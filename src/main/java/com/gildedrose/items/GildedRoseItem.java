package com.gildedrose.items;

import com.gildedrose.Item;

public abstract class GildedRoseItem extends Item implements Aging {
    protected static final int MAXIMUM_QUALITY = 50;
    private int ageToll = 1;

    public GildedRoseItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected int getAgeToll() {
        return ageToll;
    }

    protected void setAgeToll(int ageToll) {
        this.ageToll = ageToll;
    }
}
