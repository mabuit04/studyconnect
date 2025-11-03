package de.studyconnect.backend.steps;

import de.studyconnect.backend.model.Task;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.*;


public class TaskSteps{
    private Task task;


    @Given("Hugo has at least one task in his task list")
    public void task_in_list(){
        this.task = new Task();
    }


    @When("Hugo selects a task AND edits the description")
    public void change_description(String changed_description){
        this.task.setDescription(changed_description);
    }

    @Then("the task is updated AND a confirmation message is shown")
    public void result_should_be(String changed_description){
        assertEquals(changed_description, this.task.getDescription());
    }

}


//assertEquals("Schwere Aufgabe", task.getDescription());
