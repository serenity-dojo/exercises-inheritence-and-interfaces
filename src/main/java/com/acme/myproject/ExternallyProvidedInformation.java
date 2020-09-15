package com.acme.myproject;

public class ExternallyProvidedInformation implements Answerable {

    String theExternalAnswer;

    @Override
    public String getProvidedAnswer() {
        return theExternalAnswer;
    }

    @Override
    public void answerWithDefaultValue() {
        theExternalAnswer = "The Answer";
    }
}
