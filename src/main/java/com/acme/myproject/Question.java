package com.acme.myproject;

public abstract class Question implements Answerable {
    protected String answer;
    protected String code;

    public Question(String code) {
        this.code = code;
    }

    public String getProvidedAnswer() {
        return answer;
    }

    abstract public void answerWithDefaultValue();

    public String getCode() {
        return code;
    }

}
