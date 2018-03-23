package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public void executeExpression(double a, double b, MathExpression mathExpression){
        double result = mathExpression.calculateexpression(a, b);
        System.out.println("Result equals: " + result);
    }
}
