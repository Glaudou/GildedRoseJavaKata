package Main.java.edu.insightr.gildedrose;

import static org.junit.jupiter.api.Assertions.*;

class UpdateQualityCheck {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public void updateQualitybis(){
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() != AGED_BRIE
                    && items[i].getName() != BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT
                    && items[i].getQuality() > 0
                    && items[i].getName() != SULFURAS_HAND_OF_RAGNAROS) {
                items[i].setQuality(items[i].getQuality() - 1);
            }
            else {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);

                    if (items[i].getName() == BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT) {
                        if (items[i].getSellIn() < 11
                                && items[i].getQuality() < 50) {
                            items[i].setQuality(items[i].getQuality() + 1);
                        }

                        if (items[i].getSellIn() < 6
                                && items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                        }
                    }
                }
            }

            if (items[i].getName() != SULFURAS_HAND_OF_RAGNAROS) {
                items[i].setSellIn(items[i].getSellIn() - 1);
            }

            if (items[i].getSellIn() < 0) {
                if (items[i].getName() != AGED_BRIE) {
                    if (items[i].getName() != BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT) {
                        if (items[i].getQuality() > 0
                                && items[i].getName() != SULFURAS_HAND_OF_RAGNAROS) {
                                items[i].setQuality(items[i].getQuality() - 1);
                        }
                    } else {
                        items[i].setQuality(items[i].getQuality() - items[i].getQuality());
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);
                    }
                }
            }
        }
    }
}