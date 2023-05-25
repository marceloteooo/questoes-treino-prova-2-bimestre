public class Funcionario {
    private String nome;
    private double salario;
    private static int totalFuncionario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSalario (double salario){
        this.salario = salario;
    }

    public double getSalario (){
        return salario;
    }

    public static int obterTotalFuncionario(){
        totalFuncionario +=1;
        return totalFuncionario;
    }
    public void obterNome(){
        System.out.println("Nome do funcionário: "+getNome());
    }

    public void obterSalario(){
        System.out.println("Salário do funcionário: "+getSalario());
    }

    public void aumentarSalario(double porcentagem){
        salario = salario + (salario*(porcentagem/100));
    }

    public static void imprimirTotalFuncionarios(){
        System.out.println("Total de funcionários cadastrados: "+obterTotalFuncionario());
    }
}