import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TextFieldToLabel extends JFrame implements ActionListener {
    private JTextField textField;
    private JLabel label;
    private JButton button;

    public TextFieldToLabel() {
        // Set up the frame
        setTitle("TextField to Label");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create the text field
        textField = new JTextField(15);
        add(textField);

        // Create the button
        button = new JButton("Submit");
        button.addActionListener(this);
        add(button);

        // Create the label
        label = new JLabel();
        add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the text from the text field and set it in the label
        String text = textField.getText();
        label.setText(text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextFieldToLabel frame = new TextFieldToLabel();
            frame.setVisible(true);
        });
    }
}

