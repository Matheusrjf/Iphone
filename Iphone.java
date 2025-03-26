// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone2025 implementando as interfaces necessárias
public class iPhone2025 implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        // Lógica para tocar música
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        // Lógica para pausar música
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Lógica para selecionar uma música
        System.out.println("Selecionando música: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        // Lógica para fazer uma ligação
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        // Lógica para atender uma chamada
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Lógica para iniciar o correio de voz
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        // Lógica para exibir uma página na internet
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        // Lógica para adicionar uma nova aba no navegador
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        // Lógica para atualizar a página no navegador
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        // Exemplo de uso do iPhone2025
        iPhone2025 iphone = new iPhone2025();

        // Usando o Reprodutor Musical
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.tocar();
        iphone.pausar();

        // Usando o Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Usando o Navegador na Internet
        iphone.exibirPagina("https://www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
