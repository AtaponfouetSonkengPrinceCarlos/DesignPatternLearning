import java.awt.Graphics;

import javax.swing.JPanel;

import com.prince.decorator.DecorNuit;
import com.prince.decorator.Item;

public class Panneau extends JPanel {
	private Item decor;
	/**
	* @param decor
	*/
	public Panneau(Item decor) {
	super();
	this.decor = decor;
	}
	/**
	* Par défaut
	*/
	public Panneau(){
	this.decor = new DecorNuit(this);
	}
	public void paintComponent(Graphics g){
	this.decor.paintComponent(g);
	}
}
