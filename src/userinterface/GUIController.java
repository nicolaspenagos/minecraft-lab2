package userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Cube;
import model.Inventory;
import model.QuickAccess;
import myCollections.HashTable;
import threads.AnimationThread;

public class GUIController {

	public final static char QUICK_ACCESS = 'Q';

	public final static char INVENTORY = 'c';

	@FXML
	private Button addButton;
	

    @FXML
    private Label sameType;

    @FXML
    private Label lb411;
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
	private Label lb5;

	@FXML
	private Label lb6;

	@FXML
	private Label lb7;

	@FXML
	private Label lb8;

	@FXML
	private Label lb9;

	@FXML
	private Label lb10;

	@FXML
	private Label lb11;

	@FXML
	private Label lb12;

	@FXML
	private Label lb13;

	@FXML
	private Label lb14;

	@FXML
	private Label lb15;

	@FXML
	private Label lb16;

	@FXML
	private Label lb17;

	@FXML
	private Label lb18;

	@FXML
	private Label lb19;

	@FXML
	private Label lb20;

	@FXML
	private Label lb21;

	@FXML
	private Label lb22;

	@FXML
	private Label lb23;

	@FXML
	private Label lb24;

	@FXML
	private Label lb25;

	@FXML
	private Label lb26;

	@FXML
	private Label lb41;

	@FXML
	private Label lb42;

	@FXML
	private Label lb43;
	
    @FXML
    private Label isFull;

	

    @FXML
    private Label lb44;

    @FXML
    private Label lb45;

    @FXML
    private Label lb46;

    @FXML
    private Label lb47;

    @FXML
    private Label lb48;

    @FXML
    private Label lb49;

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
	private ImageView imv48;
	
	@FXML
	private ImageView imv49;

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

	@FXML
	private Label qAl;

	private Inventory inventary;

	private int currentQuickAccess;

	private QuickAccess quickAccess;

	private char mode;

	private String currentPath = "";

	@FXML
	public void initialize() {
		sameType.setVisible(false);
		isFull.setVisible(false);
		generateAmountButton.setVisible(false);
		currentQuickAccess = 1;
		qAl.setText("" + currentQuickAccess);
		inventary = new Inventory();
		quickAccess = new QuickAccess();
		opacity1.setVisible(false);
		mode = INVENTORY;
		quickAccessButton.setVisible(true);
		inventoryButton.setVisible(false);
		opacity3.setVisible(false);
		opacity31.setVisible(true);
		addButton.setVisible(false);
		modeLabel.setText("You are in INVENTORY MODE");
		opacity3.setVisible(true);

	}

