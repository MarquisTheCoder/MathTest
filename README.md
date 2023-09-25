# MathTest

## Problem

Write a function that takes three Integer numbers Number1, Number2, and Number3, and
determines if there is a mathematical operation that will make Number1 (operation) Number2
equal to Number3. If one or more of the 4 common mathematical operations (+,-,*,/) can
complete the function, return the String representation of the mathematical function. If none of
the 4 mathematical operations can make the statement true, return the String "None".
For instance:
public String mathFunction(1,2,3) returns "+",
public String mathFunction(2,2,4) returns "+*", (+ and *)
public String mathFunction(3,-3,-9) returns "*",
public String mathFunction(1,2,-1) returns "-",
public String mathFunction(3,3,1) returns "/",
public String mathFunction(7,1,11) returns "None".
You need not use Scanner to input numbers from the user if you would not like to. You can
simply write a function that takes the appropriate parameters and pass those parameters in the
main method.

## Solution 

```java
 public class Problem {
        public String mathFunction(int factorOne, int factorTwo, int product){
            String allOperators = "";

            if(factorOne == 0 && factorTwo == 0){
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
```
## Site 

<img width="1424" alt="image" src="https://github.com/MarquisTheCoder/MathTest/assets/104405433/53bfbfb0-b101-4831-a2f7-d9d42c3e563b">

