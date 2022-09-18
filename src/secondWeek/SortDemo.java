package secondWeek;

/**
 * 冒泡排序
 * バブルソート
 */
public class SortDemo {
    public static void main(String[] args) {

        int[] array = { 2, 3, 4, 5, 1 };

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) { // 执行语句 4 * 4 = 16; 4+3+2+1 = 10
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }

        for (int i : array) {
            System.out.println(i); // 1,2,3,4,5
        }
    }
}
