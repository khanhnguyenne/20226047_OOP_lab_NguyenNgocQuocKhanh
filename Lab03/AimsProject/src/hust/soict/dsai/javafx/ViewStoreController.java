package hust.soict.dsai.javafx;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.Media;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class ViewStoreController {
    @FXML
    private GridPane gridPane;

    private Store store;

    public ViewStoreController(Store store) {
        this.store = store;
    }

    @FXML
    public void initialize() {
        List<Media> mediaItems = store.getItemsInStore();
        int row = 0;
        int col = 0;
        for (Media media : mediaItems) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Item.fxml"));
                Parent itemNode = loader.load();
                ItemController itemController = loader.getController();
                itemController.setData(media);
                gridPane.add(itemNode, col, row);
                col++;
                if (col == 3) {
                    col = 0;
                    row++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnViewCartPressed() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cart.fxml"));
            Parent cartView = loader.load();
            Scene cartScene = new Scene(cartView);
            Stage stage = (Stage) gridPane.getScene().getWindow();
            stage.setScene(cartScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
