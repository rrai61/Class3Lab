/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ritu
 */
public class WelcomeService {
    private Calendar date = new GregorianCalendar();
    
    private String determineTimeOfDay(Calendar date){
        String timeOfDay ="";
        int hourOfDay = date.get(Calendar.HOUR_OF_DAY);
        
        if(hourOfDay >=0 && hourOfDay <12){
            timeOfDay = "Morning";
        }
        if(hourOfDay >=12 && hourOfDay <17){
            timeOfDay = "Afternoon";
        }
        if(hourOfDay >=17 && hourOfDay <24){
            timeOfDay = "Evening";
        }
        return timeOfDay;
    }
    
    public String createGreeting(String name){
        return "Good" + determineTimeOfDay(date) + " " + name + ". Welcome!";
    }
}
