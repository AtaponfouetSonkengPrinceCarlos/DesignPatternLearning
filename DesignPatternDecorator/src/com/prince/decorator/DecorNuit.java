package com.prince.decorator;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DecorNuit extends Item {
	public DecorNuit() {
		super();
		}
	public DecorNuit(JPanel pan) {
		super(pan);
		}
		public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//La nuit
		g.setColor(Color.black);
		g.fillRect(0, 0, this.parent.getWidth(), this.parent.getHeight()
		- this.parent.getHeight()/3);
		//Pelouse
		g.setColor(new Color(0, 138, 0));
		g.fillRect(0, this.parent.getHeight() -
		this.parent.getHeight()/3, this.parent.getWidth(),
		this.parent.getHeight());
		//La lune
		g.setColor(Color.white);
		g.fillOval(this.parent.getWidth() - this.parent.getWidth()/4,
		this.parent.getWidth()/12, this.parent.getWidth()/6,
		this.parent.getWidth()/6);
		}
}
