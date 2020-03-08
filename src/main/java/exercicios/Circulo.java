package exercicios;

public class Circulo {
    private Double raio;

    public Double calcularArea(){
        return 3.14 * (raio*raio);
    }

    public Double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }
}