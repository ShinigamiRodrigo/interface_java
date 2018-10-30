package interface_java;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame{
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	
	JLabel lblEnd = new JLabel("Endereço: ");
	JTextField txtEnd = new JTextField();
	
	JLabel lblCid = new JLabel("Cidade: ");
	JTextField txtCid = new JTextField();
	
	JLabel lblCep = new JLabel("CEP: ");
	JTextField txtCep = new JTextField();

	JLabel lblRG = new JLabel("RG: ");
	JTextField txtRG = new JTextField();
	
	JLabel lblCPF = new JLabel("CPF: ");
	JTextField txtCPF = new JTextField();
	
	public Interface() {
		super("Titulo da Minha Janela");
		
		Container paine = this.getContentPane();
		
		paine.add(lblNome);
		lblNome.setBounds(20,20,100,20);
		paine.add(txtNome);
		txtNome.setBounds(130,20,200,20);
	
		
		paine.add(lblEnd);
		lblEnd.setBounds(20,40,100,20);
		paine.add(txtEnd);
		txtEnd.setBounds(130,40,200,20);
		
		paine.add(lblCid);
		lblCid.setBounds(20,60,100,20);
		paine.add(txtCid);
		txtCid.setBounds(130,60,200,20);
		
		paine.add(lblCep);
		lblCep.setBounds(20,80,100,20);
		paine.add(txtCep);
		txtCep.setBounds(130,80,200,20);
		
		paine.add(lblRG);
		lblRG.setBounds(20,100,100,20);
		paine.add(txtRG);
		txtRG.setBounds(130,100,200,20);
		
		paine.add(lblCPF);
		lblCPF.setBounds(20,120,100,20);
		paine.add(txtCPF);
		txtCPF.setBounds(130,120,200,20);
		
		this.setLayout(null);
		this.setSize(400, 400);
		//this.setResizable(0);
		this.setVisible(true);
	}
	public static void main(String args[]) {
		Interface tela = new Interface();
	}
}
