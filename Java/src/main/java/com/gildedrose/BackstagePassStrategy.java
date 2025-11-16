package com.gildedrose;

public class BackstagePassStrategy implements ItemQualityStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
        if ((item.getSellIn() < 11)) {
            item.setQuality(item.getQuality() + 1);
        }
        if ((item.getSellIn() < 6)) {
            item.setQuality(item.getQuality() + 1);
        }
        if (item.getSellIn() < 0) {
            item.setQuality(0);
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
