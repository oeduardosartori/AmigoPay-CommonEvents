package com.amigopay.events;

import java.time.LocalDateTime;
import java.util.UUID;

public record UserCreatedEvent(
        UUID id,
        String firstName,
        String lastName,
        String email,
        LocalDateTime createdAt
) {}
