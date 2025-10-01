🚀 Compose Exercise – Setup & Passcode Screens

This is a simple Jetpack Compose exercise showcasing a setup flow with clean UI and responsive state handling.

✨ Features

📱 Setup Screen with multiple onboarding options

🔐 Clicking “Set up a pin” navigates to the Create Passcode Screen

🔢 Passcode Screen with a 4-digit input layout & keypad

⚡ Responsive UI state changes when interacting with keypad & button

❌ This is only a UI showcase – no real passcode logic or persistence

🖼️ Screenshots
<p align="center"> <img src="https://github.com/GwethCephas/Fintrack/blob/main/C.E.Setup.jpg?raw=true" alt="Setup Screen" width="300" style="margin-right:20px;"/> <img src="https://github.com/GwethCephas/Fintrack/blob/main/C.E.Passcode.jpg?raw=true" alt="Passcode Screen" width="300"/> </p>
🛠 Tech Stack

🟣 Kotlin

🎨 Jetpack Compose

🧩 Material3 for UI styling

🔄 State management with remember + mutableStateOf

⚙️ How it Works

Setup Screen shows 3 onboarding options:

✅ Set up a pin

💳 Link your bank accounts

🎯 Create your savings goal

👉 Only the first card is clickable.

Clicking “Set up a pin” ➝ Navigates to the Passcode Screen

Passcode Screen:

Shows 4 input boxes for the PIN

Includes a numeric keypad for simulation

A button updates UI state but does not actually set a PIN

🎯 Purpose

This project is meant to demonstrate:

✅ Basic navigation between screens

✅ UI responsiveness in Compose

✅ State-driven layouts

It is not a complete authentication flow – just a showcase exercise.
