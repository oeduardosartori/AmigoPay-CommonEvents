package com.amigopay.events;

import com.amigopay.events.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * It represents a rejection of payment by the financial service.
 */

public record PaymentRejectedEvent(
        UUID paymentId,
        UUID payerId,
        UUID payeeId,
        BigDecimal amount,
        PaymentStatus status,
        LocalDateTime rejectedAt,
        String rejectionReason
) {}

