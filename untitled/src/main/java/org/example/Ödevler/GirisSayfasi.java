package org.example.Ödevler;

import javax.swing.*;
import java.awt.*;

public class GirisSayfasi {

    JFrame frame;

    public GirisSayfasi(){
        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        frame.setSize(400,300);

        frame.setVisible(true);
    }
}
