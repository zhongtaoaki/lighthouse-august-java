package forthWeek;

public class Practice {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(3, 4);
        //Fraction f3 = f1.multiple(f2);
        System.out.println(f1.multiple(f2).toString());
    }
}

class Fraction extends Number{

    public int numerator; // 分子
    public int denominator; // 分母

    // 构造器 默认的无参空构造会失效
    public Fraction(int numerator, int denominator) {
        
        if (denominator == 0) {
            System.out.println("分母不能为零");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    // public Fraction() {
    // }

    // 非静态方法属于对象 对象.方法名的方式去调用
    public Fraction multiple(Fraction f) {

        // f1 * f2 = f3
        // Fraction result = new Fraction();
        // result.numerator = this.numerator * f.numerator;
        // result.denominator = this.denominator * f.denominator;

        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }

    // 非静态方法属于对象 对象.方法名的方式去调用
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    @Override
    public Calculate multiple(Calculate n) {
        Fraction f = (Fraction)n; 
        return new Fraction(this.numerator * f.numerator, this.denominator * f.denominator);
    }


}