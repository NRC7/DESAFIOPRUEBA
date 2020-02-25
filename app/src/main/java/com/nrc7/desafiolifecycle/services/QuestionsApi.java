package com.nrc7.desafiolifecycle.services;

import com.nrc7.desafiolifecycle.models.Wrapper;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionsApi {
    @GET("api.php?amount=10&category=15&difficulty=easy")
    Call<Wrapper> getAllQuestions();
}
