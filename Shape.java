package HomeWork8;

public  abstract class Shape {                    //базовий клас для фігури, яку можна створити де завгодно
    protected abstract String getShapeName();     //метод для виведення назви фігури
}
class Сircle extends Shape {                      //клас кожної фігури
    @Override
    public final String getShapeName() {          //перезаписаний метод, що повертає назву фігури відповідно до її класу
        return "circle";
    }
}
class Quadrangular extends Shape {
    @Override
    public final String getShapeName() {
        return "quadrangular";
    }
}
class Triangle extends Shape {
    @Override
    public final String getShapeName() {
        return "triangle";
    }
}
class Hexagon extends Shape {
    @Override
    public final String getShapeName() {
        return "hexagon";
    }
}
class Trapezoid extends Shape {
    @Override
    public final String getShapeName() {
        return "trapezoid";
    }
}
final class ToScreen{                                  //створюю клас, що приймає фігуру, та виводить її назвую. Більше нічого від цього класу не вимагається, тому він final
    public void shapeNameToScreen(Shape shape){
        System.out.println("This shape is a " + shape.getShapeName() + ".");
    }
}