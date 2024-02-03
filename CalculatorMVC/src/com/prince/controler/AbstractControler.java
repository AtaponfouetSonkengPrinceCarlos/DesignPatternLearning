package com.prince.controler;
import com.prince.model.AbstractModel;
import java.util.ArrayList;
public abstract class AbstractControler {
	protected AbstractModel calc;
	protected String operateur = "", nbre = "";
	protected ArrayList<String> listOperateur = new
	ArrayList<String>();
	public AbstractControler(AbstractModel cal){
	this.calc = cal;
	//On définit la liste des opérateurs afin d'être sûr qu'ils soient bons
	this.listOperateur.add("+");
	this.listOperateur.add("-");
	this.listOperateur.add("*");
	this.listOperateur.add("/");
	this.listOperateur.add("=");
	}
	/**
	* Définit l'opérateur
	* @param ope
	*/
	public void setOperateur(String ope){
	this.operateur = ope;
	control();
	}
	/**
	* Définit le nombre
	* @param nombre
	*/
	public void setNombre(String nombre){
	this.nbre = nombre;
	control();
	}
	/**
	* Efface
	*/
	public void reset(){
	this.calc.reset();
	}
	/**
	* Méthode de contrôle
	*/
	abstract void control();
}
