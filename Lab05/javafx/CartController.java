package hust.soict.dsai.javafx;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class CartController {
    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaId;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, String> colMediaCost;

    @FXML
    private VBox vbox;

    private Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @FXML
    public void initialize() {
        colMediaId.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getId() + ""));
        colMediaTitle.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTitle()));
        colMediaCategory.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getCategory()));
        colMediaCost.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getCost() + " $"));

        ObservableList<Media> mediaList = FXCollections.observableArrayList(cart.getItemsOrdered());
        tblMedia.setItems(mediaList);
    }

    @FXML
    private void btnRemovePressed() {
        Media selectedMedia = tblMedia.getSelectionModel().getSelectedItem();
        if (selectedMedia != null) {
            cart.removeMedia(selectedMedia);
            tblMedia.getItems().remove(selectedMedia);
        }
    }

    @FXML
    private void btnPlayPressed() {
        Media selectedMedia = tblMedia.getSelectionModel().getSelectedItem();
        if (selectedMedia instanceof Playable) {
            ((Playable) selectedMedia).play();
        }
    }

    @FXML
    private void btnViewStorePressed() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Store.fxml"));
            Parent storeView = loader.load();
            Scene storeScene = new Scene(storeView);
            Stage stage = (Stage) vbox.getScene().getWindow();
            stage.setScene(storeScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
