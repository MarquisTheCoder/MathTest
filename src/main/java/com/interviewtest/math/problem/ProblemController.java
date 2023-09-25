package com.interviewtest.math.problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@RestController
@RequestMapping("/problems")
public class ProblemController {

    @Autowired
    private ProblemHandler problemHandler;

    @PostMapping("/process")
    public  String processJson(@RequestBody String inputJson){
 
       try{
         
         JsonObject jsonObject = JsonParser.parseString(inputJson).getAsJsonObject();
         String problems = jsonObject.get("problem").getAsString();

         String[] numbersArray = problems.split(",");

         int[] intArray = new int[numbersArray.length];


         for (int i = 0; i < numbersArray.length; i++) {
            intArray[i] = Integer.parseInt(numbersArray[i]);
         }
         
         String answer = problemHandler.mathFunction(intArray[0], intArray[1], intArray[2]);
         return String.format("{\"result\":\"%s\"}", answer); 
       }catch(Exception e){
         return String.format("{\"result\": \"error\"}");
       }         
    }
}
