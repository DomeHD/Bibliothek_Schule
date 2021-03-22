package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiStartBibliohek extends JFrame implements ActionListener {

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

    public GuiStartBibliohek(){
        super("Bibliohk");
        setDefaultCloseOperation(3);
        setSize(600,400);
        over = new JPanel();
        over.setLayout(new GridLayout(5, 1));

        pannelMenu = new JPanel();

        pannelMenu.setLayout(new BorderLayout());
        menu = new JMenuBar();

        datei = new JMenu("Datei");

        laden = new JMenuItem("Laden");
        save = new JMenuItem("Speichern");
        saveu = new JMenuItem("Speichern Unter");
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
        edit.setLayout(new GridLayout(2,6));

        edit.add(new JLabel("Title"));
        edit.add(new JLabel("ISBN"));
        edit.add(new JLabel("Verlag"));
        edit.add(new JLabel("Autor"));
        edit.add(new JLabel("Seiten"));
        edit.add(new JLabel("Laufzeit"));

        for(int i = 0; i <= 5; i++){
            edit.add(new TextField());
        }

        buttons = new JPanel();
        buttons.setLayout(new GridLayout(1, 7));

        buttons.add(new JLabel(""));
        buttons.add(new JButton("Neu"));
        buttons.add(new JLabel(""));
        buttons.add(new JButton("Ändern"));
        buttons.add(new JLabel(""));
        buttons.add(new JButton("Löschen"));
        buttons.add(new JLabel(""));



        String listout[]= { "Test 1","Test 2","Test 3","Test 4","Test 5","Test 6","Test 7"};

        list = new JList(listout);

        list.setSelectedIndex(0);

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

    }
}
