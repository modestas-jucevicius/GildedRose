package com.gildedrose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.gildedrose.items.GildedRoseItem;
import com.gildedrose.repositories.GildedRoseItemRepository;

@Component
public class ScheduledTasks {
    @Autowired
    private GildedRoseItemRepository gildedRoseItemRepository;

    @Scheduled(cron="0 0 0 * * *")
    public void age() {
        List<GildedRoseItem> allItems = gildedRoseItemRepository.findAll();
        (new GildedRose(allItems)).updateQuality();
        gildedRoseItemRepository.saveAll(allItems);
    }
}
