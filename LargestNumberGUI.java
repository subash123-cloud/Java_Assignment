import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LargestNumberGUI extends JFrame implements ActionListener {

    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JLabel resultLabel;

    public LargestNumberGUI() {
        setTitle("Find the Largest One");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel titleLabel = new JLabel("Find the Largest One", JLabel.CENTER);
        titleLabel.setPreferredSize(new Dimension(280, 30));
        add(titleLabel);

        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberLabel.setPreferredSize(new Dimension(100, 30));
        add(firstNumberLabel);

        firstNumberField = new JTextField(10);
        add(firstNumberField);

        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberLabel.setPreferredSize(new Dimension(100, 30));
        add(secondNumberLabel);

        secondNumberField = new JTextField(10);
        add(secondNumberField);

        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(this);
        checkButton.setPreferredSize(new Dimension(80, 30));
        add(checkButton);

        resultLabel = new JLabel("", JLabel.CENTER);
        resultLabel.setPreferredSize(new Dimension(280, 30));
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int secondNumber = Integer.parseInt(secondNumberField.getText());
            int largestNumber = Math.max(firstNumber, secondNumber);
            resultLabel.setText(largestNumber + " is largest");
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input! Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LargestNumberGUI());
    }
}
