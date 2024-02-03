import com.prince.controler.AbstractControler;
import com.prince.controler.CalculetteControler;
import com.prince.model.AbstractModel;
import com.prince.model.Calculator;
import com.prince.vue.Calculette;
import com.prince.vue.Ecran;

public class Main {
	public static void main(String[] args) {
		//Instanciation de notre modèle
		AbstractModel calc = new Calculator();
		//création du contrôleur
		//Partie 4 : Les Design patterns 740/771www.siteduzero.com
		AbstractControler controler = new CalculetteControler(calc);
		//Création de notre fenêtre avec le contrôleur en paramètre
		Calculette calculette = new Calculette(controler);
		//Ajout de la fenêtre comme observer de notre modèle
		Ecran ecran = new Ecran(calculette);
		calc.addObserver(ecran);
		}
	}
