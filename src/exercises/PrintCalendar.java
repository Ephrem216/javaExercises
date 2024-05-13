package exercises;
import javax.swing.JOptionPane;
public class PrintCalendar {

    private final int INITIAL_DAY = 3;
    private final int INITIAL_YEAR = 1800;

    private int year;
    private int month;

    public PrintCalendar(int year, int month){
        this.year = year;
        this.month = month;
    }

    public void printMonth(){
        System.out.println(toString());
    }

    public void showMonth(){
        JOptionPane.showMessageDialog(null, toString());
    }

    public String toString(){
        String box = "  SUN  MON  TUE  WED  THR  FRI  SAT\n";
        int firstDay = getFirstDayOfTheMonth();
        int monthLong = getMonthDuration(month);
        String cell = "     ";
        String row ="";
        int count = 1;
        for(int i = 0; i < firstDay; i++){
            row += cell;
            count++;
        }

        for(int k = 1; k <= monthLong; k++, count++){
            row += String.format("%5s" , k);
            if(count % 7 == 0){
                box += row + "\n";
                row = "";
            }
        }
        box += row + "\n";
        return box;
    }

    public int getDeviationFromYears(){
        return ((year - INITIAL_YEAR) * 365 + getNumberOfLeapYears()) % 7;
    }

    public int getDeviationFromMonths(){
        int days = 0;
        for(int i = 0;i < month; i++){
            days += getMonthDuration(i);
        }
        return days % 7;
    }

    public int getFirstDayOfTheMonth(){
        return (INITIAL_DAY + getDeviationFromMonths() + getDeviationFromYears()) % 7;
    }

    public int getNumberOfLeapYears(){
        int numberOfLeapYears = 0;
        for(int i = INITIAL_YEAR; i < year; i++){
            if(isLeapYear(i)){
                numberOfLeapYears++;
            }
        }
        return numberOfLeapYears;
    }

    public int getMonthDuration(int month){
        if(month == 3 || month == 5 || month == 8 || month == 10)
            return 30;
        else if (month == 1){
            if(isLeapYear(year))
                return 29;
            else
                return 28;
        }
        else
            return 31;
    }

    public boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
