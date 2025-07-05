# 🧮 String Calculator - TDD Kata by Vraj Ranipa

This project is a complete implementation of the **String Calculator Kata** using **Test-Driven Development (TDD)** principles in **Java**.

---

## 👨‍💻 Author

**Name:** Vraj Ranipa  
**Role:** Software Craftsperson  
**GitHub:** [github.com/vrajranipa](https://github.com/1204Vraj)

---

## 🧪 Methodology: Test-Driven Development (TDD)

The entire solution is developed using strict **TDD**:

1. **Red** – Write a failing test case.
2. **Green** – Write the minimum code to pass the test.
3. **Refactor** – Clean up code while keeping tests green.
4. **Commit Frequently** – Each commit reflects a single evolution step.

---

## ✅ Features Implemented

| ✅ Feature | Description |
|-----------|-------------|
| Empty Input | Returns 0 for `""` |
| Single Number | Returns the number itself |
| Two Numbers | Returns sum (e.g., `"1,2"` → 3) |
| Unknown Amount of Numbers | Supports any amount of comma-separated numbers |
| Newline as Delimiter | Supports newline (`\n`) as valid delimiter |
| Custom Delimiter | Single character delimiters like `//;\n1;2` |
| Multiple Delimiters | Supports multiple delimiters like `//[*][%]\n1*2%3` |
| Multiple Delimiters of Any Length | Supports custom delimiters like `//[***][%%]\n1***2%%3` |
| Negative Number Check | Throws exception with list of all negative numbers |
| Ignore Numbers > 1000 | E.g., `2 + 1001 = 2` |

---

## 🧰 Technologies Used

- **Language:** Java 17
- **Build Tool:** Maven
- **Testing Framework:** JUnit 5
- **IDE:** IntelliJ IDEA
- **Design Methodology:** Test-Driven Development (TDD)

---

## 🧪 How to Run

```bash
# Clone the repository
git clone https://github.com/1204Vraj/string-calculator-Incubyte-tdd.git
cd string-calculator-tdd

# Run tests
mvn test

