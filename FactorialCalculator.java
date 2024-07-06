import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FactorialCalculator extends JFrame implements ActionListener {
    private JTextField numberField;
    private JTextField resultField;
    private JButton calculateButton;

    public FactorialCalculator() {
        // Set up the frame
        setTitle("Factorial");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create and add components
        JLabel numberLabel = new JLabel("Number:");
        numberLabel.setBounds(10, 10, 80, 25);
        add(numberLabel);

        numberField = new JTextField();
        numberField.setBounds(100, 10, 160, 25);
        add(numberField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 50, 100, 25);
        calculateButton.addActionListener(this);
        add(calculateButton);

        JLabel resultLabel = new JLabel("Factorial:");
        resultLabel.setBounds(10, 90, 80, 25);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(100, 90, 160, 25);
        resultField.setEditable(false);
        add(resultField);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(numberField.getText());
            if (number < 0) {
                JOptionPane.showMessageDialog(this, "Please enter a non-negative integer!");
                return;
            }
            long factorial = calculateFactorial(number);
            resultField.setText(String.valueOf(factorial));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer!");
        }
    }

    private long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FactorialCalculator calculator = new FactorialCalculator();
            calculator.setVisible(true);
        });
    }
}

