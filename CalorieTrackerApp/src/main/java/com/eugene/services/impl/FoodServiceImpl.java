//package com.eugene.services.impl;
//
//import com.eugene.dto.FoodDTO;
//import com.eugene.dto.FoodNutrientDTO;
//import com.eugene.dto.FoodResponseDTO;
////import com.eugene.dto.SingleFoodDetailResponseDTO;
//import com.eugene.exceptions.FoodExceptions.FoodNotFoundException;
//import com.eugene.services.FoodService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.*;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.HttpClientErrorException;
//import org.springframework.web.client.RestClient;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//
///**
// * This simplified version of FoodServiceImpl acts purely as a client to the FoodData Central API.
// * It fetches food data on-demand and converts it to my application's FoodDTO format without any local storage.
// * */
//
//@Service
//public class FoodServiceImpl implements FoodService {
//
//    /**
//     * Using the @Value() annotation from Spring allows me to inject values from the
//     * properties file's
//     * environment variables
//     */
////    @Value("${food.data.api.url}")
//    private static String apiUrl = "https://api.nal.usda.gov/fdc/v1";
//
////    @Value("${food.data.api.key}")
//    private static String apiKey = "EhjNU9TxV089w4KTSQy1WIUOvBvJ5vt6xr7SgeoR";
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//
//
//
//    @Override
//    public List<FoodDTO> searchFoodItems(String query) {
//
//        String url = apiUrl + "/foods/search?api_key=" + apiKey + "&query=" + query;
//        System.out.println(url);
//
//        ResponseEntity<FoodResponseDTO> responseEntity = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                null,
//                FoodResponseDTO.class
//                //query
//        );
//
//        // I retrieve the body of the response in the FoodResponseDTO.
//        FoodResponseDTO searchedFoodItems = responseEntity.getBody();
//
//        // Check if the searchedFoodItems list is null, if NOT, return the list of food items using the getFoods() method.
//        if (searchedFoodItems != null) {
//            return searchedFoodItems.getFoods();
//        }
//        // If the array is null, I return an empty list.
//        return Collections.emptyList();
//    }
//
//
////    /**
////     * Method to fetch details for one food item based on its fdcId*/
////    @Override
////    public FoodDTO getFoodItemByFdcId(String fdcId) {
////
////        String url = apiUrl + "/foods/" + fdcId + "?api_key=" + apiKey;
////
////        try {
////            ResponseEntity<SingleFoodDetailResponseDTO> responseEntity = restTemplate.exchange(
////                    url,
////                    HttpMethod.GET,
////                    null,
////                    SingleFoodDetailResponseDTO.class,
////                    fdcId
////            );
////
////            SingleFoodDetailResponseDTO singleFoodItem = responseEntity.getBody();
////
////            if (singleFoodItem != null){
////                return singleFoodItem.getSingleFoodItem();
////            }
////
////        } catch (HttpClientErrorException.NotFound e) {
////            throw new FoodNotFoundException("Food item with this fdcID not found: " + fdcId);
////        }
////
////        return null;
////    }
//
//}