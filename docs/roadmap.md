# Development Roadmap

The project will be developed incrementally, using Test-Driven Development (TDD) as the primary development approach and Behavior-Driven Development (BDD) where appropriate.

The roadmap is a living plan. Its phases may be refined as the project evolves and new lessons are learned.

### Phase 1 — Project Preparation

- Review and finalize `README.md` and `CLAUDE.md`.
- Review the repository structure, Git status, and security settings.
- Define the initial Version 1 scope and identify features that are outside that scope.
- Prepare GitHub issue templates and establish the Git branching and review workflow.
- Identify the first small, valuable feature to implement.

**Outcome:** A clear project scope, documented working practices, and a repository ready for development.

### Phase 2 — Requirements and User Stories

- Identify the main user types and their goals.
- Write and prioritize User Stories for the Version 1 features.
- Define clear acceptance criteria for each story.
- Write Gherkin scenarios for important behaviors where BDD adds value.
- Create GitHub issues from the prioritized stories and agree on the scope of the first implementation.
- Document finalized requirements and user stories in `docs/requirements.md`.
- Refine requirements as new information becomes available.

**Outcome:** A prioritized backlog of understandable, testable requirements.

### Phase 3 — Technology and Development Foundations

- Confirm the Version 1 technology stack based on the project goals and learning objectives.
- Set up the Java backend and JavaScript frontend.
- Configure JUnit and the initial testing structure.
- Establish a basic GitHub Actions CI workflow early in development.
- Configure automated checks for relevant tests and build steps.
- Document the initial architecture in `docs/architecture.md`.
- Document the testing strategy in `docs/testing-strategy.md`.
- Document how to install dependencies, run the application, and execute tests.

**Outcome:** A working development environment with an initial automated CI pipeline.

### Phase 4 — First Working Website

- Build a small end-to-end vertical slice connecting the frontend and backend.
- Add the basic carpenter business website structure and business information.
- Develop the first feature using TDD: write a failing test, implement the minimum solution, and refactor.
- Add integration and API tests where appropriate.
- Verify that the CI workflow runs successfully on proposed changes.

**Outcome:** A small but working application with automated tests and CI checks.

### Phase 5 — Webshop and Custom Product Requests

- Implement prioritized User Stories for product browsing and product details.
- Develop the custom product request workflow, including dimensions and material choices.
- Validate user input and handle errors appropriately.
- Add Gherkin/Cucumber scenarios for important business behaviors.
- Extend automated tests with REST Assured API tests and Selenium UI tests where appropriate.
- Set up Jira to run and record manual test execution for exploratory and manual test coverage.
- Update the backlog and acceptance criteria as requirements evolve.

**Outcome:** The core Version 1 features are implemented and verified against their acceptance criteria.

### Phase 6 — CI/CD and Delivery Readiness

- Expand the GitHub Actions pipeline to run relevant automated tests and build checks.
- Ensure that failures are visible and prevent changes from being treated as successfully verified.
- Add packaging or build artifact generation where appropriate.
- Prepare application configuration and secrets management for deployment.
- Add a deployment workflow when a suitable hosting environment is available.
- Verify the deployment process and document how to release and maintain the application.

**Outcome:** A repeatable, automated build and verification process, with deployment automation when the project is ready.

### Phase 7 — Review and Future Learning

- Review the architecture, test coverage, code quality, accessibility, and security.
- Document lessons learned from TDD, BDD, and working with Claude Code.
- Identify technical debt and prioritize meaningful improvements.
- Evaluate Version 2 technologies, including TypeScript, Python, Playwright, and mobile development.
- Introduce new technologies only when they support an agreed learning or product goal.

**Outcome:** A reviewed Version 1 and a prioritized direction for future development.
