package com.gildedrose;

public class NormalItemStrategy implements ItemQualityStrategy {
    @Override
    public void updateQualityItem(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

}
