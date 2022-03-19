package com.gildedrose;

public class SulfurasHandService implements Service {

	@Override
	public Item getItem(Item item) {
		item.sellIn = item.sellIn;
		item.quality = item.quality;
		return item;
	}

}
