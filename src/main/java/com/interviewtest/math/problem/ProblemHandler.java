package com.interviewtest.math.problem;

import org.springframework.stereotype.Service;

@Service
public class ProblemHandler{
    public String mathFunction(int factorOne, int factorTwo, int product){
        String allOperators = "";

        if(factorOne == 0 && factorTwo == 0 && product == 0){
            return "+*-/";
        }
        if (factorOne * factorTwo == product){
            allOperators += '*';
        }
        if(factorOne / factorTwo == product){
            allOperators += '/';
        }
        if(factorOne + factorTwo == product){
            allOperators += '+';
        }
        if(factorOne - factorTwo == product){
            allOperators += '-';
        }
        if(allOperators.isBlank()){
            return "None";
        }else{
            return allOperators;
        }
    }
}