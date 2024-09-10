import componentes.AparelhoTelefonico;
import componentes.NavegadorInternet;
import componentes.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        // FUNÇÕES DO IPOD
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        reprodutor.tocar(); // INICIAR MUSICA
        String[] musicas = { "Essa casa é sua", "Rebola pra carai", "Música da Ciderela", "Tropa de elite" }; // PLAYLIST
        String musicaSelecionada = reprodutor.selecionarMusica(musicas);

        System.out.println(musicaSelecionada); // MÚSICA ESCOLHIDA

        reprodutor.aumentarVolume(); // AUMENTAR VOLUME
        reprodutor.diminuirVolume(); // DIMINUIR VOLUME

        reprodutor.pausar(); // PAUSAR MÚSICA

        // FUNÇÕES TELEFONE

        AparelhoTelefonico telefone = new AparelhoTelefonico();

        String telefonema = telefone.ligar("993457767");
        System.out.println(telefonema);
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // FUNÇÕES INTERNET

        NavegadorInternet internet = new NavegadorInternet();

        internet.exibirPagina("https://chatgpt.com");
        internet.adicionarNovaAba();
        internet.atualizarPagina();
    }
}
