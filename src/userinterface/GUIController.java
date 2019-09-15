package userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Cube;
import model.Inventary;
import myCollections.HashTable;
import threads.AnimationThread;

public class GUIController {

	public final static char QUICK_ACCESS =  'Q';

	public final static char INVENTORY = 'c';

	@FXML
	private Label lb0;

	@FXML
	private Label lb1;

	@FXML
	private Label lb2;

	@FXML
	private Label lb3;

	@FXML
	private Label lb4;

	@FXML
	private ImageView opacity31;

	@FXML
	private Button quickAccessButton;

	@FXML
	private Button inventoryButton;

	@FXML
	private Button generateAmountButton;

	@FXML
	private ImageView imv0;

	@FXML
	private ImageView imv1;

	@FXML
	private ImageView imv2;

	@FXML
	private ImageView imv3;

	@FXML
	private ImageView imv4;

	@FXML
	private ImageView imv5;

	@FXML
	private ImageView imv6;

	@FXML
	private ImageView imv7;

	@FXML
	private ImageView imv8;

	@FXML
	private ImageView imv9;

	@FXML
	private ImageView imv10;

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
	private ImageView imv20;

	@FXML
	private ImageView imv21;

	@FXML
	private ImageView imv22;

	@FXML
	private ImageView imv23;

	@FXML
	private ImageView imv24;

	@FXML
	private ImageView imv25;

	@FXML
	private ImageView imv26;

	@FXML
	private ImageView imv27;

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

	private String currentPath = "";


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
		if(mode == INVENTORY) {

			String[] parts = currentPath.split("/");

			String line = parts[2];
			String msg = "";
			int i = 0;
			while(line.charAt(i)!='.') {
				msg+=line.charAt(i);
				i++;
			}

			System.out.println(msg);
			Cube c = new Cube(currentPath, msg);
			System.out.println(inventary.getTable().add(c));
			HashTable ht = inventary.getTable();

			if(ht.getTable()[0]!=null) {
				imv0.setImage(new Image(ht.getTable()[0].getPath()));
				lb0.setText(String.valueOf(ht.getCubesLength(0)));
			}
			if(ht.getTable()[1]!=null) {
				imv1.setImage(new Image(ht.getTable()[1].getPath()));
				lb1.setText(String.valueOf(ht.getCubesLength(1)));
			}
			if(ht.getTable()[2]!=null) {
				imv2.setImage(new Image(ht.getTable()[2].getPath()));
				lb2.setText(String.valueOf(ht.getCubesLength(2)));
			}
			if(ht.getTable()[3]!=null) {
				imv3.setImage(new Image(ht.getTable()[3].getPath()));
				lb3.setText(String.valueOf(ht.getCubesLength(3)));
			}
			if(ht.getTable()[4]!=null) {
				imv4.setImage(new Image(ht.getTable()[4].getPath()));
				lb4.setText(String.valueOf(ht.getCubesLength(4)));
			}
			if(ht.getTable()[5]!=null)
				imv5.setImage(new Image(ht.getTable()[5].getPath()));
			if(ht.getTable()[6]!=null)
				imv6.setImage(new Image(ht.getTable()[6].getPath()));
			if(ht.getTable()[7]!=null)
				imv7.setImage(new Image(ht.getTable()[7].getPath()));
			if(ht.getTable()[8]!=null)
				imv8.setImage(new Image(ht.getTable()[8].getPath()));
			if(ht.getTable()[9]!=null)
				imv9.setImage(new Image(ht.getTable()[9].getPath()));
			if(ht.getTable()[10]!=null)
				imv10.setImage(new Image(ht.getTable()[10].getPath()));
			if(ht.getTable()[11]!=null)
				imv11.setImage(new Image(ht.getTable()[11].getPath()));
			if(ht.getTable()[12]!=null)
				imv12.setImage(new Image(ht.getTable()[12].getPath()));
			if(ht.getTable()[13]!=null)
				imv13.setImage(new Image(ht.getTable()[13].getPath()));
			if(ht.getTable()[14]!=null)
				imv14.setImage(new Image(ht.getTable()[14].getPath()));
			if(ht.getTable()[15]!=null)
				imv15.setImage(new Image(ht.getTable()[15].getPath()));
			if(ht.getTable()[16]!=null)
				imv16.setImage(new Image(ht.getTable()[16].getPath()));
			if(ht.getTable()[17]!=null)
				imv17.setImage(new Image(ht.getTable()[17].getPath()));
			if(ht.getTable()[18]!=null)
				imv18.setImage(new Image(ht.getTable()[18].getPath()));
			if(ht.getTable()[19]!=null)
				imv19.setImage(new Image(ht.getTable()[19].getPath()));
			if(ht.getTable()[20]!=null)
				imv20.setImage(new Image(ht.getTable()[20].getPath()));
			if(ht.getTable()[21]!=null)
				imv21.setImage(new Image(ht.getTable()[21].getPath()));
			if(ht.getTable()[22]!=null)
				imv22.setImage(new Image(ht.getTable()[22].getPath()));
			if(ht.getTable()[23]!=null)
				imv23.setImage(new Image(ht.getTable()[23].getPath()));
			if(ht.getTable()[24]!=null)
				imv24.setImage(new Image(ht.getTable()[24].getPath()));
			if(ht.getTable()[25]!=null)
				imv25.setImage(new Image(ht.getTable()[25].getPath()));
			if(ht.getTable()[26]!=null)
				imv26.setImage(new Image(ht.getTable()[26].getPath()));
		}




	}

	@FXML
	void inventory(ActionEvent event) {
		mode = INVENTORY;
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
		mode = QUICK_ACCESS;
		opacity31.setVisible(true);
		imvRandomBlocks.setImage(new Image("/images/Null-02.jpg"));
		amount.setText("");
		changeMode();
	}

	public void setImageRandom(String id) {
		currentPath = id;
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