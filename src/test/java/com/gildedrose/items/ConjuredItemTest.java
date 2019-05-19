package com.gildedrose.items;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gildedrose.items.ConjuredItem;

public class ConjuredItemTest {
    @Test
    public void age_sellInAndQualityPositive_sellInAndQualityLowered() {
        ConjuredItem item = new ConjuredItem("item", 5, 5);

        item.age();

        assertEquals(3, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void age_sellInOneAndQualityPositive_sellInAndQualityLowered() {
        ConjuredItem item = new ConjuredItem("item", 1, 7);

        item.age();
        item.age();

        assertEquals(1, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void age_sellInOneAndQualityPositive_qualityNotNegative() {
        ConjuredItem item = new ConjuredItem("item", 1, 1);

        item.age();

        assertEquals(0, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void age_sellInZero_sellInNotNegative() {
        ConjuredItem item = new ConjuredItem("item", 0, 0);

        item.age();

        assertEquals(0, item.quality);
        assertEquals(0, item.sellIn);
    }
}
