package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.service.Factory;

class GildedRoseTest {

	@Test
	void foo() {
		Item[] items = new Item[] { new Item("foo", 0, 0) };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();
		assertEquals("foo", app.getItems()[0].name);
	}

}
