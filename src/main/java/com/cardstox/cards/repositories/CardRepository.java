package com.cardstox.cards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardstox.cards.entities.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, String> {

}
