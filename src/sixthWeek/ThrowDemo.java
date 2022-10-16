package sixthWeek;

public class ThrowDemo {

    public static void main(String[] args) {

        try {
            System.out.println(test(0));
            System.out.println(test(1));
        } catch (BusinessException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    static int test(int i) throws BusinessException {

        System.out.println("程序开始了");

        int result = 0;

        if (i <= 10) {
            throw new BusinessException("所给参数不能小于10");
        } else {
            result = 1 / i;
        }

        return result;
    }

}

class BusinessException extends Exception {

    public BusinessException(String s) {
        super(s);
    }
}