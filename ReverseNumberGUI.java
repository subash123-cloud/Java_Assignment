import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ReverseNumberGUI extends JFrame implements ActionListener {

    private JTextField inputField;
    private JTextField resultField;

    public ReverseNumberGUI() {
        setTitle("Reverse Number");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(2, 2));
        
        JLabel inputLabel = new JLabel("Number");
        panel.add(inputLabel);

        inputField = new JTextField();
        panel.add(inputField);

        JLabel resultLabel = new JLabel("Reverse");
        panel.add(resultLabel);

        resultField = new JTextField();
        resultField.setEditable(false);
        panel.add(resultField);

        add(panel, BorderLayout.CENTER);

        JButton reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(this);
        add(reverseButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = inputField.getText();
        try {
            int number = Integer.parseInt(inputText);
            int reversedNumber = reverseNumber(number);
            resultField.setText(String.valueOf(reversedNumber));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input!");
        }
    }

    private int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ReverseNumberGUI());
    }
}
