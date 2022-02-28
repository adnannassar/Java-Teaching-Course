package AdvancedKurs.PK_Klausuren.Klausur_30_08_2013;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe_2 {

}

class Fenster extends Frame {
    public static void main(String[] args) {
        Fenster f = new Fenster();
        f.setVisible(true);
    }

    public Fenster() {
        super("Test");
        this.setSize(400, 200);
        //this.addWindowListener(new FensterExit());
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(2, 1));
        Button blau = new Button("Blau");
        blau.addActionListener(new MeinListener(this, Color.BLUE));
        panel.add(blau);
        Button rot = new Button("Rot");
        rot.addActionListener(new MeinListener(this, Color.RED));
        panel.add(rot);
        add(panel, BorderLayout.EAST);
        panel = new Panel();
        panel.add(new Label("Farbtest"));
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}
class MeinListener implements ActionListener {
      static Frame m ;
     static Color c ;

    public MeinListener(Frame m, Color c) {
        this.m = m;
        this.c = c;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         m.setBackground(c);
    }
    
}
class FensterExit {

}
