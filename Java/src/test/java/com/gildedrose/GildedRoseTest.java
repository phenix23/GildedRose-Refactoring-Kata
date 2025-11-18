package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @ParameterizedTest
    @MethodSource("updateQualityProvider")
    void testUpdateQuality(String name , int sellIn , int quality, int expectedQuality) {
        Item[] items = new Item[] { new Item(name,sellIn,quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expectedQuality,app.getItems()[0].getQuality());
    }

    private static Stream<Arguments> updateQualityProvider() {
        return Stream.of(
            Arguments.of(null, 0, 1, 0),
            Arguments.of("foo", 0, 1, 0),
            Arguments.of("foo", 0, 2, 0),
            Arguments.of("foo", 0, -1, -1),
            Arguments.of("Aged Brie", 2, 0, 1),
            Arguments.of("Aged Brie", 0, 2, 4),
            Arguments.of("Aged Brie", -1, 4, 6),
            Arguments.of("Aged Brie", -2, 50, 50),
            Arguments.of("Sulfuras, Hand of Ragnaros", 3, 60, 60),
            Arguments.of("Sulfuras, Hand of Ragnaros", 0, 1, 1),
            Arguments.of("Sulfuras, Hand of Ragnaros", -1, 1, 1),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", -2, 5, 0),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", -1, 50, 0),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", 11, 2, 3),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", 10, 70, 70),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", 5, 70, 70),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", 10, 39, 41),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", 5, 39, 42),
            Arguments.of("+5 Dexterity Vest", 10, 20, 19),
            Arguments.of("Conjured Mana Cake", 3, 6, 5),
            Arguments.of("Conjured Mana Cake", 0, 3, 1),
            Arguments.of("Conjured Mana Cake", -1, 1, 0)
        );
    }
}
