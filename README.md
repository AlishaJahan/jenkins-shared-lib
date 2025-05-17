# jenkins-shared-lib
This repository contains a collection of **Jenkins Shared Libraries** designed to centralize and standardize reusable Jenkins pipeline code across multiple projects. By utilizing these libraries, teams can enforce best practices, reduce code duplication, and simplify maintenance.
## What are Jenkins Shared Libraries?

Shared libraries allow you to define reusable pipeline logic outside of your main Jenkinsfile. This helps with:
- Cleaner Jenkinsfiles
- DRY (Don't Repeat Yourself) principles
- Easier updates and maintenance
- Version control and CI/CD of pipeline logic

---

##  How to Use This Shared Library

1. **Define the Library in Jenkins:**

   Go to:
Jenkins → Manage Jenkins → Configure System → Global Pipeline Libraries

Add:
- **Name**: `shared-lib` (or any name you prefer)
- **Default version**: `main` or a specific Git tag/branch
- **Project Repository**: Git URL of this repository

2. **Import and Use in Jenkinsfile:**

```groovy
@Library('shared-lib') _
