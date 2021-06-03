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
public class NResponse implements Question_Inter{
    private ArrayList<String> options;
    private ArrayList<String> answers;
    
    public NResponse(ArrayList<String> options, ArrayList<String> answers){
        this.options = options;
        this.answers = answers;
    }
    @Override
    public void statement(String statement) {
        System.out.println("N Response Question: "+statement);
    }

    @Override
    public int weight(int weight) {
        return weight;
    }

    @Override
    public boolean check() {
        int answer_right = 0;
        for(int i=0;i<options.size();i++){
            for(int j=0;j<answers.size();j++){
                if(options.get(i)==answers.get(j)){
                    answer_right+=1;
                }
            }
        }
        if(answer_right==answers.size()){
            return true;
        }
        else{
            return false;
        }
    }
    
}
