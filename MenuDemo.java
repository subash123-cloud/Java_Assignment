import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo extends JFrame {

    public MenuDemo() {
        // Create the frame
        setTitle("JMenu Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "Normal Menu"
        JMenu normalMenu = new JMenu("Normal Menu");
        JMenuItem newItem = new JMenuItem("New...");
        JMenuItem openItem = new JMenuItem("Open...");
        normalMenu.add(newItem);
        normalMenu.add(openItem);

        // Create the "Radio Menu"
        JMenu radioMenu = new JMenu("Radio Menu");
        JRadioButtonMenuItem firstRadioOption = new JRadioButtonMenuItem("First Radio Option");
        JRadioButtonMenuItem secondRadioOption = new JRadioButtonMenuItem("Second Radio Option");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(firstRadioOption);
        radioGroup.add(secondRadioOption);
        radioMenu.add(firstRadioOption);
        radioMenu.add(secondRadioOption);

        // Create the "Check Menu"
        JMenu checkMenu = new JMenu("Check Menu");
        JCheckBoxMenuItem firstCheckOption = new JCheckBoxMenuItem("First Check Option");
        JCheckBoxMenuItem secondCheckOption = new JCheckBoxMenuItem("Second Check Option");
        checkMenu.add(firstCheckOption);
        checkMenu.add(secondCheckOption);

        // Add menus to the menu bar
        menuBar.add(normalMenu);
        menuBar.add(radioMenu);
        menuBar.add(checkMenu);

        // Add the menu bar to the frame
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDemo().setVisible(true);
            }
        });
    }
}

