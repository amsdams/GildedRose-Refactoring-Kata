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

	/*
	 * SellIn decreases at the end of each day
	 */
	@Test
	void test_Aged_Brie_decreasesSellIn() {
		String name = Factory.AGED_BRIE;
		Item actual = new Item(name, 10, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(9, app.getItems()[0].sellIn, "sellIn test failed");
	}

	/*
	 * Quality increases each day
	 */
	@Test
	void test_Aged_Brie_increasesQuality() {
		String name = Factory.AGED_BRIE;
		Item actual = new Item(name, 10, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(21, app.getItems()[0].quality, "quality test failed");
	}

	/*
	 * The Quality can not be above 50
	 */
	@Test
	void test_Aged_Brie_increasesQualityNeverAbove50() {
		String name = Factory.AGED_BRIE;
		Item actual = new Item(name, 10, 50);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(50, app.getItems()[0].quality, "quality test failed");
	}

	/*
	 * SellIn decreases each day
	 */
	@Test
	void test_Backstage_passes_decreasesSellIn() {
		String name = Factory.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT;
		Item actual = new Item(name, 10, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(9, app.getItems()[0].sellIn, "sellIn test failed");
	}

	/*
	 * Quality increases by 3 when there are 5 days or less each day
	 */
	@Test
	void test_Backstage_passes_increasesQualityByThreeWhenSellInMoreThanZero() {
		String name = Factory.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT;
		Item actual = new Item(name, 1, 1);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(4, app.getItems()[0].quality, "quality test failed");
	}

	/*
	 * Quality increases by 2 when there are 10 days each day
	 */
	@Test
	void test_Backstage_passes_increasesQualityByTwoWhenSellInMoreThanFive() {
		String name = Factory.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT;
		Item actual = new Item(name, 6, 1);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(3, app.getItems()[0].quality, "quality test failed");
	}

	/*
	 * Quality can not be above 50
	 */
	@Test
	void test_Backstage_passes_increasesQualityQualityNeverAbove50() {
		String name = Factory.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT;
		Item actual = new Item(name, 10, 50);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(50, app.getItems()[0].quality, "quality test failed");
	}

	/*
	 * SellIn increases in Quality sellIn is more than days
	 */
	@Test
	void test_Backstage_passes_decreasesQualitySellInWhenMoreThanTen() {

		String name = Factory.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT;
		Item actual = new Item(name, 11, 1);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(2, app.getItems()[0].quality, "quality test failed");
	}

	/*
	 * Quality drops to 0 after the concert
	 */
	@Test
	void test_Backstage_passesdecreasesQualityToZeroWhenSellInIsZero() {
		String name = Factory.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT;
		Item actual = new Item(name, 0, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(0, app.getItems()[0].quality, "quality test failed");
	}

	/*
	 * 
	 * "Conjured" items degrade in Quality twice as fast as normal items
	 */
	@Test
	void test_Conjured_Mana_Cake_decreasesQualityByFourWhenSellinIs0() {
		String name = Factory.CONJURED_MANA_CAKE;
		Item actual = new Item(name, 0, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(16, app.getItems()[0].quality, "sellIn test failed");
	}

	/*
	 * 
	 * "Conjured" items degrade in Quality twice as fast as normal items
	 */
	@Test
	void test_Conjured_Mana_Cake_decreasesQualityByTwoWhenSellinAbove0() {
		String name = Factory.CONJURED_MANA_CAKE;
		Item actual = new Item(name, 10, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(18, app.getItems()[0].quality, "sellIn test failed");
	}

	/*
	 * The Quality of an item is never negative
	 */
	@Test
	void test_Conjured_Mana_Cake_decreasesQualityNeverBelow0() {
		String name = Factory.CONJURED_MANA_CAKE;
		Item actual = new Item(name, 0, 0);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(0, app.getItems()[0].quality, "sellIn test failed");
	}

	/*
	 * At the end of each day SellIn decreases
	 */
	@Test
	void test_Conjured_Mana_Cake_decreasesSellIn() {
		String name = Factory.CONJURED_MANA_CAKE;
		Item actual = new Item(name, 10, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(9, app.getItems()[0].sellIn, "sellIn test failed");
	}

	/*
	 * Quality degrades by one when sellin above 0
	 */
	@Test
	void test_Default_decreasesQualityByOneWhenSellInIsAboveZero() {
		Item[] items = new Item[] { new Item("foo", 2, 1) };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(0, app.getItems()[0].quality, "quality test failed");
	}

	/*
	 * Quality degrades twice as fast when the sell by date has passed,
	 */
	@Test
	void test_Default_decreasesQualityByTwoWhenSellInIsZeroOrLess() {
		Item[] items = new Item[] { new Item("foo", 0, 2) };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(0, app.getItems()[0].quality, "quality test failed");
	}

	/*
	 * The Quality of an item is never negative
	 */
	@Test
	void test_Default_decreasesQualityNeverBelow0() {
		Item[] items = new Item[] { new Item("foo", 0, 0) };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(0, app.getItems()[0].quality, "quality test failed");
	}

	@Test
	void test_Elixirof_the_Mongoose_day_decreasesSellIn() {
		String name = Factory.ELIXIR_OF_THE_MONGOOSE;
		Item actual = new Item(name, 10, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(9, app.getItems()[0].sellIn, "sellIn test failed");
	}

	@Test
	void test_plus5_Dexterity_Vest_decreasesSellIn() {
		String name = Factory.PLUS_5_DEXTERITY_VEST;
		Item actual = new Item(name, 10, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(9, app.getItems()[0].sellIn, "sellIn test failed");
	}

	@Test
	void test_Sulfuras_Hand_Ragnaros_decreasesSellIn() {
		String name = Factory.SULFURAS_HAND_OF_RAGNAROS;
		Item actual = new Item(name, 10, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);
		app.updateQuality();

		assertEquals(10, app.getItems()[0].sellIn, "sellIn test failed");
	}

}
