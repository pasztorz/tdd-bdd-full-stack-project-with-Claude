#
# <p style="text-align:center">Carpenter Website<br>and Webshop</p>
## <p style="text-align:center">Full Stack Project<br><br>applying Test-Driven Development and<br>Behavior-Driven Development<br>Approach<br>and Claude Code AI Harness Framework</p>

## 1. About the project

This project aims to develop a full stack website for a carpenter, including a webshop of ready-made stock items as well as a structured messaging interface for custom product requests based on customer-specified dimensions and materials. For implementation, Claude Code is used as AI harness framework.

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

### 1.3. Project Status

This project is in an early scaffolding stage:

* Backend skeleton (Java/Maven) is set up; no production features are implemented yet.
* No tests exist yet (TDD has not started in practice).
* No frontend code exists yet.
* No Cucumber/Gherkin setup or `.feature` files exist yet.
* No CI/CD pipeline is configured yet.

This section will be updated as the project progresses.

### 1.4. Getting Started

**Prerequisites:** Java 21, Maven.

1. Clone the repository.
2. Copy `.env.example` to `.env` and fill in real values locally (never commit `.env`).
3. Build the project: `mvn compile`.
4. Run the tests: `mvn test` (test suite is currently empty; this will grow as TDD work starts).

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

### 2.2 Technology Stack by Version
#### 2.2.1 Version 1 - Initial (Development) Technology Stack

  For this stack, *technologies `known by me`* at the moment of starting with the implementation are used. 

  * *Frontend:* **`React`** (JavaScript)
  * *Backend:* **`Java`**
  * *Tests:*
    - Frontend unit tests: **`Vitest`**
    - Frontend component tests: **`Vitest`** and **`React Testing Library`**
    - Backend unit tests: **`JUnit`**
    - Browser/UI automation: **`Selenium with Java`**
    - API - **`REST Assured with Java`**
    - BDD scenarios: **`Gherkin and Cucumber`**
    - manual test execution: **`Jira`** (used to run and record manual test results; separate from day-to-day task tracking, which uses GitHub Issues — see `CLAUDE.md`)
  * *CI/CD:* **`GitHub Action`**

  Java/Maven, JUnit, Selenium, AssertJ, REST Assured, and Cucumber/Gherkin are installed (see `pom.xml`). React, Vitest, React Testing Library, Jira, and the CI/CD pipeline are still to be added.

#### 2.2.2. Version 2 - Future Learning Goals:

Potential technologies to explore in later phase of the project:

  * *Frontend:* **`TypeScript`** (migrate the React frontend to TypeScript)
  * *Backend and mobile devices:* **`Python`**
  * *Tests:*
    - Browser/UI automation: **`Playwright with Python`**
    - API - **`Postman`**
    - manual tests execution: `Katalon IDE` or `Selenium IDE`
    - mobile development.

## 3. Development Roadmap

The project will be developed incrementally, using Test-Driven Development (TDD) as the primary development approach and Behavior-Driven Development (BDD) where appropriate. The roadmap is a living plan: its phases may be refined as the project evolves and new lessons are learned.

See [docs/roadmap.md](docs/roadmap.md) for the full phase-by-phase breakdown, including concrete actions and outcomes. Phases:

1. Project Preparation
2. Requirements and User Stories
3. Technology and Development Foundations
4. First Working Website
5. Message-Sender Extension (Custom Product Requests)
6. Webshop Extension
7. CI/CD and Delivery Readiness
8. Review and Future Learning
