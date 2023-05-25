public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    public ContaPoupanca (int numeroConta, double saldo){
        super(numeroConta,saldo);
    } 

    @Override
    public void imprimir (){
        System.out.println("Conta: "+getnumeroConta()+" Saldo:"+getSaldo());
    }

}