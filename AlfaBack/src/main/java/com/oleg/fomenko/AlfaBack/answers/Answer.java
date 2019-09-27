package com.oleg.fomenko.AlfaBack.answers;

public class Answer {
    private int status;
    private String text;

    public static final int OK_ANSWER = 200;
    public static final int WRONG_ANSWER = 503;

    public Answer(int status, String text) {
        this.status = status;
        this.text = text;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static final Answer getOkAnswer(String text) {
        return new Answer(OK_ANSWER, text);
    }

    public static final Answer getWrongAnswer(String text) {
        return new Answer(WRONG_ANSWER, text);
    }
}
