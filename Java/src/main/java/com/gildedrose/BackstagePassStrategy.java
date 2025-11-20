package com.gildedrose;

public class BackstagePassStrategy implements ItemQualityStrategy {

    public static final int FIFTY_DAYS = 50;
    public static final int ELEVEN_DAYS = 11;
    public static final int SIX_DAYS = 6;

    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
            if ((item.getSellIn() < ELEVEN_DAYS)) {
                item.setQuality(item.getQuality() + 1);
            }
            if ((item.getSellIn() < SIX_DAYS)) {
                item.setQuality(item.getQuality() + 1);
            }
        }
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }

}
