package com.gildedrose;

public class ItemStrategyFactory {
    public static ItemQualityStrategy createStrategy(String itemName){
        ItemType type = ItemType.fromString(itemName);
        switch (type) {
            case AGED_BRIE:
                return new AgedBrieStrategy();
            case BACKSTAGE_PASS:
                return new BackstagePassStrategy();
            case SULFURAS:
                return new SulfurasStrategy();
            default:
                return new NormalItemStrategy();
        }
    }
}
