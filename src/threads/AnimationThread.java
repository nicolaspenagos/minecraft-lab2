package threads;

import model.Inventory;
import userinterface.GUIController;

public class AnimationThread extends Thread{
	
	private GUIController gui;
	private Inventory inventary;
	
	public AnimationThread(GUIController gui, Inventory inventary) {
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
		gui.getAddB().setVisible(true);
		gui.getIMV().setVisible(false);
		if(gui.getMode()==gui.QUICK_ACCESS) {
			gui.getAddB().setVisible(false);
			gui.getAddB().setVisible(false);
			gui.getIMV().setVisible(true);
			gui.getIMV1().setVisible(false);
		}
		gui.setImageRandom("/images/"+inventary.getCurrentBlock()+".png");
		
	}

}
