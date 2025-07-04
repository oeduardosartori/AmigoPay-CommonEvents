package com.amigopay.events;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Represents the request to initiate a payment between two wallets.
 * Issued by payment-service and consumed by wallet-service to process the transfer.
 */

public record PaymentInitiatedEvent(
        UUID paymentId,
        UUID payerId,
        UUID payeeId,
        BigDecimal amount,
        LocalDateTime timestamp
) { }
