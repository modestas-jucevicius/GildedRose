package com.gildedrose.items;

public class TicketItem extends GildedRoseItem {
    private static final int FIRST_AGE_TOLL_CHANGE_SELLIN = 10;
    private static final int FIRST_AGE_TOLL_CHANGE_VALUE = 2;
    private static final int SECOND_AGE_TOLL_CHANGE_SELLIN = 5;
    private static final int SECOND_AGE_TOLL_CHANGE_VALUE = 3;

    public TicketItem() {}


    public TicketItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        checkSellIn();
    }

    @Override
    public void age() {
        if (this.sellIn > 0) {
            if (this.quality <= MAXIMUM_QUALITY - getAgeToll()) {
                quality += getAgeToll();
            } else {
                quality = MAXIMUM_QUALITY;
            }

            this.sellIn--;
            checkSellIn();
        }
    }

    private void checkSellIn() {
        if (this.sellIn == 0) {
            this.quality = 0;
        } else if (sellIn <= SECOND_AGE_TOLL_CHANGE_SELLIN ) {
            setAgeToll(SECOND_AGE_TOLL_CHANGE_VALUE);
        } else if (sellIn <= FIRST_AGE_TOLL_CHANGE_SELLIN) {
            setAgeToll(FIRST_AGE_TOLL_CHANGE_VALUE);
        }
    }
}
