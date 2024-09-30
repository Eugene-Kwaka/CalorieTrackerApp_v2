//package com.eugene.repositories;
//
//import com.eugene.models.Food;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface FoodRepo extends JpaRepository<Food, Long> {
//    Optional<Food> findById(Long fId);
//    Optional<Food> findByFoodName(String foodName);
//    List<Food> findAllByFoodNameContainingIgnoreCase(String foodName);
//    List<Food> findAll();
//}
