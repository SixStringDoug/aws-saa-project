# AWS SAA Project (SAA-C03)

This repository contains a hands-on project designed to reinforce AWS Certified Solutions Architect – Associate (SAA-C03) concepts.  
The same simple application will be deployed using three paradigms:
- **Amazon EC2**
- **AWS Fargate (ECS)**
- **Elastic Beanstalk**

## 📚 Objectives
- Practice AWS core services (EC2, S3, RDS, IAM, CloudWatch, etc.)
- Implement infrastructure as code using **Terraform** and **CloudFormation**
- Integrate cost controls, monitoring, and CI/CD pipelines
- Build a lightweight backend CRUD app and deploy across three environments

## 🗂 Structure
```
aws-saa-project/
├── backend/ # CRUD app (Java or Python)
├── terraform/ # Terraform IaC modules (used primarily for EC2)
├── cloudformation/ # CloudFormation templates (used primarily for Fargate and Elastic Beanstalk)
├── docs/ # Architecture diagrams & notes
```

## 🚀 Cost Management
- AWS Budgets alert set to **$8/month cap**
- All deployments adhere to **Free Tier constraints**

## 🔒 Security Best Practices
- IAM access keys rotated **every 90 days**
- Use least-privilege IAM policies (group-based permissions)
- Log in with IAM user, **never root**, except for account-level tasks
- Enable MFA on the root user and IAM user accounts (recommended)
- Enable **IAM Billing Access** for IAM users via root account
  (to allow non-root users to view billing and cost data)

## 🧩 Current Week
**Week 1 (Chunk 1):** GitHub setup, IAM user, app architecture plan, initial CRUD scaffold.

