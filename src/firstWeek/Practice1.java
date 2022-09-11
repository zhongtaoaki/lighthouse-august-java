package firstWeek;

public class Practice1 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3 };

        // int temp = array[0];
        // array[0] = array[2];
        // array[2] = temp;

        array[0] = array[0] + array[2];
        array[2] = array[0] - array[2];
        array[0] = array[0] - array[2];

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

    }
}
