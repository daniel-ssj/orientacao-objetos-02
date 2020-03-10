import exercicios.*;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setLimite(1000.00);
        conta1.setSaldo(500.00);
        conta1.setNumero(1);

        Conta conta2 = new Conta();
        conta2.setNumero(2);
        conta2.setSaldo(1500.00);

        //conta1.sacar(600.00);
        //conta1.sacar(900.00);
        //conta1.sacar(100.00);

        conta1.transferir(conta2, 600.00);
        conta1.transferir(conta2, 900.00);
        //conta1.transferir(conta2, 100.00);

        System.out.println(conta1.getSaldo());
    }

}
