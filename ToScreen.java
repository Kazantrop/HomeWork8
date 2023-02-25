package HomeWork8;

final class ToScreen{                                  //створюю клас, що приймає фігуру, та виводить її назвую. Більше нічого від цього класу не вимагається, тому він final
    public void shapeNameToScreen(Shape shape){
        System.out.println("This shape is a " + shape.getShapeName() + ".");
    }
}