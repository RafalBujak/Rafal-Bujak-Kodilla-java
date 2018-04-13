package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {
    @Test
    public void testAddDoubleNumbers(){
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        String result = calculator.display.displayValue(calculator.add(5, 8));
        //Then
        Assert.assertEquals("13.0", result);
    }
    @Test
    public void testSubDoubleNumbers() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        String result = calculator.display.displayValue(calculator.sub(5, 8));
        //Then
        Assert.assertEquals("-3.0", result);
    }
    @Test
    public void testMulDoubleNumbers() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        String result = calculator.display.displayValue(calculator.mul(5, 8));
        //Then
        Assert.assertEquals("40.0", result);
    }
    @Test
    public void testDivDoubleNumbers() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        String result = calculator.display.displayValue(calculator.div(5, 8));
        //Then
        Assert.assertEquals("0.625", result);
    }

}
