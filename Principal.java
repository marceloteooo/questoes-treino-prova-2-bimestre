public class Principal {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente (001,100,500);

        ContaPoupanca cp1 = new ContaPoupanca (002,150);

        cc1.depositar(100);
        cc1.sacar(50);
        cc1.imprimir();

        cp1.depositar(50);
        cp1.sacar(25);
        cp1.imprimir();
        System.out.println("Marcelo");
    }
}
