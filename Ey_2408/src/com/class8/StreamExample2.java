package com.class8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {

		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("coffee");
		shoppingList.add("bread");
		shoppingList.add("pineapple");
		shoppingList.add("milk");
		shoppingList.add("pasta");

		Stream<String> shoppingListStream = shoppingList.stream();
		shoppingListStream.sorted().map(item -> item.toLowerCase()).
		filter(item -> item.startsWith("p")).
		forEach(item -> System.out.println(item));

		shoppingListStream.forEach(item -> System.out.println(item));

	}

}
