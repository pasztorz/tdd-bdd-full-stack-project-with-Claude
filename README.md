#
# <p style="text-align:center">Carpenter Website<br>and Webshop</p>
## <p style="text-align:center">Full Stack Project<br><br>applying Test-Driven Development and<br>Behavior-Driven Development<br>Approach<br>and Claude Code AI Harness Framework</p>

## 1. About the project

This project aims to develop a full stack website for a carpenter, inculding a webshop of ready-made stock items as well as a structured messaging interface for custom product requests based on customer-specified dimensions and materials. For implementation, Claude Code is used as AI harness framework.

### 1.1. Project Goals
**Primary Goals:**
- develop a carpenter website
- with a webshop for ready-made stock items
- and with a message sender function as a standardised framework to order custom products by size and material.

**Secondary Goals**
- learn and practice complementary technologies

### 1.2. GitHub repository

GitHub repo url:  https://github.com/pasztorz/tdd-bdd-full-stack-project-with-Claude.git

As this is a CV project, the repository is public.

## 2. Approach and Technologies

### 2.1. Approach

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

### 2.2 Technology Roadmap
#### 2.2.1 Version 1 - Initial (Development) Technology Stack

  For this stack, *technologies `known by me`* at the moment of starting with the implementation are used. 

  * *Frontend:* **`Javascript`**
  * *Backend:* **`Java`**
  * *Tests:*
    - Unit tests: **`JUnit`**
    - Browser/UI automation: **`Selenium with Java`**
    - API - **`REST Assured with Java`**
    - BDD scenarios: **`Gherkin and Cucumber`**
    - manual tests: **`Jira`**
  * *CI/CD:* **`GitHub Action`**

#### 2.2.2. Version 2 - Future Learning Goals:

Potential technologies to explore in later phase of the project:

  * *Frontend:* **`Typescript`**
  * *Backend and mobile devices:* **`Python`**
  * *Tests:*
    - Browser/UI automation: **`Playwright with Python`**
    - API - **`Postman`**
    - manual tests:
    - mobile development.
  