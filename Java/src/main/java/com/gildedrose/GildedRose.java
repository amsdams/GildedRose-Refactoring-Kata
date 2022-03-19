package com.gildedrose;

import com.gildedrose.model.Item;
import com.gildedrose.service.Factory;
import com.gildedrose.service.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
class GildedRose {

	private Factory factory = new Factory();

	@Getter
	private Item[] items;

	public void updateQuality() {
		for (Item item : items) {
			Service service = factory.getService(item);
			Item updated = service.updateItem(item);
			log.info("updated {}", updated);
		}
	}

}