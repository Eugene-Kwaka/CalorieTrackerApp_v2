package com.eugene.controllers;


import com.eugene.client.FoodClient;
import com.eugene.dto.FoodDTO;
import com.eugene.dto.UserDTO;
import com.eugene.exceptions.FoodExceptions.FoodNotFoundException;
//import com.eugene.services.FoodService;
import com.eugene.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
//@RequestMapping("/api/users/{uId}/food")
@RequestMapping("api/food/")
public class FoodController {

    @Autowired
    private FoodClient foodClient;

    @GetMapping("/search/{query}")
    public ResponseEntity<List<FoodDTO>> searchFoodItems(@PathVariable String query){
        List<FoodDTO> foodItemsDTO = foodClient.searchFoodItems(query);
        if(foodItemsDTO.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(foodItemsDTO, HttpStatus.OK);
    }

//    @GetMapping("/{fdcId}")
//    public ResponseEntity<FoodDTO> getFoodItemByFdcId(@PathVariable String fdcId){
//       try{
//           FoodDTO foodItemDTO = foodService.getFoodItemByFdcId(fdcId);
//           return new ResponseEntity<>(foodItemDTO, HttpStatus.OK);
//
//       }catch(FoodNotFoundException e){
//           throw new FoodNotFoundException("Food item not found");
//       }
//    }


}
