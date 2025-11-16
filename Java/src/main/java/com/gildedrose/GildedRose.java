package com.gildedrose;

class GildedRose {
    private final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(Item item : this.getItems()){
            calculateQuality(item);
            decrementSellIn(item);
            if ( item.getSellIn() < 0) {
                reCalculateQuality(item);
            }
        }
    }

    public Item[] getItems() {
        return items;
    }

}
