package com.cardstox.cards.services;

import java.util.List;

import com.cardstox.cards.entities.Card;

public interface CardService {
	List<Card> findAllCards();
}
