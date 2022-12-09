package model;

public class CalculatorModel {
    private double number1;
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public double plus(){
        return this.number1 + this.number2;
    }
    public double minus(){
        return this.number1 - this.number2;
    }
    public double multiply(){
        return this.number1*this.number2;
    }
    public double divide(){
        return this.number1/this.number2;
    }
    public int giaithua(){
        int r = 1;
        for(int i = 1; i <= (int) this.number1; i++){
            r = r * i;
        }
        return r;
    }
}
