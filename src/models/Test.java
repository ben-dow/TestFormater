package models;

import java.util.*;

/**
 * @author Benjamin Dow
 *
 * Class definition for a "Test"
 */
public class Test extends Observable implements Observer {

    /**
     * Represented as a Linked List
     * Top thing in the Linked List
     * will be the first question
     */
    private LinkedList<Question> testQuestions;
    private FileInfo fileInfo;
    private TestInfo testInfo;


    /**
     * Constructor for creating an empty class
     * Initiates the state variables in the class
     */
    public Test(){
        testQuestions = new LinkedList<>();
        fileInfo = new FileInfo();
        testInfo = new TestInfo();
    }

    /**
     *
     * @param question A question object
     */
    public void addQuestion(Question question){
        question.addObserver(this);
        testQuestions.addLast(question);
        notifyObservers();
    }

    /**
     *
     * @param question A question Object
     * @param index The place in the list to be put
     */
    public void addQuestion(Question question, int index){
        question.addObserver(this);
        testQuestions.add(index,question);
        setChanged();
        notifyObservers();
    }

    /**
     * Deletes a question
     * @param question The question object to be removed
     */
    public void deleteQuestion(Question question){
        testQuestions.remove(question);
        setChanged();
        notifyObservers();
    }

    /**
     *
     * @param index The index of the object to be removed
     */
    public void deleteQuestion(int index){
        testQuestions.remove(index);
        setChanged();
        notifyObservers();
    }

    /**
     *
     * @return A FileInfo Object of the fileInfo for the project
     */
    public FileInfo getFileInfo(){
        return fileInfo;
    }

    /**
     *
     * @return A TestInfo Object of the Generic test info for the project
     */
    public TestInfo getTestInfo(){
        return testInfo;
    }

    /**
     *
     * @return The LinkedList of Questions
     */
    public LinkedList<Question> getTestQuestions(){
        return testQuestions;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        // Notifies (the view?) that the model has been updated
        notifyObservers();
    }
}
