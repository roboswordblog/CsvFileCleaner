import java.awt.*;
import javax.swing.*;

public class Main {
    static dataHandling dataHandler = new dataHandling();
    static boolean replaceSwitch = false;
    static 
    public static JPanel createReplacePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(500, 52, 700, 100);
        panel.setBackground(new Color(30, 30, 30));

        JLabel replaceText = new JLabel("Replace");
        replaceText.setBounds(0, 0, 60, 30);
        replaceText.setForeground(Color.WHITE);
        panel.add(replaceText);

        JTextField value1 = new JTextField();
        value1.setBounds(60, 0, 30, 30);
        value1.setBackground(new Color(50, 50, 50));
        value1.setForeground(Color.WHITE);
        value1.setCaretColor(Color.WHITE);
        value1.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        value1.setFont(new Font("Consolas", Font.PLAIN, 14));
        panel.add(value1);

        JLabel withText = new JLabel("With");
        withText.setBounds(120, 0, 50, 30);
        withText.setForeground(Color.WHITE);
        panel.add(withText);

        JTextField value2 = new JTextField();
        value2.setBounds(170, 0, 30, 30);
        value2.setBackground(new Color(50, 50, 50));
        value2.setForeground(Color.WHITE);
        value2.setCaretColor(Color.WHITE);
        value2.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        value2.setFont(new Font("Consolas", Font.PLAIN, 14));
        panel.add(value2);

        JButton replaceButton = new JButton("Replace");
        replaceButton.setBounds(230, 0, 65, 30);
        replaceButton.setBackground(new Color(255, 128, 0));
        replaceButton.setForeground(Color.WHITE);
        replaceButton.setFocusPainted(false);
        replaceButton.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        replaceButton.setFont(new Font("Consolas", Font.PLAIN, 13));
        replaceButton.setOpaque(true);
        replaceButton.setContentAreaFilled(true);

        replaceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                replaceButton.setBackground(new Color(230, 115, 0));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                replaceButton.setBackground(new Color(255, 128, 0));
            }
        });
        panel.add(replaceButton);

        return panel;
    }

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
        JPanel replacePanel = createReplacePanel();
        replacePanel.setVisible(false);

        JButton replaceValButton = new JButton("Replace Value");
        replaceValButton.setBounds(560, 9, 150, 42);
        replaceValButton.setBackground(new Color(255, 128, 0));
        replaceValButton.setForeground(Color.WHITE);
        replaceValButton.setFocusPainted(false);
        replaceValButton.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        replaceValButton.setFont(new Font("Consolas", Font.BOLD, 14));
        replaceValButton.setOpaque(true);
        replaceValButton.setContentAreaFilled(true);

        replaceValButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                replaceValButton.setBackground(new Color(230, 115, 0));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                replaceValButton.setBackground(new Color(255, 128, 0));
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
        replaceValButton.addActionListener(e -> {


            replacePanel.setVisible(!replacePanel.isVisible());


            window.repaint();
            window.revalidate();
        });

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(910, 10, 100, 40);
        saveButton.setBackground(new Color(0, 153, 76));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFocusPainted(false);
        saveButton.setFont(new Font("Consolas", Font.BOLD, 14));
        saveButton.setFocusPainted(false);
        saveButton.setBorderPainted(false);
        saveButton.setContentAreaFilled(false);
        saveButton.setOpaque(true);

        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButton.setBackground(new Color(0, 180, 90));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButton.setBackground(new Color(0, 153, 76));
            }
        });


        window.add(replacePanel);
        window.add(loadButton);
        window.add(dropNaButton);
        window.add(replaceValButton);
        window.add(saveButton);
        window.getContentPane().setBackground(new Color(30, 30, 30));
        window.setVisible(true);
    }
}
