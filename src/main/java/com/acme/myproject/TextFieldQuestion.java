package com.acme.myproject;

public class TextFieldQuestion extends Question {

    public TextFieldQuestion(String code) {
        super(code);
    }

    @Override
    public void answerWithDefaultValue() {
        this.answer = "123456";
    }
}
