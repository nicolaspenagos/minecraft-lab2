package threads;

import model.Inventary;
import userinterface.GUIController;

public class AnimationThread extends Thread{
	
	private GUIController gui;
	private Inventary inventary;
	
	public AnimationThread(GUIController gui, Inventary inventary) {
		this.gui = gui;
		this.inventary = inventary;
	}
	
	@Override 
	public void run() {
	   	
		int cont = 1;
		while(cont<=15) {
			String id = "/images/block"+cont+".png";
			
			try {
				
			    gui.setImageRandom(id);
				sleep(160);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cont++;	
		}
	
		gui.setImageRandom("/images/"+inventary.getCurrentBlock()+".png");
		
	}

}
