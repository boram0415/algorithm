import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        StringBuilder sb = new StringBuilder();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DATE);
        sb.append(year).append("-");
        sb.append(month / 10 == 0 ? "0"+month : month).append("-");
        sb.append(day / 10 == 0 ? "0" + day : day);
        System.out.println(sb);
    }
}
