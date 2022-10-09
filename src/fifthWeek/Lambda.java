package fifthWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * lambda的本质是重写接口里的抽象方法
 * 该接口必须是只有一个抽象方法的接口（函数式接口）
 * Consumer : 有且只有一个入参，但没有返回值
 */
public class Lambda {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(20);
        list.add(54);
        list.add(12);
        list.add(2);

        // 1.入参是一个接口，准备一个实装了该接口的类
        // 2.准备的实例
        // Consumer temp = new Test();

        // 匿名类
        // Consumer temp2 = new Consumer<Integer>() {
        // @Override
        // public void accept(Integer t) {
        // System.out.println(t); // 循环体
        // }
        // };
        // 3.把这个实例传给该方法
        // lambda表达式，箭头函数 把方法作为入参传给另一个方法
        list.forEach(t -> System.out.println(t));

    }
}

// 1. 准备一个实装了该接口的类
class Test implements Consumer {

    @Override
    public void accept(Object t) {
        System.out.println(t); // 循环体
    }

}
