package com.gildedrose.items;

public class ConjuredItem extends GildedRoseItem {
    private static final int EXPIRED_AGE_TOLL = 2;
    private static final int CONJURED_USAGE = 2;

    public ConjuredItem() {}

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        setAgeToll(CONJURED_USAGE);
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
            setAgeToll(EXPIRED_AGE_TOLL * CONJURED_USAGE);
        }
    }

}
