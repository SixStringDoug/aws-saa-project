# TaskTracker Backend

A Spring Boot application that manages tasks with support for file attachments stored in **Amazon S3** and persistent task data in **Amazon RDS** (PostgreSQL).  
This service is part of the broader AWS SAA Project.

---

## 📦 Features
- CRUD operations for task management
- File upload/download integration with Amazon S3
- Persistent relational storage in Amazon RDS
- Configurable via environment variables for security
- Maven-based build process

---

## 🛠 Prerequisites
- **Java 17+**
- **Maven 3.9+**
- Access to an AWS account with:
    - An S3 bucket
    - An RDS PostgreSQL instance
    - Proper IAM credentials configured
- Environment variables set for:
    - `AWS_ACCESS_KEY_ID`
    - `AWS_SECRET_ACCESS_KEY`
    - `AWS_REGION`
    - `DB_URL`
    - `DB_USERNAME`
    - `DB_PASSWORD`

---

## 🚀 Running Locally
```bash
# Clone the repository
git clone https://github.com/your-org/aws-saa-project.git
cd aws-saa-project/backend/tasktracker

# Build the project
mvn clean install

# Run with Maven
mvn spring-boot:run
```

---

## 🔧 Configuration
This application uses `application.properties.template` as a reference for all configurable values.  
Never commit your real credentials — instead, set them via environment variables before starting the app.

---

## 📜 Changes in Phase 2
- Integrated Amazon S3 for file attachments.
- Configured Amazon RDS connection for task persistence.
- Updated `.gitignore` to exclude sensitive files (like `application.properties` with credentials).
- Added `application.properties.template` for safer configuration sharing.
- Verified removal of hard-coded secrets from the repository.

---

## 📚 References

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.8/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.8/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.8/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.4.8/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Validation](https://docs.spring.io/spring-boot/3.4.8/reference/io/validation.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.8/reference/using/devtools.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

---