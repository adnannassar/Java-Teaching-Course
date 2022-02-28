package AdvancedKurs.PK_Klausuren.Klausur_31_08_2012;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

 public class Gui extends JFrame implements ActionListener {
     public static void main(String[] args) {
        Gui g = new Gui();
        g.setVisible(true);
    
     }
    private JButton[] buttons;
    private JPanel[] panels = new JPanel[3];
    private JLabel[] labels = {new JLabel("Artikel"), new JLabel("Anzahl"), new JLabel("Stückpreis")};
    private JLabel eStatus = new JLabel("");
    private JComboBox eArtikel;
    private JTextField eAnzahl = new JTextField("2");
    private JLabel ePreis = new JLabel("0");
    public static final String[] BLABELS = {"Berechnen", "Beenden"};
    public static final Artikel[] ARTIKEL = {new Artikel("Stift", 3), new Artikel("Papier", 5)};
 
    public Gui() {
        setTitle("Lagerverwaltung");
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        GridLayout g = new GridLayout(4, 1);
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(g);
        }
        buttons = new JButton[BLABELS.length];
        for (int i = 0; i < BLABELS.length; i++) {
            buttons[i] = new JButton(BLABELS[i]);
        //    buttons[i].setPreferredSize(new Dimension(100, 50));
            panels[0].add(buttons[i]);
            buttons[i].setEnabled(true);
        }
        for (JLabel js : labels) {
            panels[1].add(js);
        }
        eArtikel = new JComboBox();
        for (Artikel s : ARTIKEL) {
            eArtikel.addItem(s.bezeichnung);
        }
        panels[2].setLayout(g);
        panels[2].add(eArtikel);
        panels[2].add(eAnzahl);
        panels[2].add(ePreis);
        panels[2].add(eStatus);
        add(panels[0], BorderLayout.EAST);
        add(panels[1], BorderLayout.WEST);
        add(panels[2], BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class Artikel {

        int preis;
        String bezeichnung;

        public Artikel(String bezeichnung, int preis) {
            this.preis = preis;
            this.bezeichnung = bezeichnung;
        }
    }
}
