package Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class calcular extends JFrame {
private JPanel contentPane;
private JTextField tf_visor;
public calculadora ct = new calculadora();

public static void main(String[] args) {EventQueue.invokeLater(new Runnable() {
	public void run() {
		try {
		calcular frame = new calcular();
		frame.setVisible(true);
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		});
		}
	
		public calcular() {
		setTitle("Calc-T2112");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 245, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tf_visor = new JTextField();
		tf_visor.setBackground(Color.LIGHT_GRAY);
		tf_visor.setForeground(Color.BLACK);
		tf_visor.setEditable(false);
		tf_visor.setFont(new Font("Arial Black", Font.BOLD, 14));
		tf_visor.setBounds(10, 0, 218, 27);
		contentPane.add(tf_visor);
		tf_visor.setColumns(10);
		JButton bt_7 = new JButton("7");
		bt_7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

		tf_visor.setText(
		 tf_visor.getText()+"7");
		}
		});
		bt_7.setFont(new Font("Arial Black", Font.BOLD, 12));
		bt_7.setBounds(10, 31, 52, 38);
		contentPane.add(bt_7);
		JButton bt_8 = new JButton("8");
		bt_8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		tf_visor.setText(
		 tf_visor.getText()+"8");
		}
		});
		bt_8.setFont(new Font("Arial Black", Font.BOLD, 12));
		bt_8.setBounds(66, 31, 52, 38);
		contentPane.add(bt_8);JButton bt_9 = new JButton("9");
		bt_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf_visor.setText(
			 tf_visor.getText()+"9");
			}
			});
			bt_9.setFont(new Font("Arial Black", Font.BOLD, 12));
			bt_9.setBounds(121, 31, 52, 38);
			contentPane.add(bt_9);
			JButton bt_divi = new JButton("/");
			bt_divi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			ct.Leitura(Float.parseFloat(tf_visor.getText()));
			ct.setOperador("/");
			tf_visor.setText("");
			}
			});
			bt_divi.setFont(new Font("Arial Black", Font.BOLD, 12));
			bt_divi.setBounds(176, 31, 52, 38);
			contentPane.add(bt_divi);
			JButton bt_multi = new JButton("*");
			bt_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ct.Leitura(Float.parseFloat(tf_visor.getText()));
			ct.setOperador("*");
			tf_visor.setText("");
			}
			});
			bt_multi.setFont(new Font("Arial Black", Font.BOLD, 12));
			bt_multi.setBounds(176, 80, 52, 38);
			contentPane.add(bt_multi);
			JButton bt_4 = new JButton("4");
			bt_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf_visor.setText(
			 tf_visor.getText()+"4");
			}
			});
			bt_4.setFont(new Font("Arial Black", Font.BOLD, 12));
			bt_4.setBounds(10, 80, 52, 38);
			contentPane.add(bt_4);
			JButton bt_5 = new JButton("5");
			bt_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf_visor.setText(
			 tf_visor.getText()+"5");
			}
			});
			bt_5.setFont(new Font("Arial Black", Font.BOLD, 12));bt_5.setBounds(66, 80, 52, 38);
			contentPane.add(bt_5);
			JButton bt_6 = new JButton("6");
			bt_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf_visor.setText(
			 tf_visor.getText()+"6");
			}
			});
			bt_6.setFont(new Font("Arial Black", Font.BOLD, 12));
			bt_6.setBounds(121, 80, 52, 38);
			contentPane.add(bt_6);
			JButton bt_subt = new JButton("-");
			bt_subt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ct.Leitura(Float.parseFloat(tf_visor.getText()));
			ct.setOperador("-");
			tf_visor.setText("");
			}
			});
			bt_subt.setFont(new Font("Arial Black", Font.BOLD, 12));
			bt_subt.setBounds(176, 129, 52, 38);
			contentPane.add(bt_subt);
			JButton bt_1 = new JButton("1");
			bt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf_visor.setText(
			 tf_visor.getText()+"1");
			}
			});
			bt_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			bt_1.setBounds(10, 129, 52, 38);
			contentPane.add(bt_1);
			JButton bt_2 = new JButton("2");
			bt_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf_visor.setText(
			 tf_visor.getText()+"2");
			}
			});
			bt_2.setFont(new Font("Arial Black", Font.BOLD, 12));
			bt_2.setBounds(66, 129, 52, 38);
			contentPane.add(bt_2);
			JButton bt_3 = new JButton("3");
			bt_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf_visor.setText(
			 tf_visor.getText()+"3");
			}
			});
			bt_3.setFont(new Font("Arial Black", Font.BOLD, 12));
			bt_3.setBounds(121, 129, 52, 38);
			contentPane.add(bt_3);JButton bt_soma = new JButton("+");
			bt_soma.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				ct.Leitura(Float.parseFloat(tf_visor.getText()));
				ct.setOperador("+");
				tf_visor.setText("");
				}
				});
				bt_soma.setFont(new Font("Arial Black", Font.BOLD, 12));
				bt_soma.setBounds(176, 178, 52, 38);
				contentPane.add(bt_soma);
				JButton bt_limpa = new JButton("C");
				bt_limpa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				ct.setParc1(0);
				ct.setParc2(0);
				ct.setResultado(0);
				ct.setOperador("");
				tf_visor.setText("");
				}
				});
				bt_limpa.setFont(new Font("Arial Black", Font.BOLD, 12));
				bt_limpa.setBounds(10, 218, 218, 38);
				contentPane.add(bt_limpa);
				JButton bt_0 = new JButton("0");
				bt_0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				tf_visor.setText(
				 tf_visor.getText()+"0");
				}
				});
				bt_0.setFont(new Font("Arial Black", Font.BOLD, 12));
				bt_0.setBounds(66, 178, 52, 38);
				contentPane.add(bt_0);
				JButton bt_igual = new JButton("=");
				bt_igual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				ct.Leitura(Float.parseFloat(tf_visor.getText()));
				ct.Igualar();
				tf_visor.setText(String.valueOf(ct.getResultado()
				));
				}
				});
				bt_igual.setFont(new Font("Arial Black", Font.BOLD, 12));
				bt_igual.setBounds(121, 178, 52, 38);
				contentPane.add(bt_igual);
				JButton bt_ponto = new JButton(".");
				bt_ponto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				tf_visor.setText(
				 tf_visor.getText()+".");
				}
				});
				bt_ponto.setFont(new Font("Arial Black", Font.BOLD, 12));
				bt_ponto.setBounds(10, 178, 52, 38);
				contentPane.add(bt_ponto);
				}
				}