package GUI;

import util.Bibliothek;
import util.Medium;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiStartBibliohek extends JFrame implements ActionListener, ListSelectionListener {

    public JPanel over;
    public JPanel pannelMenu;
    public JPanel edit;
    public JPanel buttons;
    public JPanel listPannel;

    public JList list;

    public JMenuBar menu;

    public JMenuItem datei;
    public JMenuItem laden;
    public JMenuItem save;
    public JMenuItem saveu;
    public JMenuItem exit;

    public JButton neu;
    public JButton loschen;
    public JButton andern ;

    public TextField title;
    public TextField ISBN;
    public TextField Verlag;
    public TextField Autor;

    public int Mednum = 0;

    DefaultListModel model;
    public GuiStartBibliohek(){
        super("Bibliohk");
        setDefaultCloseOperation(3);
        setSize(1600,800);
        over = new JPanel();
        over.setLayout(new GridLayout(4, 1));

        pannelMenu = new JPanel();

        pannelMenu.setLayout(new BorderLayout());
        menu = new JMenuBar();

        datei = new JMenu("Datei");

        laden = new JMenuItem("Laden");
        laden.addActionListener(this);

        save = new JMenuItem("Speichern");
        save.addActionListener(this);

        saveu = new JMenuItem("Speichern Unter");
        saveu.addActionListener(this);

        exit = new JMenuItem("Beenden");
        exit.addActionListener(this);

        datei.add(datei);
        datei.add(laden);
        datei.add(save);
        datei.add(saveu);
        datei.add(exit);

        menu.add(datei);
        pannelMenu.add(menu, BorderLayout.NORTH);

        edit = new JPanel();
        edit.setLayout(new GridLayout(2,5));

        edit.add(new JLabel("Title"));
        edit.add(new JLabel("ISBN"));
        edit.add(new JLabel("Verlag"));
        edit.add(new JLabel("Seiten"));
        edit.add(new JLabel("Laufzeit"));

        title = new TextField("");
        edit.add(title);

        ISBN = new TextField("");
        edit.add(ISBN);

        Verlag = new TextField("");
        edit.add(Verlag);


        edit.add(new TextField("-"));
        edit.add(new TextField("-"));

        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1, 7));

        neu = new JButton("Neu");
        neu.addActionListener(this);

        andern = new JButton("Ändern");
        andern.addActionListener(this);

        loschen = new JButton("Löschen");
        loschen.addActionListener(this);

        buttons.add(new JLabel(""));
        buttons.add(neu);
        buttons.add(new JLabel(""));
        buttons.add(andern);
        buttons.add(new JLabel(""));
        buttons.add(loschen);
        buttons.add(new JLabel(""));


        model =  new DefaultListModel();
        model.addElement("Noch Kein Element geladen!");

        list = new JList(model);

        list.setSelectedIndex(0);
        list.addListSelectionListener(this);

        listPannel = new JPanel();
        listPannel.add(list);

        over.add(pannelMenu);
        over.add(list);
        over.add(edit);
        over.add(buttons);

        setContentPane(over);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent object) {
        if (object.getSource() == exit){
            System.exit(0);
        }
        if (object.getSource() == neu){
            NewWindow nw = new NewWindow(this);
        }
        if (object.getSource() == loschen){
            int in = list.getSelectedIndex();
            if(Bibliothek.getIni().vc.size() >= in && in >= 0){
                model.remove(in);
                Bibliothek.getIni().vc.remove(in);
                repaintList();
            }
        }
        if (object.getSource() == save){
            Bibliothek bk = Bibliothek.getIni();
            bk.SpeicherAlleMedien();

        }
        if (object.getSource() == laden){
            Bibliothek bk = Bibliothek.getIni();
            bk.LadeAlleMedeien();

            for(Medium m : bk.vc){
                addList(m);
            }

        }
        if (object.getSource() == andern){
            int in = list.getSelectedIndex();

            if(Bibliothek.getIni().vc.size() >= in && in >= 0){
                Bibliothek.getIni().vc.get(in).setTitle(title.getText());
                Bibliothek.getIni().vc.get(in).setIsbn(ISBN.getText());
                Bibliothek.getIni().vc.get(in).setVerlag(Verlag.getText());

                repaintList();
            }
        }

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int in = list.getSelectedIndex();


        if(Bibliothek.getIni().vc.size() >= in && in >= 0){

            title.setText(Bibliothek.getIni().vc.get(in).getTitle());
            ISBN.setText(Bibliothek.getIni().vc.get(in).getIsbn());
            Verlag.setText(Bibliothek.getIni().vc.get(in).getVerlag());

            repaint();
        }

    }

    public void repaintList(){
        model.removeAllElements();

        Mednum = 0;
        for(Medium m : Bibliothek.getIni().vc) {
            String aus;
            if (m.isAusgeliehn()) {
                aus = "Der title ist ausgeliehen";
            } else aus = "Der title ist nicht ausgeliehen";

            String data = "Mediennr: " + Mednum + " " + m.getTitle() + ", " + m.getIsbn() + ", Verlag: " + m.getVerlag() + ". " + aus;
            model.addElement(data);
            Mednum++;
        }

        repaint();
    }
    public void addList(Medium m){
        if(model.get(0).equals("Noch Kein Element geladen!")){
            model.remove(0);
        }

        repaintList();
    }


}
