package com.gildedrose.service.impl;

import com.gildedrose.model.Item;
import com.gildedrose.service.Service;
import com.gildedrose.service.util.Util;

/*
 *  "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
 */
public class ConjuredCakeService implements Service {

	@Override
	public Item updateItem(Item item) {
		item.sellIn = item.sellIn - 1;
		item.quality = Util.decreaseQuality(item.quality);
		item.quality = Util.decreaseQuality(item.quality);

		if (item.sellIn < 0) {
			item.quality = Util.decreaseQuality(item.quality);
			item.quality = Util.decreaseQuality(item.quality);

		}
		return item;
	}

}
