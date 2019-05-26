package com.gildedrose.items;

public class FermentedItem extends GildedRoseItem {

    public FermentedItem() {}

    public FermentedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void age() {
        if (this.quality < MAXIMUM_QUALITY) {
            quality++;
        }
    }

}
