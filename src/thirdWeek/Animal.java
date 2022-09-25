package thirdWeek;

/**
 * 继承
 * extends
 * 子类(サブクラス)
 * 父类(超类 super class スーパークラス)
 * 
 * 子类会拥有父类的非私有属性和非私有方法
 * 
 * 重写
 * 子类对父类方法的重新实现
 * 方法名和入参和返回值都得是一样的
 * 
 * java是没有多继承的
 */
public class Animal {

    public Animal(String name) {
    }

    public Animal(){}

    public String name;
    public int age;

    public void bite() {

    }

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.name = "吱吱";
        bird.age = 1;
        bird.featherColor = "Red";
        bird.bite();
        bird.bite("Hello");

        Bird bird1 = bird;
        Animal animal = bird;

    }
}

class Bird extends Animal {

    public String featherColor;

    public void fly() {

    }

    public void bite() {
        System.out.println(name + "在吱吱叫");
    }

    public void bite(String hello) {
        System.out.println(name + "在学你：" + hello);
    }
}
