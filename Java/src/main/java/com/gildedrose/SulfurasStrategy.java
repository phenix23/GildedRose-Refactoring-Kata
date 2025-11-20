package com.gildedrose;

public class SulfurasStrategy implements ItemQualityStrategy {
    @Override
    public void updateQualityItem(Item item) {
        item.setQuality(item.getQuality());
    }

}
