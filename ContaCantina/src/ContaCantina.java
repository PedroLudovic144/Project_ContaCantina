public class ContaCantina {
    private  TipoContaEnum tipoConta;
    private double saldo;
    private double limite;
    private double saldominimo;
    public  ContaCantina(double valor){
        this.saldo = saldo;
        this.tipoConta = TipoContaEnum.ALUNO;
        this.saldominimo = 10.0;
    }
    public ContaCantina(TipoContaEnum tipoConta, double saldo){
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        if(tipoConta.equals(TipoContaEnum.PROFESSOR)){
            this.limite = 100.0;
        }
    }
    public void  emitirAlertaSaldoBaixo(){
        if (this.saldo <= this.saldominimo){
            System.out.println("Alerta de saldo baixo" + saldo);
        }
        else {
            System.out.println("Saldo: R$"+ saldo);
        }

    }
    public void debitar(double valor){
        if (tipoConta.equals(TipoContaEnum.DIRETO)){
            this.saldo -= valor;
        }
        if (tipoConta.equals(TipoContaEnum.PROFESSOR)&& saldo +limite>= valor)
        {
            this.saldo -= valor;
            emitirAlertaSaldoBaixo();
        }
        else {

        }
    }
    public void creditar(double valor){
        this.saldo  += valor;
        if(tipoConta.equals(TipoContaEnum.ALUNO)){

        }

    }
    public  void emitir(double valor){

    }

    public TipoContaEnum getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoContaEnum tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldominimo() {
        return saldominimo;
    }

    public void setSaldominimo(double saldominimo) {
        this.saldominimo = saldominimo;
        emitirAlertaSaldoBaixo();
    }
}
