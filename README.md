Compose Exercise – Setup & Passcode Screens

This is a simple Jetpack Compose exercise that demonstrates a setup flow with a responsive UI.

Features

A Setup Screen with multiple onboarding options.

Clicking the “Set up a pin” card navigates to the Create Passcode Screen.

The Create Passcode Screen showcases a 4-digit passcode input layout.

The screen is responsive with state changes when interacting with the keypad and buttons.

Note: This is only a UI showcase – it does not actually persist or verify the passcode.

Screenshots
<p align="center"> <img src="https://github.com/GwethCephas/Fintrack/blob/main/C.E.Setup.jpg?raw=true" alt="Setup Screen" width="300"/> <img src="https://github.com/GwethCephas/Fintrack/blob/main/C.E.Passcode.jpg?raw=true" alt="Passcode Screen" width="300"/> </p>
Tech Stack

Kotlin

Jetpack Compose

Material3 for styling

State management with remember and mutableStateOf

How it works

Setup Screen displays three onboarding options:

Set up a pin

Link your bank accounts

Create your savings goal

The first card (“Set up a pin”) is clickable.

On clicking the first card, navigation takes the user to the Create Passcode Screen.

Create Passcode Screen:

Shows four empty boxes for the pin.

Numeric keypad below to simulate input.

Button updates UI state but does not set up a real PIN.

Purpose

This exercise is only meant to showcase basic navigation, UI design, and state responsiveness in Jetpack Compose.
It is not a full authentication or pin management implementation.
