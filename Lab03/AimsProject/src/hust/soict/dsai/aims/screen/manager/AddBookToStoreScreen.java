package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    public AddBookToStoreScreen() {
        super();
    }

    @Override
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4, 2, 2, 2));

        JLabel lblTitle = new JLabel("Title: ");
        tfTitle = new JTextField();

        JLabel lblCategory = new JLabel("Category: ");
        tfCategory = new JTextField();

        JLabel lblCost = new JLabel("Cost: ");
        tfCost = new JTextField();

        center.add(lblTitle);
        center.add(tfTitle);
        center.add(lblCategory);
        center.add(tfCategory);
        center.add(lblCost);
        center.add(tfCost);

        JButton btnAdd = new JButton("Add Book");
        center.add(new JLabel());
        center.add(btnAdd);

        return center;
    }

    public static void main(String[] args) {
        new AddBookToStoreScreen();
    }
}
