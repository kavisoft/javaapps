package com.ks.enumurator;


public class EnumTest {
    
    
    public void tellItLikeItIs(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest();
        firstDay.tellItLikeItIs(Day.FRIDAY);
       
    }
}