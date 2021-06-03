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
public class TrueFalse implements Question_Inter{
    
    private ArrayList<String> options;
    private String answer;
    
    public TrueFalse(ArrayList<String> options, String answer){
        this.options = options;
        this.answer = answer;
    }
    @Override
    public void statement(String statement) {
        System.out.println("True False Question "+statement); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int weight(int weight) {
        return weight;
    }

    @Override
    public boolean check() {
        for(int i=0;i<options.size();i++){
            if(answer.equals(options.get(i))){
                return true;
            }
        }
        return false;
    }
    
}
