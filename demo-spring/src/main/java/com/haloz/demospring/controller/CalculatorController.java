package com.haloz.demospring.controller;

import com.haloz.demospring.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator;

    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }
    @GetMapping
    public String welcome(){
        return calculator.welcome();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam("value1") Integer val1, @RequestParam("value2") Integer val2){
        return String.format("%d + %d = %d", val1, val2, calculator.plus(val1,val2));
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("value1") Integer val1, @RequestParam("value2") Integer val2){
        return String.format("%d - %d = %d", val1, val2, calculator.minus(val1,val2));
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("value1") Integer val1, @RequestParam("value2") Integer val2){
        return String.format("%d * %d = %d", val1, val2, calculator.multiply(val1,val2));
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("value1") Integer val1, @RequestParam("value2") Integer val2){
        return String.format("%d / %d = %d", val1, val2, calculator.divide(val1,val2));
    }
}
