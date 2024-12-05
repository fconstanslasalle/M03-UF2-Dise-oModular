package practica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {
    //Variables Start
    private JLabel title;
    private JButton Option1, Option2, Option3, Option4, Option5;
    //Variables END

    public Formulario(){
        //Title Start
        setLayout(null);
        title = new JLabel("Dora la CalculaDora");
        title.setFont(new Font("Tahoma", Font.BOLD, 25));
        title.setBounds(180,5,250,75);
        add(title);
        //Title END
        //Options Start
            //O1
        Option1 = new JButton("Calcular un numero binari (Num --> Bin)");
        Option1.setBounds(180, 75, 340, 25);
        add(Option1);
        Option1.addActionListener(this);
            //O1 END
            //O2
        Option2 = new JButton("Calcular un numero Hexadecimal (Num --> Hex)");
        Option2.setBounds(180, 115, 340, 25);
        add(Option2);
        Option2.addActionListener(this);
            //O2 END
            //O3
        Option3 = new JButton("Calcular una IP");
        Option3.setBounds(180, 155, 340, 25);
        add(Option3);
        Option3.addActionListener(this);
            //O3 END
            //O4
        Option4 = new JButton("Mostar taula de màscares");
        Option4.setBounds(180, 195, 340, 25);
        add(Option4);
        Option4.addActionListener(this);
            //O4 END
            //O5
        Option5 = new JButton("Sortir del programa");
        Option5.setBounds(180, 235, 340, 25);
        add(Option5);
        Option5.addActionListener(this);
            //O5 END
            //Logo Homepage
        JLabel logo = new JLabel(new ImageIcon("./img/logoHome150.png"));
        logo.setBounds(20, 25, 150, 150);
        add(logo);

            //Logo Homepage END
        //Options END

    }

    public static void main(String args[]){
        //Homepage
        Formulario Homepage = new Formulario();
        Homepage.setBounds(0,0,560,350);
        Homepage.setResizable(false);
        Homepage.setTitle("Dora la CalculaDora");
        Homepage.setVisible(true);
        Homepage.setLocationRelativeTo(null);
        Homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Homepage

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == Option1){
            //Obrir Finestra amb Opcio1 Start
            Option1 dec = new Option1();
            dec.setVisible(true);
            dec.setBounds(500,250,560,350);
            this.dispose();
            //Obrir Finestra amb Opcio1 Start
            
        } else if (e.getSource() == Option2) {
            //Obrir Finestra amb Opcio2 Start
            Option2 hex = new Option2();
            hex.setVisible(true);
            hex.setBounds(500,250,560,350);
            this.dispose();
            //Obrir Finestra amb Opcio2 Start
            
        } else if (e.getSource() == Option3) {
            //Obrir Finestra amb Opcio3 Start
            Option3 IP = new Option3();
            IP.setVisible(true);
            IP.setBounds(500,250,560,350);
            this.dispose();
            //Obrir Finestra amb Opcio3 END
        } else if (e.getSource() == Option4) {
            //Obrir Finestra amb Opcio4 Start
            Option4 masks = new Option4();
            masks.setVisible(true);
            masks.setBounds(500,250,560,350);
            //Obrir Finestra amb Opcio4 END
        } else if (e.getSource() == Option5) {
            //sortir del programa
            System.exit(0);
            //Sortir del programa END
            
        }

    }
}