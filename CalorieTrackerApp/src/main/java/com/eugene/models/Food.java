//package com.eugene.models;
//
//import com.eugene.dto.FoodNutrientDTO;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Entity
//@Table(name = "food")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class Food {
//    @Id
////    remove the @GeneratedValue, since the fdcId comes from the external API.
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "fdc_id", updatable = false)
//    private String fdcId;
//
//    @Column(name = "description", nullable = false)
//    private String description;
//
//    @Column(name = "brandName", nullable = false)
//    private String brandName;
//
//    @Column(name = "serving_size", nullable = false)
//    private String servingSize;
//
//    @Column(name = "serving_unit", nullable = false)
//    private String servingUnit;
//
//    @Column(name = "calorieCount", nullable = false)
//    private Integer calorieCount;
//
//    // The lastUpdated field tracks when the food item was last updated in the API
//    @Column(name = "last_updated")
//    private LocalDateTime lastUpdated;
//
//    /**
//     * This method updates the lastUpdated field.
//     * */
//    @PreUpdate
//    @PrePersist
//    public void updateTimeStamp(){
//        lastUpdated = LocalDateTime.now();
//    }
//}

//    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<FoodNutrientDTO> foodNutrients;

    //    @Column(name = "description", unique = true, nullable = false)
//    private String foodName;

//    @Column(name = "calories", nullable = false)
//    private Integer calorie;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "u_id", nullable = false)
//    private User user;
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "f_id", updatable = false)
//    private Long fId;
//
//    @Column(name = "food_name", unique = true, nullable = false)
//    private String foodName;
//
//    @Column(name = "calories", nullable = false)
//    private Integer calorie;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "u_id", nullable = false)
//    private User user;

//    @OneToMany(mappedBy="food")
//    @JsonManagedReference(value = "food")
//    private List<CalorieTrack> calorieTrackList;

