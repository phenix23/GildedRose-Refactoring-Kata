package com.gildedrose;

public class SulfurasStrategy implements ItemQualityStrategy {
    @Override
    public void updateQuality(Item item) {
        item.setQuality(item.getQuality());
    }

    @Override
    public void updateSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            this.updateQuality(item);
        }
    }
}
