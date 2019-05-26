package com.gildedrose.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gildedrose.items.ConjuredItem;
import com.gildedrose.items.FermentedItem;
import com.gildedrose.items.GildedRoseItem;
import com.gildedrose.items.LegendaryItem;
import com.gildedrose.items.RegularItem;
import com.gildedrose.items.TicketItem;
import com.gildedrose.repositories.GildedRoseItemRepository;

@RestController
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private GildedRoseItemRepository gildedRoseItemRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<GildedRoseItem> getAllItems() {
      return gildedRoseItemRepository.findAll();
    }

    @RequestMapping(value = "/regular", method = RequestMethod.POST)
    public GildedRoseItem createRegularItem(@Valid @RequestBody RegularItem item) {
      item.set_id(ObjectId.get());
      gildedRoseItemRepository.save(item);
      return item;
    }

    @RequestMapping(value = "/conjured", method = RequestMethod.POST)
    public GildedRoseItem createConjuredItem(@Valid @RequestBody ConjuredItem item) {
      item.set_id(ObjectId.get());
      gildedRoseItemRepository.save(item);
      return item;
    }

    @RequestMapping(value = "/legendary", method = RequestMethod.POST)
    public GildedRoseItem createLegendaryItem(@Valid @RequestBody LegendaryItem item) {
      item.set_id(ObjectId.get());
      gildedRoseItemRepository.save(item);
      return item;
    }

    @RequestMapping(value = "/fermented", method = RequestMethod.POST)
    public GildedRoseItem createFermentedItem(@Valid @RequestBody FermentedItem item) {
      item.set_id(ObjectId.get());
      gildedRoseItemRepository.save(item);
      return item;
    }

    @RequestMapping(value = "/ticket", method = RequestMethod.POST)
    public GildedRoseItem createTicketItem(@Valid @RequestBody TicketItem item) {
      item.set_id(ObjectId.get());
      gildedRoseItemRepository.save(item);
      return item;
    }
}
