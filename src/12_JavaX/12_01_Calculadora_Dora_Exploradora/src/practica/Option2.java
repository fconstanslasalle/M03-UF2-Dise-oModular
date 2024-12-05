package practica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Option2 extends JFrame implements ActionListener {
    //Buttons STart
    private JButton home, submit, exit;
    //Buttons END

    //LAbels
    private JLabel title, explicacio;
    String dataresult = "";
    //Labels

    //Textarea
    private JTextField data;
    //textarea END

    public Option2(){
        //Title Start
        setLayout(null);
        title = new JLabel("Dora la CalculaDora");
        title.setFont(new Font("Tahoma", Font.BOLD, 25));
        title.setBounds(180,5,250,75);
        add(title);
        //Title END
        home = new JButton("Menú Principal");
        home.setBounds(10, 275, 150, 25);
        add(home);
        home.addActionListener(this);

        //Logo
        JLabel logo = new JLabel(new ImageIcon("img/logoHex150.png"));
        logo.setBounds(20, 25, 150, 150);
        add(logo);
        //Logo END

        //Explicació
        explicacio = new JLabel("Num --> Hexadecimal");
        explicacio.setBounds(180, 60, 175, 20);
        explicacio.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(explicacio);
        //Explicació END

        //Entradata
        data = new JTextField("123");
        data.setBounds(180, 90, 200, 25);
        add(data);
        //Entradata END

        //Submit data
        submit = new JButton("Submit");
        submit.setBounds(385, 90, 80, 25);
        add(submit);
        submit.addActionListener(this);
        //Submit data END

        //Sortir del programa
        exit = new JButton("Sortir");
        exit.setBounds(386, 275, 150, 25);
        add(exit);
        exit.addActionListener(this);
        //Sortir del programa



    }

    public static void main (String[]args){
        //pagina Start
        Option2 page = new Option2();
        page.setBounds(500,250,560,350);
        page.setResizable(false);
        page.setVisible(true);
        page.setLocationRelativeTo(null);
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Pagina END
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == home){
            //Retorna a pagina d'inici START
            Formulario homepage = new Formulario();
            homepage.setVisible(true);
            homepage.setBounds(500,250,560,350);
            this.dispose();
            //Retorna a pagina d'inici END
        } else if (e.getSource() == submit) {
            boolean isNumber = true;
            String auxdata = data.getText();
            int auxfinal = 0;
            //Determinar si el text entrat conté lletres
            //Depenent del text s'executará un codi o un altre especificat mes endavant
            for (int i = 0; i < auxdata.length(); i++) {
                if (!Character.isDigit(auxdata.charAt(i))) {
                    isNumber = false;
                    break;
                }
            }
            if (isNumber){
                auxfinal = Integer.parseInt(auxdata);
                JOptionPane.showMessageDialog(null, "Numero: " + data.getText() + "\n" +
                        "Equivalent Hexadecimal: 0x" + String.format("%8s", Integer.toHexString(auxfinal)).replace(' ', '0'));
                /*
                 * String.format("%16s", Integer.toBinaryString(auxfinal)).replace(' ', '0')
                 *
                 * String.format("%16s", Integer.toBinaryString(auxfinal))
                 * --> Determina la longitud del Output ("%16s")
                 * --> passa el número donat(auxfinal) i el passa al seu equivalent en Hexadecimal en format String (Integer.toHexString(auxfinal))
                 * --> De normal String Format omple el que falta de l'String amb espais, ".replace()" per una altra banda sustitueix el primer valor donat pel segon (' ', '0')
                 * */
            } else if (!isNumber) {
                //Control d'errors
                JOptionPane.showMessageDialog(null, "Error en les dades");
            }
        } else if (e.getSource() == exit) {
            //Surt del programa
            System.exit(0);
        }

    }
}
