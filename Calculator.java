import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculator extends JFrame implements ActionListener {
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create and add components
        JLabel num1Label = new JLabel("Number 1:");
        num1Label.setBounds(10, 10, 80, 25);
        add(num1Label);

        num1Field = new JTextField();
        num1Field.setBounds(100, 10, 160, 25);
        add(num1Field);

        JLabel num2Label = new JLabel("Number 2:");
        num2Label.setBounds(10, 40, 80, 25);
        add(num2Label);

        num2Field = new JTextField();
        num2Field.setBounds(100, 40, 160, 25);
        add(num2Field);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10, 70, 80, 25);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(100, 70, 160, 25);
        resultField.setEditable(false);
        add(resultField);

        addButton = new JButton("+");
        addButton.setBounds(10, 110, 50, 25);
        addButton.addActionListener(this);
        add(addButton);

        subtractButton = new JButton("-");
        subtractButton.setBounds(70, 110, 50, 25);
        subtractButton.addActionListener(this);
        add(subtractButton);

        multiplyButton = new JButton("*");
        multiplyButton.setBounds(130, 110, 50, 25);
        multiplyButton.addActionListener(this);
        add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.setBounds(190, 110, 50, 25);
        divideButton.addActionListener(this);
        add(divideButton);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                result = num1 * num2;
            } else if (e.getSource() == divideButton) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                    return;
                }
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
