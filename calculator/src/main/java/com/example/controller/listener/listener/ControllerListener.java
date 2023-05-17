package com.example.controller.listener.listener;

import com.example.controller.listener.CalculatorController;
import com.example.model.CalculatorModel;
import com.example.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerListener implements ActionListener {

    private CalculatorModel model;
    private CalculatorView view;

    public ControllerListener(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            model = new CalculatorModel(view.getFirstNum(), view.getSecondNum(), view.getOperator());
            double result = model.getResult();
            view.setResult(result);
        } catch (NumberFormatException ex) {
            view.showErrorDialog("Invalid input");
        }
    }
}