	@FXML
	void add(ActionEvent event) {
		sameType.setVisible(false);
		if (mode == INVENTORY) {

			String[] parts = currentPath.split("/");

			String line = parts[2];
			String msg = "";
			int i = 0;
			while (line.charAt(i) != '.') {
				msg += line.charAt(i);
				i++;
			}
			Cube c = new Cube(currentPath, msg);
			boolean addedProperly = inventary.getTable().add(c);
			HashTable ht = inventary.getTable();
			if(addedProperly) {
				if (ht.getTable()[0] != null) {
					imv0.setImage(new Image(ht.getTable()[0].getPath()));
					lb0.setText(String.valueOf(ht.getCubesLength(0)));
				}
				if (ht.getTable()[1] != null) {
					imv1.setImage(new Image(ht.getTable()[1].getPath()));
					lb1.setText(String.valueOf(ht.getCubesLength(1)));
				}
				if (ht.getTable()[2] != null) {
					imv2.setImage(new Image(ht.getTable()[2].getPath()));
					lb2.setText(String.valueOf(ht.getCubesLength(2)));
				}
				if (ht.getTable()[3] != null) {
					imv3.setImage(new Image(ht.getTable()[3].getPath()));
					lb3.setText(String.valueOf(ht.getCubesLength(3)));
				}
				if (ht.getTable()[4] != null) {
					imv4.setImage(new Image(ht.getTable()[4].getPath()));
					lb4.setText(String.valueOf(ht.getCubesLength(4)));
				}
				if (ht.getTable()[5] != null) {
					imv5.setImage(new Image(ht.getTable()[5].getPath()));
					lb5.setText(String.valueOf(ht.getCubesLength(5)));
				}
				if (ht.getTable()[6] != null) {
					imv6.setImage(new Image(ht.getTable()[6].getPath()));
					lb6.setText(String.valueOf(ht.getCubesLength(6)));
				}
				if (ht.getTable()[7] != null) {
					imv7.setImage(new Image(ht.getTable()[7].getPath()));
					lb7.setText(String.valueOf(ht.getCubesLength(7)));
				}
				if (ht.getTable()[8] != null) {
					imv8.setImage(new Image(ht.getTable()[8].getPath()));
					lb8.setText(String.valueOf(ht.getCubesLength(8)));
				}
				if (ht.getTable()[9] != null) {
					imv9.setImage(new Image(ht.getTable()[9].getPath()));
					lb9.setText(String.valueOf(ht.getCubesLength(9)));
				}
				if (ht.getTable()[10] != null) {
					imv10.setImage(new Image(ht.getTable()[10].getPath()));
					lb10.setText(String.valueOf(ht.getCubesLength(10)));
				}
				if (ht.getTable()[11] != null) {
					imv11.setImage(new Image(ht.getTable()[11].getPath()));
					lb11.setText(String.valueOf(ht.getCubesLength(11)));
				}
				if (ht.getTable()[12] != null) {
					imv12.setImage(new Image(ht.getTable()[12].getPath()));
					lb12.setText(String.valueOf(ht.getCubesLength(12)));
				}
				if (ht.getTable()[13] != null) {
					imv13.setImage(new Image(ht.getTable()[13].getPath()));
					lb13.setText(String.valueOf(ht.getCubesLength(13)));
				}
				if (ht.getTable()[14] != null) {
					imv14.setImage(new Image(ht.getTable()[14].getPath()));
					lb14.setText(String.valueOf(ht.getCubesLength(14)));
				}
				if (ht.getTable()[15] != null) {
					imv15.setImage(new Image(ht.getTable()[15].getPath()));
					lb15.setText(String.valueOf(ht.getCubesLength(15)));
				}
				if (ht.getTable()[16] != null) {
					imv16.setImage(new Image(ht.getTable()[16].getPath()));
					lb16.setText(String.valueOf(ht.getCubesLength(16)));
				}
				if (ht.getTable()[17] != null) {
					imv17.setImage(new Image(ht.getTable()[17].getPath()));
					lb17.setText(String.valueOf(ht.getCubesLength(17)));
				}
				if (ht.getTable()[18] != null) {
					imv18.setImage(new Image(ht.getTable()[18].getPath()));
					lb18.setText(String.valueOf(ht.getCubesLength(18)));
				}
				if (ht.getTable()[19] != null) {
					imv19.setImage(new Image(ht.getTable()[19].getPath()));
					lb19.setText(String.valueOf(ht.getCubesLength(19)));
				}
				if (ht.getTable()[20] != null) {
					imv20.setImage(new Image(ht.getTable()[20].getPath()));
					lb20.setText(String.valueOf(ht.getCubesLength(20)));
				}
				if (ht.getTable()[21] != null) {
					imv21.setImage(new Image(ht.getTable()[21].getPath()));
					lb21.setText(String.valueOf(ht.getCubesLength(21)));
				}
				if (ht.getTable()[22] != null) {
					imv22.setImage(new Image(ht.getTable()[22].getPath()));
					lb22.setText(String.valueOf(ht.getCubesLength(22)));
				}
				if (ht.getTable()[23] != null) {
					imv23.setImage(new Image(ht.getTable()[23].getPath()));
					lb23.setText(String.valueOf(ht.getCubesLength(23)));
				}
				if (ht.getTable()[24] != null) {
					imv24.setImage(new Image(ht.getTable()[24].getPath()));
					lb24.setText(String.valueOf(ht.getCubesLength(24)));
				}
				if (ht.getTable()[25] != null) {
					imv25.setImage(new Image(ht.getTable()[25].getPath()));
					lb25.setText(String.valueOf(ht.getCubesLength(25)));
				}
				if (ht.getTable()[26] != null) {
					imv26.setImage(new Image(ht.getTable()[26].getPath()));
					lb26.setText(String.valueOf(ht.getCubesLength(26)));
				}
			}
			
		} else {

			String[] parts = currentPath.split("/");

			String line = parts[2];
			String msg = "";
			int i = 0;
			while (line.charAt(i) != '.') {
				msg += line.charAt(i);
				i++;
			}
			Cube c = new Cube(currentPath, msg);
			if(quickAccess.isNull(currentQuickAccess)){
				 quickAccess.add(c, currentQuickAccess, Integer.parseInt(amount.getText()));
			}else {
				
			
				if(c.getKey().equals(quickAccess.getCurrentKey(currentQuickAccess))) {
					 quickAccess.add(c, currentQuickAccess, Integer.parseInt(amount.getText()));
				}else {
					sameType.setVisible(true);
				}
			}
			update();
			
			
			
		   
		    
		    
		}
	}

