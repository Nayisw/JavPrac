import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MatrixInFileGUI extends JFrame {

    private JTextField rowsField, colsField;
    private JTextArea matrixArea;

    public MatrixInFileGUI() {
        setTitle("Matrix Input and Output");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Enter the number of rows:"));
        rowsField = new JTextField();
        inputPanel.add(rowsField);
        inputPanel.add(new JLabel("Enter the number of columns:"));
        colsField = new JTextField();
        inputPanel.add(colsField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmission();
            }
        });
        inputPanel.add(submitButton);

        add(inputPanel, BorderLayout.NORTH);

        matrixArea = new JTextArea();
        matrixArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(matrixArea);
        add(scrollPane, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void handleSubmission() {
        try {
            int row = Integer.parseInt(rowsField.getText());
            int col = Integer.parseInt(colsField.getText());

            int[][] matrix = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    String input = JOptionPane.showInputDialog("Enter element at position (" + (i + 1) + ", " + (j + 1) + "):");
                    matrix[i][j] = Integer.parseInt(input);
                }
            }

            writeMatrixToFile(matrix);

            StringBuilder matrixText = new StringBuilder();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrixText.append(matrix[i][j]).append(" ");
                }
                matrixText.append("\n");
            }
            matrixArea.setText(matrixText.toString());
        } catch (NumberFormatException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input or error occurred!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void writeMatrixToFile(int[][] matrix) throws IOException {
        FileWriter fileWriter = new FileWriter("matrix.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                printWriter.print(" " + matrix[i][j]);
            }
            printWriter.println();
        }
        printWriter.close();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MatrixInFileGUI());
    }
}
