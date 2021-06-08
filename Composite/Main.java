/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Latiude 7480
 */
public class Main {
    public static void main(String args[]){
        
        Participant michael = new Participant("Michael");
        Participant david = new Participant("David");
        Couple couple1 = new Couple("couple1");
        
        couple1.addParticipant(michael);
        couple1.addParticipant(david);
        couple1.setWinner( (Participant) michael);
        
        Participant aron = new Participant("Aron");
        Participant bob = new Participant("Bob");
        Couple couple2 = new Couple("couple2");
        couple2.addParticipant(aron);
        couple2.addParticipant(bob);
        couple2.setWinner(aron);
        
        Couple finalRound = new Couple("final");
        finalRound.addParticipant(couple1);
        finalRound.addParticipant(couple2);
        finalRound.setWinner(couple2);
//        
        System.out.println(finalRound.getInfo());
//        

    }
}
