import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ColorChooser extends JFrame implements ActionListener {
    private JPanel panel;

    public ColorChooser() {
        // Set up the frame
        setTitle("Choose a color");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the panel that will change colors
        panel = new JPanel();
        panel.setBackground(Color.RED);
        add(panel, BorderLayout.CENTER);

        // Create the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton redButton = new JButton("RED");
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        JButton greenButton = new JButton("GREEN");
        greenButton.addActionListener(this);
        buttonPanel.add(greenButton);

        JButton blueButton = new JButton("BLUE");
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);

        JButton closeButton = new JButton("CLOSE");
        closeButton.addActionListener(this);
        buttonPanel.add(closeButton);

        add(buttonPanel, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "RED":
                panel.setBackground(Color.RED);
                break;
            case "GREEN":
                panel.setBackground(Color.GREEN);
                break;
            case "BLUE":
                panel.setBackground(Color.BLUE);
                break;
            case "CLOSE":
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorChooser frame = new ColorChooser();
            frame.setVisible(true);
        });
    }
}
