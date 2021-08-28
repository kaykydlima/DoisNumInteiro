
package doisnumint;

import java.util.Scanner;

public class DoisNumInt {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int x = leia.nextInt();
        System.out.println("Digite o segundo valor: ");
        int y = leia.nextInt();
        
        if(x < y){
            System.out.println(x);
            System.out.println(y);
        }else{
            System.out.println(y);
            System.out.println(x);
        }
    }
    
}
