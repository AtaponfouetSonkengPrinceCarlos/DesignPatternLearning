import javax.swing.JFrame;

public class Fenetre extends JFrame {
	public Fenetre(){
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Decorateur");
		this.setResizable(false);
		this.setContentPane(new Panneau());
		}
}
