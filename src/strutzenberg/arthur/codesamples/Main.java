package strutzenberg.arthur.codesamples;

public class Main {

    public static void main(String[] args) {


        //TODO: Convert this into a valid set of unit tests :D!!!!
        String s = "InvalidDateString";
        ICalendarExample calEx=null;


        System.out.println("Error Path Test");
        try {
            calEx= CalendarExample.Create(s);

            System.err.println("Should not see this!!!!");
            //TODO: ProperAbort test handler (again this is actually built into jUnit
        }catch(Exception ex) {//TODO: Make this a better exception handler (Exception is WAY too generic)
            System.err.println("Error Path Test Passes....");
        }

        System.out.println("Happy Path Test");
        s = "9-27-2016";
        try {
            calEx= CalendarExample.Create(s);
            System.out.println(calEx.prettyPrint().toString());

        }catch(Exception ex){
            System.err.println("Should not see this!!!!");
            //TODO: ProperAbort test handler (again this is actually built into jUnit
        }


    }
}
