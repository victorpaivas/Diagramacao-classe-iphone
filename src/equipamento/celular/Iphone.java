package equipamento.celular;

import equipamento.internet.NavegadorInternet;
import equipamento.musica.ReprodutorMusical;
import equipamento.telefonia.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusical, Telefone {
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página navegador");
    }

    @Override
    public void adicionarFavoritos() {
        System.out.println("Página adicionada aos favoritos do navegador");
    }

    @Override
    public void copiarTexto() {
        System.out.println("Texto copiado navegador");
    }

    @Override
    public void colarTexto() {
        System.out.println("Texto colado navegador");
    }

    @Override
    public void tocar() {
        System.out.println("Música iniciada");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void parar() {
        System.out.println("Música parada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Volume aumentado música");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Volume diminuido música");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando..");
    }

    @Override
    public void desligar() {
        System.out.println("Ligação encerrada");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de Voz");
    }

    @Override
    public void silenciar() {
        System.out.println("Ligação silenciada");
    }

    @Override
    public void teclado() {
        System.out.println("Digite o número desejado..");
    }

    @Override
    public void vivaVoz() {
        System.out.println("Ligação está no viva voz..");
    }
}
