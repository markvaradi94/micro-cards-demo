DROP TABLE IF EXISTS cards;

CREATE TABLE cards
(
    `card_id`            int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    `card_number`        varchar(100)       NOT NULL,
    `customer_id`        int                NOT NULL,
    `card_type`          varchar(100)       NOT NULL,
    `created_date`       date DEFAULT NULL,
    `total_limit`        int                NOT NULL,
    `available_amount`   int                NOT NULL,
    `amount_used`        int                NOT NULL,
    `outstanding_amount` int                NOT NULL
);


INSERT INTO cards(card_number, customer_id, card_type, created_date, total_limit, available_amount, amount_used,
                  outstanding_amount)
VALUES ('4567XXXX12578312', 1, 'Debit', CURRENT_DATE, 10000, 1000, 9000, 2000);

INSERT INTO cards(card_number, customer_id, card_type, created_date, total_limit, available_amount, amount_used,
                  outstanding_amount)
VALUES ('9999XXXX12578312', 1, 'Credit', CURRENT_DATE, 250000, 1000, 240000, 12000);

INSERT INTO cards(card_number, customer_id, card_type, created_date, total_limit, available_amount, amount_used,
                  outstanding_amount)
VALUES ('1234XXXX12578312', 1, 'Credit', CURRENT_DATE, 50000, 25000, 25000, 3000);
