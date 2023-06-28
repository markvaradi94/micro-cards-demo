package io.olidam.cards.service.repository;

import io.olidam.cards.service.model.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<CardEntity, Integer> {
    List<CardEntity> findAllByCustomerId(int customerId);
}
