package com.gildedrose.items;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gildedrose.items.TicketItem;

public class TicketItemTest {
    @Test
    public void ticketItem_sellInAboveTen_ageTollOne() {
        TicketItem item = new TicketItem("item", 11, 5);

        assertEquals(1, item.getAgeToll());
    }

    @Test
    public void TicketItem_sellInAboveFive_ageTollTwo() {
        TicketItem item = new TicketItem("item", 7, 5);

        assertEquals(2, item.getAgeToll());
    }

    @Test
    public void TicketItem_sellInAboveZero_ageTollThree() {
        TicketItem item = new TicketItem("item", 3, 5);

        assertEquals(3, item.getAgeToll());
    }

    @Test
    public void TicketItem_sellInZero_qualityZero() {
        TicketItem item = new TicketItem("item", 0, 5);

        assertEquals(0, item.getQuality());
    }

    @Test
    public void age_sellInElevenQualityPositive_sellInLoweredAndQualityAndRateIncreasedToTwo() {
        TicketItem item = new TicketItem("item", 11, 5);

        item.age();
        item.age();

        assertEquals(8, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    public void age_sellInSixAndQualityPositive_sellInLoweredAndQualityAndRateIncreasedToThree() {
        TicketItem item = new TicketItem("item", 6, 5);

        item.age();
        item.age();

        assertEquals(10, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void age_sellInOneAndQualityPositive_qualityZero() {
        TicketItem item = new TicketItem("item", 1, 3);

        item.age();

        assertEquals(0, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void age_sellInTwoQualityMax_qualityNotChanged() {
        TicketItem item = new TicketItem("item", 2, 50);

        item.age();

        assertEquals(50, item.quality);
        assertEquals(1, item.sellIn);
    }
}
