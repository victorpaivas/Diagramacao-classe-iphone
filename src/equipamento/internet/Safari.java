package equipamento.internet;

public class Safari implements NavegadorInternet {
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Safari");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no Safari");
    }

    @Override
    public void adicionarFavoritos() {
        System.out.println("Página adicionada nos favoritos");
    }

    @Override
    public void copiarTexto() {
        System.out.println("Texto copiado do Safari");
    }

    @Override
    public void colarTexto() {
        System.out.println("Texto colado no Safari");
    }
}
