package sample;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class InventoryMainMenuController{


    public void viewInventory(Event event){
        try {
            Parent list = FXMLLoader.load(getClass().getResource("InventoryList.fxml"));
            Scene invScene = new Scene(list);
            Stage invStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            invStage.hide();
            invStage.setScene(invScene);
            //adminStage.setTitle("Admin Panel");
            invStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addProduct(Event event){
        try {
            Parent list = FXMLLoader.load(getClass().getResource("AddProductMenu.fxml"));
            Scene addProductScene = new Scene(list);
            Stage addProductStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            addProductStage.hide();
            addProductStage.setScene(addProductScene);
            //adminStage.setTitle("Admin Panel");
            addProductStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchProduct(Event event){
        try {
            Parent list = FXMLLoader.load(getClass().getResource("SearchForm.fxml"));
            Scene searchProductScene = new Scene(list);
            Stage searchProductStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            searchProductStage.hide();
            searchProductStage.setScene(searchProductScene);
            //adminStage.setTitle("Admin Panel");
            searchProductStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
