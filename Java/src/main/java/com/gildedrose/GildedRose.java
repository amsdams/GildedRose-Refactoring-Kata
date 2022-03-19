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

			if (item.name.equals(AGED_BRIE)) {
				item.sellIn = item.sellIn - 1;
				item.quality = increaseQuality(item.quality);

				if (item.sellIn < 0) {
					item.quality = increaseQuality(item.quality);
				}

			} else if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
				item.sellIn = item.sellIn - 1;
				item.quality = increaseQuality(item.quality);

				if (item.sellIn < 10) {
					item.quality = increaseQuality(item.quality);
				}

				if (item.sellIn < 5) {
					item.quality = increaseQuality(item.quality);
				}

				if (item.sellIn < 0) {
					item.quality = increaseQuality(item.quality);

				}

				if (item.sellIn < 0) {
					item.quality = 0;
				}

			} else if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
				item.sellIn = item.sellIn;
				item.quality = item.quality;

			} else {
				item.sellIn = item.sellIn - 1;
				item.quality = decreaseQuality(item.quality);

				if (item.sellIn < 0) {
					item.quality = decreaseQuality(item.quality);

				}
			}

		}
	}

	public int decreaseQuality(int quality) {
		if (quality > 0) {
			quality = quality - 1;
		}
		return quality;

	}

	public int increaseQuality(int quality) {
		if (quality < 50) {
			quality = quality + 1;
		}
		return quality;
	}
}