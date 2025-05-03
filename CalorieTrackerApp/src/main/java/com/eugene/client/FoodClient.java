package com.eugene.client;

// import com.eugene.dto.FoodDTO;
// import com.eugene.dto.FoodResponseDTO;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.http.HttpMethod;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Component;
// import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.eugene.dto.FoodDTO;
import com.eugene.dto.FoodResponseDTO;

@FeignClient(name = "foodClient", url = "${food.api.url}")
public interface FoodClient {

    /**
     * Returns a list of food that match the search(query) keywords
     * @param query the search query that will be replaced with the actual search term example: "apple"
     * @param apiKey the API key that will be replaced with the actual API key example: "ABCD1234"
     * @return a list of food items that match the search query
     *   */
    @GetMapping("/foods/search?query={query}")
    FoodResponseDTO searchFoodItems(@PathVariable("query") String query, @RequestParam("api_key") String apiKey);

    /** 
     * Returns a single food item based on its fdcId
     * @param fdcId the fdcId that will be replaced with the actual fdcId example: "534358"
     * @param apiKey the API key that will be replaced with the actual API key example: "ABCD1234"
     * @return a single food item
     */ 
    @GetMapping("/food/{fdcId}")
    FoodDTO getFoodItemByFdcId(@PathVariable("fdcId") String fdcId, @RequestParam("api_key") String apiKey);

}



