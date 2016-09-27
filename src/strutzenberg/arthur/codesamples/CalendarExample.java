package strutzenberg.arthur.codesamples;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by astrutzenberg on 9/27/2016.
 */
public class CalendarExample implements ICalendarExample {

    private int month;
    private int year;


    public static ICalendarExample Create(String inputString)
    {
        CalendarExample c = new CalendarExample();

        return c;
    }

    protected CalendarExample ()
    {
        throw new UnsupportedOperationException("Method left as an exercise to the reader(and I did not want to reference commons lang for NotImplementedException)");
    }

    /**
     * Returns the index that the first day of the month will fall on....either do this explicitly, or if you area allowed
     * I'd just utilize some of the built in java libs (if you are masochistic)...or not (looks like java v8 improved this slightly)
     *
     * To be honest real code makes use of libs like: https://commons.apache.org/proper/commons-lang/javadocs/api-2.6/org/apache/commons/lang/time/DateUtils.html
     * (as references in the code) to make this stuff a LOT easier.
     * @param year
     * @param month
     * @return index (0=Sunday....6=Saturday)
     */
    private int getIndexOfFirstDayOfMonth(int year, int month)
    {
        throw new UnsupportedOperationException("Method left as an exercise to the reader(and I did not want to reference commons lang for NotImplementedException)");
    }

    /**
     * This is where the ugly formula to calculate the days in the month exists...either do this explicitly, or if you area allowed
     * I'd just utilize some of the built in java libs (if you are masochistic)...or not (looks like java v8 improved this slightly)
     *
     * To be honest real code makes use of libs like: https://commons.apache.org/proper/commons-lang/javadocs/api-2.6/org/apache/commons/lang/time/DateUtils.html
     * (as references in the code) to make this stuff a LOT easier.
     *
     * @param year
     * @param month
     * @return
     */
    private int getDaysInMonth(int year,int month)
    {
        throw new UnsupportedOperationException("Method left as an exercise to the reader(and I did not want to reference commons lang for NotImplementedException)");
    }

    private String[] getNumbersWithProperStartPadding(int year,int month)
    {
        int dayOneIdx= getIndexOfFirstDayOfMonth(year,month);
        int daysInMonth = getDaysInMonth(year,month);
        String[] output = new String[daysInMonth+ dayOneIdx];

        int i=0;
        for(; i< dayOneIdx;++i)
        {
            output[i]="   ";//TODO: Magic strings are for the devil...make this string a constant
        }
        for(int j=1; j<=daysInMonth;++i,++j){
            output[i]=String.format("%3d",j);
        }

        return output;
    }

    private String getHeader(){

        return "SUN MON TUES WED THR FRI SAT";
    }

    @Override
    public StringBuilder prettyPrint() {
        StringBuilder sb= new StringBuilder();
        sb.append(getHeader());
        sb.append(System.getProperty("line.separator"));

        String[] output= getNumbersWithProperStartPadding(year,month);

        for(int i=0;i<output.length;++i){
            if(i%7 == 0 && i>0){
                sb.append(System.getProperty("line.separator"));
            }
            sb.append(output[i]);
            if(i%7 !=6){ //only add a space unless we are the final day of the week (idx 7)
                sb.append(" ");
            }
        }

        return sb;
    }
}
