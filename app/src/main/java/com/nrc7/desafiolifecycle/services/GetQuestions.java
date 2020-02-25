package com.nrc7.desafiolifecycle.services;

import android.util.Log;

import com.nrc7.desafiolifecycle.models.Question;
import com.nrc7.desafiolifecycle.models.Wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class GetQuestions {

    private List<Question> questionList = getQuestions();

    public List<Question> getQuestionList() {
        return questionList;
    }

    private List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        try {
            Wrapper wrapper = new QuestionService().execute().get();
            Question[] response = wrapper.getResults();
            questions = Arrays.asList(response);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return questions;
    }



    private static class QuestionService extends Service {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d("NRC7", "onPreExecute()");
        }

        @Override
        protected void onPostExecute(Wrapper wrapper) {
            super.onPostExecute(wrapper);
            Log.d("NRC7", "onPostExecute(Wrapper wrapper)");
        }
    }
}
