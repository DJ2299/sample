/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

/**
 *
 * @author divya
 */
public class Employee {
    private int  hours = 40;
    private double rate = 10;
    private double pay = 400;

    private void calculatePay(){
        pay = hours * rate;
    }
    
    public int getHours() {
        return this.hours;
    }

    public double getRate() {
        return this.rate;
    }

    public double getPay() {
        calculatePay();
        return this.pay;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
