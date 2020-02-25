package com.nrc7.desafiolifecycle.models;

import androidx.annotation.NonNull;

public class Wrapper implements java.io.Serializable {
    private static final long serialVersionUID = 3478686235289175586L;
    private int response_code;
    private Question[] results;

    public Wrapper(int response_code, Question[] results) {
        this.response_code = response_code;
        this.results = results;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getResponse_code() {
        return response_code;
    }

    public Question[] getResults() {
        return results;
    }
}
