package test;

import view.MainView;

import javax.swing.*;

public class MainTest {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MainView();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
