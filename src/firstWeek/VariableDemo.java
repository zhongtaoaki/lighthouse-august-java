package firstWeek;

/**
 * 变量 変数
 * 变量的声明 
 * int i = 1;
 * 数据类型 变量名
 * 数据类型 data type
 * 
 * 基本数据类型（8个）
 * 整数型
 * byte 2的8次方 -128 127 (256)
 * short 2byte 
 * int 4byte 正负21亿 默认
 * long 8byte 
 * 
 * 浮点型
 * float 单精度
 * double 双精度 默认
 * 
 * 字符 character
 * char 表达字母，符号，字 2byte 6万多
 * 
 * 布尔型
 * boolean 0 1 true false
 * 
 * 引用数据类型（是有属性和方法的）
 * 首字母大写
 * 类
 * 字符串 String
 * 数组
 * 枚举，接口。。。。
 * 
 * 变量名的规则（必须遵守）
 * 不可以使用 空格 特殊符号 中文 日文
 * 只能使用 英文小写 大写 数字 $ _
 * 开头首字母只能使用英文字母
 * 
 * 变量名的规范（可以不遵守，请你遵守）
 * 请尽可能的让变量名拥有实际意义
 * 使用小驼峰命名原则；首字母小写，后面每一个单词的首字母大写
 * 
 * =
 * 赋值符号
 * 把等号右边的值赋给左边的变量
 * 
 * 变量的使用
 * 一定要先声明，再使用
 * 在本方法内，直接用变量名去使用这个变量
 * 变量的使用，本质上是值的传递
 */
public class VariableDemo {
    public static void main(String[] args) {

        int studentAge;
        studentAge = 28;
        int i = studentAge;
        
        char c = 'あ';
        boolean b = true;

        byte b2 = 127;
        b2 = (byte)i;

        double d =123.9;//会舍弃掉小数部分
        i = (int)d;

        String message = "Hello World";

        System.out.println(message);
        System.out.println(i);
    }
}
