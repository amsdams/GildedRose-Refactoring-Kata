package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.gildedrose.model.Item;
import com.gildedrose.service.Factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class GildedRose30DaysTest {

	// using tests from TexttestFixture
	// extended with 30days

	@Test
	void test_plus5_Dexterity_Vest_day30() {
		String name = Factory.PLUS_5_DEXTERITY_VEST;
		Item actual = new Item(name, 10, 20);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();

		GildedRose app = new GildedRose(factory, items);

		Item expected_day_0 = new Item(name, 10, 20);
		Item expected_day_1 = new Item(name, 9, 19);
		Item expected_day_2 = new Item(name, 8, 18);
		Item expected_day_3 = new Item(name, 7, 17);
		Item expected_day_4 = new Item(name, 6, 16);
		Item expected_day_5 = new Item(name, 5, 15);
		Item expected_day_6 = new Item(name, 4, 14);
		Item expected_day_7 = new Item(name, 3, 13);
		Item expected_day_8 = new Item(name, 2, 12);
		Item expected_day_9 = new Item(name, 1, 11);
		Item expected_day_10 = new Item(name, 0, 10);
		Item expected_day_11 = new Item(name, -1, 8);
		Item expected_day_12 = new Item(name, -2, 6);
		Item expected_day_13 = new Item(name, -3, 4);
		Item expected_day_14 = new Item(name, -4, 2);
		Item expected_day_15 = new Item(name, -5, 0);
		Item expected_day_16 = new Item(name, -6, 0);
		Item expected_day_17 = new Item(name, -7, 0);
		Item expected_day_18 = new Item(name, -8, 0);
		Item expected_day_19 = new Item(name, -9, 0);
		Item expected_day_20 = new Item(name, -10, 0);
		Item expected_day_21 = new Item(name, -11, 0);
		Item expected_day_22 = new Item(name, -12, 0);
		Item expected_day_23 = new Item(name, -13, 0);
		Item expected_day_24 = new Item(name, -14, 0);
		Item expected_day_25 = new Item(name, -15, 0);
		Item expected_day_26 = new Item(name, -16, 0);
		Item expected_day_27 = new Item(name, -17, 0);
		Item expected_day_28 = new Item(name, -18, 0);
		Item expected_day_29 = new Item(name, -19, 0);
		Item expected_day_30 = new Item(name, -20, 0);
		// @formatter:off
	    	Item[] expectedItems = new Item[] {
	    			expected_day_0, expected_day_1, expected_day_2, expected_day_3, expected_day_4, expected_day_5, expected_day_6, expected_day_7, expected_day_8, expected_day_9,
	    			expected_day_10, expected_day_11, expected_day_12, expected_day_13, expected_day_14, expected_day_15, expected_day_16, expected_day_17, expected_day_18, expected_day_19,
	    			expected_day_20, expected_day_21, expected_day_22, expected_day_23, expected_day_24, expected_day_25, expected_day_26, expected_day_27, expected_day_28, expected_day_29,
	    			expected_day_30
	    	};
	    	// @formatter:on

		// days
		for (int i = 0; i < 30; i++) {
			assertEquals(expectedItems[i].name, actual.name, "name test failed");
			assertEquals(expectedItems[i].quality, actual.quality, "quality test failed");
			assertEquals(expectedItems[i].sellIn, actual.sellIn, "sellIn test failed");
			log.debug("item {}", actual);

			app.updateQuality();

		}

	}

	@Test
	void test_Aged_Brie_day30() {
		String name = Factory.AGED_BRIE;
		Item actual = new Item(name, 2, 0);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);

		Item expected_day_0 = new Item(name, 2, 0);
		Item expected_day_1 = new Item(name, 1, 1);
		Item expected_day_2 = new Item(name, 0, 2);
		Item expected_day_3 = new Item(name, -1, 4);
		Item expected_day_4 = new Item(name, -2, 6);
		Item expected_day_5 = new Item(name, -3, 8);
		Item expected_day_6 = new Item(name, -4, 10);
		Item expected_day_7 = new Item(name, -5, 12);
		Item expected_day_8 = new Item(name, -6, 14);
		Item expected_day_9 = new Item(name, -7, 16);
		Item expected_day_10 = new Item(name, -8, 18);
		Item expected_day_11 = new Item(name, -9, 20);
		Item expected_day_12 = new Item(name, -10, 22);
		Item expected_day_13 = new Item(name, -11, 24);
		Item expected_day_14 = new Item(name, -12, 26);
		Item expected_day_15 = new Item(name, -13, 28);
		Item expected_day_16 = new Item(name, -14, 30);
		Item expected_day_17 = new Item(name, -15, 32);
		Item expected_day_18 = new Item(name, -16, 34);
		Item expected_day_19 = new Item(name, -17, 36);
		Item expected_day_20 = new Item(name, -18, 38);
		Item expected_day_21 = new Item(name, -19, 40);
		Item expected_day_22 = new Item(name, -20, 42);
		Item expected_day_23 = new Item(name, -21, 44);
		Item expected_day_24 = new Item(name, -22, 46);
		Item expected_day_25 = new Item(name, -23, 48);
		Item expected_day_26 = new Item(name, -24, 50);
		Item expected_day_27 = new Item(name, -25, 50);
		Item expected_day_28 = new Item(name, -26, 50);
		Item expected_day_29 = new Item(name, -27, 50);
		Item expected_day_30 = new Item(name, -28, 50);
		// @formatter:off
	    	Item[] expectedItems = new Item[] {
	    			expected_day_0, expected_day_1, expected_day_2, expected_day_3, expected_day_4, expected_day_5, expected_day_6, expected_day_7, expected_day_8, expected_day_9,
	    			expected_day_10, expected_day_11, expected_day_12, expected_day_13, expected_day_14, expected_day_15, expected_day_16, expected_day_17, expected_day_18, expected_day_19,
	    			expected_day_20, expected_day_21, expected_day_22, expected_day_23, expected_day_24, expected_day_25, expected_day_26, expected_day_27, expected_day_28, expected_day_29,
	    			expected_day_30
	    	};
	    	// @formatter:on

		// days
		for (int i = 0; i < 30; i++) {
			assertEquals(expectedItems[i].name, actual.name, "name test failed");
			assertEquals(expectedItems[i].quality, actual.quality, "quality test failed");
			assertEquals(expectedItems[i].sellIn, actual.sellIn, "sellIn test failed");
			log.debug("item {}", actual);

			app.updateQuality();

		}

	}

	@Test
	void test_Elixirof_the_Mongoose_day30() {
		String name = Factory.ELIXIR_OF_THE_MONGOOSE;
		Item actual = new Item(name, 5, 7);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);

		Item expected_day_0 = new Item(name, 5, 7);
		Item expected_day_1 = new Item(name, 4, 6);
		Item expected_day_2 = new Item(name, 3, 5);
		Item expected_day_3 = new Item(name, 2, 4);
		Item expected_day_4 = new Item(name, 1, 3);
		Item expected_day_5 = new Item(name, 0, 2);
		Item expected_day_6 = new Item(name, -1, 0);
		Item expected_day_7 = new Item(name, -2, 0);
		Item expected_day_8 = new Item(name, -3, 0);
		Item expected_day_9 = new Item(name, -4, 0);
		Item expected_day_10 = new Item(name, -5, 0);
		Item expected_day_11 = new Item(name, -6, 0);
		Item expected_day_12 = new Item(name, -7, 0);
		Item expected_day_13 = new Item(name, -8, 0);
		Item expected_day_14 = new Item(name, -9, 0);
		Item expected_day_15 = new Item(name, -10, 0);
		Item expected_day_16 = new Item(name, -11, 0);
		Item expected_day_17 = new Item(name, -12, 0);
		Item expected_day_18 = new Item(name, -13, 0);
		Item expected_day_19 = new Item(name, -14, 0);
		Item expected_day_20 = new Item(name, -15, 0);
		Item expected_day_21 = new Item(name, -16, 0);
		Item expected_day_22 = new Item(name, -17, 0);
		Item expected_day_23 = new Item(name, -18, 0);
		Item expected_day_24 = new Item(name, -19, 0);
		Item expected_day_25 = new Item(name, -20, 0);
		Item expected_day_26 = new Item(name, -21, 0);
		Item expected_day_27 = new Item(name, -22, 0);
		Item expected_day_28 = new Item(name, -23, 0);
		Item expected_day_29 = new Item(name, -24, 0);
		Item expected_day_30 = new Item(name, -25, 0);
		// @formatter:off
	    	Item[] expectedItems = new Item[] {
	    			expected_day_0, expected_day_1, expected_day_2, expected_day_3, expected_day_4, expected_day_5, expected_day_6, expected_day_7, expected_day_8, expected_day_9,
	    			expected_day_10, expected_day_11, expected_day_12, expected_day_13, expected_day_14, expected_day_15, expected_day_16, expected_day_17, expected_day_18, expected_day_19,
	    			expected_day_20, expected_day_21, expected_day_22, expected_day_23, expected_day_24, expected_day_25, expected_day_26, expected_day_27, expected_day_28, expected_day_29,
	    			expected_day_30
	    	};
	    	// @formatter:on

		// days
		for (int i = 0; i < 30; i++) {
			assertEquals(expectedItems[i].name, actual.name, "name test failed");
			assertEquals(expectedItems[i].quality, actual.quality, "quality test failed");
			assertEquals(expectedItems[i].sellIn, actual.sellIn, "sellIn test failed");
			log.debug("item {}", actual);

			app.updateQuality();

		}

	}

	@Test
	void test_Sulfuras_Hand_Ragnaros_day30_quantity2() {
		String name = Factory.SULFURAS_HAND_OF_RAGNAROS;
		Item actual0 = new Item(name, 0, 80);
		Item actual1 = new Item(name, -1, 80);
		Item[] items = new Item[] { actual0, actual1 };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);

		Item expected_day_0_item_0 = new Item(name, 0, 80);
		Item expected_day_0_item_1 = new Item(name, -1, 80);

		Item expected_day_1_item_0 = new Item(name, 0, 80);
		Item expected_day_1_item_1 = new Item(name, -1, 80);

		Item expected_day_2_item_0 = new Item(name, 0, 80);
		Item expected_day_2_item_1 = new Item(name, -1, 80);

		Item expected_day_3_item_0 = new Item(name, 0, 80);
		Item expected_day_3_item_1 = new Item(name, -1, 80);

		Item expected_day_4_item_0 = new Item(name, 0, 80);
		Item expected_day_4_item_1 = new Item(name, -1, 80);

		Item expected_day_5_item_0 = new Item(name, 0, 80);
		Item expected_day_5_item_1 = new Item(name, -1, 80);

		Item expected_day_6_item_0 = new Item(name, 0, 80);
		Item expected_day_6_item_1 = new Item(name, -1, 80);

		Item expected_day_7_item_0 = new Item(name, 0, 80);
		Item expected_day_7_item_1 = new Item(name, -1, 80);

		Item expected_day_8_item_0 = new Item(name, 0, 80);
		Item expected_day_8_item_1 = new Item(name, -1, 80);

		Item expected_day_9_item_0 = new Item(name, 0, 80);
		Item expected_day_9_item_1 = new Item(name, -1, 80);

		Item expected_day_10_item_0 = new Item(name, 0, 80);
		Item expected_day_10_item_1 = new Item(name, -1, 80);

		Item expected_day_11_item_0 = new Item(name, 0, 80);
		Item expected_day_11_item_1 = new Item(name, -1, 80);

		Item expected_day_12_item_0 = new Item(name, 0, 80);
		Item expected_day_12_item_1 = new Item(name, -1, 80);

		Item expected_day_13_item_0 = new Item(name, 0, 80);
		Item expected_day_13_item_1 = new Item(name, -1, 80);

		Item expected_day_14_item_0 = new Item(name, 0, 80);
		Item expected_day_14_item_1 = new Item(name, -1, 80);

		Item expected_day_15_item_0 = new Item(name, 0, 80);
		Item expected_day_15_item_1 = new Item(name, -1, 80);

		Item expected_day_16_item_0 = new Item(name, 0, 80);
		Item expected_day_16_item_1 = new Item(name, -1, 80);

		Item expected_day_17_item_0 = new Item(name, 0, 80);
		Item expected_day_17_item_1 = new Item(name, -1, 80);

		Item expected_day_18_item_0 = new Item(name, 0, 80);
		Item expected_day_18_item_1 = new Item(name, -1, 80);

		Item expected_day_19_item_0 = new Item(name, 0, 80);
		Item expected_day_19_item_1 = new Item(name, -1, 80);

		Item expected_day_20_item_0 = new Item(name, 0, 80);
		Item expected_day_20_item_1 = new Item(name, -1, 80);

		Item expected_day_21_item_0 = new Item(name, 0, 80);
		Item expected_day_21_item_1 = new Item(name, -1, 80);

		Item expected_day_22_item_0 = new Item(name, 0, 80);
		Item expected_day_22_item_1 = new Item(name, -1, 80);

		Item expected_day_23_item_0 = new Item(name, 0, 80);
		Item expected_day_23_item_1 = new Item(name, -1, 80);

		Item expected_day_24_item_0 = new Item(name, 0, 80);
		Item expected_day_24_item_1 = new Item(name, -1, 80);

		Item expected_day_25_item_0 = new Item(name, 0, 80);
		Item expected_day_25_item_1 = new Item(name, -1, 80);

		Item expected_day_26_item_0 = new Item(name, 0, 80);
		Item expected_day_26_item_1 = new Item(name, -1, 80);

		Item expected_day_27_item_0 = new Item(name, 0, 80);
		Item expected_day_27_item_1 = new Item(name, -1, 80);

		Item expected_day_28_item_0 = new Item(name, 0, 80);
		Item expected_day_28_item_1 = new Item(name, -1, 80);

		Item expected_day_29_item_0 = new Item(name, 0, 80);
		Item expected_day_29_item_1 = new Item(name, -1, 80);

		Item expected_day_30_item_0 = new Item(name, 0, 80);
		Item expected_day_30_item_1 = new Item(name, -1, 80);

		// @formatter:off
	    	Item[] expectedItems = new Item[] {
	    			//adding item 0 per day
	    			expected_day_0_item_0, expected_day_1_item_0, expected_day_2_item_0, expected_day_3_item_0, expected_day_4_item_0, expected_day_5_item_0, expected_day_6_item_0, expected_day_7_item_0, expected_day_8_item_0, expected_day_9_item_0,
	    			expected_day_10_item_0, expected_day_11_item_0, expected_day_12_item_0, expected_day_13_item_0, expected_day_14_item_0, expected_day_15_item_0, expected_day_16_item_0, expected_day_17_item_0, expected_day_18_item_0, expected_day_19_item_0,
	    			expected_day_20_item_0, expected_day_21_item_0, expected_day_22_item_0, expected_day_23_item_0, expected_day_24_item_0, expected_day_25_item_0, expected_day_26_item_0, expected_day_27_item_0, expected_day_28_item_0, expected_day_29_item_0,
	    			expected_day_30_item_0,

	    			//adding item 1 per day
	    			expected_day_0_item_1, expected_day_1_item_1, expected_day_2_item_1, expected_day_3_item_1, expected_day_4_item_1, expected_day_5_item_1, expected_day_6_item_1, expected_day_7_item_1, expected_day_8_item_1, expected_day_9_item_1,
	    			expected_day_10_item_1, expected_day_11_item_1, expected_day_12_item_1, expected_day_13_item_1, expected_day_14_item_1, expected_day_15_item_1, expected_day_16_item_1, expected_day_17_item_1, expected_day_18_item_1, expected_day_19_item_1,
	    			expected_day_20_item_1, expected_day_21_item_1, expected_day_22_item_1, expected_day_23_item_1, expected_day_24_item_1, expected_day_25_item_1, expected_day_26_item_1, expected_day_27_item_1, expected_day_28_item_1, expected_day_29_item_1,
	    			expected_day_30_item_1


	    	};
	    	// @formatter:on

		// days, item 0
		for (int i = 0; i < 30; i++) {

			assertEquals(expectedItems[i].name, actual0.name, "name test failed");
			assertEquals(expectedItems[i].quality, actual0.quality, "quality test failed");
			assertEquals(expectedItems[i].sellIn, actual0.sellIn, "sellIn test failed");
			log.debug("item {}", actual0);

			assertEquals(expectedItems[i + 31].name, actual1.name, "name test failed");
			assertEquals(expectedItems[i + 31].quality, actual1.quality, "quality test failed");
			assertEquals(expectedItems[i + 31].sellIn, actual1.sellIn, "sellIn test failed");
			log.debug("item {}", actual1);

			app.updateQuality();

		}

	}

	@Test
	void test_Backstage_passes_to_a_TAFKAL80ETC_concert_day30_quantity3() {
		String name = Factory.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT;
		Item actual0 = new Item(name, 15, 20);
		Item actual1 = new Item(name, 10, 49);
		Item actual2 = new Item(name, 5, 49);
		Item[] items = new Item[] { actual0, actual1, actual2 };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);

		Item expected_day_0_item_0 = new Item(name, 15, 20);
		Item expected_day_0_item_1 = new Item(name, 10, 49);
		Item expected_day_0_item_2 = new Item(name, 5, 49);

		Item expected_day_1_item_0 = new Item(name, 14, 21);
		Item expected_day_1_item_1 = new Item(name, 9, 50);
		Item expected_day_1_item_2 = new Item(name, 4, 50);

		Item expected_day_2_item_0 = new Item(name, 13, 22);
		Item expected_day_2_item_1 = new Item(name, 8, 50);
		Item expected_day_2_item_2 = new Item(name, 3, 50);

		Item expected_day_3_item_0 = new Item(name, 12, 23);
		Item expected_day_3_item_1 = new Item(name, 7, 50);
		Item expected_day_3_item_2 = new Item(name, 2, 50);

		Item expected_day_4_item_0 = new Item(name, 11, 24);
		Item expected_day_4_item_1 = new Item(name, 6, 50);
		Item expected_day_4_item_2 = new Item(name, 1, 50);

		Item expected_day_5_item_0 = new Item(name, 10, 25);
		Item expected_day_5_item_1 = new Item(name, 5, 50);
		Item expected_day_5_item_2 = new Item(name, 0, 50);

		Item expected_day_6_item_0 = new Item(name, 9, 27);
		Item expected_day_6_item_1 = new Item(name, 4, 50);
		Item expected_day_6_item_2 = new Item(name, -1, 0);

		Item expected_day_7_item_0 = new Item(name, 8, 29);
		Item expected_day_7_item_1 = new Item(name, 3, 50);
		Item expected_day_7_item_2 = new Item(name, -2, 0);

		Item expected_day_8_item_0 = new Item(name, 7, 31);
		Item expected_day_8_item_1 = new Item(name, 2, 50);
		Item expected_day_8_item_2 = new Item(name, -3, 0);

		Item expected_day_9_item_0 = new Item(name, 6, 33);
		Item expected_day_9_item_1 = new Item(name, 1, 50);
		Item expected_day_9_item_2 = new Item(name, -4, 0);

		Item expected_day_10_item_0 = new Item(name, 5, 35);
		Item expected_day_10_item_1 = new Item(name, 0, 50);
		Item expected_day_10_item_2 = new Item(name, -5, 0);

		Item expected_day_11_item_0 = new Item(name, 4, 38);
		Item expected_day_11_item_1 = new Item(name, -1, 0);
		Item expected_day_11_item_2 = new Item(name, -6, 0);

		Item expected_day_12_item_0 = new Item(name, 3, 41);
		Item expected_day_12_item_1 = new Item(name, -2, 0);
		Item expected_day_12_item_2 = new Item(name, -7, 0);

		Item expected_day_13_item_0 = new Item(name, 2, 44);
		Item expected_day_13_item_1 = new Item(name, -3, 0);
		Item expected_day_13_item_2 = new Item(name, -8, 0);

		Item expected_day_14_item_0 = new Item(name, 1, 47);
		Item expected_day_14_item_1 = new Item(name, -4, 0);
		Item expected_day_14_item_2 = new Item(name, -9, 0);

		Item expected_day_15_item_0 = new Item(name, 0, 50);
		Item expected_day_15_item_1 = new Item(name, -5, 0);
		Item expected_day_15_item_2 = new Item(name, -10, 0);

		Item expected_day_16_item_0 = new Item(name, -1, 0);
		Item expected_day_16_item_1 = new Item(name, -6, 0);
		Item expected_day_16_item_2 = new Item(name, -11, 0);

		Item expected_day_17_item_0 = new Item(name, -2, 0);
		Item expected_day_17_item_1 = new Item(name, -7, 0);
		Item expected_day_17_item_2 = new Item(name, -12, 0);

		Item expected_day_18_item_0 = new Item(name, -3, 0);
		Item expected_day_18_item_1 = new Item(name, -8, 0);
		Item expected_day_18_item_2 = new Item(name, -13, 0);

		Item expected_day_19_item_0 = new Item(name, -4, 0);
		Item expected_day_19_item_1 = new Item(name, -9, 0);
		Item expected_day_19_item_2 = new Item(name, -14, 0);

		Item expected_day_20_item_0 = new Item(name, -5, 0);
		Item expected_day_20_item_1 = new Item(name, -10, 0);
		Item expected_day_20_item_2 = new Item(name, -15, 0);

		Item expected_day_21_item_0 = new Item(name, -6, 0);
		Item expected_day_21_item_1 = new Item(name, -11, 0);
		Item expected_day_21_item_2 = new Item(name, -16, 0);

		Item expected_day_22_item_0 = new Item(name, -7, 0);
		Item expected_day_22_item_1 = new Item(name, -12, 0);
		Item expected_day_22_item_2 = new Item(name, -17, 0);

		Item expected_day_23_item_0 = new Item(name, -8, 0);
		Item expected_day_23_item_1 = new Item(name, -13, 0);
		Item expected_day_23_item_2 = new Item(name, -18, 0);

		Item expected_day_24_item_0 = new Item(name, -9, 0);
		Item expected_day_24_item_1 = new Item(name, -14, 0);
		Item expected_day_24_item_2 = new Item(name, -19, 0);

		Item expected_day_25_item_0 = new Item(name, -10, 0);
		Item expected_day_25_item_1 = new Item(name, -15, 0);
		Item expected_day_25_item_2 = new Item(name, -20, 0);

		Item expected_day_26_item_0 = new Item(name, -11, 0);
		Item expected_day_26_item_1 = new Item(name, -16, 0);
		Item expected_day_26_item_2 = new Item(name, -21, 0);

		Item expected_day_27_item_0 = new Item(name, -12, 0);
		Item expected_day_27_item_1 = new Item(name, -17, 0);
		Item expected_day_27_item_2 = new Item(name, -22, 0);

		Item expected_day_28_item_0 = new Item(name, -13, 0);
		Item expected_day_28_item_1 = new Item(name, -18, 0);
		Item expected_day_28_item_2 = new Item(name, -23, 0);

		Item expected_day_29_item_0 = new Item(name, -14, 0);
		Item expected_day_29_item_1 = new Item(name, -19, 0);
		Item expected_day_29_item_2 = new Item(name, -24, 0);

		Item expected_day_30_item_0 = new Item(name, -15, 0);
		Item expected_day_30_item_1 = new Item(name, -20, 0);
		Item expected_day_30_item_2 = new Item(name, -25, 0);

		// @formatter:off
	    	Item[] expectedItems = new Item[] {
	    			//adding item 0 per day
	    			expected_day_0_item_0, expected_day_1_item_0, expected_day_2_item_0, expected_day_3_item_0, expected_day_4_item_0, expected_day_5_item_0, expected_day_6_item_0, expected_day_7_item_0, expected_day_8_item_0, expected_day_9_item_0,
	    			expected_day_10_item_0, expected_day_11_item_0, expected_day_12_item_0, expected_day_13_item_0, expected_day_14_item_0, expected_day_15_item_0, expected_day_16_item_0, expected_day_17_item_0, expected_day_18_item_0, expected_day_19_item_0,
	    			expected_day_20_item_0, expected_day_21_item_0, expected_day_22_item_0, expected_day_23_item_0, expected_day_24_item_0, expected_day_25_item_0, expected_day_26_item_0, expected_day_27_item_0, expected_day_28_item_0, expected_day_29_item_0,
	    			expected_day_30_item_0,

	    			//adding item 1 per day
	    			expected_day_0_item_1, expected_day_1_item_1, expected_day_2_item_1, expected_day_3_item_1, expected_day_4_item_1, expected_day_5_item_1, expected_day_6_item_1, expected_day_7_item_1, expected_day_8_item_1, expected_day_9_item_1,
	    			expected_day_10_item_1, expected_day_11_item_1, expected_day_12_item_1, expected_day_13_item_1, expected_day_14_item_1, expected_day_15_item_1, expected_day_16_item_1, expected_day_17_item_1, expected_day_18_item_1, expected_day_19_item_1,
	    			expected_day_20_item_1, expected_day_21_item_1, expected_day_22_item_1, expected_day_23_item_1, expected_day_24_item_1, expected_day_25_item_1, expected_day_26_item_1, expected_day_27_item_1, expected_day_28_item_1, expected_day_29_item_1,
	    			expected_day_30_item_1,

	    			//adding item 2 per day
	    			expected_day_0_item_2, expected_day_1_item_2, expected_day_2_item_2, expected_day_3_item_2, expected_day_4_item_2, expected_day_5_item_2, expected_day_6_item_2, expected_day_7_item_2, expected_day_8_item_2, expected_day_9_item_2,
	    			expected_day_10_item_2, expected_day_11_item_2, expected_day_12_item_2, expected_day_13_item_2, expected_day_14_item_2, expected_day_15_item_2, expected_day_16_item_2, expected_day_17_item_2, expected_day_18_item_2, expected_day_19_item_2,
	    			expected_day_20_item_2, expected_day_21_item_2, expected_day_22_item_2, expected_day_23_item_2, expected_day_24_item_2, expected_day_25_item_2, expected_day_26_item_2, expected_day_27_item_2, expected_day_28_item_2, expected_day_29_item_2,
	    			expected_day_30_item_2


	    	};
	    	// @formatter:on

		// days, item 0
		for (int i = 0; i < 30; i++) {
			log.debug("day {}", i);

			assertEquals(expectedItems[i].name, actual0.name, "name test failed");
			assertEquals(expectedItems[i].quality, actual0.quality, "quality test failed");
			assertEquals(expectedItems[i].sellIn, actual0.sellIn, "sellIn test failed");
			log.debug("item {}", actual0);

			assertEquals(expectedItems[i + 31].name, actual1.name, "name test failed");
			assertEquals(expectedItems[i + 31].quality, actual1.quality, "quality test failed");
			assertEquals(expectedItems[i + 31].sellIn, actual1.sellIn, "sellIn test failed");
			log.debug("item {}", actual1);

			assertEquals(expectedItems[i + 62].name, actual2.name, "name test failed");
			assertEquals(expectedItems[i + 62].quality, actual2.quality, "quality test failed");
			assertEquals(expectedItems[i + 62].sellIn, actual2.sellIn, "sellIn test failed");
			log.debug("item {}", actual2);

			app.updateQuality();
		}

	}
	/*
	 * from testtextficture, but without new requirement
	 * "- "Conjured" items degrade in Quality twice as fast as normal items"
	 */

	@Disabled("See new requirement about \"Conjured\" items degrade in Quality twice as fast as normal items")
	@Test
	void test_Conjured_Mana_Cake_day30_Old() {
		String name = Factory.CONJURED_MANA_CAKE;
		Item actual = new Item(name, 3, 6);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);

		Item expected_day_0 = new Item(name, 3, 6);
		Item expected_day_1 = new Item(name, 2, 5);
		Item expected_day_2 = new Item(name, 1, 4);
		Item expected_day_3 = new Item(name, 0, 3);
		Item expected_day_4 = new Item(name, -1, 1);
		Item expected_day_5 = new Item(name, -2, 0);
		Item expected_day_6 = new Item(name, -3, 0);
		Item expected_day_7 = new Item(name, -4, 0);
		Item expected_day_8 = new Item(name, -5, 0);
		Item expected_day_9 = new Item(name, -6, 0);
		Item expected_day_10 = new Item(name, -7, 0);
		Item expected_day_11 = new Item(name, -8, 0);
		Item expected_day_12 = new Item(name, -9, 0);
		Item expected_day_13 = new Item(name, -10, 0);
		Item expected_day_14 = new Item(name, -11, 0);
		Item expected_day_15 = new Item(name, -12, 0);
		Item expected_day_16 = new Item(name, -13, 0);
		Item expected_day_17 = new Item(name, -14, 0);
		Item expected_day_18 = new Item(name, -15, 0);
		Item expected_day_19 = new Item(name, -16, 0);
		Item expected_day_20 = new Item(name, -17, 0);
		Item expected_day_21 = new Item(name, -18, 0);
		Item expected_day_22 = new Item(name, -19, 0);
		Item expected_day_23 = new Item(name, -20, 0);
		Item expected_day_24 = new Item(name, -21, 0);
		Item expected_day_25 = new Item(name, -22, 0);
		Item expected_day_26 = new Item(name, -23, 0);
		Item expected_day_27 = new Item(name, -24, 0);
		Item expected_day_28 = new Item(name, -25, 0);
		Item expected_day_29 = new Item(name, -26, 0);
		Item expected_day_30 = new Item(name, -27, 0);
		// @formatter:off
	    	Item[] expectedItems = new Item[] {
	    			expected_day_0, expected_day_1, expected_day_2, expected_day_3, expected_day_4, expected_day_5, expected_day_6, expected_day_7, expected_day_8, expected_day_9,
	    			expected_day_10, expected_day_11, expected_day_12, expected_day_13, expected_day_14, expected_day_15, expected_day_16, expected_day_17, expected_day_18, expected_day_19,
	    			expected_day_20, expected_day_21, expected_day_22, expected_day_23, expected_day_24, expected_day_25, expected_day_26, expected_day_27, expected_day_28, expected_day_29,
	    			expected_day_30
	    	};
	    	// @formatter:on

		// days
		for (int i = 0; i < 30; i++) {
			log.debug("day {}", i);

			assertEquals(expectedItems[i].name, actual.name, "name test failed");
			assertEquals(expectedItems[i].quality, actual.quality, "quality test failed");
			assertEquals(expectedItems[i].sellIn, actual.sellIn, "sellIn test failed");
			log.debug("item {}", actual);

			app.updateQuality();

		}

	}

	@Test
	void test_Conjured_Mana_Cake_day30() {
		String name = Factory.CONJURED_MANA_CAKE;
		Item actual = new Item(name, 3, 6);
		Item[] items = new Item[] { actual };
		Factory factory = new Factory();
		GildedRose app = new GildedRose(factory, items);

		Item expected_day_0 = new Item(name, 3, 6);
		Item expected_day_1 = new Item(name, 2, 4);
		Item expected_day_2 = new Item(name, 1, 2);
		Item expected_day_3 = new Item(name, 0, 0);
		Item expected_day_4 = new Item(name, -1, 0);
		Item expected_day_5 = new Item(name, -2, 0);
		Item expected_day_6 = new Item(name, -3, 0);
		Item expected_day_7 = new Item(name, -4, 0);
		Item expected_day_8 = new Item(name, -5, 0);
		Item expected_day_9 = new Item(name, -6, 0);
		Item expected_day_10 = new Item(name, -7, 0);
		Item expected_day_11 = new Item(name, -8, 0);
		Item expected_day_12 = new Item(name, -9, 0);
		Item expected_day_13 = new Item(name, -10, 0);
		Item expected_day_14 = new Item(name, -11, 0);
		Item expected_day_15 = new Item(name, -12, 0);
		Item expected_day_16 = new Item(name, -13, 0);
		Item expected_day_17 = new Item(name, -14, 0);
		Item expected_day_18 = new Item(name, -15, 0);
		Item expected_day_19 = new Item(name, -16, 0);
		Item expected_day_20 = new Item(name, -17, 0);
		Item expected_day_21 = new Item(name, -18, 0);
		Item expected_day_22 = new Item(name, -19, 0);
		Item expected_day_23 = new Item(name, -20, 0);
		Item expected_day_24 = new Item(name, -21, 0);
		Item expected_day_25 = new Item(name, -22, 0);
		Item expected_day_26 = new Item(name, -23, 0);
		Item expected_day_27 = new Item(name, -24, 0);
		Item expected_day_28 = new Item(name, -25, 0);
		Item expected_day_29 = new Item(name, -26, 0);
		Item expected_day_30 = new Item(name, -27, 0);
		// @formatter:off
	    	Item[] expectedItems = new Item[] {
	    			expected_day_0, expected_day_1, expected_day_2, expected_day_3, expected_day_4, expected_day_5, expected_day_6, expected_day_7, expected_day_8, expected_day_9,
	    			expected_day_10, expected_day_11, expected_day_12, expected_day_13, expected_day_14, expected_day_15, expected_day_16, expected_day_17, expected_day_18, expected_day_19,
	    			expected_day_20, expected_day_21, expected_day_22, expected_day_23, expected_day_24, expected_day_25, expected_day_26, expected_day_27, expected_day_28, expected_day_29,
	    			expected_day_30
	    	};
	    	// @formatter:on

		// days
		for (int i = 0; i < 30; i++) {
			log.debug("day {}", i);

			assertEquals(expectedItems[i].name, actual.name, "name test failed");
			assertEquals(expectedItems[i].quality, actual.quality, "quality test failed");
			assertEquals(expectedItems[i].sellIn, actual.sellIn, "sellIn test failed");
			log.debug("item {}", actual);

			app.updateQuality();

		}

	}
}
