package thirdWeek;

/**
 * 多态 ポリモーフィズム
 * 1. 继承（实装）关系
 * 2. 重写
 * 3. 父类引用指向子类
 * 
 * 编译看左边
 * 执行看右边
 * 
 * 接口 interface インターフェイス
 * 是一个系统向外暴露的一套规范
 * token
 * 实现token这个接口的类都需要遵守属于token的规范
 * 
 * 接口的声明
 * 接口和类都是引用数据类型
 * interface 接口名{
 * 抽象方法（没有方法体的方法）
 * }
 * 
 * 接口的使用
 * 类 implement 实现，实装
 * 抽象方法存在的意义，就是被重写
 * 当一个类实现了某个接口的时候，他必须重写这个接口的所有的抽象方法
 * 一个不具备抽象方法的类叫做实体类
 * 一个具备了抽象方法的类叫做抽象类
 * 
 * 接口是不可以被实例化（不可以被new的）
 * 使用接口的时候，new实现了这个接口的实体类
 * 多态
 */
public class Polymophism {
    public static void main(String[] args) {

        double a = 4;
        double b = 8;

        Token token = new Add();
        System.out.println(token.calculate(a, b));

        Token[] array = { new Add(), new Minus(), new Multiple(), new Divide() };
        for (Token token2 : array) {
            System.out.println(token2.calculate(a, b));
        }
    }
}

interface Token {
    double calculate(double a, double b);
}

class Add implements Token {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

class Minus implements Token {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

class Multiple implements Token {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

class Divide implements Token {
    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}