# Java Swing Calculator

This is a simple calculator application built using **Java Swing**. It provides basic arithmetic operations such as addition, subtraction, multiplication, and division with a graphical user interface (GUI).

## Features

✅ Simple and interactive user interface  
✅ Supports basic arithmetic operations: `+`, `-`, `*`, `/`  
✅ Displays results in real-time  
✅ Reset (`C`) button to clear the input  
✅ Handles divide-by-zero exceptions  

## Requirements

- Java Development Kit (JDK) 8 or later

## How to Run

### Step 1: Compile the Java files  
Open a terminal or command prompt in the project directory and compile the files:  
javac Calculator.java CalculatorGUI.java

bash
Kopyala
Düzenle

### Step 2: Run the Calculator  
java CalculatorGUI

markdown
Kopyala
Düzenle

## Code Overview

### `Calculator.java`  
- Contains methods for basic arithmetic operations:  
  - `add(double a, double b)`: Adds two numbers.  
  - `subtract(double a, double b)`: Subtracts one number from another.  
  - `multiply(double a, double b)`: Multiplies two numbers.  
  - `divide(double a, double b)`: Divides one number by another (handles division by zero).  

### `CalculatorGUI.java`  
- Implements a **Swing-based graphical user interface**.  
- Displays a text field for user input and results.  
- Uses buttons for numbers (`0-9`) and operations (`+`, `-`, `*`, `/`).  
- Includes:  
  - `C` button to **clear** input.  
  - `=` button to **calculate and display** results.  
- Listens to button clicks using **ActionListener**.  

## How It Works  

1. **Start the application** → A calculator window opens.  
2. **Enter numbers** → Click number buttons (`0-9`).  
3. **Choose an operator** → Click `+`, `-`, `*`, or `/`.  
4. **Enter the second number** → Click another number.  
5. **Get the result** → Click `=`, and the result is displayed.  
6. **Reset calculator** → Click `C` to clear everything.  

## Example Usage  

### **Example 1: Addition**  
User clicks: [3] [+] [5] [=]
Display shows: 8

markdown
Kopyala
Düzenle

### **Example 2: Division by Zero**  
User clicks: [9] [/] [0] [=]
Display shows: "Cannot divide by zero"

markdown
Kopyala
Düzenle

## Notes  

- Ensure you have **Java installed** before running the program.  
- The calculator **does not support decimal numbers** in its current form (can be improved).  
- You can **enhance** it by adding **more operations**, a **better UI**, or **keyboard input support**.  

Enjoy your **Java Swing Calculator**! 🚀
