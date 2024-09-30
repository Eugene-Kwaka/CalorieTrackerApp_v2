package com.eugene.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodDTO {

    // Added new fields from external API response
    private String fdcId;

    // I will calculate the calorieCount from the details in the foodNutrientDTO inside the FoodService.
    private Double calorieCount;

    private String description;
    private String ingredients;
    private String foodCategory;
    private String servingSizeUnit;
    private String servingSize;

    // FoodNutrientDTO contains details of the food's nutrient from the external API.
    private List<FoodNutrientDTO> foodNutrients;
}

    // foreign key
    //private Long uId;

