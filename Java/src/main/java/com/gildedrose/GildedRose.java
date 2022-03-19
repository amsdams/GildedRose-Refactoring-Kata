package com.gildedrose;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class GildedRose {
	private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private static final String AGED_BRIE = "Aged Brie";
	private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			switch (item.name) {
			case AGED_BRIE:
				AgedBrieService agedBrieService = new AgedBrieService();
				Item agedBrie = agedBrieService.getItem(item);
				log.info("updated {}", agedBrie);
				break;
			case BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT:
				BackstagePassesService backstagePassesService = new BackstagePassesService();
				Item backstagePasses = backstagePassesService.getItem(item);
				log.info("updated {}", backstagePasses);
				break;
			case SULFURAS_HAND_OF_RAGNAROS:
				SulfurasHandService sulfurasHandService = new SulfurasHandService();
				Item sulfurasHand = sulfurasHandService.getItem(item);
				log.info("updated {}", sulfurasHand);
				break;
			default:
				DefaultService defaultService = new DefaultService();
				Item defaultItem = defaultService.getItem(item);
				log.info("updated {}", defaultItem);
				break;
			}

		}
	}

}