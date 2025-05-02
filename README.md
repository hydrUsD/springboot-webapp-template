# Spring Boot Web App Template

A clean, reusable Spring Boot template with:

- ✅ Spring Web (MVC + REST)
- ✅ Thymeleaf templating (`index.html`)
- ✅ JSP support (`index.jsp`)
- ✅ Lombok and Validation
- ✅ Prettier with 2-space formatting (HTML, SCSS, JSON)
- ✅ SASS-ready styling via `style.scss`
- ✅ DevTools for live reload

---

## 📦 Project Structure

```
src/
├── main/
│   ├── java/com/template/demo/
│   │   └── HelloController.java
│   ├── resources/
│   │   ├── templates/index.html      # Thymeleaf
│   │   ├── static/css/style.scss     # SASS (edit this)
│   │   └── static/css/style.css      # Output CSS (generated)
│   └── webapp/WEB-INF/jsp/index.jsp  # JSP version
```

---

## 🚀 Run the App

```bash
./mvnw spring-boot:run
```

- Visit: `http://localhost:8080/` → Thymeleaf version
- Visit: `http://localhost:8080/jsp` → JSP version

---

## 🎨 Frontend Setup (Prettier + SASS)

```bash
npm install
npx prettier --write .
npx sass src/main/resources/static/css/style.scss src/main/resources/static/css/style.css --watch
```

---

## ⚙️ IntelliJ Setup Notes

- 2-space formatting enforced via Prettier and IDE settings
- Auto-format on save enabled for Java
- HTML & JSP formatted by IntelliJ with special rules (e.g. no indent on `<head>`, `<body>`)
- Excluded folders: `node_modules/`, `target/`

---

## 🧱 Built With

- Java 17
- Spring Boot 3.4.5
- Maven 3+
- IntelliJ IDEA Ultimate 2025

---

## 📂 Clone as New Project

```bash
git clone https://github.com/yourname/springboot-webapp-template.git new-project
cd new-project
rm -rf .git
git init
```

Then rename packages, adjust metadata, and start coding!

---

## 📄 License

MIT, Apache 2.0, or your preferred license.
