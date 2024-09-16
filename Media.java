
package media;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Media {


    public static void main(String[] args) {
       List<Integer> list = new ArrayList();
       Scanner entrada = new Scanner(System.in);
       double media;
       int numeros;
       int n;
       int quant;
       System.out.println("Primeiro informe a quantidade de numeros que deseja calcular a media:");
       quant = entrada.nextByte(); 
       System.out.println("Informe um numero:");
       numeros = entrada.nextByte();
       list.add(numeros);
       for (int i = 1; i < quant; i++){
           System.out.println("Imforme mais um numero");
           numeros = entrada.nextByte();
           list.add(numeros);

           
       }
        media = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(media);
                
       }
    }


    


    
    

