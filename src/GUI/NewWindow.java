package GUI;

import util.Bibliothek;
import util.Medium;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

public class NewWindow extends JDialog implements ActionListener {

    public TextField title;
    public TextField ISBN;
    public TextField Verlag;
    public TextField Autor;
    public TextField Seiten;

    public JButton ok;
    public JButton abrechen;

    public JLabel err;

    private GuiStartBibliohek call;
    public NewWindow(GuiStartBibliohek call){
        super((JFrame)null, "Neues Medium", true);
        setBounds(10, 10, 800, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.call = call;

        JPanel main = new JPanel();
        main.setLayout(new GridLayout(7, 2));

        title = new TextField();
        main.add(new JLabel("Title"));
        main.add(title);

        ISBN = new TextField();
        main.add(new JLabel("ISBN"));
        main.add(ISBN);

        Verlag = new TextField();
        main.add(new JLabel("Verlag"));
        main.add(Verlag);

        Autor = new TextField();
        main.add(new JLabel("Autor"));
        main.add(Autor);

        Seiten = new TextField();
        main.add(new JLabel("Seiten"));
        main.add(Seiten);

        err = new JLabel("");
        main.add(err);
        main.add(new JLabel(""));

        ok = new JButton("Ok");
        ok.addActionListener(this);
        main.add(ok);

        abrechen = new JButton("abrechen");
        abrechen.addActionListener(this);
        main.add(abrechen);


        setContentPane(main);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent object) {
        if (object.getSource() == abrechen){
            dispose();
        }

        if (object.getSource() == ok){
            if(!title.getText().equals("") && !ISBN.getText().equals("") && !Verlag.getText().equals("") && !Autor.getText().equals("") && !Seiten.getText().equals("")){
                Medium m = new Medium(title.getText(), Verlag.getText(), ISBN.getText(), false, new GregorianCalendar());

                Bibliothek.getIni().vc.add(m);
                call.addList(m);
                dispose();
            }else {
                err.setText("Bitte Fülle alle Felder aus!");
                repaint();
            }

        }
    }
}
