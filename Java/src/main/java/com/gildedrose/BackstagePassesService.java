package com.gildedrose;

public class BackstagePassesService implements Service {

	@Override
	public Item getItem(Item item) {
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
