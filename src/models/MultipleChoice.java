package models;

import java.util.ArrayList;

/**
 * @author Benjamin Dow
 */
public class MultipleChoice extends Question {
    private ArrayList<String> choices;

    /**
     * Creates an Empty Multiple Choice Question
     */
    public MultipleChoice(){
        super();
        choices = new ArrayList<>();
    }

    public MultipleChoice(String questionText, String answer, ArrayList<String> choices){
        super(questionText,answer);
        this.choices = choices;
    }


    public ArrayList<String> getChoices(){
        return choices;
    }

    public void addChoice(String choice){
        choices.add(choice);
        notifyObservers();
    }

    public void removeChoice(String choice){
        choices.remove(choice);
    }

    public void removeChoice(int choiceNumber){
        choices.remove(choiceNumber);
    }

    /**
     * Considered True if o is a multiple choice object, has the same question text
     * and has the same choice list
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if(o instanceof MultipleChoice){
            if(( ((MultipleChoice) o).getQuestionText().equals(this.getQuestionText()))) {
                if (((MultipleChoice) o).choices.equals(this.choices)) {
                    return true;
                }
            }
        }

        return false;
    }
}
