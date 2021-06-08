/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author Latiude 7480
 */
public class Couple implements Tournament{
    private ArrayList<Tournament> participants = new ArrayList<>(2);
    
    private Tournament winner;
    private String name;
    
    public Couple(String name){
        this.name = name;
    }
    
    public void addParticipant(Tournament participant){
        participants.add(participant);
    }
    public void removeParticipant(Tournament participant){
        for(int i=0; i<participants.size(); i++){
            Participant player = (Participant) participants.get(i);
            if(player.getInfo() == participant.getInfo()){
                participants.remove(i);
            }
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean setWinner(Tournament participant){
         for(int i=0; i<participants.size(); i++){
            Tournament player =  participants.get(i);
            if(player.getName() == participant.getName()){
                this.winner = participant;
                return true;
            }
        }
         return false;
    }
    
    public String getInfo(){
//        System.out.println("Couple: "+participants.get(0).getInfo()+"-----"+participants.get(1).getInfo()+" Winner is: "+winner.getInfo());
        return winner.getInfo();
    }
}
