package com.gildedrose.items;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import com.gildedrose.Item;

public abstract class GildedRoseItem extends Item implements Aging {
    protected static final int MAXIMUM_QUALITY = 50;

    @Transient
    private int ageToll = 1;

    @Id
    public ObjectId _id;

    public GildedRoseItem() {
        super(null, 0, 0);
    }

    public GildedRoseItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public void setSellIn(final int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return this.quality;
    }

    public void setQuality(final int quality) {
        this.quality = quality;
    }

    protected int getAgeToll() {
        return ageToll;
    }

    protected void setAgeToll(int ageToll) {
        this.ageToll = ageToll;
    }
}
