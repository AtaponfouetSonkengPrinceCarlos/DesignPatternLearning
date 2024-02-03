package com.prince.vue;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.prince.observer.Observer;

public class Ecran extends JFrame implements Observer {
	private JLabel ecran = new JLabel();

	public Ecran(Component c) {
		this.setSize(300, 100);
		this.setLocationRelativeTo(c);
		this.setResizable(false);
		Font police = new Font("DS-digital", Font.BOLD, 50);
		this.ecran.setFont(police);
		this.ecran.setHorizontalAlignment(JLabel.RIGHT);
		this.getContentPane().add(this.ecran, BorderLayout.CENTER);
		this.setVisible(true);
	}

	@Override
	public void update(String str) {
		// TODO Auto-generated method stub
		ecran.setText(str);
	}

}
