/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.models.Operation;
import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Calculator;
import core.models.storage.History;
import java.util.ArrayList;

/**
 *
 * @author cande
 */
public class CalculatorController {

    public static Response addOperation(String aText, String bText) {
        try {
            double aNumber = Double.parseDouble(aText), bNumber = Double.parseDouble(bText);
           
            Response validation = validate(aNumber, bNumber, aText, bText);
            if(validation.getStatus() != Status.OK ){
                return validation;
            }
            
            History history = History.getInstance();

            Calculator calculator = new Calculator();

            history.addOperation(new Operation(aNumber, bNumber, "+", calculator.add(aNumber, bNumber)));
            
            return new Response("OK", Status.CREATED, calculator.add(aNumber, bNumber));
        
            
        } catch (Exception ex) {
            return new Response("Ha ocurrido un error inesperado", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
   private static Response validate(double a, double b, String at, String bt){
        try {
                a = Double.parseDouble(at);

            } catch (NumberFormatException ex) {
                return new Response("No se pueden introducir caracteres en el primer campo", Status.BAD_REQUEST);
            }

            try {
                b = Double.parseDouble(bt);
            } catch (NumberFormatException ex) {
                return new Response("No se pueden introducir caracteres en el primer campo", Status.BAD_REQUEST);
            }
            if (at.equals("")) {
                return new Response("El primer numero de texto esta vacio.", Status.BAD_REQUEST);
            }

            if (bt.equals("")) {
                return new Response("El segundo numero de texto esta vacio.", Status.BAD_REQUEST);
            }
            
            return new Response("OK", Status.OK);
       
         
   }
   
    public static Response subtractOperation(String aText, String bText) {
        try {
            double aNumber = Double.parseDouble(aText), bNumber = Double.parseDouble(bText);
           
            Response validation = validate(aNumber, bNumber, aText, bText);
            if(validation.getStatus() != Status.OK ){
                return validation;
            }
            
            History history = History.getInstance();

            Calculator calculator = new Calculator();

            history.addOperation(new Operation(aNumber, bNumber, "-", calculator.subtract(aNumber, bNumber)));
            
            return new Response("OK", Status.CREATED, calculator.subtract(aNumber, bNumber));
        
            
        } catch (Exception ex) {
            return new Response("Ha ocurrido un error inesperado", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
     public static Response multiplyOperation(String aText, String bText) {
        try {
            double aNumber = Double.parseDouble(aText), bNumber = Double.parseDouble(bText);
           
            Response validation = validate(aNumber, bNumber, aText, bText);
            if(validation.getStatus() != Status.OK ){
                return validation;
            }
            
            History history = History.getInstance();

            Calculator calculator = new Calculator();

            history.addOperation(new Operation(aNumber, bNumber, "*", calculator.multiply(aNumber, bNumber)));
            
            return new Response("OK", Status.CREATED, calculator.multiply(aNumber, bNumber));
        
            
        } catch (Exception ex) {
            return new Response("Ha ocurrido un error inesperado", Status.INTERNAL_SERVER_ERROR);
        }
    }
     
     public static Response divideOperation(String aText, String bText) {
        try {
            double aNumber = Double.parseDouble(aText), bNumber = Double.parseDouble(bText);
           
            Response validation = validate(aNumber, bNumber, aText, bText);
            if(validation.getStatus() != Status.OK ){
                return validation;
            }
            
            if(bNumber == 0){
                return new Response("No se puede dividir entre 0",Status.BAD_REQUEST);
            }
   
            History history = History.getInstance();

            Calculator calculator = new Calculator();

            history.addOperation(new Operation(aNumber, bNumber, "/", calculator.divide(aNumber, bNumber)));
            
            return new Response("OK", Status.CREATED, calculator.divide(aNumber, bNumber));
        
            
        } catch (Exception ex) {
            return new Response("Ha ocurrido un error inesperado", Status.INTERNAL_SERVER_ERROR);
        }
    }
     
     public static Response potencyOperation(String aText, String bText) {
        try {
            double aNumber = Double.parseDouble(aText), bNumber = Double.parseDouble(bText);
           
            Response validation = validate(aNumber, bNumber, aText, bText);
            if(validation.getStatus() != Status.OK ){
                return validation;
            }
   
            History history = History.getInstance();

            Calculator calculator = new Calculator();

            history.addOperation(new Operation(aNumber, bNumber, "^", calculator.potency(aNumber, bNumber)));
            
            return new Response("OK", Status.CREATED, calculator.potency(aNumber, bNumber));
        
            
        } catch (Exception ex) {
            return new Response("Ha ocurrido un error inesperado", Status.INTERNAL_SERVER_ERROR);
        }
    }
     
     public static ArrayList<Operation> getOperations() {
        return History.getInstance().getOperations();
    }
    
    

}
