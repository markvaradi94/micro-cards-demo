package io.olidam.cards.service.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@Entity
@Table(name = "cards")
@NoArgsConstructor
@AllArgsConstructor
public class CardEntity {

    @Id
    @Column(name = "card_id")
    @GeneratedValue(strategy = IDENTITY)
    private int cardId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "total_limit")
    private int totalLimit;

    @Column(name = "amount_used")
    private int amountUsed;

    @Column(name = "available_amount")
    private int availableAmount;

    @Column(name = "outstanding_amount")
    private int outstandingAmount;

    @Column(name = "created_date")
    private LocalDate createdDate;
}
