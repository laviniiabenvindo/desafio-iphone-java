package componentes;

public class AparelhoTelefonico {
 boolean atendida = false;
 public String ligar(String numero){
  return "Discando para " + numero;
 }

 public void atender(){
  System.out.println("CHAMANDO...");
 }

 public void iniciarCorreioVoz(){
 if (atendida == false) {
  System.out.println("CORREIO DE VOZ INICIADA");
 } else{
  System.out.println("LIGAÇÃO FINALIZADA");
 }
 }
}