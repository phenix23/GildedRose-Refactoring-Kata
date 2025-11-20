package com.gildedrose;

public class QualityProcessor {

    public static void process(Item item) {
        ItemQualityStrategy strategy = ItemStrategyFactory.createStrategy(item.getName());
        strategy.updateQualityItem(item);
        strategy.updateSellInItem(item);
    }
}
