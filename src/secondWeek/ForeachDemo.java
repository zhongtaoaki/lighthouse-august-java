package secondWeek;

/**
 * foreach
 * 小括号里
 * 变量 ：循环的对象
 */
public class ForeachDemo {
    public static void main(String[] args) {
        
        int[] array = { 2, 5, 1, 78, 10, 20 };
        int total = 0;
        for (int index = 0; index < array.length; index++) {
            //System.out.println(array[index]);
            //total += array[index];
        }

        for (int i : array) {
            total += i;
        }
        System.out.println(total);

        int[][] array2 = { { 2, 5, 1 }, { 78, 10, 20 }, { 2, 34 } };
    
        for(int[] is : array2){
            for (int i : is) {
                System.out.println(i);
                if (i == 10) {
                    break;
                }
            }
        }
    }
}
