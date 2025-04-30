# Validate SA ID Number

A project built using **Test-Driven Development (TDD)** in Java to validate South African ID numbers.

## 📌 Topic: Unit Testing

Unit testing is a foundational skill for any serious software developer. It helps improve code quality, ensures reliability, and gives you the confidence to refactor and enhance your application over time.

---

## 🤔 Why Unit Testing?

- **Boost Your Focus in 5 Minutes with Brain.fm**  
  Harness the power of **neural phase locking** to get focused and stay focused.

- **Unit Testing in JavaScript (Part 2): Your First Tests**  
  Learn how to write your very first tests in JavaScript and build confidence with TDD.

- **Test Runners Overview**  
  Language-agnostic concepts apply here. For JavaScript, tools like Jest and Mocha are popular.  
  In Python, common test runners include `unittest` and `pytest`.

- **Unit Testing in JavaScript (Part 3): Test Runners**  
  Understand the role of test runners and how they fit into your development workflow.

---

## 📚 Java Unit Testing Resources

- [Baeldung: Java Unit Testing Best Practices](https://www.baeldung.com/java-unit-testing-best-practices)
- [YouTube: JUnit Tutorial by Coding with John](https://www.youtube.com/watch?v=vZm0lHciFsQ&ab_channel=CodingwithJohn)

---

## ✅ Project Objective

Use **TDD** to write a validator for South African ID numbers.

---

## 🧪 Your First Tests

Follow the **RED–GREEN–REFACTOR** cycle:
1. RED: Write a failing test.
2. GREEN: Write just enough code to make the test pass.
3. REFACTOR: Clean up the code without changing behavior.

### Test Plan

1. Test valid ID numbers:
   - `2001014800086`
   - `2909035800085`
2. Test for too short inputs.
3. Test for too long inputs.
4. Test for non-numeric characters.
5. Test year, month, day ranges.
6. Validate gender digit, citizenship, and checksum using the **Luhn algorithm**.

---

## 📂 Project Setup with Gradle

Use Gradle to scaffold your Java project from the command line.

### Steps:

```bash
mkdir validate_sa_id
cd validate_sa_id
gradle init
