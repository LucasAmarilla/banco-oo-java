public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***Extrato conta corrente***");
        System.out.println(String.format("Agencia %d", super.agencia));
        System.out.println(String.format("Numero %d", super.numero));
        System.out.println(String.format("Saldo %d", super.saldo));



    }


}
