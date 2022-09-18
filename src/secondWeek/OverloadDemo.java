package secondWeek;

/**
 * 方法的重载（overload オーバーロード）
 * 两个或以上的方法，方法名一致，参数不一致就形成了重载
 * 参数不一致：
 *  参数的数量不一样
 *  参数的数据类型不一致
 *  参数的顺序不一致
 */
public class OverloadDemo {
    
    public static void main(String[] args) {
        
        System.out.println(add(1, 2));
        System.out.println(add(1, 2.1));
    }

    static double add(int a , int b){
        return a + b;
    }

    static double add(int a , double b){
        return a + b;
    }

}
