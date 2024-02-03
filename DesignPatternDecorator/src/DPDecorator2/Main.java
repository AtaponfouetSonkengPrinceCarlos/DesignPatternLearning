package DPDecorator2;

public class Main {
	public static void main(String[] args){
		Patisserie pat = new Gateau();
		pat = new CoucheChocolat(pat);
		System.out.println(pat.preparer());
		}
}
