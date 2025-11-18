package com.gildedrose;

public interface ItemQualityStrategy {
    void updateQuality(Item item);

    default void updateSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            updateQuality(item);
        }
    }
}
