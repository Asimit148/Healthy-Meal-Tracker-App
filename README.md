# 🥗 Healthy Meal Tracker App

### 👤 Author: Asimit Shrivastava ST10471627

---

## 📱 Overview of the App
The Healthy Meal Tracker App is a user-friendly Android application that allows users to log, review, and filter their daily meals with nutritional insights. It consists of three intuitive screens—Welcome, Input, and Display—that guide users through a seamless tracking experience.

---

## 🎯 Purpose of the App
This app is designed to help users track their meal intake, categorize meals by type, record calories, and make personal notes. The goal is to promote healthier eating habits by providing an easy-to-use logging system.

---

## 🧩 Features of the App

### 🖥️ 1. Welcome Screen
- A simple landing page welcoming users.
- Buttons:
  - **Get Started** – Navigates to the Meal Input Screen.
  - **Exit App** – Closes the application.

![Welcome Screen](screenshots/welcome_screen.png)

---

### 📝 2. Meal Input Screen
- Users can input the following details:
  - **Meal Description**
  - **Meal Type**
  - **Calories**
  - **Notes**
- Buttons:
  - **Add to Meal Log** – Adds the meal to a list (with input validation).
  - **Go to Meal Viewer Screen** – Navigates to the Meal View screen.
  - **Clear Contents** – Clears all EditText fields.
  - **Exit App** – Closes the app.

![Meal Input Screen](screenshots/input_screen.png)

---

### 📊 3. Meal View Screen
- Displays meals entered.
- Buttons:
  - **Show All Meals** – Displays every meal with full details.
  - **Show Meals with Calories > 300** – Filters and shows only meals with 300+ calories.
  - **Back to Home Screen** – Returns to the input screen.

![Meal View Screen](screenshots/display_screen.png)

---

## 🎨 Design Considerations

- **EditTexts** were used for user inputs: description, type, calories, and notes.
- **Buttons** on each screen guide the user logically through the app:
  - On the Welcome screen, buttons clearly separate entry and exit.
  - On the Input screen, buttons are color-coded:
    - Green for Add
    - Blue for View
    - Yellow for Clear
    - Red for Exit
  - On the View screen, intuitive navigation and filtering enhance usability.
- **TextViews** serve as headers and feedback areas (e.g., display results).

![EditText Examples](screenshots/edittexts.png)
![Button Layout](screenshots/buttons.png)
![TextViews](screenshots/textviews.png)

---

## 🔒 Usability and Error Handling

- Input validation ensures:
  - All required fields (Description, Type, Calories) are completed.
  - Calories are valid positive numbers.
- Feedback via Toast messages prevents user confusion and incorrect data submission.

---

## 🌟 Personal Design Inspiration and Touches

- The background and layout were crafted for a calming, clean user experience.
- Color themes:
  - Blue and green hues promote a fresh, healthy vibe.
  - Light gray backgrounds improve input visibility.
- Buttons and text elements were deliberately styled for high contrast and accessibility.

![UI Color Scheme](screenshots/colors.png)

---

## 🔧 Development Workflow

- **Version Control** was implemented using Git and GitHub.
- **GitHub Actions** can be configured for CI/CD, testing, and automation.
- Benefits:
  - Backup and history of changes.
  - Team collaboration support.
  - Error detection and build automation using GitHub Actions.

---

## ✅ Conclusion

The Healthy Meal Tracker App was created to combine practicality with a pleasant user experience. Through careful design, error validation, and thoughtful UI components, it meets its goal of encouraging healthier food choices. The use of GitHub ensures the project is maintainable and scalable for future enhancements.
