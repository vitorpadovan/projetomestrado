package com.br.mestrado.control.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionSair implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Saindo");
		System.exit(0);
	}

}
