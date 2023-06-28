package io.olidam.cards.service.controller;

import io.olidam.cards.service.model.dto.CardDto;
import io.olidam.cards.service.model.dto.CustomerDto;
import io.olidam.cards.service.model.mapper.CardMapper;
import io.olidam.cards.service.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService service;
    private final CardMapper mapper;

    @GetMapping
    List<CardDto> getAll() {
        return mapper.toApi(service.findAll());
    }

    @GetMapping("{id}")
    CardDto findById(@PathVariable int id) {
        return service.findById(id)
                .map(mapper::toApi)
                .orElseThrow(() -> new RuntimeException("Could not find card with id %s".formatted(id)));
    }

    @PostMapping("myCards")
    List<CardDto> getCardsForCustomer(@RequestBody CustomerDto customer) {
        return service.findCardsForCustomer(customer.customerId()).stream()
                .map(mapper::toApi)
                .toList();
    }

    @PostMapping
    CardDto createCard(@RequestBody CardDto card) {
        return mapper.toApi(service.createCard(mapper.toDb(card)));
    }

    @DeleteMapping("{id}")
    CardDto deleteAccount(@PathVariable int id) {
        return service.delete(id)
                .map(mapper::toApi)
                .orElseThrow(() -> new RuntimeException("Could not find card with id %s".formatted(id)));
    }
}
