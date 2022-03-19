package com.gildedrose;

public class DefaultService implements Service {

	@Override
	public Item getItem(Item item) {
		item.sellIn = item.sellIn - 1;
		item.quality = Util.decreaseQuality(item.quality);

		if (item.sellIn < 0) {
			item.quality = Util.decreaseQuality(item.quality);

		}
		return item;
	}

}
