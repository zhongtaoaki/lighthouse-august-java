package firstWeek;

/**
 * 变量
 * 变量的声明
 * 变量的使用
 * 变量的集合（数组）
 * 
 * 变量的运算
 * 
 * 运算符
 * 算术运算符(数进行运算，得到的结果也是数)
 * +-*\/%(模)
 * i++ 会先赋值，再运算
 * 
 * 比较运算符(得到的结果是boolean)
 * <,>,<=,>=,==,!=
 * 
 * 赋值运算符
 * = , +=, -=,*=, %=
 * 
 *  */
public class TokenDemo {

    public static void main(String[] args) {

        int i = 10;
        int j = 3;

        // 1-14
        int k = i % 4; // 0,1,2,3
        System.out.println(k);

        i = i + 1; // 自增 - 11
        j = i++; // 12
        System.out.println(i);// 12
        System.out.println(i++);// 12, i 13
        System.out.println(++i);// 14

        System.out.println(j < i); // 11 < 14 吗
        System.out.println(j == i);// 11 等于 14 吗
        System.out.println(j != i);// 11 不等于 14 吗

        boolean b = j < i;
        System.out.println(b);

        j = 10;
        i = 11;
        j += i;// j = j + i;

        //下面三个式子的含义是一样的
        i = i + 1;
        i++;
        i += 1;
    }
}
