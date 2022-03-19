package com.gildedrose;

public class AgedBrieService implements Service {

	@Override
	public Item getItem(Item item) {
		item.sellIn = item.sellIn - 1;
		item.quality = Util.increaseQuality(item.quality);

		if (item.sellIn < 0) {
			item.quality = Util.increaseQuality(item.quality);
		}
		return item;
	}

}
