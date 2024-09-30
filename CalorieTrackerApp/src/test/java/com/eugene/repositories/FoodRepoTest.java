//package com.eugene.repositories;
//
//import com.eugene.CalorieTrackerAppApplication;
//import com.eugene.models.Food;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest(classes = CalorieTrackerAppApplication.class)
////@Transactional
//class FoodRepoTest {
//
//    @Autowired
//    FoodRepo repository;
//
//    @Test
//    void shouldFindFoodItems(){
//        List<Food> actual = repository.findAll();
//        assertNotNull(actual);
//        assertEquals(actual.size(), 95);
//    }
//
//}