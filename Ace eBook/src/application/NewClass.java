package application;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/******
 * <p> Title: NewClass. </p>
 * 
 * <p> Description: A JavaFX demonstration application and baseline for a sequence of projects </p>
 * 
 * @author  Manpreet Singh
 * 
 * @version 1.0	2019-05-16 Added Add,Remove and view button for saved calculations 
 */
public class NewClass {
	

	
	

	public NewClass(Stage resultStage1) throws IOException {
		
		Button btn_LoadCalculations = new Button("Load");
		
		Pane theRoot = new Pane();
		
		
		Scene resultScene = new Scene(theRoot, 500, 500);
		resultStage1.setScene(resultScene);
		resultStage1.show();
		theRoot.getChildren().addAll(btn_LoadCalculations);
		}
	
	private void setupButton(Button b, int w, int x, int y) {
		b.setMinWidth(w);
		b.setAlignment(Pos.BASELINE_CENTER);
		b.setLayoutX(x);
		b.setLayoutY(y);
	}
		
		
	
	
	
}


