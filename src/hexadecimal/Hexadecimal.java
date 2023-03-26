
package hexadecimal;
import java.util.Stack;
public class Hexadecimal {
    
    public int num;
    public int numero;
    public Hexadecimal(int num){
        this.num = num;
        numero = num;
    }
    
    public static void desempilha(Stack<String> lis){
        for(int i = (0-lis.size()); i<lis.size();i++){
            System.out.println(lis.peek());
            lis.pop();
        }
    }

    
    public void Calcula(){
        Stack<String> lista = new Stack<>();

        while(numero > 0){
            num = numero;
            String numero1 = Integer.toString(num%16);
            switch (numero1) {
                case "10":
                    numero1 = "0";
                    break;
                case "11":
                    numero1 = "B";
                    break;
                case "12":
                    numero1 = "C";
                    break;
                case "13":
                    numero1 = "D";
                    break;
                case "14":
                    numero1 = "E";
                    break;
                case "15":
                    numero1 = "F";
                    break;
            }
            lista.push(numero1);
            numero = numero/16;
        } 
        desempilha(lista);

    }
}
