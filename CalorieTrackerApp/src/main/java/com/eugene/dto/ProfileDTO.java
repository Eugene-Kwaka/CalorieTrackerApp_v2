package com.eugene.dto;

import org.hibernate.annotations.NotFound;

import io.micrometer.core.lang.NonNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileDTO {

    @NotNull(message = "Profile ID cannot be null")
    private Long pId;
    
    @NotNull(message = "Gender cannot be null")
    private String gender;

    @Min(value = 1, message = "Height must be greater than 0")
    @NotNull
    private Double height;

    @Min(value = 1, message = "Weight must be greater than 0")
    @NotNull
    private Double weight;

    @Min(value = 1, message = "Activity must be between 1 and 5")
    @Max(value = 5, message = "Activity must be between 1 and 5")
    @NotNull
    private Integer activity;

    @Min(value=1, message = "Calorie goal must be greater than 0")
    @NotNull
    private Integer calorieGoal;

    @NotNull(message = "User ID cannot be null")
    @NotNull
    // foreign key
    private Long uId;
}
