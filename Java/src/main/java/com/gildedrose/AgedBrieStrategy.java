package com.gildedrose;

public class AgedBrieStrategy implements ItemQualityStrategy {
    @Override
    public void updateQualityItem(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
