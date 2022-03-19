package com.gildedrose.service;

import com.gildedrose.model.Item;
import com.gildedrose.service.impl.AgedBrieService;
import com.gildedrose.service.impl.BackstagePassesService;
import com.gildedrose.service.impl.DefaultService;
import com.gildedrose.service.impl.SulfurasHandService;

public class Factory {
	private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private static final String AGED_BRIE = "Aged Brie";
	private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";

	public Service getService(Item item) {
		switch (item.name) {
		case BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT:
			return new BackstagePassesService();
		case AGED_BRIE:
			return new AgedBrieService();
		case SULFURAS_HAND_OF_RAGNAROS:
			return new SulfurasHandService();
		default:
			return new DefaultService();
		}

	}
}
