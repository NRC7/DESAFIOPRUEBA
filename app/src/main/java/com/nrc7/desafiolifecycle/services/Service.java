package com.nrc7.desafiolifecycle.services;

import android.os.AsyncTask;
import android.util.Log;

import com.nrc7.desafiolifecycle.models.Wrapper;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class Service extends AsyncTask<Wrapper, Void, Wrapper> {

    @Override
    protected Wrapper doInBackground(Wrapper... wrappers) {
        QuestionsApi questionsApi = new Interceptor().getQuestionList();
        Call<Wrapper> questionCall = questionsApi.getAllQuestions();

        try {
            Response<Wrapper> wrapperResponse = questionCall.execute();
            if (200 == wrapperResponse.code()) {
                return wrapperResponse.body();
            }
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("NRC7", "doInBackground: Exception Triggered");
        }
        return null;
    }
}