	@FXML
	void inventory(ActionEvent event) {
		sameType.setVisible(false);
		mode = INVENTORY;
		opacity31.setVisible(false);
		imvRandomBlocks.setImage(new Image("/images/Null-02.jpg"));
		amount.setText("");
		changeMode();
	}

	@FXML
	void generateBlock(ActionEvent event) {
		sameType.setVisible(false);
		if (mode == QUICK_ACCESS) {
			opacity31.setVisible(true);
			opacity3.setVisible(true);
			addButton.setVisible(false);
		}
		amount.setText("");
		inventary.generateRandomBlock();

		AnimationThread aT = new AnimationThread(this, inventary);
		aT.setDaemon(true);
		aT.start();

	}

	@FXML
	void generateAmount(ActionEvent event) {
		sameType.setVisible(false);
		opacity31.setVisible(false);
		addButton.setVisible(true);
		amount.setText(inventary.getCurrentAmount() + "");
	}

	@FXML
	void next(ActionEvent event) {
		sameType.setVisible(false);
		isFull.setVisible(false);
		if (currentQuickAccess == 27) {
			currentQuickAccess = 1;
		} else {
			currentQuickAccess++;
		}

		qAl.setText("" + currentQuickAccess);
		update();
	}

	@FXML
	void quickAccess(ActionEvent event) {
		sameType.setVisible(false);
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
		if (modeLabel.getText().equals("You are in INVENTORY MODE")) {
			modeLabel.setText("You are in QUICK ACCESS MODE");
			quickAccessButton.setVisible(false);
			inventoryButton.setVisible(true);
			generateAmountButton.setVisible(true);
			opacity1.setVisible(true);
			// opacity3.setVisible(false);
			opacity2.setVisible(false);
		} else {
			modeLabel.setText("You are in INVENTORY MODE");
			quickAccessButton.setVisible(true);
			inventoryButton.setVisible(false);
			opacity1.setVisible(false);
			generateAmountButton.setVisible(false);
			opacity2.setVisible(true);
			opacity3.setVisible(true);
		}
	}
	
