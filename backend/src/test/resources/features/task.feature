Feature: Task Operations

Background: User is logged in as a standard user

    Scenario: Create task
        Given 
        When user selects "create new task" in the application
        Then a new task should be created AND user sees the confirmation message AND the task is seen in user's task list

    Scenario: Edit task
        Given at least one task exists
        When user selects a task AND edits the description
        Then the task is updated AND a confirmation message is shown

    Scenario: 
        Given at least one task exists
        When user opens export menu AND selects taks and desired format
        Then the system sends the export request to the export service AND a download link is shown
        


