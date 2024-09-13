
package sequencia.de.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenciaDeFibonacci {


    public static void main(String[] args) {
        List num = new ArrayList<>();
        Scanner pergun = new Scanner(System.in);
        int sequencia = 0;
        int anterior = 0;
        int resp;
        for (int i =0; i<36; i++ ) {
          if(i==0){
              sequencia += 1;
              anterior = 0;
          }else{
              sequencia += anterior;
              anterior = sequencia - anterior;
              
          }
        num.add(sequencia);
        
        }
        System.out.println("Informe um numero nque deseja encontrar na sequencia de Fibonacci");
        resp = pergun.nextInt();
        if(num.contains(resp)){
            System.out.println("O numero "+resp+" se encontra na sequencia de Fibonacci");
            System.out.println("Aqui esta alguns dos numeros da seqiencia: "+num);
        }else{
            System.out.println("O numero informado nao se encontra na squencia.");
        }
    
    }
}
