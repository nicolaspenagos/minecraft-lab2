package userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Inventary;
import threads.AnimationThread;

public class GUIController {
	
	public final static char QUICK_ACCESS =  'Q';
	
	public final static char INVENTORY = 'c';
	
    @FXML
    private ImageView opacity31;

    @FXML
    private Button quickAccessButton;

    @FXML
    private Button inventoryButton;
    
    @FXML
    private Button generateAmountButton;

    @FXML
    private ImageView imv11;

    @FXML
    private ImageView imv12;

    @FXML
    private ImageView imv13;

    @FXML
    private ImageView imv14;

    @FXML
    private ImageView imv15;

    @FXML
    private ImageView imv16;

    @FXML
    private ImageView imv17;

    @FXML
    private ImageView imv18;

    @FXML
    private ImageView imv19;

    @FXML
    private ImageView imv29;

    @FXML
    private ImageView imv28;

    @FXML
    private ImageView imv27;

    @FXML
    private ImageView imv26;

    @FXML
    private ImageView imv25;

    @FXML
    private ImageView imv24;

    @FXML
    private ImageView imv22;

    @FXML
    private ImageView imv21;

    @FXML
    private ImageView imv31;

    @FXML
    private ImageView imv32;

    @FXML
    private ImageView imv33;

    @FXML
    private ImageView imv34;

    @FXML
    private ImageView imv35;

    @FXML
    private ImageView imv36;

    @FXML
    private ImageView imv37;

    @FXML
    private ImageView imv38;

    @FXML
    private ImageView imv39;

    @FXML
    private ImageView imv49;

    @FXML
    private ImageView imv48;

    @FXML
    private ImageView imv47;

    @FXML
    private ImageView imv46;

    @FXML
    private ImageView imv45;

    @FXML
    private ImageView imv44;

    @FXML
    private ImageView imv43;

    @FXML
    private ImageView imv42;

    @FXML
    private ImageView imv41;

    @FXML
    private ImageView opacity1;

    @FXML
    private ImageView opacity2;

    @FXML
    private ImageView imvRandomBlocks;
    

    @FXML
    private Label modeLabel;
    
    @FXML
    private Label amount;
    
    @FXML
    private ImageView opacity3;
   
    private Inventary inventary;
    
    private char mode;
        
    @FXML
    public void initialize() {
    	
    	generateAmountButton.setVisible(false);
    	inventary = new Inventary();
    	opacity1.setVisible(false);
    	mode = INVENTORY;
    	quickAccessButton.setVisible(true);
    	inventoryButton.setVisible(false);
    	opacity3.setVisible(false);
    	opacity31.setVisible(false);
    	modeLabel.setText("You are in INVENTORY MODE");
    	opacity3.setVisible(true);
    	
    }
    
    @FXML
    void add(ActionEvent event) {
    	
    }

    @FXML
    void inventory(ActionEvent event) {
    	opacity31.setVisible(false);
    	imvRandomBlocks.setImage(new Image("/images/Null-02.jpg"));
    	amount.setText("");
    	changeMode();
    }

    @FXML
    void generateBlock(ActionEvent event) {
    	
    	amount.setText("");
    	inventary.generateRandomBlock();
    	
    	AnimationThread aT = new AnimationThread(this, inventary);
    	aT.setDaemon(true);
    	aT.start(); 
    	
    	
    }
    
    @FXML
    void generateAmount(ActionEvent event) {
    	opacity31.setVisible(false);
    	amount.setText(inventary.getCurrentAmount()+"");
    }

    @FXML
    void next(ActionEvent event) {
    	
    }

    @FXML
    void quickAccess(ActionEvent event) {
    	opacity31.setVisible(true);
     	imvRandomBlocks.setImage(new Image("/images/Null-02.jpg"));
    	amount.setText("");
    	changeMode();
    }
    
    public void setImageRandom(String id) {;
    	imvRandomBlocks.setImage(new Image(id));
    	setLabelAmount();
    }
    
    public void setLabelAmount() {

    }

    public void changeMode() {
    	if(modeLabel.getText().equals("You are in INVENTORY MODE")) {
    		modeLabel.setText("You are in QUICK ACCESS MODE");
    		quickAccessButton.setVisible(false);
    		inventoryButton.setVisible(true);
    		generateAmountButton.setVisible(true);
    		opacity1.setVisible(true);
    		opacity3.setVisible(false);
    		opacity2.setVisible(false);
    	}else {
    		modeLabel.setText("You are in INVENTORY MODE");		
    		quickAccessButton.setVisible(true);
    		inventoryButton.setVisible(false);
    		opacity1.setVisible(false);
    		generateAmountButton.setVisible(false);
    		opacity2.setVisible(true);
    		opacity3.setVisible(true);
    	}
    }

    
  //  public void 

}