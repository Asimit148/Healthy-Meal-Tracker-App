# 🥗 Healthy Meal Tracker App

### 👤 Author: Asimit Shrivastava ST10471627

---

## 📱 Overview of the App
The Healthy Meal Tracker App is a user-friendly Android application that allows users to log, review, and filter their daily meals with nutritional insights. It consists of three intuitive screens—Welcome, Input, and Display—that guide users through a seamless tracking experience.

---

## 🎯 Purpose of the App
This app is designed to help users:
- Track their meal intake.
- Categorize meals by type.
- Record calories.
- Add personal meal notes.

The goal is to promote healthier eating habits by providing an easy-to-use meal logging system.

---

## 🧩 Features of the App

### 🖥️ 1. Welcome Screen
- **TextView**: Displays the app title and welcome message.
- **Buttons**:
  - `Get Started`: Navigates to the Meal Input Screen.
  - `Exit App`: Closes the application.

#### 🖼️ Screenshot:
![Welcome Screen](https://github.com/user-attachments/assets/b22e9d1a-6f24-480b-b178-5517bf3fdadd)

---

### 📝 2. Meal Input Screen
- **EditTexts**:
  - Meal Description
  - Meal Type (e.g., Breakfast, Lunch)
  - Calories (numeric input)
  - Notes
- **Buttons**:
  - `Add to Meal Log`: Adds the meal to a list (with input validation).
  - `Go to Meal Viewer Screen`: Navigates to the Meal View screen.
  - `Clear Contents`: Clears all fields.
  - `Exit App`: Exits the application.

#### 🖼️ Screenshots:
<p float="left">
  <img src="https://github.com/user-attachments/assets/1a7b24dc-8451-43a9-b0e4-dbeffdf7dbdd" width="30%" />
  <img src="https://github.com/user-attachments/assets/ec4385e9-f0c8-4ef2-b7c4-07d1bbb1884b" width="30%" />
  <img src="https://github.com/user-attachments/assets/eaaf3912-b2f6-4e25-a041-916a5be871a8" width="30%" />
</p>

---

### 📊 3. Meal View Screen
- Displays a summary of meals entered by the user.
- **Buttons**:
  - `Show All Meals`: Displays every meal with full details.
  - `Show Meals with Calories > 300`: Filters and shows only meals with high calorie content.
  - `Back to Home Screen`: Returns to the input screen.
- **TextViews**:
  - Used for showing full meal log and filtered list.

#### 🖼️ Screenshots:
<p float="left">
  <img src="https://github.com/user-attachments/assets/e8b509fc-68bb-414d-be85-c885151447e0" width="30%" />
  <img src="https://github.com/user-attachments/assets/17a4ea6c-76a4-486c-9fcd-3a53ef2dbac1" width="30%" />
  <img src="https://github.com/user-attachments/assets/3a16d396-dfe1-467a-a44d-355c306a6054" width="30%" />
</p>

---

## 🎨 Design Considerations

### ✏️ EditTexts:
- Used on the Input screen for meal description, type, calorie entry, and notes.
- Provide hint text and proper spacing for ease of input.

### 🎛️ Buttons:
- Color-coded for intuitive navigation:
  - **Green**: Add to log
  - **Blue**: Go to viewer
  - **Yellow**: Clear inputs
  - **Red**: Exit
- On the Welcome and View screens, buttons are clearly labeled and positioned for user clarity.

### 📋 TextViews:
- Used to display feedback, headings, and meal results.
- Styled for visibility and clarity.

#### 🖼️ UI Elements:
<p float="left">
  <img src="screenshots/edittexts.png" width="30%" />
  <img src="screenshots/buttons.png" width="30%" />
  <img src="screenshots/textviews.png" width="30%" />
</p>

---

## 🔒 Usability and Error Handling

- **Input Validation**:
  - Ensures that all fields are completed before allowing submission.
  - Validates that calorie input is a positive number.
- **Feedback**:
  - Uses `Toast` messages to alert the user if required fields are missing or invalid.

---

## 🌟 Personal Design Inspiration and Touches

- **Backgrounds**: Designed to be calm and non-distracting.
- **Color Themes**:
  - Green and blue hues create a health-focused, calming feel.
  - Light backgrounds improve contrast and readability.
- **Styling**:
  - Consistent padding, button styling, and corner rounding enhance overall look and usability.

#### 🖼️ Screenshot:
![UI Color Scheme](screenshots/colors.png)

---

## 🔧 Development Workflow

### 🗂️ Version Control
- Git used to track all changes during development.

### 🌐 GitHub Integration
- GitHub was used to store, backup, and collaborate on the source code.

### ⚙️ GitHub Actions (Optional Enhancements)
- Could be used for:
  - Running tests automatically
  - Building APKs
  - CI/CD automation

### ✅ Benefits
- Protects against data loss
- Easy collaboration
- Efficient troubleshooting and version rollback

---

## ✅ Conclusion

The Healthy Meal Tracker App was designed to be a practical, visually appealing, and effective tool for encouraging mindful eating. By blending clean design, strong validation, and smooth navigation, this app provides a great foundation for Android development with a meaningful user impact.

---
