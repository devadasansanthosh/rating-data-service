package com.ibm.sf.ratingdataservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.ibm.sf.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingDataServiceController {
	
	@RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;

    }


}
