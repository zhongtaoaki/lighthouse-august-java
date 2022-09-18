package secondWeek;

/**
 * for循环
 * 小括号里写迭代器的迭代方式和边界值
 */
public class ForDemo {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                // System.out.println(i);
            }
            i++;
        }

        for (int j = 0; j <= 20; j++) {
            if (j % 2 == 1) {
                // System.out.println(j);
            }
        }

        // 循环数组
        int[] array = { 2, 5, 1, 78, 10, 20 };
        int total = 0;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
            total += array[index];

        }
        System.out.println(total);
        // int index = 0;
        // while (index < array.length) {
        // System.out.println(array[index]);
        // index++;
        // }

        // 二维数组
        int[][] array2 = { { 2, 5, 1 }, { 78, 10, 20 }, { 2, 34 } };
        for (int x = 0; x < array2.length; x++) {
            for (int y = 0; y < array2[x].length; y++) {
                System.out.println(array2[x][y]);
            }
        }
    }
}
