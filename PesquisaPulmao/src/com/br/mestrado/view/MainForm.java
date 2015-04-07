package com.br.mestrado.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.br.mestrado.control.actions.ActionAbrirForm;
import com.br.mestrado.control.actions.ActionSair;
import com.br.mestrado.control.actions.ActionSobre;

public class MainForm extends JFrame{

	public MainForm() {
		this.setDefaults();
		this.addMenu();
		this.setVisible(true);
	}
	
	private void setDefaults()
	{
		this.setMinimumSize(new Dimension(700,500));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Point middle = new Point(screenSize.width / 2, screenSize.height / 2);
		Point newLocation = new Point(middle.x - (this.getWidth() / 2), 
		                              middle.y - (this.getHeight() / 2));

		this.setLocation(newLocation);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.invalidate();
		this.validate();
		this.repaint();
		
	}
	
	private void addMenu()
	{
		JMenuBar barraDeMenu = new JMenuBar();
		
		
		JMenu menuCadastro = new JMenu("Cadastros");
		JMenuItem cadastroPaciente = new JMenuItem("Cadatro de Pacientes");
		cadastroPaciente.addActionListener(new ActionAbrirForm(this, new FrmCadastroPaciente(),Color.BLUE));
		
		JMenuItem cadastroExames = new JMenuItem("Cadatro de Exames");
		cadastroExames.addActionListener(new ActionAbrirForm(this, new FrmCadastroExame(),Color.RED));
		menuCadastro.add(cadastroExames);
		menuCadastro.add(cadastroPaciente);
		
		
		JMenu menuPesquisa = new JMenu("Pesquisas");
		JMenuItem pesquisaPacientes = new JMenuItem("Pesquisa de Pacientes");
		JMenuItem pesquisaExames = new JMenuItem("Pesquisa de Exames");
		menuPesquisa.add(pesquisaPacientes);
		menuPesquisa.add(pesquisaExames);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		JMenuItem menuSobre = new JMenuItem("Sobre");
		//menuSobre.addActionListener(new ActionSobre(this));
		menuAjuda.add(menuSobre);
		
		JMenuItem menuSair = new JMenuItem("Sair");
		menuSair.addActionListener(new ActionSair());
		
		
		barraDeMenu.add(menuCadastro);
		barraDeMenu.add(menuPesquisa);
		barraDeMenu.add(menuAjuda);
		barraDeMenu.add(menuSair);
		
		this.setJMenuBar(barraDeMenu);
	}
}
