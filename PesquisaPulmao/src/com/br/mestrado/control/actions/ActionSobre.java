package com.br.mestrado.control.actions;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPopupMenu;

public class ActionSobre implements ActionListener{
	
	private Component invocador;
	
	public ActionSobre(Component invocador) {
		this.invocador = invocador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JPopupMenu menu = new JPopupMenu();
		menu.setSize(new Dimension(300, 300));
		menu.setVisible(true);
		menu.show(null, 200, 200);
		System.out.println("Acionando o menu sobre");
	}
}
