package exercicios;

public class Retangulo {
    private Double base;
    private Double altura;

    public Double calcularArea() {
        return base * altura;
    }

    public Double calcularPerimetro() {
        return 2* (base + altura);
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }
}