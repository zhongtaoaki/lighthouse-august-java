package forthWeek;

/**
 * 对于引用数据类型而言，【值】指的地址
 */
public class Clone {
    public static void main(String[] args) {

        int[] array1 = { 0, 1, 2 };
        // int[] array2 = array1; // shallow copy

        // 在堆中开辟一块新的空间 new
        // int[] array2 = new int[array1.length];
        // for (int i = 0; i < array1.length; i++) {
        // array2[i] = array1[i]; // shallow copy
        // }// deep copy

        int[] array2 = array1.clone();// deep copy
        array2[0] = 2;

        int[][] array3 = { { 0, 1, 2 }, { 3, 4, 5 } };
        // int[][] array4 = array3.clone(); // deep copy(shallow copy)
        int[][] array4 = new int[array3.length][];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = array3[i].clone();
        }

        array4[0][0] = 6;
        System.out.println(array3[0][0]);

        System.out.println("array1: ");
        for (int i : array1) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println("array2: ");
        for (int i : array2) {
            System.out.print(i);
        }

        System.out.println(array1);
    }
}
