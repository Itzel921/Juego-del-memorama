package Memoramass;

import java.util.Random;

public class Logica6C {

    public int[] getCardNumbers() {
        int[] numbers = new int[6];
        int contador = 0;

        while (contador < 6) {
            Random randum = new Random();
            int NumAleatorio = randum.nextInt(3) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 6; i++) {
                if(numbers[i] == NumAleatorio){
                    nvr++;
                }
            }
            
            if(nvr < 2){
                numbers[contador] = NumAleatorio;
                contador++;
            }
        }
        
        return numbers;
    }
}
