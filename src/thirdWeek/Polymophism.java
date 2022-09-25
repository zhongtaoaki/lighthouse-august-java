package thirdWeek;

/**
 * 多态 ポリモーフィズム
 * 1. 继承关系
 * 2. 重写
 * 3. 父类引用指向子类
 * 
 * 编译看左边
 * 执行看右边
 * 
 */
public class Polymophism {
    public static void main(String[] args) {

        double a = 4;
        double b = 8;

        Token token = new Add();
        System.out.println(token.calculate(a, b));

        Token[] array = { new Add(), new Minus(), new Multiple(), new Divide() };
        for (Token token2 : array) {
            //token2.isZero(a, b);
            System.out.println(token2.calculate(a, b));
        }
    }
}

class Token {
    public double calculate(double a, double b) {
        return 0;
    }
}

class Add extends Token {
    public double calculate(double a, double b) {
        return a + b;
    }

    public boolean isZero(double a, double b){
        if (b != 0) {
            return true;
        }else{
            return false;
        }
    }
}

class Minus extends Token {
    public double calculate(double a, double b) {
        return a - b;
    }

    public boolean isZero(double a, double b){
        if (b != 0) {
            return true;
        }else{
            return false;
        }
    }
}

class Multiple extends Token {

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }

    public boolean isZero(double a, double b){
        if (b != 0) {
            return true;
        }else{
            return false;
        }
    }
}

class Divide extends Token {
    public double calculate(double a, double b) {
        return a / b;
    }

    public boolean isZero(double a, double b){
        if (b != 0) {
            return true;
        }else{
            return false;
        }
    }
}