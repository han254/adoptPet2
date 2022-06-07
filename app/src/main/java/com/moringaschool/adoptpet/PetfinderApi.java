package com.moringaschool.adoptpet;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PetfinderApi {
    @GET("animals/search")
    Call<PetSearchResponse> getPets(
            @Query("address") String address,
            @Query("term") String term
    );
}
