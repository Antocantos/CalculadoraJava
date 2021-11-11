

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame {
    JScrollPane scroll;
    JButton btn1, btn2, btnBorrar;
    JButton[] botones;
    JTextField txt, txt2;
    public Ventana (){
        setSize(1000, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        txt=new JTextField("", 40);
        add(txt);
        botones=new JButton[10];
        for(int n=0; n<10; n++){
            botones[n]=new JButton(String.valueOf(n));
            add(botones[n]);
            botones[n].addActionListener(new CallBackBtn());
        }
        btn1=new JButton("1");
        add(btn1);
        btn1.addActionListener(new CallBackBtn1());
        btnBorrar=new JButton("Borrar");
        add(btnBorrar);
        btnBorrar.addActionListener(new CallBackBtnBorrar());
    }
    private class CallBackBtn implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Botón pulsado");
            JButton aux=(JButton) e.getSource();
            String numero=aux.getText();
            txt.setText(txt.getText() + numero);
        }
    }
    private class CallBackBtn1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText() + "1");
        }
    }
    private class CallBackBtnBorrar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText().substring(0, txt.getText().length()-1));
        }
    }
}












/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Ventana extends JFrame {
    JScrollPane scroll;
    JButton btn, btn2;
    JTextField txt, txt2, txt3;
    JButton[] botones = new JButton[10];

    public Ventana (){

        setSize(1000, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        //getContentPane().setLayout(null);

        txt=new JTextField("", 40);
        add(txt);
        txt.setBounds(400, 30, 300, 60);
        txt.setFont(new Font("Aial", Font.BOLD, 40));

        for(int i = 0; i < 10 ; i++){

            botones[i] = new JButton(String.valueOf(i));
            add(botones[i]);
            botones[i].addActionListener(new CallBackBtn());


        }
/*
        btn=new JButton("1");
        add(btn);
        btn.setBounds (0,50,150,60);
        btn.addActionListener(new CallBackBtn());







    }



    private class CallBackBtn implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Boton pulsado");
            JButton aux=(JButton) e.getSource();
            String numero=aux.getText();
            txt.setText(txt.getText() + numero);


        }


    }


}
*/
