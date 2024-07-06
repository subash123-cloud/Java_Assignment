import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInfoForm extends JFrame {

    private JTextField nameField, addressField, phoneField, emailField;
    private JRadioButton maleButton, femaleButton;
    private JComboBox<String> programComboBox;

    public StudentInfoForm() {
        // Create form elements
        setTitle("Student Info Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 5, 5));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();

        JLabel genderLabel = new JLabel("Gender:");
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);

        JLabel programLabel = new JLabel("Program:");
        programComboBox = new JComboBox<>(new String[]{"BIM", "CS", "IT", "BBA"});

        JLabel phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = addressField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String program = (String) programComboBox.getSelectedItem();
                String phone = phoneField.getText();
                String email = emailField.getText();
                
                String info = String.format("Name: %s\nAddress: %s\nGender: %s\nProgram: %s\nPhone: %s\nEmail: %s",
                                             name, address, gender, program, phone, email);
                
                JOptionPane.showMessageDialog(null, info, "Student Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                addressField.setText("");
                genderGroup.clearSelection();
                programComboBox.setSelectedIndex(0);
                phoneField.setText("");
                emailField.setText("");
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Add elements to frame
        add(nameLabel);
        add(nameField);
        add(addressLabel);
        add(addressField);
        add(genderLabel);
        add(genderPanel);
        add(programLabel);
        add(programComboBox);
        add(phoneLabel);
        add(phoneField);
        add(emailLabel);
        add(emailField);
        add(addButton);
        add(resetButton);
        add(cancelButton);

        // Layout adjustments
        setLayout(new GridLayout(8, 2, 10, 10));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentInfoForm().setVisible(true);
            }
        });
    }
}
