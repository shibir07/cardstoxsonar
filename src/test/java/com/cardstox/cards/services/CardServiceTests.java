package com.cardstox.cards.services;

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
import com.cardstox.cards.repositories.CardRepository;

@RunWith(MockitoJUnitRunner.class)
public class CardServiceTests {
	@InjectMocks
	CardServiceImpl subject;

	@Mock
	CardRepository cardRepository;

	@Test
	public void testShouldCallFindAllAndReturnListOfCards() {
		// given
		List<Card> cards = new ArrayList<>();
		when(cardRepository.findAll()).thenReturn(cards);

		// when
		List<Card> result = subject.findAllCards();

		// then
		verify(cardRepository).findAll();
		assertThat(result, notNullValue());

	}
}
