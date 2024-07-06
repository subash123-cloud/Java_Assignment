import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GuessTheAnswerGUI extends JFrame implements ActionListener {

    private JLabel resultLabel;

    public GuessTheAnswerGUI() {
        setTitle("Guess the Answer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel questionLabel = new JLabel("What is the next number in the sequence: 2, 4, 8, 16, ?");
        questionLabel.setPreferredSize(new Dimension(280, 30));
        add(questionLabel);

        JButton button1 = new JButton("32");
        button1.addActionListener(this);
        button1.setPreferredSize(new Dimension(130, 30));
        add(button1);

        JButton button2 = new JButton("18");
        button2.addActionListener(this);
        button2.setPreferredSize(new Dimension(130, 30));
        add(button2);

        JButton button3 = new JButton("All of the above");
        button3.addActionListener(this);
        button3.setPreferredSize(new Dimension(130, 30));
        add(button3);

        JButton button4 = new JButton("None of the  of the above");
        button4.addActionListener(this);
        button4.setPreferredSize(new Dimension(130, 30));
        add(button4);

        resultLabel = new JLabel("", JLabel.CENTER);
        resultLabel.setPreferredSize(new Dimension(280, 30));
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("32")) {
            resultLabel.setText("You are correct");
        } else {
            resultLabel.setText("You are incorrect");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GuessTheAnswerGUI());
    }
}
