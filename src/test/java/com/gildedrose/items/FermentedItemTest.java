package com.gildedrose.items;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gildedrose.items.FermentedItem;

public class FermentedItemTest {
    @Test
    public void age_sellInAndQualityPositive_sellInNotChangedQualityIncreased() {
        FermentedItem item = new FermentedItem("item", 5, 5);

        item.age();

        assertEquals(6, item.quality);
        assertEquals(5, item.sellIn);
    }

    @Test
    public void age_qualityMaximum_qualityUnchanged() {
        FermentedItem item = new FermentedItem("item", 1, 50);

        item.age();

        assertEquals(50, item.quality);
    }
}
