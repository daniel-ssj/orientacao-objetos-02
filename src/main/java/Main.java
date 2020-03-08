import exercicios.*;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.setLado(10.5);
        Quadrado q2 = new Quadrado();
        q2.setLado(27.48);

        Retangulo r = new Retangulo();
        r.setAltura(5.1);
        r.setBase(3.7);

        Circulo c = new Circulo();
        c.setRaio(13.45);

        System.out.println(q1.calcularArea());
        System.out.println(q2.calcularArea());
        System.out.println(q1.calcularPerimetro());
        System.out.println(q2.calcularPerimetro());

        System.out.println(q2.getLado());
        System.out.println(q1.getLado());

        System.out.println(r.calcularArea());
        System.out.println(r.calcularPerimetro());

        System.out.println(r.getAltura());
        System.out.println(r.getBase());

        System.out.println(c.calcularArea());
        System.out.println(c.calcularPerimetro());

        System.out.println(c.getRaio());

    }
}
