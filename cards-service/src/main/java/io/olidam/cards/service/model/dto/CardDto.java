package io.olidam.cards.service.model.dto;

import lombok.Builder;
import lombok.With;

import java.time.LocalDate;

@With
@Builder
public record CardDto(
        Integer cardId,
        Integer customerId,
        String cardNumber,
        String cardType,
        Integer totalLimit,
        Integer amountUsed,
        Integer availableAmount,
        Integer outstandingAmount,
        LocalDate createdDate
) {
}