	public void update() {
	    int numberOfImages = quickAccess.numberOfImages(currentQuickAccess);
	    int size = quickAccess.residue(currentQuickAccess);
	    
	    if(numberOfImages==0) {
	    	imv41.setImage(new Image("/images/Null-02.jpg"));
	    	imv42.setImage(new Image("/images/Null-02.jpg"));
	    	imv43.setImage(new Image("/images/Null-02.jpg"));
	    	imv44.setImage(new Image("/images/Null-02.jpg"));
	    	imv45.setImage(new Image("/images/Null-02.jpg"));
	    	imv46.setImage(new Image("/images/Null-02.jpg"));
	    	imv47.setImage(new Image("/images/Null-02.jpg"));
	    	imv48.setImage(new Image("/images/Null-02.jpg"));
	    	imv49.setImage(new Image("/images/Null-02.jpg"));
	    	lb411.setText(" ");
	    	lb42.setText(" ");
	    	lb43.setText(" ");
	    	lb44.setText(" ");
	    	lb45.setText(" ");
	    	lb46.setText(" ");
	    	lb47.setText(" ");
	    	lb48.setText(" ");
	    	lb49.setText(" ");
	    }
	    if(numberOfImages==1) {
	    	imv41.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	lb411.setText(size+" ");
	    	if(size==0) {
	    		lb411.setText(64+" ");
	    		
	    	}
	    	imv42.setImage(new Image("/images/Null-02.jpg"));
	    	imv43.setImage(new Image("/images/Null-02.jpg"));
	    	imv44.setImage(new Image("/images/Null-02.jpg"));
	    	imv45.setImage(new Image("/images/Null-02.jpg"));
	    	imv46.setImage(new Image("/images/Null-02.jpg"));
	    	imv47.setImage(new Image("/images/Null-02.jpg"));
	    	imv48.setImage(new Image("/images/Null-02.jpg"));
	    	imv49.setImage(new Image("/images/Null-02.jpg"));
	    	lb42.setText(" ");
	    	lb43.setText(" ");
	    	lb44.setText(" ");
	    	lb45.setText(" ");
	    	lb46.setText(" ");
	    	lb47.setText(" ");
	    	lb48.setText(" ");
	    	lb49.setText(" ");
	    }
	    
	    if(numberOfImages==2) {
	    	imv41.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv42.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	lb411.setText(64+" ");
	    	lb42.setText(size+" ");
	    	if(size==0) {
	    		lb42.setText(64+" ");
	    		
	    	}
	    	
	    	
	    	imv43.setImage(new Image("/images/Null-02.jpg"));
	    	imv44.setImage(new Image("/images/Null-02.jpg"));
	    	imv45.setImage(new Image("/images/Null-02.jpg"));
	    	imv46.setImage(new Image("/images/Null-02.jpg"));
	    	imv47.setImage(new Image("/images/Null-02.jpg"));
	    	imv48.setImage(new Image("/images/Null-02.jpg"));
	    	imv49.setImage(new Image("/images/Null-02.jpg"));
	    	lb43.setText(" ");
	    	lb44.setText(" ");
	    	lb45.setText(" ");
	    	lb46.setText(" ");
	    	lb47.setText(" ");
	    	lb48.setText(" ");
	    	lb49.setText(" ");
	    }
	    
	    if(numberOfImages==3) {
	    	imv41.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv42.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv43.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	lb411.setText(64+" ");
	    	lb42.setText(64+" ");
	    	lb43.setText(size+" ");
	    	if(size==0) {
	    		lb43.setText(64+" ");
	    		
	    	}
	    	
	    	
	    	imv44.setImage(new Image("/images/Null-02.jpg"));
	    	imv45.setImage(new Image("/images/Null-02.jpg"));
	    	imv46.setImage(new Image("/images/Null-02.jpg"));
	    	imv47.setImage(new Image("/images/Null-02.jpg"));
	    	imv48.setImage(new Image("/images/Null-02.jpg"));
	    	imv49.setImage(new Image("/images/Null-02.jpg"));
	    	lb44.setText(" ");
	    	lb45.setText(" ");
	    	lb46.setText(" ");
	    	lb47.setText(" ");
	    	lb48.setText(" ");
	    	lb49.setText(" ");
	    }
	    
	    if(numberOfImages==4) {
	    	imv41.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv42.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv43.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv44.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	lb411.setText(64+" ");
	    	lb42.setText(64+" ");
	    	lb43.setText(64+" ");
	    	lb44.setText(size+" ");
	    	if(size==0) {
	    		lb44.setText(64+" ");
	    	}
	    	
	    	imv45.setImage(new Image("/images/Null-02.jpg"));
	    	imv46.setImage(new Image("/images/Null-02.jpg"));
	    	imv47.setImage(new Image("/images/Null-02.jpg"));
	    	imv48.setImage(new Image("/images/Null-02.jpg"));
	    	imv49.setImage(new Image("/images/Null-02.jpg"));
	    	lb45.setText(" ");
	    	lb46.setText(" ");
	    	lb47.setText(" ");
	    	lb48.setText(" ");
	    	lb49.setText(" ");
	    }
	    
	    if(numberOfImages==5) {
	    	imv41.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv42.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv43.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv44.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv45.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	lb411.setText(64+" ");
	    	lb42.setText(64+" ");
	    	lb43.setText(64+" ");
	    	lb44.setText(64+" ");
	    	lb45.setText(size+" ");
	    	if(size==0) {
	    		lb45.setText(64+" ");
	    		
	    	}
	    	
	    	imv46.setImage(new Image("/images/Null-02.jpg"));
	    	imv47.setImage(new Image("/images/Null-02.jpg"));
	    	imv48.setImage(new Image("/images/Null-02.jpg"));
	    	imv49.setImage(new Image("/images/Null-02.jpg"));
	    	lb46.setText(" ");
	    	lb47.setText(" ");
	    	lb48.setText(" ");
	    	lb49.setText(" ");
	    }
	    
	    if(numberOfImages==6) {
	    	imv41.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv42.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv43.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv44.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv45.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv46.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	lb411.setText(64+" ");
	    	lb42.setText(64+" ");
	    	lb43.setText(64+" ");
	    	lb44.setText(64+" ");
	    	lb45.setText(64+" ");
	    	lb46.setText(size+" ");
	    	if(size==0) {
	    		lb46.setText(64+" ");
	    	}
	    	imv47.setImage(new Image("/images/Null-02.jpg"));
	    	imv48.setImage(new Image("/images/Null-02.jpg"));
	    	imv49.setImage(new Image("/images/Null-02.jpg"));
	    	lb47.setText(" ");
	    	lb48.setText(" ");
	    	lb49.setText(" ");
	    }
	    
	    if(numberOfImages==7) {
	    	imv41.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv42.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv43.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv44.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv45.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv46.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv47.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	lb411.setText(64+" ");
	    	lb42.setText(64+" ");
	    	lb43.setText(64+" ");
	    	lb44.setText(64+" ");
	    	lb45.setText(64+" ");
	    	lb46.setText(64+" ");
	    	lb47.setText(size+" ");
	    	if(size==0) {
	    		lb47.setText(64+" ");
	    		
	    	}
	    	imv48.setImage(new Image("/images/Null-02.jpg"));
	    	imv49.setImage(new Image("/images/Null-02.jpg"));
	    	lb48.setText(" ");
	    	lb49.setText(" ");
	    }
	    
	    if(numberOfImages==8) {
	    	imv41.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv42.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv43.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv44.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv45.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv46.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv47.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv48.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	lb411.setText(64+" ");
	    	lb42.setText(64+" ");
	    	lb43.setText(64+" ");
	    	lb44.setText(64+" ");
	    	lb45.setText(64+" ");
	    	lb46.setText(64+" ");
	    	lb47.setText(64+" ");
	    	lb48.setText(size+" ");
	    	if(size==0) {
	    		lb48.setText(64+" ");
	    		
	    	}
	    	imv49.setImage(new Image("/images/Null-02.jpg"));
	    	lb49.setText(" ");
	    }
	    
	    if(numberOfImages==9) {
	    	imv41.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv42.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv43.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv44.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv45.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv46.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv47.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv48.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	imv49.setImage(new Image(quickAccess.getPath(currentQuickAccess)));
	    	lb411.setText(64+" ");
	    	lb42.setText(64+" ");
	    	lb43.setText(64+" ");
	    	lb44.setText(64+" ");
	    	lb45.setText(64+" ");
	    	lb46.setText(64+" ");
	    	lb47.setText(64+" ");
	    	lb48.setText(64+" ");
	    	lb49.setText(size+" ");
	    	if(size==0) {
	    		lb49.setText(64+" ");
	    		isFull.setVisible(true);
	    	}
	    }
	}
	

    @FXML
    void prev(ActionEvent event) {
    	sameType.setVisible(false);
    	isFull.setVisible(false);
		if (currentQuickAccess == 1) {
			currentQuickAccess = 27;
		} else {
			currentQuickAccess--;
		}

		qAl.setText("" + currentQuickAccess);
		update();
    }

	public Button getAddB() {
		return addButton;
	}

	public char getMode() {
		return mode;
	}

	public ImageView getIMV() {
		return opacity31;
	}

	public ImageView getIMV1() {
		return opacity3;
	}

}