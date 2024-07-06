import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MouseEventHandlerGUI extends JFrame implements MouseListener, MouseMotionListener {

    private JLabel statusLabel;

    public MouseEventHandlerGUI() {
        setTitle("Mouse Event Handling Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        statusLabel = new JLabel("Perform mouse actions...", JLabel.CENTER);
        statusLabel.setPreferredSize(new Dimension(400, 100));
        add(statusLabel, BorderLayout.SOUTH);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered the Panel");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited the Panel");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        statusLabel.setText("Mouse Dragged to (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        statusLabel.setText("Mouse Moved to (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseEventHandlerGUI());
    }
}
