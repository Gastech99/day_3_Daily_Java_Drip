package pack1;

public class Point {
    private int x,y;

    // Les constructeurs par défaut
    public Point(){
        this.x = 10;
        this.y = 5;
    }

    // Les constructeurs avec arguments
    public Point(int x, int y){
        super();
        this.x  = x;
        this.y = y;
    }

    // Les constructeurs par recopie

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public void afficher(){
        System.out.println("La valeur de x = "+x);
        System.out.println("La valeur de y = "+y);
    }
}
