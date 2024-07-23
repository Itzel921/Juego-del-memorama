package Memoramass;

import java.util.Random;

public class Logica20C {

    public int[] getCardNumbers() {
        int[] numbers = new int[20];
        int contador = 0;

        while (contador < 20) {
            Random randum = new Random();
            int NumAleatorio = randum.nextInt(10) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 20; i++) {
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
