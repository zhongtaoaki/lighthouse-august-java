package thirdWeek;

/**
 * 访问修饰符（アクセス修飾子）
 * public: 可以被整个项目内的任意位置所看见
 * （default）:可以被包内的任意位置所看见
 * private :只能在本类中被看见
 * 
 * 访问修饰符可以修饰 类，成员变量，成员方法，构造器
 * 
 * 把属性值私有化，再通过public的方法将属性的权限有限的暴露的思想，封装（カプセル）
 */
public class AccessDemo {
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("旺财");
        System.out.println(dog.getName());
    }
}

class Dog{

    private String name;//保护数据，访问权限（读和写）

    //开放了一个读取的权限
    public String getName(){
        return name;
    }

    //开放了一个写入的权限
    public void setName(String name){
        this.name = name;
    }
}