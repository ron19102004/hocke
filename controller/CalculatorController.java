package controller;

import view.componentsView.ContentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {
    private ContentView contentView;
    public CalculatorController(ContentView contentView){
        this.contentView = contentView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        switch (src){
            case "+" -> this.contentView.plus();
            case "-" -> this.contentView.minus();
            case "x" -> this.contentView.multiply();
            case "/" -> this.contentView.divide();
            case "Xóa màn" -> this.contentView.cancel();
            case "!" -> this.contentView.giaithua();
        }
    }
}
