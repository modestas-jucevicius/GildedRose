package com.gildedrose.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.gildedrose.items.GildedRoseItem;

public interface GildedRoseItemRepository extends MongoRepository<GildedRoseItem, String> {
    GildedRoseItem findBy_id(ObjectId _id);
}
