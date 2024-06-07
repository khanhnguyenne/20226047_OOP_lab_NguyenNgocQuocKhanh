package hust.soict.dsai.javafx;

import hust.soict.dsai.aims.media.Media;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ItemController {
    @FXML
    private Label lblTitle;

    @FXML
    private Label lblCost;

    @FXML
    private Button btnAddToCart;

    @FXML
    private Button btnPlay;

    private Media media;

    public void setData(Media media) {
        this.media = media;
        lblTitle.setText(media.getTitle());
        lblCost.setText(media.getCost() + " $");
        if (media instanceof Playable) {
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
    }

    @FXML
    private void btnAddToCartClicked() {
        // Implement add to cart functionality
    }

    @FXML
    private void btnPlayClicked() {
        // Implement play functionality
    }
}
