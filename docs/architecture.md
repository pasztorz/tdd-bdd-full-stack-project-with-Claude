# Architecture

This document describes the system's architecture: the actual architecture, component responsibilities, and how they communicate. It is a living document — update it as the design becomes concrete and as each roadmap phase lands.

## 1. Overview

Version 1 is a single-page React frontend talking to a Spring Boot REST API, backed by a PostgreSQL database.

**Current status:** no Spring Boot code and no frontend folder exist yet (see `README.md` §1.3). This document describes the target shape so implementation (starting in Phase 4 of `docs/roadmap.md`) has a design to follow, not just a backlog of user stories.

## 2. System diagram

```
[ React SPA (browser) ]  --HTTP/JSON-->  [ Spring Boot REST API ]  --reads/writes-->  [ PostgreSQL ]
```

- The browser renders one HTML page; all section switching happens client-side (see §3).
- The frontend calls the backend over plain HTTP, exchanging JSON.
- The backend reads and writes PostgreSQL directly — see §5 for what's stored and when.

## 3. Frontend architecture

The site is a single-page app: Home, About/Services, Custom Order Request, and Contact are all sections of one page, toggled by React state — not separate routes or page loads (`react-router` is explicitly not used in Version 1; this matches the existing Phase 4 instruction in `docs/roadmap.md`).

Planned component tree, matching `docs/requirements.md` US-1 to US-5:

- `App` — holds the `activeSection` state, renders `Navigation` plus whichever section is active.
- `Navigation` — the nav bar, visible on every section, lets a visitor switch `activeSection` (Home, About/Services, Custom Order Request, Contact).
- `Home` (US-1) — business name, background picture, short description.
- `AboutServices` (US-2) — background/experience, services and products offered.
- `Contact` (US-3) — contact details, plus a way into the order flow (see below).
- `CustomOrderRequest` (US-4, US-5) — the order form (dimensions, material), validation, confirmation, and the optional register/log-in step.

**Design call:** US-3 and US-4 both need to reach the custom order form — once via its own nav item, once from within Contact. Rather than duplicating the form, `Contact` sets `activeSection` to `CustomOrderRequest` the same way `Navigation` does, so there is exactly one component owning the form, its validation, and its confirmation state.

Styling uses Bootstrap classes directly in JSX; no custom CSS framework. State stays local to `App` and its section components — no Redux or Context API in Version 1 (there's no cross-cutting state yet that would justify it).

## 4. Backend architecture

The Spring Boot web layer is introduced in Phase 5 (not present yet — `src/main/java/com/codecool/Main.java` is still a "Hello and welcome!" stub).

Planned package layout under `com.codecool`:

- `controller` — REST endpoints (e.g. `OrderRequestController`, later `AuthController`).
- `service` — business logic: validation, orchestration.
- `model` — data classes (e.g. `OrderRequest`, `Account`).
- `repository` — persistence access, backed by PostgreSQL from Phase 5 onward.

Illustrative Phase 5 endpoints (exact paths may change when implemented):

- `POST /api/order-requests` — submit a custom order request.
- `POST /api/auth/register`, `POST /api/auth/login` — optional, once Spring Security is added (US-5).

**Open decision, not prescribed here:** the exact Spring data-access approach (e.g. Spring Data JPA vs. plain JDBC) is left for when Phase 5 implementation starts.

This stays a conventional, flat layering — no hexagonal/clean-architecture layers, no DTO-mapper frameworks. It's a small, single-developer project; the structure should stay easy to hold in your head.

## 5. Persistence

PostgreSQL is used from Phase 5 onward — for order requests and accounts, not just the Phase 6 webshop catalog (per `README.md` §2.2.1 and the decision to introduce the database earlier than originally planned). Phase 6 then extends the same database with structured, queryable product-catalog tables, rather than introducing a new database.

## 6. Cross-cutting concerns

- **Configuration and secrets:** `.env` / `.env.example` (never commit `.env`), loaded via `dotenv-java` on the backend. Frontend environment variables (e.g. the API base URL) follow the same `.env` pattern once the frontend tooling is chosen.
- **Dev-mode communication:** the React dev server and Spring Boot run on separate ports locally, so the backend needs CORS configured for local development. The production serving strategy (single origin vs. separate) is left open for Phase 7.
- **Explicitly out of scope for Version 1:** microservices, message queues, containers/Docker, an API gateway. This is a small CV/learning project — keep it that way unless a real need appears.

## 7. Status

This document will be revisited and updated after Phase 4 (first working frontend), Phase 5 (backend + database), and Phase 6 (webshop) land, so it keeps describing what's actually built, not just what's planned.
