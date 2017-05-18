package models;

import java.util.Observable;

/**
 * @author Benjamin Dow
 */
public abstract class Question extends Observable {
    private String questionText;
    private String answer;

    /**
     * Constructor. Used to construct an empty question
     */
    public Question(){

    }

    /**
     * Constructor
     * @param questionText The question text
     */
    public Question(String questionText, String answer){
        this.questionText = questionText;
        this.answer = answer;
    }

    public void setQuestionText(String questionText){
        this.questionText = questionText;
    }

    public String getQuestionText(){
        return questionText;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return answer;
    }





}
