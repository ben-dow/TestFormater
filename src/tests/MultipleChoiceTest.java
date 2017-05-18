package tests;

import com.sun.org.apache.xpath.internal.operations.Mult;
import org.junit.*;
import org.junit.Test;
import models.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by benjamind on 5/5/17.
 */
public class MultipleChoiceTest {

    @org.junit.Test
    public void getChoices() throws Exception {
        MultipleChoice mcq = new MultipleChoice();
        assertEquals("Expected Empty Array List", new ArrayList<String>(), mcq.getChoices());
    }

    @Test
    public void addChoice() throws Exception {
        MultipleChoice mcq = new MultipleChoice();
        mcq.addChoice("New York");
        assertEquals("Expected 1", 1,mcq.getChoices().size());
    }

    @Test
    public void removeChoice() throws Exception {
        MultipleChoice mcq = new MultipleChoice();
        mcq.addChoice("New York");
        mcq.removeChoice("New York");
        assertEquals("Expected 0", 0,mcq.getChoices().size());

    }

    @Test
    public void removeChoice1() throws Exception{
        MultipleChoice mcq = new MultipleChoice();
        mcq.addChoice("New York");
        mcq.removeChoice(0);
        assertEquals("Expected 0 ", 0, mcq.getChoices().size());

    }

    @Test
    public void setQuestionText() throws Exception {
        MultipleChoice mcq = new MultipleChoice();
        mcq.setQuestionText("What is 1 + 1?");

    }

    @Test
    public void setAnswer() throws Exception {

    }

    @Test
    public void getAnswer() throws Exception {

    }

}