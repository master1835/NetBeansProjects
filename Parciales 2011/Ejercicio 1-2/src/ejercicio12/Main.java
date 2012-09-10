package ejercicio12;

public class Main {

    public static void main(String[] args) {

        Artista artista = new Artista(1,"Salvador Dali");
        Tecnica tecnica = new Tecnica(5,"Oleo sobre lienzo");
        ObraDeArte obra = new ObraDeArte("La persistencia de la memoria",artista,tecnica,24,33);

        Artista artista2 = new Artista(1,"Salvador Dali");
        Tecnica tecnica2 = new Tecnica(5,"Oleo sobre lienzo");

        System.out.println("Titulo: "+obra.getTitulo());
        System.out.println("Es tecnica: "+obra.esTecnica(tecnica2));
        System.out.println("Es artista: "+obra.esArtista(artista2));
        System.out.println("Area: "+obra.calcularArea());

    }

}
