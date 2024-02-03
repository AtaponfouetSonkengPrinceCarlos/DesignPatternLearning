import com.prince.comportement.*;
public class Guerrier extends Personnage {
	public Guerrier(){
		this.espritCombatif = new CombatPistolet();
		}
	public Guerrier(EspritCombatif espritCombatif, Soin soin,Deplacement deplacement) {
			//Appel au constructeur de la super classe
			super(espritCombatif, soin, deplacement);
			}
			
}
