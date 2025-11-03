Feature: Task Operations

Background: User Hugo is logged in as a standard user

    Scenario: Create task
        Given user Hugo has a valid account
        When Hugo creates a new task
        Then a new task is created 
        AND Hugo sees the confirmation message 
        AND the task is visible in Hugo's task list

    Scenario: Edit task
        Given Hugo has at least one task in his task list
        When Hugo selects a task 
        AND edits the description
        Then the task is updated 
        AND a confirmation message is shown

    Scenario: Export task
        Given Hugo has at least one task in his task list
        When Hugo opens export menu 
        AND selects task and desired format
        Then the system sends the export request to the export service 
        AND a download link is shown to Hugo
        


