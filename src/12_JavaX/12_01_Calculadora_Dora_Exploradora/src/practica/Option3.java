package practica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Option3 extends JFrame implements ActionListener {
    //Buttons STart
    private JButton home, submit, exit;
    //Buttons END

    //LAbels
    private JLabel title, explicacio;
    String dataresult = "";
    //Labels

    //Textarea
    private JTextField data, mask;
    //textarea END

    // mask Values
    private String[][] database = {{"11111111.11111111.11111111.11111111", "255.255.255.255", "/32", "", ""},
                {"11111111.11111111.11111111.11111110",	"255.255.255.254", "/31", "", "" },
                {"11111111.11111111.11111111.11111100", "255.255.255.252", "/30", "2", "" },
                {"11111111.11111111.11111111.11111000",	"255.255.255.248", "/29", "6", "" },
                {"11111111.11111111.11111111.11110000",	"255.255.255.240", "/28", "14", "" },
                {"11111111.11111111.11111111.11100000",	"255.255.255.224", "/27", "30", "" },
                {"11111111.11111111.11111111.11000000",	"255.255.255.192", "/26", "62", "" },
                {"11111111.11111111.11111111.10000000",	"255.255.255.128", "/25", "126", "" },
                {"11111111.11111111.11111111.00000000",	"255.255.255.0", "/24", "254", "C" },
                {"11111111.11111111.11111110.00000000",	"255.255.254.0", "/23", "510", "" },
                {"11111111.11111111.11111100.00000000",	"255.255.252.0", "/22", "1022", "" },
                {"11111111.11111111.11111000.00000000",	"255.255.248.0", "/21", "2046", "" },
                {"11111111.11111111.11110000.00000000",	"255.255.240.0", "/20", "4094", "" },
                {"11111111.11111111.11100000.00000000",	"255.255.224.0", "/19", "8190", "" },
                {"11111111.11111111.11000000.00000000",	"255.255.192.0", "/18", "16382", "" },
                {"11111111.11111111.10000000.00000000",	"255.255.128.0", "/17", "32766", "" },
                {"11111111.11111111.00000000.00000000",	"255.255.0.0", "/16", "65534", "B" },
                {"11111111.11111110.00000000.00000000",	"255.254.0.0", "/15", "131070", "" },
                {"11111111.11111100.00000000.00000000",	"255.252.0.0", "/14", "262142", "" },
                {"11111111.11111000.00000000.00000000",	"255.248.0.0", "/13", "524286", "" },
                {"11111111.11110000.00000000.00000000",	"255.240.0.0", "/12", "1048574", "" },
                {"11111111.11100000.00000000.00000000",	"255.224.0.0", "/11", "2097150 ", "" },
                {"11111111.11000000.00000000.00000000",	"255.192.0.0", "/10", "4194302 ", "" },
                {"11111111.10000000.00000000.00000000",	"255.128.0.0", "/9", " 8388606", "" },
                {"11111111.00000000.00000000.00000000",	"255.0.0.0", "/8", "16777214", "A" },
                {"11111110.00000000.00000000.00000000",	"254.0.0.0", "/7", "33554430", "" },
                {"11111100.00000000.00000000.00000000",	"252.0.0.0", "/6", "67108862 ", "" },
                {"11111000.00000000.00000000.00000000",	"248.0.0.0", "/5", "134217726", "" },
                {"11110000.00000000.00000000.00000000",	"240.0.0.0", "/4", "268435454", "" },
                {"11100000.00000000.00000000.00000000",	"224.0.0.0", "/3", "536870910 ", "" },
                {"11000000.00000000.00000000.00000000",	"192.0.0.0", "/2", "1073741822", "" },
                {"10000000.00000000.00000000.00000000",	"128.0.0.0", "/1", "2147483646", "" },
                {"00000000.00000000.00000000.00000000",	"0.0.0.0", "/0", "4294967294", "" }};





    public Option3(){
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
        JLabel logo = new JLabel(new ImageIcon("img/logoIP150.png"));
        logo.setBounds(20, 25, 150, 150);
        add(logo);
        //Logo END

        //Explicació
        explicacio = new JLabel("Calcular IP");
        explicacio.setBounds(180, 60, 175, 20);
        explicacio.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(explicacio);
        //Explicació END

        //Entradata
        data = new JTextField("192.168.16.2");
        data.setBounds(180, 90, 200, 25);
        add(data);
        //Entradata END

        //Submit data
        submit = new JButton("Submit");
        submit.setBounds(425, 90, 80, 25);
        add(submit);
        submit.addActionListener(this);
        //Submit data END

        //mask
        mask = new JTextField("/30");
        mask.setBounds(385, 90, 35, 25);
        add(mask);
        //mask

        //Sortir del programa
        exit = new JButton("Sortir");
        exit.setBounds(386, 275, 150, 25);
        add(exit);
        exit.addActionListener(this);
        //Sortir del programa



    }


    public static void main (String[]args){
        //pagina Start
        Option3 page = new Option3();
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
            String auxdata = data.getText();
            String maskdata = mask.getText();
            //Determinar si el text entrat conté lletres

            Pattern letters = Pattern.compile("[a-zA-z]", Pattern.CASE_INSENSITIVE);
            Matcher lettermach = letters.matcher(auxdata);
            Matcher maskmacher = letters.matcher(maskdata);
            boolean isNumber = lettermach.find();
            boolean masknumber = maskmacher.find();

            if (isNumber == false && masknumber == false){

                String IPseparator = Pattern.quote(".");
                String maskseparator = Pattern.quote("/");
                //Separar IP
                String[] IPsplit = auxdata.split(IPseparator);
                List<String> IPsplited = new ArrayList<>(Arrays.asList(IPsplit));
                IPsplited.remove("");
                IPsplit = IPsplited.toArray(new String[0]);

                //Separar mascara
                String[] Masksplit = maskdata.split(maskseparator);
                List<String> Masksplited = new ArrayList<>(Arrays.asList(Masksplit));
                Masksplited.remove("");
                Masksplit = Masksplited.toArray(new String[0]);


                //TO int
                int octet1 = Integer.parseInt(IPsplit[0]);
                int octet2 = Integer.parseInt(IPsplit[1]);
                int octet3 = Integer.parseInt(IPsplit[2]);
                int octet4 = Integer.parseInt(IPsplit[3]);
                int maskvalue = Integer.parseInt(Masksplit[0]);


                if (octet1 >= 256 || octet2 >= 256 || octet3 >= 256 || octet4 >= 256 || maskvalue >=33){
                    JOptionPane.showMessageDialog(null, "Dora no puede calcular algun numero que has introducido \n" +
                          "por favor comprueba que el numero no sea mayor a 255 para que Dora pueda calcularlo");
                } else {
                    //Preparar IP Binaria
                    String BinariyIP = String.format("%8s", Integer.toBinaryString(octet1)).replace(' ', '0') + "." +
                            String.format("%8s", Integer.toBinaryString(octet2)).replace(' ', '0') + "." +
                            String.format("%8s", Integer.toBinaryString(octet3)).replace(' ', '0') + "." +
                            String.format("%8s", Integer.toBinaryString(octet4)).replace(' ', '0');


                    //Prreparar mascara
                    String BinaryMaskValue = "";
                    String DecimalMaskValue = "";
                    String HostMaskValue = "";

                    for (int i = 0; i < database.length; i++) {

                        for (int j = 0; j < database[i].length; j++) {

                            if (maskdata.equals(database[i][j])) {

                                BinaryMaskValue = database[i][0];
                                DecimalMaskValue = database[i][1];
                                HostMaskValue = database[i][3];


                            }
                        }
                    }


                    //Subxarxes

                    //per passar dades nescessaries en la llibreria
                    InetAddress ip = null, mascara = null;

                    try {
                        ip = InetAddress.getByName(auxdata);
                        mascara = InetAddress.getByName(DecimalMaskValue);
                    } catch (UnknownHostException ex) {
                        throw new RuntimeException(ex);
                    }


                    byte[] ipBytes = ip.getAddress();
                    byte[] maskBytes = mascara.getAddress();

                    byte[] network = new byte[4];
                    byte[] broadcast = new byte[4];

                    for (int i = 0; i < 4; i++) {
                        //per obtenir la IP de xarxa
                        network[i] = (byte) (ipBytes[i] & maskBytes[i]);

                        // "~" s'utilitza per a invertir bits dels numeros donats EX --> ~ori(00001111) --> final(11110000)
                        broadcast[i] = (byte) (ipBytes[i] | ~maskBytes[i]);
                    }

                    InetAddress networkAddress, broadcastAddress;

                    try {
                        networkAddress = InetAddress.getByAddress(network);
                        broadcastAddress = InetAddress.getByAddress(broadcast);
                    } catch (UnknownHostException ex) {
                        throw new RuntimeException(ex);
                    }



                    //Retorn de dades

                    JOptionPane.showMessageDialog(null, "          +----------------------------------------- REPORT -------------------------------------------+          \n" +
                                                                               "          |                                                                                                                            |          \n" +
                                                                               "          | IP Introduida: " + auxdata + "                                                                              |          \n" +
                                                                               "          | IP Xarxa: " + networkAddress + "                                                                                     |          \n" +
                                                                               "          | IP Broadcast: " + broadcastAddress + "                                                                             |          \n" +
                                                                               "          | -------------------------------------------------------------------------------------------------- |          \n" +
                                                                               "          |                                                Info. Mascara                                                    |          \n" +
                                                                               "          |                                                                                                                            |          \n" +
                                                                               "          | CIDR: " + maskdata + "                                                                                                          |          \n" +
                                                                               "          | Valor Decimal: " + DecimalMaskValue + "                                                                     |          \n" +
                                                                               "          | Valor Binari: " + BinaryMaskValue + "                                 |          \n" +
                                                                               "          | Hosts Possibles: " + HostMaskValue + "                                                                                       |          \n" +
                                                                               "          | IP Xarxa: " + networkAddress + "                                                                                    |          \n" +
                                                                               "          | -------------------------------------------------------------------------------------------------- |          \n" +
                                                                               "          |                                           Comparació Binaria                                              |          \n" +
                                                                               "          |                                                                                                                            |          \n" +
                                                                               "          | IP Binaria:            " + BinariyIP + "                          |          \n" +
                                                                               "          | Mascara Binaria: " + BinaryMaskValue + "                          |          \n" +
                                                                               "          |                                                                           @DoracalculaDoraCompany |          \n" +
                                                                               "          +--------------------------------------------------------------------------------------------------+          \n");
                }



            } else if (isNumber == true && masknumber == true) {
                //Control d'errors
                JOptionPane.showMessageDialog(null, "Error en les dades");
            }
        } else if (e.getSource() == exit) {
            //Surt del programa
            System.exit(0);
        }

    }

}