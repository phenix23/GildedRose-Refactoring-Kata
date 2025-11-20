package com.gildedrose;

public interface ItemQualityStrategy {
    void updateQualityItem(Item item);

    default void updateSellInItem(Item item) {
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            updateQualityItem(item);
        }
    }
}
