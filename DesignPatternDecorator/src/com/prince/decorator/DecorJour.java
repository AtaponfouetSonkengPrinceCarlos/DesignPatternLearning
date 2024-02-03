package com.prince.decorator;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DecorJour extends Item {
	public DecorJour(JPanel pan) {
		super(pan);
		}
		public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//Ciel bleu
		g.setColor(Color.blue);
		g.fillRect(0, 0, this.parent.getWidth(), this.parent.getHeight()
		- this.parent.getHeight()/3);
		//Pelouse
		g.setColor(Color.green);
		g.fillRect(0, this.parent.getHeight() -
		this.parent.getHeight()/3, this.parent.getWidth(),
		this.parent.getHeight());
		//Le soleil
		g.setColor(Color.yellow);
		g.fillOval(this.parent.getWidth() - this.parent.getWidth()/4,
		this.parent.getWidth()/12, this.parent.getWidth()/6,
		this.parent.getWidth()/6);
		}
}
