package view;

import view.componentsView.ContentView;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private JLabel screenResult;
    private Font font;
    public MainView(){
        this.init();
        this.setVisible(true);
    }
    private void init() {
        this.setTitle("Học ké 22it2b");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.font = new Font("Cascadia",Font.BOLD,20);

        this.screenResult = new JLabel("Màn hình kết quả");
        this.screenResult.setForeground(Color.RED);
        this.screenResult.setFont(this.font);
        JPanel content = ContentView.getInstance(this.screenResult,font).init();

        this.setLayout(new BorderLayout());
        this.add(this.screenResult,BorderLayout.NORTH);
        this.add(content,BorderLayout.CENTER);

    }
}
