import java.time.LocalDate;
import java.util.Scanner;

class p141{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek());
    }
}