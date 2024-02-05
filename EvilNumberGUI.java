import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvilNumberGUI {
    private JFrame frame;

    public EvilNumberGUI() {
        frame = new JFrame("Evil Number Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        JLabel inputLabel = new JLabel("Enter a number:");
        inputLabel.setBounds(20, 20, 100, 20);
        frame.add(inputLabel);

        JTextField inputField = new JTextField();
        inputField.setBounds(130, 20, 120, 20);
        frame.add(inputField);

        JButton checkButton = new JButton("Check");
        checkButton.setBounds(100, 60, 100, 30);
        frame.add(checkButton);

        JTextArea outputArea = new JTextArea();
        outputArea.setBounds(20, 100, 250, 50);
        frame.add(outputArea);

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    boolean isEvil = EvilNumberLogic.isEvilNumber(number);
                    if (isEvil) {
                        outputArea.setText(number + " is an Evil Number!");
                    } else {
                        outputArea.setText(number + " is not an Evil Number");
                    }
                } catch (NumberFormatException ex) {
                    outputArea.setText("Invalid input. Please enter a valid number.");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new EvilNumberGUI();
    }
}
