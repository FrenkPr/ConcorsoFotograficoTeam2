package ConcorsoFotograficoTeam2;

import javax.sound.sampled.SourceDataLine;

import java.util.Scanner;

public class ConcorsoFotografico {
  public static void main(String[] args) {
    // memorizza voti da 1 a 10 assegnati a 5 foto
    // usa un ciclo for per inserire i voti uno alla volta

    Scanner scannerNum = new Scanner(System.in);
    
    int[] fotoVotiGiudici = new int[5];



    // stampare quali foto sono state premiate, se con voto >= a 8 (con operatore %)
    int fotoNumeroPremiate = 0;
         
    for (int i = 0; i < 5; i++) {
      if (((fotoVotiGiudici[i] % 2) == 0) && (fotoVotiGiudici[i] > 8)) {
        System.out.println("voto foto " + i + ": " + fotoVotiGiudici[i]);
        
        fotoNumeroPremiate++;
      }
    }
      

    // stampare numero totale foto premiate





    // stampare concorso annullato se nessuna foto riceve almeno 6 punti



    scannerNum.close();
  }
}
