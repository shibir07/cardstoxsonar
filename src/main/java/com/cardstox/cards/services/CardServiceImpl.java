package com.cardstox.cards.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardstox.cards.entities.Card;
import com.cardstox.cards.repositories.CardRepository;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	CardRepository cardRepository;

	@Override
	public List<Card> findAllCards() {
		return cardRepository.findAll();
	}

}
