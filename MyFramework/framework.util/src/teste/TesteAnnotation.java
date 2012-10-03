package teste;

import javax.swing.JFrame;

public class TesteAnnotation extends JFrame{
	
	
	public TesteAnnotation(){
		initComponents();
	}
	
	private void initConfig(){
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	
	private void initComponents(){
		initConfig();
	}
	
	public static void main(String[] args) {
		
	}
}
