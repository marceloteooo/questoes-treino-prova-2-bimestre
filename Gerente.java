public class Gerente extends Funcionario {
    private String departamento;

    public Gerente (String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    public void setDepartamento (String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento (){
        return departamento;
    }

    public String obterDepartamento(){
        return departamento;
    }

    public void imprimirDados(){
        System.out.println("Nome do gerente: "+getNome()+" - Salário do gerente: "+getSalario()+" - Departamento do gerente: "+getDepartamento());
    }
}
