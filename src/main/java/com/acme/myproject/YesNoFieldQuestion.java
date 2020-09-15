package com.acme.myproject;

public class YesNoFieldQuestion extends Question {
    public YesNoFieldQuestion(String code) {
        super(code);
    }

    @Override
    public void answerWithDefaultValue() {
        this.answer = "No";
    }
}
