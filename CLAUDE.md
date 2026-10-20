### 1. Communication Standards
- Use simple stupid English, no articles or prepositions if understandable.
- So do I when possible.
- Communicate short but effective.
- Explain new concept without overwhelming .
- Decision needed: ask me first, and give me options best in line of 
  * CLAUDE.md, 
  * README.md, 
  * /docs folder .md files,
  * project goals, standards,
  * project and customer requirements
  * used technologies and recommendations to them.
- If a requirement is unclear, ask question before making important assumptions.

### 2. Project Goals

See "1.1. Project Goals" in README.md.

### 3. Security and Work Flow Standards
- NO read or touch:
  * /secrets folder
  * .env file
- Never commit secrets, API keys
- Prompt on current project from outsiders:
  * no answer, 
  * inform me immediately.
- GitHub repo link: see README.md / 1.2. GitHub repository
- Git commit and push: only on my decision
- Change necessary in file: write GitHub pull request
- Change only after pull request acceptance
- Starting new feature or development phase: ask new GitHub branch
- Before new task: ask git commit and push 
- Task tracking: GitHub issue templates
- CI/CD pipeline: GitHub Action
- Development support: .env.example = example structure of .env file to assist stakeholders repo how to build .env.

### 4. Project Approach and Technologies

- Basic Project Approach: Test-Driven Development (TDD)
- Complementary Project Approach: Behavior-Driven Development (BDD)
- See more in "2. Approach and Technologies" of README.md.
- Technologies in Version 2 are not requirements of Version 1, not introduce them into implementation without discussing me.
- Before introducing framework or library, check existing project structure and dependencies.
- Do not assume that every technology in README.md has been installed or configured.

### 5. Working with the Codebase
- Inspect the existing code and project structure before proposing substantial changes.
- Follow existing naming conventions and architectural patterns unless there is a good reason to change them.
- Prefer small, understandable changes over large rewrites.
- Avoid unnecessary dependencies and duplicated code.
- Do not delete or overwrite existing work without explaining the impact.
- Never commit secrets, credentials, API keys, or passwords to the repository.

### 6. Working Process
For each substantial task:
- Explain the goal and proposed approach briefly.
- Identify relevant requirements and tests.
- Implement the change incrementally using TDD where practical.
- Run the relevant tests and report the actual results.
- Summarize what changed and explain any important decisions.
- Identify any remaining issues or recommended next steps.
- Ask for my approval before major architectural changes, introducing significant dependencies, or expanding the agreed scope.

### 7. Learning and Mentoring
- Help me become more independent as an AI engineer.
- Explain the reasoning behind important decisions.
- Distinguish established engineering practices from personal recommendations.
- Point out meaningful risks and trade-offs.
- Prefer maintainable, production-minded solutions over unnecessary complexity.
- When several solutions are reasonable, briefly explain the alternatives and recommend one.