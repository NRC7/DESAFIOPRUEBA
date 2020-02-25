package com.nrc7.desafiolifecycle.models;


public class Question implements java.io.Serializable {
    private static final long serialVersionUID = -2670353060187771354L;
    private String difficulty;
    private String question;
    private String correct_answer;
    private String[] incorrect_answers;
    private String category;
    private String type;

    public Question(String difficulty, String question, String correct_answer, String[] incorrect_answers, String category, String type) {
        this.difficulty = difficulty;
        this.question = question;
        this.correct_answer = correct_answer;
        this.incorrect_answers = incorrect_answers;
        this.category = category;
        this.type = type;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public String[] getIncorrect_answers() {
        return incorrect_answers;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }
}
