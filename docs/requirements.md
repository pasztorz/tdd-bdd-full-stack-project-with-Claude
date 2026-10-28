# Requirements

This document captures the project's business requirements, user stories, acceptance criteria, and scope.

## Business Requirements

_To be defined._

## User Stories

### US-1: View the home page

**As a** visitor,
**I want to** view the carpenter business's home page,
**so that** I can understand what the business offers.

**Acceptance Criteria:**
- The home page is the default view when a visitor opens the website.
- The home page shows the business name, a home page background picture and a short description of what the business offers.
- The home page provides navigation to the other sections of the site (e.g. About/Services, Custom Order Request, Contact).

**Gherkin Scenario:** [features/home_page.feature](../features/home_page.feature)

### US-2: View the About/Services section

**As a** visitor,
**I want to** view the About/Services section of the carpenter business's website,
**so that** I can learn about the carpenter's background and the services offered, and decide whether the business meets my needs.

**Acceptance Criteria:**
- A visitor can navigate to the About/Services section from any other section of the site.
- The About/Services section describes the carpenter's background or experience.
- The About/Services section lists the services or types of products offered (e.g. custom-made furniture, ready-made stock items).
- The About/Services section provides navigation to the other sections of the site (e.g. Home, Custom Order Request, Contact).

**Gherkin Scenario:** _not yet created — will be added as a `.feature` file under `features/` once Cucumber is set up (Phase 3), and linked here._

### US-3: Check contact information

**As a** visitor,
**I want to** view the carpenter business's contact information,
**so that** I can reach out to them directly.

**Acceptance Criteria:**
- A visitor can navigate to the Contact section from any other section of the site.
- The Contact section displays the business's contact details (e.g. phone number, email address, physical address).
- The Contact section also provides a way to start a custom product order request (see US-4), not only the dedicated navigation item.
- The Contact section provides navigation to the other sections of the site (e.g. Home, About/Services, Custom Order Request).

**Gherkin Scenario:** _not yet created — will be added as a `.feature` file under `features/` once Cucumber is set up (Phase 3), and linked here._

### US-4: Order a custom product

**As a** visitor,
**I want to** send a message specifying the product I want, including its dimensions and material,
**so that** I can request a custom-made product from the carpenter.

**Acceptance Criteria:**
- The site has a dedicated "Custom Order Request" (Egyedi ajánlatkérés) navigation item, visible in the main navigation bar on every section of the site.
- The same custom order request function is also reachable from within the Contact section (US-3), not only via the dedicated navigation item.
- The Custom Order Request section provides a form for submitting a custom product request, including fields for dimensions and material.
- Required fields (e.g. dimensions and material) are validated before the request can be submitted.
- After successful submission, the visitor sees confirmation that the request was sent.

**Gherkin Scenario:** _not yet created — will be added as a `.feature` file under `features/` once Cucumber is set up (Phase 3), and linked here._

### US-5: Register or log in during ordering

**As a** visitor placing a custom order request,
**I want to** register a new account or log in to an existing one during the ordering process,
**so that** my order can be linked to my account.

**Acceptance Criteria:**
- During the custom order request flow (US-4), a visitor is offered the option to register a new account or log in to an existing one.
- A visitor can also complete and submit the order without registering or logging in (registration/login is optional, not required, for Version 1).
- A visitor who registers or logs in successfully can continue the order flow without losing the details already entered.

**Gherkin Scenario:** _not yet created — will be added as a `.feature` file under `features/` once Cucumber is set up (Phase 3), and linked here._

## Scope

_To be defined._