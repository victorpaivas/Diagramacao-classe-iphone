package equipamento.musica;

public class Ipod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando música no Ipod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no Ipod");
    }

    @Override
    public void parar() {
        System.out.println("Parando música no Ipod");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Ipod");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume da música no Ipod");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume da música no Ipod");
    }
}
