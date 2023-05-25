public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Marcelo", 7500);
        Gerente g = new Gerente ("Marcos",15000,"Florestal");

        f.aumentarSalario(10);
        g.aumentarSalario(10);

        f.obterNome();
        f.obterSalario();
        g.imprimirDados();

        Funcionario.obterTotalFuncionario();
        Funcionario.imprimirTotalFuncionarios();
    }
}
