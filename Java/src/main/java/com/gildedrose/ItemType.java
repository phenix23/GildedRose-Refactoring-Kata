package com.gildedrose;

public enum ItemType {
    AGED_BRIE("Aged Brie"),
    BACKSTAGE_PASS("Backstage passes to a TAFKAL80ETC concert"),
    SULFURAS("Sulfuras, Hand of Ragnaros");

    private final String nameItem;

    ItemType(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getDisplayName(){
        return nameItem;
    }

    public static ItemType fromString(String name) {
        for (ItemType type : values()) {
            if (type.getDisplayName().equals(name)) {
                return type;
            }
        }
        return null;
    }

}
