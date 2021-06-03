/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder.Exam;

import java.util.ArrayList;

/**
 *
 * @author Latiude 7480
 */
public class Main {
    public static void main(String args[]){
        ExamBuilder builder = new ExamBuilder();
        Exam exam = builder.createNResponse(new ArrayList<>(), new ArrayList<>())
                           .createTrueFalse(new ArrayList<>(), "answer")
                           .build();
               
    }
}
