package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        
         
        
         
    if ( JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION)==1) {
    	isWeekday=false;
    	
    }else {
    	isWeekday=true;
    }
    
    if( JOptionPane.showConfirmDialog(null, "Is it vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION)==1) {
    	isVacation=false;
    }else { isVacation=true;
    }
    
    System.out.println(isWeekday);
    System.out.println(isVacation);
    
    if(isVacation==true) {
    	JOptionPane.showMessageDialog(null, "Sleep in.");
    }
    
    
    else if(isWeekday==false) {
    	JOptionPane.showMessageDialog(null, "Sleep in.");
    }else {
    	JOptionPane.showMessageDialog(null, "Get up lazybones!");
    }
    }
    


        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }

