package codewars;

public class TimeFormatter {

    private static final int SECONDS_IN_YEAR = 31536000;
    private static final int SECONDS_IN_MONTH =2678400;
    private static final int SECONDS_IN_DAY =86400;
    private static final int SECONDS_IN_HOUR =3600;
    private static final int SECONDS_IN_MINUTE =60;

    public static String formatDuration(int seconds){
        if (seconds == 0){

            return "now";
        }
        String format = String.format("%s,%s", 1, 2);
        return "";

    }
}
