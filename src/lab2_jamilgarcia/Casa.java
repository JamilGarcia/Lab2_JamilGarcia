package lab2_jamilgarcia;

public class Casa {
    
    private int n_casa; 
    private int n_bloque; 
    private String color; 
    private int ancho; 
    private int largo; 
    private String comprada; 
    private int pisos; 
    private int banos; 
    private int cuartos; 
    private String dueño; 
    private String ingeniero; 
    
    public Casa(){
        
    }

    public Casa(int n_casa, int n_bloque, String color, int ancho, int largo, String comprada, int pisos, int banos, int cuartos, String dueño, String ingeniero) {
        this.n_casa = n_casa;
        this.n_bloque = n_bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.comprada = comprada;
        this.pisos = pisos;
        this.banos = banos;
        this.cuartos = cuartos;
        this.dueño = dueño;
        this.ingeniero = ingeniero;
    }

    public int getN_casa() {
        return n_casa;
    }

    public void setN_casa(int n_casa) {
        this.n_casa = n_casa;
    }

    public int getN_bloque() {
        return n_bloque;
    }

    public void setN_bloque(int n_bloque) {
        this.n_bloque = n_bloque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getComprada() {
        return comprada;
    }

    public void setComprada(String comprada) {
        this.comprada = comprada;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }

    @Override
    public String toString() {
        return "Numero de Casa: " + n_casa + "\n" 
                + "Numero De Bloque: " + n_bloque + "\n" 
                + "Color: " + color +  "\n" 
                + "Ancho: " + ancho +  "\n" 
                + "Largo: " + largo +  "\n" 
                + "Comprada: " + comprada +  "\n" 
                + "Pisos: " + pisos +  "\n" 
                + "Baños: " + banos +  "\n" 
                + "Cuartos: " + cuartos +  "\n" 
                + "Dueño: " + dueño +  "\n" 
                + "Ingeniero" + ingeniero ;
    }
    
    
    
}
