package com.nrc7.desafiolifecycle.models;

import androidx.annotation.NonNull;

public class Wrapper implements java.io.Serializable {
    private static final long serialVersionUID = 3478686235289175586L;
    private int response_code;
    private Question[] results;

    public int getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public Question[] getResults() {
        return this.results;
    }

    public void setResults(Question[] results) {
        this.results = results;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
