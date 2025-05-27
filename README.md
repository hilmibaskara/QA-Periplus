# QA-Periplus

Automated UI testing framework for the Periplus web application. Built using Java, Selenium WebDriver, and TestNG, this project provides modular and reusable components for validating core e-commerce functionalities such as product search, shopping cart, sign-in, and account management.

## 🧰 Features

- Page Object Model (POM) structure
- Selenium WebDriver for browser automation
- TestNG for test configuration and execution
- Utility classes for common functions (JavaScript execution, waits, etc.)
- Organized shopping cart test scenarios by utilizing several Periplus pages:
  - Home Page
  - Sign In
  - Shopping Cart
  - Product Details
  - Product Search
  - My Account

## 📁 Project Structure

```
QA-Periplus-main/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── com/
│   │       │   └── periplus/
│   │       │       └── pages/
│   │       │           ├── HomePage.java
│   │       │           ├── signin/
│   │       │           ├── shoppingcart/
│   │       │           ├── productsearch/
│   │       │           ├── productdetails/
│   │       │           └── myaccount/
│   │       ├── org/example/
│   │       └── utilities/
│   │           ├── JavaScriptUtility.java
│   │           └── Utility.java
│   └── test/
│
├── pom.xml
└── .gitignore
```

## 🛒 Shopping Test Scenario - QA Periplus

This document outlines the detailed test steps for validating the "Add to Cart" functionality on the Periplus website through automated UI testing.

### 🎯 Test Objective

To verify that a user can search for a product, add it to the shopping cart, and confirm the product is added correctly using the ISBN number.

### 📝 Test Steps

1. **Open Browser**
   - Launch Google Chrome.

2. **Navigate to Website**
   - Go to [https://www.periplus.com/](https://www.periplus.com/)

3. **Login Process**
   - Click on the **Sign In** link.
   - Enter **Username** and **Password**.
   - Click the **Login** button.

4. **Search for a Product**
   - Input the search term: `Atomic Habits`.
   - Click on the **Search** icon.

5. **Select Product**
   - Click on the **first product** in the search results.
   - Retrieve the **ISBN number** of the product for identification.

6. **Add to Cart**
   - Click the **Add to Cart** button.
   - Wait until the **confirmation popup disappears**.

7. **Verify Shopping Cart**
   - Click on the **Shopping Cart** icon.
   - Check if the **retrieved ISBN number** exists in the cart.
   - ✅ If it exists, **test is passed**.
   - ❌ If it does not, **test is failed**.

### ✅ Expected Result

The product with the correct ISBN should appear in the shopping cart after being added, confirming successful completion of the scenario.


## 🛠 Requirements

- Java 11+
- Maven
- ChromeDriver or compatible WebDriver
- IntelliJ IDEA or any Java IDE

## 🚀 Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-repo/QA-Periplus.git
   cd QA-Periplus
   ```

2. **Install dependencies**:
   ```bash
   mvn clean install
   ```

3. **Run tests**:
   ```bash
   mvn test
   ```
