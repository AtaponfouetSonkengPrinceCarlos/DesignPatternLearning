package DPDecorator2;

public abstract class Couche extends Patisserie {
	protected Patisserie pat;
	protected String nom;
	public Couche(Patisserie p){
	pat = p;
	}
	@Override
	public String preparer() {
		// TODO Auto-generated method stub
		System.out.println(nom);
		String str = pat.preparer();
		System.out.println("ccccccccc"+nom+str);
		return str + nom;
	}

}
