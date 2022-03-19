package com.gildedrose.service.impl;

import com.gildedrose.model.Item;
import com.gildedrose.service.Service;
import com.gildedrose.service.util.Util;

public class AgedBrieService implements Service {

	@Override
	public Item updateItem(Item item) {
		item.sellIn = item.sellIn - 1;
		item.quality = Util.increaseQuality(item.quality);

		if (item.sellIn < 0) {
			item.quality = Util.increaseQuality(item.quality);
		}
		return item;
	}

}
