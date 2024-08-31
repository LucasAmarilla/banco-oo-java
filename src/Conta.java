public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 0001;
    public static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato() {
        System.out.println("***Extrato conta corrente***");
        System.out.println(String.format("Agencia %d", this.agencia));
        System.out.println(String.format("Numero %d", this.numero));
        System.out.println(String.format("Saldo %d", this.saldo));



    }


}
