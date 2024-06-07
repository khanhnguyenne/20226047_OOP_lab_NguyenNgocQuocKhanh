package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfDirector, tfLength;

    public AddDigitalVideoDiscToStoreScreen() {
        super();
    }

    @Override
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(6, 2, 2, 2));

        JLabel lblTitle = new JLabel("Title: ");
        tfTitle = new JTextField();

        JLabel lblCategory = new JLabel("Category: ");
        tfCategory = new JTextField();

        JLabel lblCost = new JLabel("Cost: ");
        tfCost = new JTextField();

        JLabel lblDirector = new JLabel("Director: ");
        tfDirector = new JTextField();

        JLabel lblLength = new JLabel("Length: ");
        tfLength = new JTextField();

        center.add(lblTitle);
        center.add(tfTitle);
        center.add(lblCategory);
        center.add(tfCategory);
        center.add(lblCost);
        center.add(tfCost);
        center.add(lblDirector);
        center.add(tfDirector);
        center.add(lblLength);
        center.add(tfLength);

        JButton btnAdd = new JButton("Add DVD");
        center.add(new JLabel());
        center.add(btnAdd);

        return center;
    }

    public static void main(String[] args) {
        new AddDigitalVideoDiscToStoreScreen();
    }
}
