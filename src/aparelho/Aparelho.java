package aparelho;
import equipamento.celular.Iphone;
import java.util.Scanner;

public class Aparelho {

    public static void main(String[] args) {
        Iphone iphone11 = new Iphone();

        iphone11.ligar();
        iphone11.atender();
        iphone11.copiarTexto();
        iphone11.iniciarCorreioVoz();
        iphone11.tocar();
        iphone11.aumentarVolume();

    }
}
