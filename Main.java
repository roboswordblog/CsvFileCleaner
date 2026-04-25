import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("CSV FILE CLEANER");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1100, 675);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);

        JTextField fileName = new JTextField("example.csv");
        fileName.setSize(150, 50);
        fileName.setLocation(50, 5);
        fileName.setBackground(new Color(50, 50, 50));
        fileName.setForeground(Color.WHITE);
        fileName.setCaretColor(Color.WHITE);
        fileName.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        fileName.setFont(new Font("Consolas", Font.PLAIN, 14));
        window.add(fileName);

        JButton loadButton = new JButton("Load");
        loadButton.setBounds(210, 10, 100, 40);
        loadButton.setBackground(new Color(45, 45, 45));
        loadButton.setForeground(Color.WHITE);
        loadButton.setFocusPainted(false);
        loadButton.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        loadButton.setFont(new Font("Consolas", Font.BOLD, 14));
        loadButton.setOpaque(true);
        loadButton.setContentAreaFilled(true);

        window.add(loadButton);
        window.getContentPane().setBackground(new Color(30, 30, 30));
        window.setVisible(true);
    }
}
