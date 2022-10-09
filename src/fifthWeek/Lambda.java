package fifthWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * lambda的本质是重写接口里的抽象方法
 * 该接口必须是只有一个抽象方法的接口（函数式接口）
 * Consumer : 有且只有一个入参，但没有返回值
 * Function : 有且只有一个入参，且有一个返回值
 * Supplier : 没有入参，但是有返回值
 * Predicate: 有且只有一个入参，有一个返回值，返回值是boolean
 * Comparator: 有两个入参，返回一个int（正数，负数，0）
 */
public class Lambda {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(27);
        list.add(54);
        list.add(15);
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
        // list.forEach(t -> System.out.println(t));
        list.forEach(integer -> {
            if (integer % 2 == 0) { // 把偶数打印出来
                // System.out.println(integer);
            }
        });

        // 当lambda里的方法体只有一行，且是在调用另一个函数时
        // 如果该函数的入参与返回值规则和该抽象方法一致
        // 可以函数的调用 【方法的主体::方法名】
        // list.forEach(System.out::println);

        // 把所有偶数从大到小输出
        list.stream().filter(t -> t % 2 == 0).sorted((o1, o2) -> o2 - o1).forEach(System.out::println);
    }
}

// 1. 准备一个实装了该接口的类
class Test implements Consumer {

    @Override
    public void accept(Object t) {
        System.out.println(t); // 循环体
    }

}
