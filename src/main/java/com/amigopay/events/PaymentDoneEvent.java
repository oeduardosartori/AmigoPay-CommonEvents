package com.amigopay.events;

import com.amigopay.events.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Represents confirmation that a payment was made successfully.
 */

public record PaymentDoneEvent(
        UUID paymentId,
        UUID payerId,
        UUID payeeId,
        BigDecimal amount,
        PaymentStatus status,
        LocalDateTime processedAt
) { }
