package com.gildedrose;

import java.util.Arrays;
import java.util.List;

import com.gildedrose.items.GildedRoseItem;

public class GildedRose {
    List<GildedRoseItem> items;

    public GildedRose(List<GildedRoseItem> items) {
        this.items = items;
    }

    public GildedRose(GildedRoseItem[] items) {
        this.items = Arrays.asList(items);
    }

    public void updateQuality() {
        items.parallelStream()
        .forEach(item -> item.age());
    }
}