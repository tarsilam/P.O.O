package Lista01;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Random;
import javax.swing.JOptionPane;


public class AdvinhaB extends JFrame implements ActionListener {
       
    int numPremiado;
    int chute;
    
    JButton btnChutar = new JButton("Chutar");
    JButton btnReiniciar = new JButton("Reiniciar");
    
    JTextField t1 = new JTextField(6); 
        
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    
    JLabel l1 = new JLabel("Eu tenho um número entre 1 e 100, você pode adivinhá-lo? Entre com seu chute.");
    JLabel l2 = new JLabel("");

    public AdvinhaB() {
        
        Random geradorNum = new Random();
        numPremiado = geradorNum.nextInt(100) + 1;
        
        setLayout(new FlowLayout ());
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        
        p1.add(t1);
        p2.add(btnChutar);
        p3.add(l1);
        p4.add(l2);
        p5.add(btnReiniciar);
        
        btnChutar.addActionListener(this);
        btnReiniciar.addActionListener(this);
        
        p1.setBackground(Color.red);
        p1.setSize(300,150);
        
        setTitle("Adivinhe um Número");
        Container c = getContentPane();
        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
                
    } 
    
    public static void main(String[] args) {
        new AdvinhaB();
        
        }


    public void actionPerformed(ActionEvent e) {
         
        if (btnChutar == e.getSource()) {
            
            Double valor = Double.parseDouble(t1.getText());
                  
            if(valor < numPremiado) {
                l2.setText("Tente um número maior");
                this.getContentPane().setBackground(Color.BLUE);
                t1.setText("");
            }
            else {
                l2.setText("Tente um número menor");
                this.getContentPane().setBackground(Color.RED);
                t1.setText("");
            }
             
            if(valor == numPremiado) {
                l2.setText("Parabéns você acertou!");
                this.getContentPane().setBackground(Color.GREEN);
                t1.setEnabled(false);
                add(p5);
            }                      
                        
        }
        
        if(btnReiniciar == e.getSource()) {
            this.getContentPane().setBackground(null);
            t1.setEnabled(true);
            t1.setText("");
            l2.setText("");
            numPremiado = new Random().nextInt(100) + 1;
            btnReiniciar.setVisible(false);
        
      }
    
    }

}


