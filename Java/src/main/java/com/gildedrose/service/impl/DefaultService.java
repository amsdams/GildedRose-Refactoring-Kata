package com.gildedrose.service.impl;

import com.gildedrose.model.Item;
import com.gildedrose.service.Service;
import com.gildedrose.service.util.Util;
/*
 *  At the end of each day our system lowers both values for every item
 *  for Dexteri shirt, Elixerand  Conjured
 */
/*
 * "Conjured" items degrade in Quality twice as fast as normal items
 */
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
