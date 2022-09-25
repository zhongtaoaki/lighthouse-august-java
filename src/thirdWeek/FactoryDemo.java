package thirdWeek;

/**
 * 设计模式 23
 * 工厂模式
 */
public class FactoryDemo {
    public static void main(String[] args) {
        
        ShapeFactory.getShape("三角形").draw();
        ShapeFactory.getShape("正方形").draw();
        ShapeFactory.getShape("圆").draw();
        // 画了个三角形
        // 画了个正方形
        // 画了个圆
    }
}

class ShapeFactory {
    public static Shape getShape(String shapeChineseName) {
        switch (shapeChineseName) {
            case "三角形":
                return new Triangle();
            case "正方形":
                return new Square();
            case "圆":
                return new Circle();
            default:
                return null;
        }
    }
}

interface Shape {
    void draw();
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("画了个三角形");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("画了个正方形");
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("画了个圆");
    }
}
