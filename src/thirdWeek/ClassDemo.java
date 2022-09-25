package thirdWeek;

/**
 * 对象 Object オブジェクト
 * 处理数据
 * 
 * 真实世界的抽象（01）
 * 对象就是一条数据
 * 
 * 类 class クラス
 * 类代表的是一类数据，是数据的抽象表达
 * （一类面包）
 * 属性 field フィールド
 * 
 * 类的声明
 * 类的声明位置：在文件内，类外
 * 一个文件内可以声明多个类，但是不规范
 * public class 类名{}
 * 类名要遵守大驼峰命名原则（首字母要大写，之后每个单词的首字母也大写）
 * 类的声明的大括号内可以写属性,方法
 * 属性 field フィールド
 * 属性的本质也是一个变量（成员变量）
 * 类内定义的非static修饰的方法叫做成员方法
 * 变量的生效范围
 * 
 * 
 * 类的使用（对象的声明）
 * 在类内使用
 * 用关键词 new 去使用这个类
 * 数据类型 变量名
 * 类名 变量名 = new 类名（）;
 * 基本数据类型（整型，浮点型，布尔）
 * 引用数据类型（数组，String，类）
 * 属性的使用：用对象.属性名的方式去使用
 * 成员方法的使用：用对象.方法名的方式去使用
 * 
 * 构造方法（构造函数，构造器，constructor コンストラクタ）
 * 以类名作为方法名的方法
 * 本质是在new一个新对象之前，初始化这个对象
 * 入参：可以有，没有参数的构造方法也叫无参构造
 * 返回值：就是这个对象，但是不写
 * 方法体：一个没有参数且没有方法体的构造器叫无参空构造，每个java类默认有一个无参空构造
 * 构造器是可以重载（方法名一致，参数不一致）
 * 当人为声明了一个构造器之后，默认的无参空构造都会失效
 * 
 * 使用static修饰的变量叫做 静态变量
 * 静态变量是属于类的属性，依附于类，而不依附于对象
 * 使用类.属性名去调用
 * 也可以使用对象.属性名去调用
 * 对于静态变量的值的改变，会影响到这个类的所有对象
 * 
 * 使用static修饰的方法叫做 静态方法
 * 静态方法是属于类的方法，依附于类，而不是对象
 * 使用类.方法名去调用
 * 如果调用的位置和声明的位置是在同一个类里，类名可以省略
 * 静态方法是不可以调用非静态变量
 */
public class ClassDemo {

    String number;

    public static void main(String[] args) {

        Cat cat1 = new Cat("张二狗");
        Cat cat2 = new Cat("Alice", 6, "white");

        cat1.age = 2;
        cat1.color = "blue";
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        cat1.bite();
        cat2.bite();  

        System.out.println(Cat.legCount);
    }
}

class Cat {

    public String name;
    public int age;
    public String color;

    public static int legCount = 4;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name; // this 代指的是对象 等于号前面是这个类的属性的值，等号的后面是这个构造器的入参
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void bite() {
        System.out.println(name + "Miao");
    }

    // public static void test(){
    //     System.out.println(name + "Miao");
    // }

}
