package com.gildedrose;

class GildedRose {
	private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private static final String AGED_BRIE = "Aged Brie";
	private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			if (!item.name.equals(AGED_BRIE) && !item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {

				if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
					decreaseQuality(item);
				}
			} else {
				increaseQuality(item);
				if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
					
					if (item.sellIn < 11) {
						increaseQuality(item);
					}

					if (item.sellIn < 6) {
						increaseQuality(item);
					}
				}
			}

			if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
				item.sellIn = item.sellIn - 1;
			}

			if (item.sellIn < 0) {
				if (!item.name.equals(AGED_BRIE)) {
					if (!item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {

						if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
							decreaseQuality(item);
						}
					} else {
						item.quality = item.quality - item.quality;
					}
				} else {
					increaseQuality(item);
				}
			}
		}
	}

	public void decreaseQuality(Item item) {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}
	}

	public void increaseQuality(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;
		}
	}
}