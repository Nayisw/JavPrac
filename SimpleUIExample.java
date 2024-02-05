import javax.swing.*;

public class SimpleUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        JLabel inputLabel = new JLabel("Enter a number:");
        inputLabel.setBounds(20, 20, 100, 20);
        frame.add(inputLabel);

        JTextField inputField = new JTextField();
        inputField.setBounds(130, 20, 120, 20);
        frame.add(inputField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 60, 100, 30);
        frame.add(submitButton);

        JTextArea outputArea = new JTextArea();
        outputArea.setBounds(20, 100, 250, 50);
        frame.add(outputArea);

        submitButton.addActionListener(e -> {
            String input = inputField.getText();
            // Perform any processing with the input here
            outputArea.setText("Input: " + input); // Display input in the output area
        });

        frame.setVisible(true);
    }
}
