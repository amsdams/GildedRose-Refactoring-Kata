package com.gildedrose.service.impl;

import com.gildedrose.model.Item;
import com.gildedrose.service.Service;
import com.gildedrose.service.util.Util;
/*
 * "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
 * Quality increases by 2 when there are 10 days or less
 * and by 3 when there are 5 days or less but
 * Quality drops to 0 after the concert
 */
public class BackstagePassesService implements Service {

	@Override
	public Item updateItem(Item item) {
		item.sellIn = item.sellIn - 1;
		item.quality = Util.increaseQuality(item.quality);

		if (item.sellIn < 10) {
			item.quality = Util.increaseQuality(item.quality);
		}

		if (item.sellIn < 5) {
			item.quality = Util.increaseQuality(item.quality);
		}

		if (item.sellIn < 0) {
			item.quality = 0;
		}
		return item;
	}

}
