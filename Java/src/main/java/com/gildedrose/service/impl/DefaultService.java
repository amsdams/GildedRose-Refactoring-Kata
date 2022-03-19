package com.gildedrose.service.impl;

import com.gildedrose.model.Item;
import com.gildedrose.service.Service;
import com.gildedrose.service.util.Util;

public class DefaultService implements Service {

	@Override
	public Item updateItem(Item item) {
		item.sellIn = item.sellIn - 1;
		item.quality = Util.decreaseQuality(item.quality);

		if (item.sellIn < 0) {
			item.quality = Util.decreaseQuality(item.quality);

		}
		return item;
	}

}
