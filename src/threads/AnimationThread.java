package threads;

import userinterface.GUIController;

public class AnimationThread extends Thread{
	
	private GUIController gui;
	
	public AnimationThread(GUIController guix) {
		gui = guix;
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
		
		int currentBlock = (int)(Math.random()*15)+1;
		gui.setImageRandom("/images/block"+currentBlock+".png");
		gui.setCurrentBlock(currentBlock);
		
	}

}
