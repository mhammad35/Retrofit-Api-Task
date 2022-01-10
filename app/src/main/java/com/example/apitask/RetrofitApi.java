package com.example.apitask;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApi {

    @GET("comments?postId=1")
    Call<List<ModelClass>> getModelClass();


}
