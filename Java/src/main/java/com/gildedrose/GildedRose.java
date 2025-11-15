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

    private void calculateQuality(Item item) {
        if ("Aged Brie".equals(item.getName()) ||"Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
            incrementQuality(item);
        } else {
            decrementQuality(item);
        }
    }

    private void reCalculateQuality(Item item) {
        if ("Aged Brie".equals(item.getName()) ) {
            incrementQuality(item);
        } else {
            if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
                item.setQuality(0);
            } else {
                decrementQuality(item);
            }
        }
    }

    private void decrementSellIn(Item item) {
         item.setSellIn("Sulfuras, Hand of Ragnaros".equals(item.getName()) ? item.getSellIn(): item.getSellIn() - 1);
    }

    private void incrementQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);

            if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName()) && (item.getSellIn() < 11)) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }

    private void decrementQuality(Item item) {
        if (item.getQuality() > 0 && !"Sulfuras, Hand of Ragnaros".equals(item.getName())) {
            item.setQuality(item.getQuality() - 1);
        }
    }
}
