package com.acme.myproject;

public class DropdownQuestion extends Question {
    public DropdownQuestion(String code) {
        super(code);
    }

    @Override
    public void answerWithDefaultValue() {
        this.answer = "0";
    }
}
