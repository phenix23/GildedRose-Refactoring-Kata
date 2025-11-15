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
            Arguments.of("Aged Brie", 0, 0, 2),
            Arguments.of("Aged Brie", 1, 0, 1),
            Arguments.of("Aged Brie", 0, 50, 50),
            Arguments.of("Sulfuras, Hand of Ragnaros", 0, 1, 1),
            Arguments.of("Sulfuras, Hand of Ragnaros", -1, 1, 1),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", 0, 2, 0),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", 11, 2, 3),
            Arguments.of("Backstage passes to a TAFKAL80ETC concert", 10, 2, 4)
        );
    }
}
