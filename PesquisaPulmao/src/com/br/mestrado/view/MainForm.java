package com.br.mestrado.view;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.br.mestrado.control.actions.ActionSair;
import com.br.mestrado.control.actions.ActionSobre;

public class MainForm extends JFrame{

	public MainForm() {
		this.setDefaults();
		this.addMenu();
	}
	
	private void setDefaults()
	{
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(700,500));
	}
	
	private void addMenu()
	{
		JMenuBar barraDeMenu = new JMenuBar();
		
		
		JMenu menuCadastro = new JMenu("Cadastros");
		JMenuItem cadastroPaciente = new JMenuItem("Cadatro de Pacientes");
		JMenuItem cadastroExames = new JMenuItem("Cadatro de Exames");
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
