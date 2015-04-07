package com.br.mestrado.control.actions;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class ActionSobre implements ActionListener{
	
	private Component invocador;
	
	public ActionSobre(Component invocador) {
		this.invocador = invocador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this.invocador, "Mensagem", "Titulo", JOptionPane.INFORMATION_MESSAGE);
	}
}
