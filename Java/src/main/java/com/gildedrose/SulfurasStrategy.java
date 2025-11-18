package com.gildedrose;

public class SulfurasStrategy implements ItemQualityStrategy {
    @Override
    public void updateQuality(Item item) {
        item.setQuality(item.getQuality());
    }

}
