package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = "email")
public class User {
    @NonNull private Long id;
    @NonNull private String username;
    @NonNull private String email;
    @NonNull private String password;
    @NonNull private Instant registrationDate;
}