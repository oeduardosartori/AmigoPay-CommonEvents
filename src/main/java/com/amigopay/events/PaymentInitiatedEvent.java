package com.amigopay.events;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record PaymentInitiatedEvent(
        UUID paymentId,
        UUID payerId,
        UUID payeeId,
        BigDecimal amount,
        LocalDateTime timestamp
) { }
