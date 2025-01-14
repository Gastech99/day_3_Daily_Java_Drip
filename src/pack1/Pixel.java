package pack1;

public class Pixel extends Point{
    private int couleur;

    public Pixel(){
        super();
        this.couleur = 0;
    }

    public Pixel(int x, int y, int couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    public void afficher(){
        super.afficher();
        System.out.println("La couleur est de : "+this.couleur);
    }
}
