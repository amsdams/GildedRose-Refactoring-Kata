package com.gildedrose.service.impl;

import com.gildedrose.model.Item;
import com.gildedrose.service.Service;
/*
 *  "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
 */
public class SulfurasHandService implements Service {

	@Override
	public Item updateItem(Item item) {
		return item;
	}

}
