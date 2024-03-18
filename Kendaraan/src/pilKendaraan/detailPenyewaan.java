package pilKendaraan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class detailPenyewaan extends JFrame{
    JPanel panel;
    JTextField nama, nomor, hari;
    ButtonGroup kendaraanGroup;
    JRadioButton[] kendaraanOptions;
    JLabel namaLabel, nomorLabel, kendaraanLabel, hariLabel, hasilLabel;
    
    public detailPenyewaan () {
        nama = new JTextField();
        nomor = new JTextField();
        hari = new JTextField();

        namaLabel = new JLabel("Nama:");
        nomorLabel = new JLabel("Nomor Telepon:");
        kendaraanLabel = new JLabel("Pilih Kendaraan:");
        hariLabel = new JLabel("Jumlah Hari:");
        hariLabel = new JLabel();
        
        panel.add(namaLabel);
        panel.add(nama);
        panel.add(nomorLabel);
        panel.add(nomor);
        panel.add(kendaraanLabel);
        panel.add(hariLabel);
        panel.add(hari);
    }
}
