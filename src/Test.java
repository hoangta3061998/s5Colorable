public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();
        for (int i = 0 ; i < shapes.length ; i++){
            System.out.println(shapes[i]);
            if (shapes[i] instanceof Square){
                Square square = (Square) shapes[i];
                square.howToColor();
            }
        }
    }
}
