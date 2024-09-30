package com.eugene.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileDTO {
    private Long pId;
    private String gender;
    private Double height;
    private Double weight;
    private Integer activity;
    private Integer calorieGoal;
    // foreign key
    private Long uId;
}
