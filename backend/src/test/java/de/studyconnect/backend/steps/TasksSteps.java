package de.studyconnect.backend.steps;

import de.studyconnect.backend.model.Task;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class TasksSteps{
    private Task task;


    @Given("Given Hugo has at least one task in his task list")
    public void task_in_list(){
        this.task = new Task();
    }


    @When("When Hugo selects a task AND edits the description")
    public void change_description(string changed_description){
        this.result = this.task.setDescription(changed_description);

    }
}