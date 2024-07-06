import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwapTextFields extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    private JButton swapButton;

    public SwapTextFields() {
        // Set up the frame
        setTitle("Swap Text Fields");
        setSize(250, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create the text fields with smaller size and font
        textField1 = new JTextField(5);
        textField2 = new JTextField(5);
        Font font = new Font("Arial", Font.PLAIN, 12);
        textField1.setFont(font);
        textField2.setFont(font);

        // Create the button
        swapButton = new JButton("Swap");
        swapButton.addActionListener(this);
        swapButton.setFont(font);

        // Add components to the frame
        add(new JLabel("Number 1"));
        add(textField1);
        add(new JLabel("Number 2"));
        add(textField2);
        add(swapButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Swap the text between the two text fields
        String temp = textField1.getText();
        textField1.setText(textField2.getText());
        textField2.setText(temp);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SwapTextFields frame = new SwapTextFields();
            frame.setVisible(true);
        });
    }
}
