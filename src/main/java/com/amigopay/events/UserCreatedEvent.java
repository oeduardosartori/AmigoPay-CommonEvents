package com.amigopay.events;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Event emitted by user-service when registering a new user
 * Consumed by wallet-service to automatically create a linked wallet.
 */

public record UserCreatedEvent(
        UUID id,
        String firstName,
        String lastName,
        String email,
        LocalDateTime createdAt
) { }
