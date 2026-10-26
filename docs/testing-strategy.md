# Testing Strategy

This document describes test levels, test ownership, execution commands, and how unit, integration, API, UI, and acceptance tests fit together. Test-Driven Development (TDD) is the primary approach; Behavior-Driven Development (BDD), via Gherkin and Cucumber, complements it for acceptance-level behavior. It is a living document — update it as testing practice grows.

**Current status:** test dependencies are installed (see `pom.xml`), but no tests, and no `.feature` files, exist yet (see `README.md` §1.3).

## 1. Test levels and tools

| Level | Tool | Responsibility | Where tests live |
|---|---|---|---|
| Backend unit | JUnit + AssertJ | A single class or method, in isolation | `src/test/java/com/codecool/...` |
| Frontend unit | Vitest | A single JS function or module | `frontend/src/**/*.test.js(x)` (once the frontend exists) |
| Frontend component | Vitest + React Testing Library | A component's rendered behavior (e.g. section switching, form validation feedback) | Colocated with the component it tests |
| API | REST Assured | A backend REST endpoint over HTTP, black-box | `src/test/java/com/codecool/.../api` |
| Acceptance / UI (BDD) | Selenium + Cucumber/Gherkin | A full user story, driven through a real browser | Scenarios in `features/*.feature`; step definitions in `src/test/java/com/codecool/.../steps` |
| Manual | Jira | Exploratory and manual test case recording (Phase 6 onward) | Jira, separate from GitHub Issues (which track development tasks) |

Each `features/*.feature` file maps 1:1 to a user story in `docs/requirements.md` — e.g. `features/home_page.feature` for US-1 — replacing that story's "Gherkin Scenario: not yet created" placeholder once written.

API tests run against a Postgres-backed backend from Phase 5 onward (see `docs/architecture.md` §5). The exact test-database strategy — a local test instance, Testcontainers, or something else — is not decided here; it's an open decision for when Phase 5 implementation starts.

## 2. Test pyramid

Most tests are fast unit and component tests, run on every save. Fewer tests are API tests, which need a running backend. Fewest are acceptance/UI tests — one Cucumber/Selenium scenario per user story, smoke-checking the main flow, not every edge case. Edge cases and validation branches belong at the unit, component, or API level, where they're cheap and fast to run.

## 3. TDD/BDD workflow

The default workflow for new backend or frontend code is red-green-refactor: write a failing unit or component test for the next small behavior, write the minimum code to pass it, then refactor.

BDD complements this one level up: for each user story, the Gherkin scenario is written or refined first (in `docs/requirements.md` and `features/*.feature`), describing the behavior in plain language. Step definitions are then implemented, wired through Cucumber's JUnit Platform Suite runner (already configured via `cucumber-junit-platform-engine` and `junit-platform-suite` in `pom.xml`), until the scenario passes.

Gherkin scenarios describe *what* the system should do; unit and component tests describe *how*. Both are written before the production code they verify.

## 4. Execution commands

- **Backend (today):** `mvn test` — runs JUnit unit tests, REST Assured API tests, and Cucumber scenarios together. Cucumber runs through the JUnit Platform Suite runner, so no separate command is needed.
- **Frontend (once set up):** `npm test` or `npx vitest` — runs unit and component tests.
- **CI:** Phase 3 adds a basic GitHub Actions workflow running these commands on every push and PR. Phase 7 expands this into the full build/package/deploy pipeline.

## 5. Manual testing (Jira)

Not needed until Phase 6. Jira will record manual and exploratory test runs for the webshop extension — things automated UI tests don't cover well, like visual or UX checks — kept separate from GitHub Issues, which track development tasks.

## 6. Out of scope (for now)

Mutation testing, contract testing, and load/performance testing are not part of the agreed Version 1 stack. They could be revisited as Version 2 learning goals (see `README.md` §2.2.2) if there's a reason to.
