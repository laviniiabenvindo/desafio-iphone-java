package componentes;

import java.util.Random;

public class ReprodutorMusical {
 int volume = 25;


 public void tocar() {
  System.out.println("TOCANDO MÚSICA!");
 }

 public void pausar() {
  System.out.println("MÚSICA PAUSADA");
 }

 public void aumentarVolume() {
  volume++;
  System.out.println("Volume: " + volume);

 }

 public void diminuirVolume() {
  volume--;
  System.out.println("Volume: " + volume);
 }

 public String selecionarMusica(String[] musicas) {
  Random random = new Random();
  int indice = random.nextInt(musicas.length); 
  return musicas[indice]; 
  
 }
}
