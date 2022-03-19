package com.gildedrose;

import com.gildedrose.model.Item;
import com.gildedrose.service.impl.AgedBrieService;
import com.gildedrose.service.impl.BackstagePassesService;
import com.gildedrose.service.impl.DefaultService;
import com.gildedrose.service.impl.SulfurasHandService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class GildedRose {
	private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private static final String AGED_BRIE = "Aged Brie";
	private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	AgedBrieService agedBrieService = new AgedBrieService();
	BackstagePassesService backstagePassesService = new BackstagePassesService();
	SulfurasHandService sulfurasHandService = new SulfurasHandService();
	DefaultService defaultService = new DefaultService();

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			switch (item.name) {
			case AGED_BRIE:
				Item agedBrie = agedBrieService.updateItem(item);
				log.info("updated {}", agedBrie);
				break;
			case BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT:
				Item backstagePasses = backstagePassesService.updateItem(item);
				log.info("updated {}", backstagePasses);
				break;
			case SULFURAS_HAND_OF_RAGNAROS:
				Item sulfurasHand = sulfurasHandService.updateItem(item);
				log.info("updated {}", sulfurasHand);
				break;
			default:
				Item defaultItem = defaultService.updateItem(item);
				log.info("updated {}", defaultItem);
				break;
			}

		}
	}

}