package secondWeek;

/**
 * Dont Repeat Yourself
 * Method　メソッド
 * 方法的声明和使用
 * 
 * 方法的声明
 * 声明在类内方法外
 * static（静态） 返回值的数据类型 方法名(方法的参数的数据类型 参数名 ){
 * 方法体
 * 在方法体的最后一行写return 把这个的返回值通过return的方式给返回出去
 * }
 * 方法的参数也叫形式参数，
 * 形式参数可以不止一个，甚至是没有
 * 方法的返回值只能是一个
 * 可以没有 数据类型写成void 这个方法可以不写return
 * 
 *   
 * 方法的使用
 * 方法的使用在方法内
 * 在同一类里，用static修饰的方法可以直接使用方法名（）的方式去调用
 * 在（）里给和该方法参数数据类型一致的值
 * 方法在调用之后会有返回值，这个返回值的值会作为这个表达式的字面值
 * 调用方法的时候给的参数必须和形式参数列表保持一致（参数个数，每个参数的数据类型要保持一致,参数的顺序也要保持一致）
 * 
 * 变量的生命周期
 * 在方法内部声明的变量叫做本地变量
 * 本地变量是生命周期在离他最近的大括号内
 * 
 */
public class MethodDemo {
    public static void main(String[] args) {

        int i = 4;
        int result = sqr(i);

        int j = 5;
        int result2 = sqr(j);
        System.out.println(result);
        System.out.println(result2);

        System.out.println(add(1, 2.0));


    }

    static int sqr(int number) {
        return number * number;
    }

    static int add(int a, double b){
        return (int)(a + b);
    }
}
