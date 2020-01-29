package com.adaptionsoft.games;

import java.util.HashMap;

public class DecksManager {
    final Deck popDeck = new Deck(Category.POP);
    final Deck scienceDeck = new Deck(Category.SCIENCE);
    final Deck sportsDeck = new Deck(Category.SPORTS);
    final Deck rockDeck = new Deck(Category.ROCK);
    final HashMap<Category, Deck> categoryDecks = new HashMap<>();

    public DecksManager() {
        categoryDecks.put(Category.POP, popDeck);
        categoryDecks.put(Category.SCIENCE, scienceDeck);
        categoryDecks.put(Category.SPORTS, sportsDeck);
        categoryDecks.put(Category.ROCK, rockDeck);
    }

    public String getNextQuestion(int place) {
        Category[] categories = Category.values();
        String category = categories[place % categories.length].getName();

        System.out.println("The category is " + category);

        if (category.equals(categories[0].getName())) {
            return categoryDecks.get(Category.POP).getNextQuestion();
        }
        if (category.equals(categories[1].getName())) {
            return categoryDecks.get(Category.SCIENCE).getNextQuestion();
        }
        if (category.equals(categories[2].getName())) {
            return categoryDecks.get(Category.SPORTS).getNextQuestion();
        }
        if (category.equals(categories[3].getName())) {
            return categoryDecks.get(Category.ROCK).getNextQuestion();
        }
        throw new Error("");
    }
}
