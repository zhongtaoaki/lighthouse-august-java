package sixthWeek;

public final class Demo {
    
    public static final String NAME = "3";

    public final int number;

    public Demo(int number){
        this.number = number;
    }

    public Demo(){
        this.number = 10;
    }

    public static void main(String[] args) {
        
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();

        final int i = 0;
       // i = 1;

        System.out.println(NAME);
    }

    public final void test(){

    }
}
