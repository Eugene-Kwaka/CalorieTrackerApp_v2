package com.eugene.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodNutrientDTO {
    private String nutrientName;
    private Double value;
    private String unitName;
}
