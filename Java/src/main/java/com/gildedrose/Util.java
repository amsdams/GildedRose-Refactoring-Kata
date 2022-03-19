package com.gildedrose;

public class Util {
	public static int decreaseQuality(int quality) {
		if (quality > 0) {
			quality = quality - 1;
		}
		return quality;

	}

	public static int increaseQuality(int quality) {
		if (quality < 50) {
			quality = quality + 1;
		}
		return quality;
	}
}