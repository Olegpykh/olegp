package lessons.lesson09_10;

public class Lesson1 {


    public static void main(String[] args) {

        int day = 1;
        String dayNane = getDayName(day);
        System.out.println(dayNane);



    }

    private static String getDayName(int day) {
        String result;
        switch (day) {
            case 1: result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result=  "Friday";
                break;
            case 6:
                result= "Saturday";
                break;
            case 7:
                result="Sunday";
                break;


            default: result = "Errow";



        }    return result;


    }




}
