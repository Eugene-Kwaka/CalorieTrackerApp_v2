package com.eugene.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CalorieTrackDTO {
    private Long cId;
    private Double serving;
    private LocalDate logDate;
    //    private UserDTO user;
    private FoodDTO food;
    private Long uId;

}
