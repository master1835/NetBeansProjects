package ejercicio12;

public class ObraDeArte {
    private String titulo;
    private Artista artista;
    private Tecnica tecnica;
    private double altura;
    private double ancho;

    public ObraDeArte(String titulo, Artista artista, Tecnica tecnica, double altura, double ancho) {
        this.titulo = titulo;
        this.artista = artista;
        this.tecnica = tecnica;
        this.altura = altura;
        this.ancho = ancho;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public boolean esTecnica(Tecnica tecnica) {
        return this.tecnica.getIdTecnica() == tecnica.getIdTecnica();
    }

    public boolean esArtista(Artista artista) {
        return this.artista.getIdArtista() == artista.getIdArtista();
    }

    public double calcularArea() {
        return ancho*altura;
    }

}
