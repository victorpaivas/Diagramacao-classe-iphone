package equipamento.telefonia;

public class Phone implements Telefone{
    @Override
    public void ligar() {
        System.out.println("Realizando Ligação");
    }

    @Override
    public void desligar() {
        System.out.println("Ligação Encerrada");
    }

    @Override
    public void atender() {
        System.out.println("Ligaçao atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Escutando correio de Voz");
    }

    @Override
    public void silenciar() {
        System.out.println("Ligação mutada");
    }

    @Override
    public void teclado() {
        System.out.println("Disque um número desejado");
    }

    @Override
    public void vivaVoz() {
        System.out.println("Ligação no VivaVoz");
    }
}
