package userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import threads.AnimationThread;

public class GUIController {

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
    private ImageView imvRandomBlocks;
    
    private int currentBlock;
    
    @FXML
    void add(ActionEvent event) {

    }

    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void generateBlock(ActionEvent event) {
    	
    	AnimationThread aT = new AnimationThread(this);
    	aT.setDaemon(true);
    	aT.start(); 
    	
    }

    @FXML
    void next(ActionEvent event) {

    }

    @FXML
    void reestart(ActionEvent event) {

    }
    
    public void setImageRandom(String id) {
    	imvRandomBlocks.setImage(new Image(id));
    }
    
    public void setCurrentBlock(int currentBlockx) {
    	currentBlock = currentBlockx;
    }

}
