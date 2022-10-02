package forthWeek;

/**
 * == 比的是值
 * 引用数据类型来说，值就是地址
 * 
 * 当需要比较两个引用数据类型的值的时候
 * 使equals方法
 */
public class Equals {

    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 1;

        System.out.println(number1 == number2);

        Student student1 = new Student("satou", 80, 20);
        Student student2 = new Student("satou", 80, 20);

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        System.out.println(student1.name.equals(student2.name));
        System.out.println(student1.name == student2.name);

    }
}
