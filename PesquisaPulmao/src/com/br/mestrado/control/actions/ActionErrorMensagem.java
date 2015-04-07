package com.br.mestrado.control.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class ActionErrorMensagem implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "ERROR!","Error", JOptionPane.ERROR_MESSAGE);
	}

}
