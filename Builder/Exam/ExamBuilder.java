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
public class ExamBuilder {
    ArrayList<Question_Inter> questions = new ArrayList<Question_Inter>();
    public ExamBuilder createTrueFalse(ArrayList<String> options, String answer){
        TrueFalse question = new TrueFalse(options,answer);
        questions.add(question);
        
        return this;
        
    }
    public ExamBuilder createNResponse(ArrayList<String> options, ArrayList<String> answers){
        NResponse question = new NResponse(options,answers);
        questions.add(question);
        
        return this;
        
    }
    public Exam build(){
        return new Exam(questions);
    }
}
