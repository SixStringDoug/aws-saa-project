# AWS SAA Project (SAA-C03)

This repository contains a hands-on project designed to reinforce AWS Certified Solutions Architect – Associate (SAA-C03) concepts.  
The same simple application will be deployed using three paradigms:
- **Amazon EC2**
- **AWS Fargate (ECS)**
- **Elastic Beanstalk**

---

## 📚 Objectives
- Practice AWS core services (EC2, S3, RDS, IAM, CloudWatch, etc.)
- Implement infrastructure as code using **Terraform** and **CloudFormation**
- Integrate cost controls, monitoring, and CI/CD pipelines
- Build a lightweight backend CRUD app and deploy across three environments

---

## 🗂 Structure
```
aws-saa-project/
├── backend/ # CRUD app (Java - Spring Boot)
├── terraform/ # Terraform IaC modules (primarily for EC2)
├── cloudformation/ # CloudFormation templates (primarily for Fargate and Elastic Beanstalk)
├── docs/ # Architecture diagrams & notes
```

---

## 🚀 Cost Management
- AWS Budgets alert set to **$8/month cap**
- All deployments adhere to **Free Tier constraints**

---

## 🔒 Security Best Practices
- IAM access keys rotated **every 90 days**
- Use least-privilege IAM policies (group-based permissions)
- Log in with IAM user, **never root**, except for account-level tasks
- Enable MFA on the root user and IAM user accounts (recommended)
- Enable **IAM Billing Access** for IAM users via root account
  (to allow non-root users to view billing and cost data)

---

## 🧩 Current Phase
**Phase 2:** Backend app integration with AWS S3 and RDS, security cleanup, and repository updates.

---

## 🆕 Changes in Phase 2
- Integrated backend with **Amazon S3** for file storage.
- Integrated backend with **Amazon RDS** (PostgreSQL).
- Removed hardcoded AWS credentials and sensitive data from repository.
- Added `.gitignore` rules to prevent secrets from being committed.
- Created `application.properties.template` for environment variable configuration.
- Reconfigured RDS instance to ensure Free Tier compatibility.
- Updated repository structure for better AWS integration workflow.

---
