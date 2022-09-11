package firstWeek;

/**
 * 数组 Array 配列
 * 同一种数据类型的元素的集合
 * 数组的元素的数据类型有且只能有一个
 * 
 * 数组的声明
 * 数据类型 变量名 = 初始值；
 * 
 * 数组的使用
 * 对于数组的使用，用下标的方式去操作该数组的每个元素
 * 数组的变量名[下标Index]
 * 数组的下标从零开始数，最后一个元素的下标是数组长度-1
 * 数组越界异常
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
 * Index 3 out of bounds for length 3
 * at firstWeek.ArrayDemo.main(ArrayDemo.java:26)
 * 
 * 数组的长度是不可变的
 * 
 */
public class ArrayDemo {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3 };
        int[] array2 = new int[3];
        System.out.println(array2[0]);
        array2[0] = 10;
        array2[1] = 11;
        array2[2] = 12;

        System.out.println(array2[0]);
        System.out.println(array2[array.length - 1]);

        System.out.println(array.length);

        // array[3] = 9;
        // System.out.println(array[2]);

        // System.out.println(array); //[I@2f92e0f4 地址

        int[][] array3 = {{1,2,3},{4,5}};
        int[][] array4 = new int[2][3];

        System.out.println(array3[0][0]);
        System.out.println(array3[0][1]);
        System.out.println(array3[0][2]);
        System.out.println(array3[1][0]);
        System.out.println(array3[1][1]);
        
        System.out.println(array3[1][2]);

    }
}
