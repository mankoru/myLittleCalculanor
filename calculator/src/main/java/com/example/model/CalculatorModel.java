package com.example.model;

public class CalculatorModel {

    // declare variables
    private final double operand1;
    private final double operand2;
    private final char operator;
    private final double result;

    //create constructor
    public CalculatorModel(double operand1, double operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
        this.result = calculation(operand1, operand2, operator);
    }

    //get calculations result
    public double calculation(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public double getOperand1(){
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public char getOperator() {
        return operator;
    }

    public double getResult() {
        return result;
    }
}
