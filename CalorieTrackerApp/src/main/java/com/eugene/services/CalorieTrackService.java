package com.eugene.services;

import com.eugene.dto.CalorieTrackDTO;

import java.time.LocalDate;
import java.util.List;

public interface CalorieTrackService {
    public CalorieTrackDTO getCalories(Long cId);

    public List<CalorieTrackDTO> getCaloriesByUser(Long uId);

    public List<CalorieTrackDTO> getCaloriesByUserAndDateBetween(Long uId, LocalDate logDateStart, LocalDate logDateEnd);

    public List<CalorieTrackDTO> getCaloriesByUserAndDate(Long uId, LocalDate logDate);

    public Result<CalorieTrackDTO> createCalorieTrack(CalorieTrackDTO calorieTrackDTO);

    public Result<CalorieTrackDTO> updateCalorieTrack(CalorieTrackDTO calorieTrackDTO);

    public boolean deleteCalorieTrack(Long cId);




//    PUT https://localhost:8080:api/caloriestrack/{cId}







}
