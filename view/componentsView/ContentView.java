package view.componentsView;

import controller.CalculatorController;
import model.CalculatorModel;
import view.MainView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ContentView extends JPanel {
    private JTextField number1;
    private JTextField number2;
    private Font font;
    private ActionListener actionListener;
    private CalculatorModel calculatorModel;
    private JLabel screen;
    public static ContentView getInstance(JLabel screen, Font font){
        return new ContentView(screen,font);
    }
    public ContentView(JLabel screen,Font font){
        this.screen = screen;
        this.actionListener = new CalculatorController(this);
        this.calculatorModel = new CalculatorModel();
        this.font = font;
    }
    public JPanel init(){
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content,BoxLayout.Y_AXIS));

        content.add(this.containerNum1());
        content.add(this.containerNum2());
        content.add(this.cal());
        return content;
    }
    private JPanel containerNum1(){
        JPanel cn1 = new JPanel();
        cn1.setLayout(new FlowLayout());

        JLabel n1 = new JLabel("Số đầu");
        n1.setFont(this.font);
        this.number1 = new JTextField(10);
        this.number1.setFont(this.font);
        cn1.add(n1);
        cn1.add(number1);
        return cn1;
    }
    private JPanel containerNum2(){
        JPanel cn2 = new JPanel();
        cn2.setLayout(new FlowLayout());

        JLabel n2 = new JLabel("Số cuối");
        n2.setFont(this.font);
        this.number2 = new JTextField(10);
        this.number2.setFont(font);
        cn2.add(n2);
        cn2.add(number2);
        return cn2;
    }
    private JPanel cal(){
        JPanel cal = new JPanel();
        cal.setLayout(new GridLayout(3,2));

        JButton plus = new JButton("+");
        plus.setFont(this.font);
        plus.addActionListener(this.actionListener);

        JButton minus = new JButton("-");
        minus.setFont(this.font);
        minus.addActionListener(this.actionListener);

        JButton multiply = new JButton("x");
        multiply.setFont(this.font);
        multiply.addActionListener(this.actionListener);

        JButton divide = new JButton("/");
        divide.setFont(this.font);
        divide.addActionListener(this.actionListener);

        JButton giaithua = new JButton("!");
        giaithua.setFont(this.font);
        giaithua.addActionListener(this.actionListener);

        JButton cancel = new JButton("Xóa màn");
        cancel.addActionListener(this.actionListener);
        cancel.setFont(this.font);
        cancel.setBackground(Color.BLUE);
        cancel.setBorderPainted(false);
        cancel.setForeground(Color.WHITE);

        cal.add(plus);
        cal.add(minus);
        cal.add(multiply);
        cal.add(divide);
        cal.add(giaithua);
        cal.add(cancel);
        return cal;
    }
    public void setValue(){
        this.calculatorModel.setNumber1(Double.parseDouble(this.number1.getText()));
        this.calculatorModel.setNumber2(Double.parseDouble(this.number2.getText()));
    }
    public void plus(){
        this.setValue();
        this.screen.setText("Kết quả:"+this.calculatorModel.plus());
    }
    public void minus(){
        this.setValue();
        this.screen.setText("Kết quả:"+this.calculatorModel.minus());
    }
    public void multiply(){
        this.setValue();
        this.screen.setText("Kết quả:"+this.calculatorModel.multiply());
    }
    public void divide(){
        this.setValue();
        this.screen.setText("Kết quả:"+this.calculatorModel.divide());
    }
    public void cancel(){
        this.number1.setText("");
        this.number1.setText("");
        this.screen.setText("Màn hình kết quả");
    }
    public void giaithua(){
        this.calculatorModel.setNumber1(Double.parseDouble(this.number1.getText()));
        this.screen.setText("Kết quả:"+this.calculatorModel.giaithua());
    }
}
