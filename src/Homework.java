public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
int i = 1;
while (i < 10) {
    System.out.print(i + " ");
    i++;}
System.out.println(i);
for ( ; i > 0; i--)
        {System.out.print( i + " ");}
}
public static void task2(){
        int daysInMonth = 31;
        for (int firstFriday = 3; firstFriday <= daysInMonth; firstFriday += 7  )
        {System.out.println( "Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");}
    }

public static void task3(){
        int periodCometa = 79;
        int thisYear = 2022;
        int beforeYear = thisYear - 200;
        int afterYear = thisYear + 100;
        for (int i = 0; i < afterYear ; i += periodCometa)
            if ( i > beforeYear) {
                System.out.println(i);}
    }
}
