Feature: Studyconnect Operations

    Scenario: Create Task
        Given I am logged in
        When I select "create new task" in the application
        Then a task should be created
