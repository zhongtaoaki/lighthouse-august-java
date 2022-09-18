package secondWeek;

public class ScopeDemo {
    public static void main(String[] args) {

        int i = 0;
        System.out.println(add(i++));

    }

    static int add(int i) {
        return i+1;
    }

}
