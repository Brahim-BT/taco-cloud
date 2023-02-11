package com.brahim.tacocloud;

import java.util.List;

import javax.validation.constraints.Size;

import jakarta.annotation.Nonnull;
import lombok.Data;

@Data
public class Taco {

    @Nonnull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Nonnull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<String> ingredients;
}
