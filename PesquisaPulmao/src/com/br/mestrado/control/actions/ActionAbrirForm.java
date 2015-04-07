package com.br.mestrado.control.actions;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.br.mestrado.model.util.AbstractJPanel;

public class ActionAbrirForm implements ActionListener{

	private JFrame principal;
	private AbstractJPanel painel;
	private Color cor;
	public ActionAbrirForm(JFrame principal,AbstractJPanel painel) {
		this.principal = principal;
		this.painel = painel;
		this.cor = null;
	}

	public ActionAbrirForm(JFrame principal,AbstractJPanel painel,Color cor) {
		this.principal = principal;
		this.painel = painel;
		this.cor = cor;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this.principal, this.painel.getPanelName());
		this.painel.setSize(new Dimension(200, 300));
		if(this.cor != null)
		{
			this.painel.setBackground(this.cor);
		}
		GridBagLayout l = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.principal.add(this.painel);
	}

}
