public abstract class ContaBancaria {
    protected int numeroConta;
    protected double saldo;

    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void setnumeroConta (int numeroConta){
    this.numeroConta = numeroConta;
    }

    public int getnumeroConta (){
        return numeroConta;
    }

    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public double getSaldo (){
        return saldo;
    }

    public void depositar (double valor){
        saldo = saldo + valor;
 }

    public boolean sacar (double valor){
        if (valor > saldo){
            return false;
        } else {
            saldo = saldo - valor;
            return true; 
        }
    }
}