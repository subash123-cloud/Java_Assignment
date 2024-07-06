import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyEventDemo extends JFrame implements KeyListener {
    private JTextField textField;
    private JLabel label;

    public KeyEventDemo() {
        // Create the frame
        setTitle("Key Event Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        textField = new JTextField(20);
        label = new JLabel("Press any key in the text field...");

        // Add key listener to the text field
        textField.addKeyListener(this);

        // Add components to the frame
        add(textField);
        add(label);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Handle key typed event
        label.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Handle key pressed event
        label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Handle key released event
        label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
