package com.prince.decorator;

import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Item {
	protected JPanel parent;
	public Item(JPanel pan) {
		this.parent = pan;
		}
		/**
		* Constructeur par défaut
		*/
		public Item() {}
		public void paintComponent(Graphics g){
		this.parent.getGraphicsConfiguration();
		}
}
