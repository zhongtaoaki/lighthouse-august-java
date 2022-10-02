package forthWeek;

/**
 * this
 * 第一种用法：代指调用该非静态方法的对象或者这个构造器即将生成的那个对象
 * 第二种用法：代指这个类的构造器（当在一个构造器里去调用另一个构造器的时候，这个this只能出现在第一行）
 * 
 * super
 * 第一种用法：代指调用该非静态方法的父类对象或者这个构造器即将生成的那个对象的父类对象
 * 第二种用法：代指这个类的父类的构造器（当在一个构造器里去调用另一个构造器的时候，这个this只能出现在第一行）
 * 
 */
public class Student extends Object{

    public String name;
    public int score;
    public int number;

    public Student() {
        super();
    }

    public Student(String name) {
        super(); 
        this.name = name;
    }

    public Student(String name, int number) {
        this(name);
        this.number = number;
    }

    public Student(String name, int score, int number) {
        this(name, number);
        //super.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        Student student1 = new Student("satou");
        Student student2 = new Student("satou", 90);
    }

}

class People{

}