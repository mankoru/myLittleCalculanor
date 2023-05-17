package com.example.controller.listener;

import com.example.controller.listener.listener.ControllerListener;
import com.example.model.CalculatorModel;
import com.example.view.CalculatorView;

public class CalculatorController {


    private CalculatorModel model;
    private CalculatorView view;



    public CalculatorController(CalculatorView view){
        this.view = view;


        this.view.addCalculateListener(new ControllerListener(view, model));
    }
}
