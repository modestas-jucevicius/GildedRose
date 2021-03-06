package com.gildedrose.items;

public class RegularItem extends GildedRoseItem {
    private static final int EXPIRED_AGE_TOLL = 2;

    public RegularItem() {}

    public RegularItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        checkSellIn();
    }

    @Override
    public void age() {
        if (this.quality >= getAgeToll()) {
            quality -= getAgeToll();
        } else {
            quality = 0;
        }

        if (this.sellIn > 0) {
            this.sellIn--;
            checkSellIn();
        }
    }

    private void checkSellIn() {
        if (this.sellIn == 0) {
            setAgeToll(EXPIRED_AGE_TOLL);
        }
    }
}
