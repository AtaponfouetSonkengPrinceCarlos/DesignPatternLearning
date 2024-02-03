package com.prince.model;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JLabel;

import com.prince.observer.Observable;
import com.prince.observer.Observateur;
public class Horloge extends Thread implements Observable {
	private Calendar cal;
	private String hour = "";
	private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();
	public Horloge(){
	Thread t = new Thread(this);
	t.start();
	}
	public void run() {
	while(true){
	//On récupère l'instance d'un calendrier à chaque tour
	//celui-ci va nous permettre de récupérer l'heure actuelle
	this.cal = Calendar.getInstance();
	this.hour = /* Les heures */
	this.cal.get(Calendar.HOUR_OF_DAY) + " : "
	+
	( /* Les minutes */
	this.cal.get(Calendar.MINUTE) < 10
	? "0" + this.cal.get(Calendar.MINUTE)
	: this.cal.get(Calendar.MINUTE)
	)
	+ " : "
	+
	( /* Les secondes */
	(this.cal.get(Calendar.SECOND)< 10)
	? "0"+this.cal.get(Calendar.SECOND)
	: this.cal.get(Calendar.SECOND)
	);
	this.updateObservateur();
	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	}
	public void addObservateur(Observateur obs) {
		this.listObservateur.add(obs);
		}
		/**
		* Retire tous les observateurs de la liste
		*/
		public void delObservateur() {
		this.listObservateur = new ArrayList<Observateur>();
		}
		/**
		* Avertit les observateurs que l'observable a changé
		* et invoque la méthode update de chaque observateur !
		*/
		public void updateObservateur() {
		for(Observateur obs : this.listObservateur )
		obs.update(this.hour);
		}
}
