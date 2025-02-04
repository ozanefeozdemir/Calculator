import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

 class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField display;
    private Calculator calculator;
    private StringBuilder currentInput;
    private String operator;
    private double firstNumber;

    public CalculatorGUI() {
        calculator = new Calculator();
        currentInput = new StringBuilder();
        operator = "";
        // Set up the frame
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Create display
        display = new JTextField();
        display.setHorizontalAlignment(JTextField.LEFT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Buttons for numbers and operations
        String[] buttons = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"};

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            currentInput.append(command);
            display.setText(currentInput.toString());
        } else if (command.matches("[+\\-*/]")) {
            try {
                firstNumber = Double.parseDouble(currentInput.toString());
            } catch (NumberFormatException ex) {
                display.setText("Error");
                return;
            }
            operator = command;
            currentInput.setLength(0);
        }


        else if (command.equals("=")) {
            try {
                double secondNumber = Double.parseDouble(currentInput.toString());
                double result = 0;
                switch (operator) {
                    case "+" -> result = calculator.add(firstNumber, secondNumber);
                    case "-" -> result = calculator.subtract(firstNumber, secondNumber);
                    case "*" -> result = calculator.multiply(firstNumber, secondNumber);
                    case "/" -> result = calculator.divide(firstNumber, secondNumber);
                }
                display.setText(String.valueOf(result));
                currentInput.setLength(0);
            } catch (ArithmeticException ex) {
                display.setText("Cannot divide by zero");
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        } else if (command.equals("C")) {
            currentInput.setLength(0);
            operator = "";
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
