public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int currentNum = 0;
        while (currentNum < 10) {
            System.out.print(++currentNum + " ");
        }

        System.out.println();
        for (; currentNum > 0; currentNum--) {
            System.out.print(currentNum + " ");
        }  System.out.println();
    }

    public static void task2() {
        int daysInMonth = 31;
        for (int currentFriday = 3; currentFriday <= daysInMonth; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int periodCometa = 79;
        int thisYear = 2022;
        int start = thisYear - 200;
        int end = thisYear + 100;
        for (int i = 0; i < end; i += periodCometa){
            if (i > start) {
                System.out.println(i);}
            }
    }
}
