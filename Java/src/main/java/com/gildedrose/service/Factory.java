package com.gildedrose.service;

import com.gildedrose.model.Item;
import com.gildedrose.service.impl.AgedBrieService;
import com.gildedrose.service.impl.BackstagePassesService;
import com.gildedrose.service.impl.ConjuredCakeService;
import com.gildedrose.service.impl.DefaultService;
import com.gildedrose.service.impl.SulfurasHandService;

public class Factory {
	public static final String ELIXIR_OF_THE_MONGOOSE = "Elixir of the Mongoose";
	public static final String PLUS_5_DEXTERITY_VEST = "+5 Dexterity Vest";
	public static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";
	public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	public static final String AGED_BRIE = "Aged Brie";
	public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";

	public Service getService(Item item) {

		switch (item.name) {
		case BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT:
			return new BackstagePassesService();
		case AGED_BRIE:
			return new AgedBrieService();
		case SULFURAS_HAND_OF_RAGNAROS:
			return new SulfurasHandService();
		case CONJURED_MANA_CAKE:
			return new ConjuredCakeService();
		default:
			return new DefaultService();
		}

	}
}
