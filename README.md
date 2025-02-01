<h1 align="center">Веб приложение «Блог»</a> </h1>

![2025-02-01_20-44-20](https://github.com/user-attachments/assets/3f1543ce-1ee0-4008-a148-579885cbbc64)

# Описание проекта
<p>Проект представляет собой веб-приложение "Блог" с возможностью публикации и чтения статей. Реализован с использованием Spring Boot, HTML, CSS, Bootstrap и JavaScript.</p>

# Основной функционал
<ul>
  <li>Главная страница с приветствием и переходом в блог.</li>
  <li>Страница блога со списком статей.</li>
  <li>Возможность добавления новых статей.</li>
  <li>Навигационное меню для удобного перехода между страницами.</li>
</ul>

# Технологии
<ul>
  <li>Spring Boot – Backend-приложение</li>
  <li>Maven – Система сборки</li>
  <li>MySQL</li>
  <li>OpenServer – Локальный сервер</li>
  <li>HTML, CSS – Разметка и стилизация</li>
  <li>Bootstrap – Используется для адаптивного дизайна</li>
  <li>JavaScript – Динамическое поведение страниц</li>
</ul>

# Установка и запуск
<p>1. Убедитесь, что у вас установлены:</p>
<ul>
  <li>Java 17+</li>
  <li>Maven </li>
  <li>OpenServer (для работы с MySQL)</li>
</ul>
<p>2. Настройка базы данных:</p>
<ul>
  <li>Запустите OpenServer и убедитесь, что MySQL работает.</li>
  <li>Создайте базу данных blog_db.</li>
  <li>Настройте подключение в application.properties:</li><br>
  <code>spring.datasource.url=jdbc:mysql://localhost:3306/blog_db</code><br>
  <code>spring.datasource.username=root</code><br>
  <code>spring.datasource.password=your_password</code><br>
  <code>spring.jpa.hibernate.ddl-auto=update</code>
</ul>
<p>3. Склонируйте репозиторий:</p>
<code>git clone https://github.com/your-repo/blog-project.git</code><br>
<code>cd blog</code><br>
<br>
<p>4. Соберите и запустите приложение:</p>
<code>./mvnw spring-boot:run   # Для Linux/macOS</code>
<code>mvnw.cmd spring-boot:run  # Для Windows</code>
<p>Откройте браузер и перейдите по адресу:</p>
<code>http://localhost:8080</code>
