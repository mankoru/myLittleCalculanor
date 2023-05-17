package com.example;

import com.example.controller.listener.CalculatorController;
import com.example.model.CalculatorModel;
import com.example.view.CalculatorView;

public class AppCalculator {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(view);

        view.setVisible(true);
    }
}