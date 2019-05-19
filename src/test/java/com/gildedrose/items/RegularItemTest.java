package com.gildedrose.items;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gildedrose.items.RegularItem;

public class RegularItemTest {
    @Test
    public void age_sellInAndQualityPositive_sellInAndQualityLowered() {
        RegularItem item = new RegularItem("item", 5, 5);

        item.age();

        assertEquals(4, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void age_sellInOneAndQualityPositive_sellInAndQualityLowered() {
        RegularItem item = new RegularItem("item", 1, 7);

        item.age();
        item.age();

        assertEquals(4, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void age_sellInOneAndQualityPositive_qualityNotNegative() {
        RegularItem item = new RegularItem("item", 1, 0);

        item.age();

        assertEquals(0, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void age_sellInZero_sellInNotNegative() {
        RegularItem item = new RegularItem("item", 0, 0);

        item.age();

        assertEquals(0, item.quality);
        assertEquals(0, item.sellIn);
    }
}
