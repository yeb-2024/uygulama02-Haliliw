package org.example.Ödevler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GirisSayfasi implements ActionListener {

    JFrame frame;
    JTextField kullaniciAdi;
    JTextField sifre;
    JButton button;

    public GirisSayfasi(){
        JPanel panelUst = new JPanel();
        JLabel labelUst = new JLabel();

        panelUst.setLayout(new FlowLayout());
        labelUst.setText("Kullanıcı Adı");
        labelUst.setFont(new Font(null,Font.PLAIN, 15));

        kullaniciAdi = new JTextField();
        kullaniciAdi.setPreferredSize(new Dimension(200,40));

        panelUst.add(labelUst);
        panelUst.add(kullaniciAdi);

        button = new JButton("Giriş Yap");
        button.setFont(new Font(null,Font.PLAIN,15));
        button.addActionListener(this);

        JPanel panelAlt = new JPanel();
        JLabel labelAlt = new JLabel();

        panelAlt.setLayout(new FlowLayout());
        labelAlt.setText("Şifre");
        labelAlt.setFont(new Font(null,Font.PLAIN, 15));

        sifre = new JTextField();
        sifre.setPreferredSize(new Dimension(200,40));

        panelAlt.add(labelAlt);
        panelAlt.add(sifre);

        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        frame.setSize(400,300);

        frame.add(panelUst);
        frame.add(panelAlt);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== button){
            String kullaniciAdi = this.kullaniciAdi.getText().trim();
            String sifre = this.sifre.getText().trim();

            if (kullaniciAdi.isEmpty() || sifre.isEmpty()){
                JOptionPane.showMessageDialog(
                        null,
                        "Lütfen Tüm Alanları Doldurunuz!",
                        "Hata",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
