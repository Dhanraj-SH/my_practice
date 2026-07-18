import java.util.Scanner;

class p121{

    static void daysInMonth(int month, int year) {
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    yield 29;
                else
                    yield 28;
            }
            default -> {
                System.out.println("Invalid month");
                yield -1;
            }
        };
        if (days == -1) return;
        System.out.println("Days = " + days);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();
        daysInMonth(month, year);
    }
}