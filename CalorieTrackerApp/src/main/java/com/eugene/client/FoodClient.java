package com.eugene.client;

import com.eugene.dto.FoodDTO;
import com.eugene.dto.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.util.Collections;
import java.util.List;

@Component
public class FoodClient {

    @Value("${food.api.url}")
    private String apiUrl;

    @Value("${food.api.key}")
    private String apiKey;


    @Autowired
    private RestTemplate restTemplate;


    public List<FoodDTO> searchFoodItems(String query) {

        String url = apiUrl + "/foods/search?api_key=" + apiKey + "&query=" + query;

        System.out.println(url);

        ResponseEntity<FoodResponseDTO> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                FoodResponseDTO.class
            );

        // I retrieve the body of the responseEntity and store it in the searchedFoodItems object of FoodResponseDTO type.
        FoodResponseDTO searchedFoodItems = responseEntity.getBody();

        // Check if the searchedFoodItems list is null, if NOT, return the list of food items using the getFoods() method.
        if (searchedFoodItems != null) {
            return searchedFoodItems.getFoods();
        }
        // If the array is null, I return an empty list.
        return Collections.emptyList();
    }


//    /**
//     * Method to fetch details for one food item based on its fdcId*/
//    @Override
//    public FoodDTO getFoodItemByFdcId(String fdcId) {
//
//        String url = apiUrl + "/foods/" + fdcId + "?api_key=" + apiKey;
//
//        try {
//            ResponseEntity<SingleFoodDetailResponseDTO> responseEntity = restTemplate.exchange(
//                    url,
//                    HttpMethod.GET,
//                    null,
//                    SingleFoodDetailResponseDTO.class,
//                    fdcId
//            );
//
//            SingleFoodDetailResponseDTO singleFoodItem = responseEntity.getBody();
//
//            if (singleFoodItem != null){
//                return singleFoodItem.getSingleFoodItem();
//            }
//
//        } catch (HttpClientErrorException.NotFound e) {
//            throw new FoodNotFoundException("Food item with this fdcID not found: " + fdcId);
//        }
//
//        return null;
//    }

}

