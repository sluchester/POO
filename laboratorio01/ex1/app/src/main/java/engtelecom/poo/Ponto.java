package engtelecom.poo;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distancia(Ponto b){
        double da = b.x-this.x;
        double db = b.y-this.y;
        double pda = Math.pow(da, 2);
        double pdb = Math.pow(db, 2);
        return Math.sqrt(pda+pdb);
    }
}
