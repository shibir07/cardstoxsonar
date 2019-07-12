package com.cardstox.cards.controllers;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.cardstox.cards.entities.Card;
import com.cardstox.cards.services.CardService;

@RunWith(MockitoJUnitRunner.class)
public class CardsControllerTests {

	@InjectMocks
	CardsController subject;

	@Mock
	CardService cardsService;

	@Test
	public void testShouldCallFindAllCardsAndReturnListOfCards() {
		// given
		List<Card> cards = new ArrayList<>();
		when(cardsService.findAllCards()).thenReturn(cards);

		// when
		List<Card> result = subject.findAllCards();

		// then
		verify(cardsService).findAllCards();
		assertThat(result, notNullValue());
	}
}
