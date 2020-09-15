# Questions and answers

The aim of this exercise is to create a hierchy of classes to represent the answers to questions on a form. We want to be able to answer each question on a form with a sensible default value, without worrying about what value to put in each field. 

The business rules are as follows:
  - Different types of questions should have different default answers
  - Types of questions include:
    - Text fields (default value "123456")
    - Yes/No fields (default value "No")
    - Dropdown lists (default value "0")

To implement this, follow the following steps:

  - Implement a superclass `Question`, and a subclass for each type of question. The `Question` class should have the following fields:  
    - answer
    - code
    
  - and the following methods:
     - answerWithDefaultValue()
     - getProvidedAnswer()
     - getCode()
    
  2. Create an interface called `Answerable` with the first two methods.
  
  3. Create a new class called `ExternallyProvidedInformation`, which also implements the Answerable interface.
  
  4. Write a test that uses the Answerable interface to create a list of questions of different types, as well as an instance of `ExternallyProvidedInformation`. The test should get the information from each instance in a loop, and check the results of each.
  
  