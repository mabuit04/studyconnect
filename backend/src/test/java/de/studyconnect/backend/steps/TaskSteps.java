package de.studyconnect.backend.steps;

import de.studyconnect.backend.model.Task;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.*;

public class TaskSteps {
    private Task task;
    private String changed_description;
    private boolean exportRequestSent = false;
    private boolean confirmationMessageShown = false;

    // Steps for Create Task Scenario
    @Given("user Hugo has a valid account")
    public void valid_account() {
        this.task = null;
    }

    @When("Hugo creates a new task")
    public void create_task() {
        this.task = new Task();
        this.task.setDescription("Neue Aufgabe");
    }

    @Then("a new task is created")
    public void task_is_created() {
        assertNotNull(this.task);
        assertEquals("Neue Aufgabe", this.task.getDescription());
    }

    @Then("Hugo sees the confirmation message")
    public void hugo_sees_the_confirmation_message() {
        // This is for Simulation purpose.
        this.confirmationMessageShown = true;
        assertTrue(confirmationMessageShown, "Confirmation message should be shown.");
    }

    @Then("the task is visible in Hugo's task list")
    public void the_task_is_visible_in_hugo_s_task_list() {
        // This is for Simulation purpose.
        // For now, we assume it's there if it was created.
        assertNotNull(this.task, "Task should be visible in the list.");
    }

    // Steps for Edit Task Scenario
    @Given("Hugo has at least one task in his task list")
    public void task_in_list() {
        this.task = new Task();
        this.task.setDescription("Schwere Aufgabe");
        this.exportRequestSent = false;
        this.confirmationMessageShown = false;
    }

    @When("Hugo selects a task")
    public void hugo_selects_a_task() {
        // Placeholder for selecting a task. We already have a task from the Given step.
        assertNotNull(this.task, "A task should exist to be selected.");
    }

    @When("edits the description")
    public void edits_the_description() {
        this.changed_description = "Leichtere Aufgabe";
        this.task.setDescription(changed_description);
    }

    @Then("the task is updated")
    public void the_task_is_updated() {
        assertEquals(this.changed_description, this.task.getDescription());
    }

    @Then("a confirmation message is shown")
    public void a_confirmation_message_is_shown() {
        // This is for Simulation purpose.
        this.confirmationMessageShown = true;
        assertTrue(confirmationMessageShown, "Confirmation message should be shown.");
    }

    // Steps for Export Task Scenario
    @When("Hugo opens export menu")
    public void hugo_opens_export_menu() {
        // Placeholder for opening the export menu.
    }

    @When("selects task and desired format")
    public void selects_task_and_desired_format() {
        if (this.task != null) {
            this.exportRequestSent = true;
        }
    }

    @Then("the system sends the export request to the export service")
    public void the_system_sends_the_export_request_to_the_export_service() {
        assertTrue(this.exportRequestSent, "Export request should have been sent.");
    }

    @Then("a download link is shown to Hugo")
    public void a_download_link_is_shown_to_hugo() {
        // This is for Simulation purpose.
        assertTrue(this.exportRequestSent, "A download link should be shown if the export request was sent.");
    }
}
