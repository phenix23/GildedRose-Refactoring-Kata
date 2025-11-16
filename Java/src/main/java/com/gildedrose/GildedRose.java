package com.gildedrose;

class GildedRose {
    private final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(Item item : this.getItems()){
            QualityProcessor.process(item);
        }
    }

    public Item[] getItems() {
        return items;
    }

}
