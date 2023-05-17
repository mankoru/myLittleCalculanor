package com.example.view;

import com.example.controller.listener.listener.ControllerListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    //create variables;

    private JTextField numericFirst = new JTextField(6);
    private JTextField operator = new JTextField(3);
    private JTextField numericSecond = new JTextField(6);
    private JButton calculatedButton = new JButton("calculate");
    private JLabel equalsNumeric = new JLabel("=");
    private JTextField resultField = new JTextField(10);

    //create user interface
    public CalculatorView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(numericFirst);
        calcPanel.add(operator);
        calcPanel.add(numericSecond);
        calcPanel.add(equalsNumeric);
        calcPanel.add(resultField);
        calcPanel.add(calculatedButton);

        this.add(calcPanel);
    }

    public double getFirstNum() {
        String input = numericFirst.getText();
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("Input is not numeric!");
        }
        return Double.parseDouble(input);
    }

    public double getSecondNum() {
        String input = numericSecond.getText();
        if (!input.matches("\\d+")) {
            throw new IllegalArgumentException("don't numeric");
        }
        return Double.parseDouble(input);
    }

    public char getOperator(){
        return operator.getText().charAt(0);
    }

    public void setResult(double result) {
        resultField.setText(Double.toString(result));
    }

    public void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }


    public void addCalculateListener(ActionListener listenForCalcButton) {
        calculatedButton.addActionListener(listenForCalcButton);
    }

}
