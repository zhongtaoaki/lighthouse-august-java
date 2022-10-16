package sixthWeek;

public class ThreadDemo {

    public static int i = 1;

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("10"));

        thread.start();
    }
}


