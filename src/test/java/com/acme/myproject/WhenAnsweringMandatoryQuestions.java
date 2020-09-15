package com.acme.myproject;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenAnsweringMandatoryQuestions {
    @Test
    public void textFieldsShouldBeAnsweredWithAValidTextValue() {

        Question textFieldQuestion = new TextFieldQuestion("Q1");

        textFieldQuestion.answerWithDefaultValue();

        assertThat(textFieldQuestion.getProvidedAnswer()).isEqualTo("123456");
    }

    @Test
    public void yesNoFieldsShouldBeAnsweredWithNo() {
        Question yesNoField = new YesNoFieldQuestion("Q2");

        yesNoField.answerWithDefaultValue();

        assertThat(yesNoField.getProvidedAnswer()).isEqualTo("No");
    }

    @Test
    public void dropDownListsShouldHaveAnAnswerOfZero() {
        Question dropdownQuestion = new DropdownQuestion("Q3");

        dropdownQuestion.answerWithDefaultValue();

        assertThat(dropdownQuestion.getProvidedAnswer()).isEqualTo("0");
    }

    @Test
    public void answerablesShouldAllHaveDefaultValues() {
        List<Answerable> answers = Arrays.asList(
                new DropdownQuestion("Q3"),
                new YesNoFieldQuestion("Q2"),
                new ExternallyProvidedInformation()
        );

        answers.forEach(
                answer -> answer.answerWithDefaultValue()
        );

        assertThat(answers.get(0).getProvidedAnswer()).isEqualTo("0");
        assertThat(answers.get(1).getProvidedAnswer()).isEqualTo("No");
        assertThat(answers.get(2).getProvidedAnswer()).isEqualTo("The Answer");
    }
}
