package forthWeek;

/**
 * 接口里只能有抽象方法
 * 1.8之前 不能有属性
 * 抽象类:声明 class关键词加上abstract
 * 抽象里可以写抽象方法和属性的
 * 抽象方法前面一定加上abstract关键词
 * 
 * 有抽象方法的类必须是抽象类
 * 抽象类可以有抽象方法
 * 
 * 抽象类存在的意义就是要被继承的
 * 抽象类是没有构造器的，不可以被new
 * 
 */
public abstract class Number implements Calculate{

    public String value;

}

interface Calculate{

    Calculate multiple(Calculate n);
}
