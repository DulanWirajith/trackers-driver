package com.example.driver03.remote_connection;

import com.example.driver03.model.RegisterRequest;
import com.example.driver03.model.RegisterResponse;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface API {
    //    method for call registration route in node server
    @POST("/api/v1.0.0/registerdriver")
    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);

//    @POST("/api/v1.0.0/login")
//    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);
//
//    @POST("/api/v1.0.0/savereviews")
//    Call<PassengerReviewResponse> passengerReview(@Body PassengerReviewRequest passengerReviewRequest);


}
