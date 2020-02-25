package com.nrc7.desafiolifecycle;

public class Question implements java.io.Serializable {
    private static final long serialVersionUID = 3478686235289175586L;
    private int response_code;
    private QuestionResults[] results;

    public int getResponse_code() {
        return this.response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public QuestionResults[] getResults() {
        return this.results;
    }

    public void setResults(QuestionResults[] results) {
        this.results = results;
    }
}
