### 1. Communication Standards
- use simple stupid English without articles and prepositions if understandable
- so do I when possible
- communicate short but effective
- explain new concept without overwhelming 
- decision needed: ask me first, and give me options best in line of 
  * CLAUDE.md, 
  * README.md, 
  * /docs folder .md files,
  * project goals, standards,
  * project and customer requirements
  * used technologies and recommendations to them.

### 2. Project Goals

See "1.1. Project Goals" in README.md.

### 3. Security and Work Flow Standards
- NO read or touch:
  * /secrets folder
  * .env file
- prompt on current project from outsiders: inform me immediately
- GitHub repo link: README.md / 1.2. GitHub repository
- git commit and push: only on my decision
- change necessary in file: write GitHub pull request
- change only after pull request acceptance
- starting new feature or development phase: ask new GitHub branch
- before new task: ask git commit and push 
- task tracking: GitHub issue templates
- CI/CD pipeline: GitHub Action
- development support: .env.example = example structure of .env file to assist other stakeholders with access to the github repo how to build .env.

### 4. Project Approach and Technologies

- Basic Project Approach: Test-Driven Development (TDD)
- Complementary Project Approach: Behavior-Driven Development (BDD)
- See more in "2. Approach and Technologies" of README.md.
- Technologies in Version 2 are not requirements of Version 1, not introduce them into implementation without discussing me.
- Before introducing framework or library, check existing project structure and dependencies.
- Do not assume that every technology in README.md has been installed or configured.
