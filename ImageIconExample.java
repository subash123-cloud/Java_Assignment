import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ImageIconExample extends JFrame {

    public ImageIconExample() {
        setTitle("ImageIcon Example");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel topLabel = new JLabel("Java Programming", JLabel.CENTER);
        add(topLabel, BorderLayout.NORTH);

        // Update the path to your image file
        String imagePath = "C:\\xampp\\htdocs\\S_P_Business\\images\\chocopie(12).png";
        ImageIcon javaIcon = new ImageIcon(imagePath);

        if (javaIcon.getIconWidth() == -1) {
            // If the image didn't load, display an error message
            JLabel errorLabel = new JLabel("Image not found", JLabel.CENTER);
            add(errorLabel, BorderLayout.CENTER);
        } else {
            JLabel imageLabel = new JLabel(javaIcon);
            add(imageLabel, BorderLayout.CENTER);
        }

        JLabel bottomLabel = new JLabel("Try it", JLabel.CENTER);
        add(bottomLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageIconExample());
    }
}
