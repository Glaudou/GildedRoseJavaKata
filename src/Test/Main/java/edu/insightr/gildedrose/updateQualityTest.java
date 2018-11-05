package edu.insightr.gildedrose;

import static org.junit.jupiter.api.Assertions.*;

class updateQualityTest {

    public void checkQuality()
    {
        boolean flag = true;
        for(int i = 0; i < 75; i++){
            inventory.updateQuality();
        }
        for (int j=0; j < items.length; j++) {
            if (items[j].getName() != "Sulfuras, Hand of Ragnaros" && (items[j].getQuality() < 0 || items[j].getQuality() > 50)) {
                flag = false;
            }
        }
        System.out.println(flag);
    }


    public void CheckQualitySulfuras(){
        boolean flag = true;
        for(int i = 0; i < 75; i++){
            inventory.updateQuality();
        }
        for (int i = 0; i < items.length; i++) {
            if ("Sulfuras, Hand of Ragnaros".equals(items[i].getName())) && 80 != items[i].getQuality){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}