import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CurrencyConverter extends JFrame implements ActionListener {
    private JTextField dollarField, nepaliField, euroField;
    private JButton convertButton;
    private static final double USD_TO_NEPALI_RATE = 112.0;
    private static final double USD_TO_EURO_RATE = 0.89;

    public CurrencyConverter() {
        // Create the frame
        setTitle("Currency Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Create components
        JLabel dollarLabel = new JLabel("Dollar (USD):");
        dollarField = new JTextField();
        JLabel nepaliLabel = new JLabel("Nepalese (NPR):");
        nepaliField = new JTextField();
        nepaliField.setEditable(false); // Nepalese field should be output only
        JLabel euroLabel = new JLabel("Euro (EUR):");
        euroField = new JTextField();
        euroField.setEditable(false); // Euro field should be output only
        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        // Add components to the frame
        add(dollarLabel);
        add(dollarField);
        add(nepaliLabel);
        add(nepaliField);
        add(euroLabel);
        add(euroField);
        add(new JLabel()); // Placeholder to align button
        add(convertButton);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            try {
                double dollar = Double.parseDouble(dollarField.getText());
                double nepali = dollar * USD_TO_NEPALI_RATE;
                double euro = dollar * USD_TO_EURO_RATE;
                nepaliField.setText(String.format("%.2f", nepali));
                euroField.setText(String.format("%.2f", euro));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
