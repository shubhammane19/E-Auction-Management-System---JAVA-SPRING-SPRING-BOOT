package com.company.auction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {
    private JPanel auctionPanel;
    private JButton customerButton;
    private JButton adminButton;
    private JFrame auctionF;

    public MainScreen() {
        auctionF = new JFrame("Auction Management System");
        auctionF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        auctionF.setContentPane(auctionPanel);
        auctionF.pack();
        auctionF.setSize(600, 400);
        auctionF.setVisible(true);

        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Customer();
            }
        });
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Admin();
            }
        });
    }
}
