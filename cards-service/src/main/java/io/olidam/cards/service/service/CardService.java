package io.olidam.cards.service.service;

import io.olidam.cards.service.model.entity.CardEntity;
import io.olidam.cards.service.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository repository;


    public List<CardEntity> findAll() {
        return repository.findAll();
    }

    public Optional<CardEntity> findById(int id) {
        return repository.findById(id);
    }

    public List<CardEntity> findCardsForCustomer(int customerId) {
        return repository.findAllByCustomerId(customerId);
    }

    public CardEntity createCard(CardEntity newCard) {
        return repository.save(newCard);
    }

    public Optional<CardEntity> delete(int id) {
        Optional<CardEntity> cardToDelete = findById(id);
        cardToDelete.ifPresent(repository::delete);
        return cardToDelete;
    }
}
