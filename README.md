#
# <p style="text-align:center">Carpenter Website<br>and Webshop</p>
## <p style="text-align:center">Full Stack Project<br><br>with Test-Driven Development and<br>Behavior-Driven Development<br>Approach<br>and Claude Code AI Harness Framework</p>

## About the project

This is a full stack project for developing a carpenter page with an integrated webshop of ready-made stock items as well as a custom product order functionality using built-in message sender interface. For implementation, Claude Code is used as AI harness framework.

## Approach and Technologies

The primary development approach is **Test-Driven Development** (**`TDD`**).

Development process starts with tests. At the unit test level, the expected behavior is defined first, followed by the implementation of the production code required to make those tests pass. Tests are then continuously maintained and extended as the application evolves.

Because this project represents a real-world product that could ultimately be delivered to a non-technical client or customer, the functional requirements should also be expressed in a form that is understandable to people with no software-development background.

For this reason, the project also follows **Behavior-Driven Development** (**`BDD`**) principles.

`BDD` complements `TDD` by describing the expected behavior of the system from a user's or stakeholder's perspective. Requirements and User Stories are therefore written in plain language and, where appropriate, expressed as executable specifications using **`Cucumber`** and **`Gherkin`**.

This creates a development workflow in which:
* Requirements describe what the user or customer needs.
* User Stories describe the desired functionality from the user's perspective.
* Gherkin scenarios express expected behavior in a structured, human-readable form.
* Cucumber can execute those scenarios as automated acceptance tests.
* Unit and integration tests support the implementation at lower levels of the system.
* Production code is implemented incrementally to satisfy the tests and requirements.
* Claude Code is used as an AI-assisted development tool throughout this process.