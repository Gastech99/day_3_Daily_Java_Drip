package pack1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        Point p1= new Point();
        Point p2= new Point(5, 9);
        Point p3= new Point(p2);
        Pixel px1 = new Pixel();
        Pixel px2 = new Pixel(2, 8, 5);

        p1.afficher();
        p2.afficher();
        p3.afficher();
        px1.afficher();
        px2.afficher();
    }
}