import java.util.*;

public class thirdques
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numday =0;
        String monthname = "Invalid details";

        System.out.println("Input the month number: ");
        int month = input.nextInt();

        switch (month)
        {
            case 1:
                monthname = "January";
                numday = 31;
                break;
            case 2:
                monthname = "February";
                numday = 28;
                break;
            case 3:
                monthname = "March";
                numday = 31;
                break;
            case 4:
                monthname = "April";
                numday = 30;
                break;
            case 5:
                monthname = "May";
                numday = 31;
                break;
            case 6:
                monthname = "June";
                numday = 30;
                break;
            case 7:
                monthname = "July";
                numday = 31;
                break;
            case 8:
                monthname = "August";
                numday = 31;
                break;
            case 9:
                monthname = "September";
                numday = 30;
                break;
            case 10:
                monthname = "October";
                numday = 31;
                break;
            case 11:
                monthname = "November";
                numday = 30;
                break;
            case 12:
                monthname = "December";
                numday = 31;
                break;
        }
        System.out.println(monthname + " " + "has" + " " + numday);
    }
}
