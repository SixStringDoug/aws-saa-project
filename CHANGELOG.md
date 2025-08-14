# Changelog

All notable changes to this project will be documented in this file.  
This project follows a phase-based approach aligned with AWS SAA Project objectives.

---

## Phase 1 – Initial Setup & CRUD Backend Scaffold
**Date:** [2025-08-02]
- Set up GitHub repository and `.gitignore`.
- Created initial backend CRUD application scaffold (Java Spring Boot).
- Configured Maven build and dependencies.
- Planned and documented AWS architecture for EC2, Fargate, and Elastic Beanstalk deployments.
- Established security best practices for IAM and project setup.

---

## Phase 2 – Backend Integration with S3 and RDS
**Date:** [2025-08-12]
- Implemented AWS S3 integration for file upload/download features.
- Integrated AWS RDS PostgreSQL with Spring Boot datasource configuration.
- Migrated application properties to use placeholders and `.template` files to remove secrets from version control.
- Updated `.gitignore` to exclude sensitive files (`application.properties`).
- Added `application.properties.template` for deployment configuration.
- Pushed updated backend code to Git with S3 and RDS integration complete.
- Prepared to plan container storage access patterns for AWS Fargate.

---
