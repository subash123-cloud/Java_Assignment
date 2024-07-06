import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FoodOrderingSystemGUI extends JFrame implements ActionListener {

    private JCheckBox momoCheckBox;
    private JCheckBox pizzaCheckBox;
    private JCheckBox chowmeinCheckBox;
    private JCheckBox fryRiceCheckBox;
    private JLabel resultLabel;

    public FoodOrderingSystemGUI() {
        setTitle("Food Ordering System");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1, 10, 10));

        JLabel titleLabel = new JLabel("Food Ordering System", JLabel.CENTER);
        add(titleLabel);

        JPanel checkBoxPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        
        momoCheckBox = new JCheckBox("Momo");
        checkBoxPanel.add(momoCheckBox);

        pizzaCheckBox = new JCheckBox("Pizza");
        checkBoxPanel.add(pizzaCheckBox);

        chowmeinCheckBox = new JCheckBox("Chowmein");
        checkBoxPanel.add(chowmeinCheckBox);

        fryRiceCheckBox = new JCheckBox("Fry Rice");
        checkBoxPanel.add(fryRiceCheckBox);

        add(checkBoxPanel);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        resultLabel = new JLabel("", JLabel.CENTER);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder selectedItems = new StringBuilder();
        int count = 0;

        if (momoCheckBox.isSelected()) {
            selectedItems.append("Momo ");
            count++;
        }
        if (pizzaCheckBox.isSelected()) {
            selectedItems.append("Pizza ");
            count++;
        }
        if (chowmeinCheckBox.isSelected()) {
            selectedItems.append("Chowmein ");
            count++;
        }
        if (fryRiceCheckBox.isSelected()) {
            selectedItems.append("Fry Rice ");
            count++;
        }

        resultLabel.setText("You have selected " + count + " items they are " + selectedItems.toString().trim());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FoodOrderingSystemGUI());
    }
}
