package com.prince.vue;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.prince.model.Horloge;
import com.prince.observer.Observateur;
public class Fenetre extends JFrame{
	private JLabel label = new JLabel();
	private Horloge horloge;
	public Fenetre(){
	/* On initialise notre JFrame */
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setSize(200, 80);
	/* On initialise l'horloge */
	this.horloge = new Horloge();
	this.horloge.addObservateur(new Observateur(){
		public void update(String hour) {
		label.setText(hour);
		}
		});
	/* On initialise notre JLabel */
	Font police = new Font("Arial", Font.TYPE1_FONT, 30);
	this.label.setFont(police);
	this.label.setHorizontalAlignment(JLabel.CENTER);
	/* On ajoute le JLabel à notre JFrame */
	this.getContentPane().add(this.label, BorderLayout.CENTER);
	}
	
	/* Méthode main pour lancer le programme */
	public static void main(String[] args){
	Fenetre fen = new Fenetre();
	fen.setVisible(true);
	}
}
