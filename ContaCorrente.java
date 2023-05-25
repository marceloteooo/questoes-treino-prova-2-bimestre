public class ContaCorrente extends ContaBancaria implements Imprimivel{
    protected double limiteChequeEspecial;
    public ContaCorrente (int numeroConta, double saldo, double limiteChequeEspecial){
        super(numeroConta,saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void setlimiteChequeEspecial (double limiteChequeEspecial){
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getlimiteChequeEspecial (){
        return limiteChequeEspecial;
    }

    public double obterLimiteCheque (){
        return limiteChequeEspecial;
    }

    @Override
    public void imprimir (){
        System.out.println("Conta: "+getnumeroConta()+" Saldo:"+getSaldo()+"Limite: "+obterLimiteCheque());
    }

}
