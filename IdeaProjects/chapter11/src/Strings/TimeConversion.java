package Strings;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time (hh:mm:ss): ");
        String time = sc.nextLine();
        String _24HourTime = timeConverter(time);
        System.out.println(_24HourTime);
    }

    private static String timeConverter(String time) {
        String[] components = time.split(":");
        String hourComponent = components[0];
        String minuteComponent = components[1];
        String secondsMeridian = components[2];
        String secondsComponent = secondsMeridian.substring(0, 2);
        String meridianComponent = secondsMeridian.substring(2);

        if (meridianComponent.equalsIgnoreCase("AM")){
            if (hourComponent.equals("12")){
                hourComponent = "00";
            }
        } else if(meridianComponent.equalsIgnoreCase("PM")){
            int hourComponentAsInt = Integer.parseInt(hourComponent);
            if (hourComponentAsInt < 12){
                hourComponentAsInt = hourComponentAsInt + 12;
            }
            hourComponent = String.valueOf(hourComponentAsInt);
        }
        return hourComponent+":"+minuteComponent+":"+secondsComponent;
    }
}