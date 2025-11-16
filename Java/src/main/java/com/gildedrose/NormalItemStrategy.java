package com.gildedrose;

public class NormalItemStrategy implements ItemQualityStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    @Override
    public void updateSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            this.updateQuality(item);
        }
    }
}
