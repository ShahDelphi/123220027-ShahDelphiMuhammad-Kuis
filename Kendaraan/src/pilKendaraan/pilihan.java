package pilKendaraan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pilihan extends JFrame {
    JPanel panel;
    JButton motorButton, mobilButton, saveButton;

    public pilihan() {
        setTitle("Aplikasi Penyewaan Kendaraan");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        motorButton = new JButton("Motor");
        mobilButton = new JButton("Mobil");

        motorButton.addActionListener(new ButtonListener());
        mobilButton.addActionListener(new ButtonListener());

        panel.add(new JLabel());
        panel.add(motorButton);
        panel.add(mobilButton);

        add(panel);

        setVisible(true);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == motorButton || event.getSource() == mobilButton) {
                String tipeKendaraan = event.getActionCommand();
                displayDetailsFrame(tipeKendaraan);
            }
        }
    }

    void displayDetailsFrame(String tipeKendaraan) {
        
    }

    // Main method
    public static void main(String[] args) {
        new pilihan();
    }
}

