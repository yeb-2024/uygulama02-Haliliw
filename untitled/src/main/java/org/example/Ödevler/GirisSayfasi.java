package org.example.Ödevler;

import javax.swing.*;
import java.awt.*;

public class GirisSayfasi {

    JFrame frame;
    JTextField kullaniciAdi;
    JTextField Sifre;

    public GirisSayfasi(){
        JPanel panelUst = new JPanel();
        JLabel labelUst = new JLabel();

        panelUst.setLayout(new FlowLayout());
        labelUst.setText("Kullanıcı Adı");
        labelUst.setFont(new Font("Arial",Font.PLAIN, 20));

        kullaniciAdi = new JTextField();
        kullaniciAdi.setPreferredSize(new Dimension(200,40));

        panelUst.add(labelUst);
        panelUst.add(kullaniciAdi);

        JPanel panelAlt = new JPanel();
        JLabel labelAlt = new JLabel();

        panelAlt.setLayout(new FlowLayout());
        labelAlt.setText("Şifre");
        labelAlt.setFont(new Font("Arial",Font.PLAIN, 20));

        Sifre = new JTextField();
        Sifre.setPreferredSize(new Dimension(200,40));

        panelAlt.add(labelAlt);
        panelAlt.add(Sifre);

        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        frame.setSize(400,300);

        frame.add(panelUst);
        frame.add(panelAlt);
        frame.setVisible(true);
    }
}
