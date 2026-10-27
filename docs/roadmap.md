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
- Set up the React frontend with Bootstrap for styling.
- Configure Vitest and React Testing Library for frontend component tests.
- Set up the Java backend with Spring Boot.
- Configure JUnit and the initial testing structure.
- Establish a basic GitHub Actions CI workflow early in development.
- Configure automated checks for relevant tests and build steps.
- Document the initial architecture in `docs/architecture.md`.
- Document the testing strategy in `docs/testing-strategy.md`.
- Document how to install dependencies, run the application, and execute tests.

**Outcome:** A working development environment with an initial automated CI pipeline.

### Phase 4 — First Working Website

- Build the static one-page carpenter business website in React: Home, About/Services, and Contact as sections shown via state, not separate page loads.
- Develop the first feature using TDD, in two incremental cycles:
  1. Home section content (business name, background picture, short description) — write a failing Vitest/React Testing Library component test, implement the minimum React code to pass, and refactor.
  2. Navigation and section switching (About/Services, Custom Order Request, and Contact as placeholder stubs for now) — write a failing Vitest/React Testing Library component test for switching between sections, implement, and refactor.
- Add a Cucumber/Selenium acceptance test as a higher-level smoke check of the same behavior in a real browser.
- Verify that the CI workflow (Vitest and Selenium/Cucumber) runs successfully on proposed changes.
- No backend or API work yet — the Java backend is introduced in Phase 5, with the message-sender feature.

**Outcome:** A small but working static website with component-level and acceptance-level automated tests, verified by CI.

### Phase 5 — Message-Sender Extension (Custom Product Requests)

- Introduce the Java backend web layer using Spring Boot.
- Wire the Custom Order Request form — reachable via its own dedicated navigation item and from the Contact section — to a real backend endpoint, so a custom product request (dimensions and material choices) is actually submitted via the API.
- Add optional user registration and login (using Spring Security) during the ordering flow, so a visitor can place a custom order either as a guest or as a registered user.
- Use PostgreSQL to persist submitted requests and registered accounts.
- Validate user input and handle errors appropriately.
- Add Gherkin/Cucumber scenarios for important business behaviors.
- Add REST Assured API tests for the new endpoint.
- Update the backlog and acceptance criteria as requirements evolve.

**Outcome:** The custom product request feature, including optional registration/login, is implemented end-to-end (React frontend + Java backend) and verified against its acceptance criteria — the project's first full-stack feature.

### Phase 6 — Webshop Extension

- Implement prioritized User Stories for product browsing and product details.
- Extend the existing PostgreSQL database with structured, queryable product data for the webshop.
- Validate user input and handle errors appropriately.
- Add Gherkin/Cucumber scenarios for important business behaviors.
- Extend automated tests with REST Assured API tests and Selenium UI tests where appropriate.
- Set up Jira to run and record manual test execution for exploratory and manual test coverage.
- Update the backlog and acceptance criteria as requirements evolve.

**Outcome:** The webshop is implemented and verified against its acceptance criteria, completing the core Version 1 feature set.

### Phase 7 — CI/CD and Delivery Readiness

- Expand the GitHub Actions pipeline to run relevant automated tests and build checks.
- Ensure that failures are visible and prevent changes from being treated as successfully verified.
- Add load/performance testing with Gatling to verify the app holds up under expected load, before Version 1 is considered complete.
- Add packaging or build artifact generation where appropriate.
- Prepare application configuration and secrets management for deployment.
- Add a deployment workflow when a suitable hosting environment is available.
- Verify the deployment process and document how to release and maintain the application.

**Outcome:** A repeatable, automated build and verification process, with deployment automation when the project is ready.

### Phase 8 — Review and Future Learning

- Review the architecture, test coverage, code quality, accessibility, and security.
- Document lessons learned from TDD, BDD, and working with Claude Code.
- Identify technical debt and prioritize meaningful improvements.
- Evaluate Version 2 technologies, including TypeScript, Python, Playwright, and mobile development.
- Introduce new technologies only when they support an agreed learning or product goal.

**Outcome:** A reviewed Version 1 and a prioritized direction for future development.
