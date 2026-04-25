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

        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadButton.setBackground(new Color(70, 70, 70));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                loadButton.setBackground(new Color(45, 45, 45));
            }
        });

        JButton dropNaButton = new JButton("Drop NaN");
        dropNaButton.setBounds(410, 10, 150, 40);
        dropNaButton.setBackground(new Color(0, 123, 255));
        dropNaButton.setForeground(Color.WHITE);
        dropNaButton.setFocusPainted(false);
        // dropNaButton.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        dropNaButton.setFont(new Font("Consolas", Font.BOLD, 14));
        dropNaButton.setFocusPainted(false);
        dropNaButton.setBorderPainted(false);
        dropNaButton.setContentAreaFilled(false);
        dropNaButton.setOpaque(true);

        dropNaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dropNaButton.setBackground(new Color(0, 86, 179));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                dropNaButton.setBackground(new Color(0, 123, 255));
            }
        });

        window.add(loadButton);
        window.add(dropNaButton);
        window.getContentPane().setBackground(new Color(30, 30, 30));
        window.setVisible(true);
    }
}
