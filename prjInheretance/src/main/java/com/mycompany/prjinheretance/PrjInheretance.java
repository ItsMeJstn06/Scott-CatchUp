/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheretance;

/**
 *
 * @author DrxpS
 */
public class PrjInheretance {

    public static void main(String[] args) {
        
        
        SportsStudents sport = new SportsStudents("Justin");
        sport.attendClass();
        sport.submitAssignment();
        sport.playSport();
        
        System.out.println("------------------------------");
        
        MusicStudent music = new MusicStudent("Scott");
        music.attendClass();
        music.MusicInstrument();
        
        System.out.println("------------------------------");
        
        ArtStudents art = new ArtStudents("Clayton");
        art.attendClass();
        art.paint();
        
        System.out.println("------------------------------");
    }
}
