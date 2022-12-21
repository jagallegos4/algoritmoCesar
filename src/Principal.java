
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String abecedario= "ABCDEFGHIJKLMNOPQRSTUBWXYZ";
        String codificado;
        System.out.println("ab"+abecedario);
        /*System.out.println("INGRESE UNA FRASE: ");
        String frase = sc.nextLine();
        
        System.out.println("INGRESE EL DESPLAZAMIENTO: ");
        int desplazamiento = sc.nextInt();
        
        codificado=codificar(abecedario,frase,desplazamiento);
        
        System.out.println("frase codificada"+codificado);*/
    }
    
    /*public static String codificar(String abecedario, String texto, int desplazamiento){
        String textoCodificado = "";
        texto = texto.toUpperCase();
        char caracter;
        int posicion;
        for (int i = 0; i < texto.length(); i++) {
            caracter=texto.charAt(i);
            posicion=abecedario.indexOf(caracter);
            
            if (posicion==-1){
                textoCodificado+=caracter;
            }else{
                textoCodificado+= abecedario.charAt((posicion+desplazamiento)%abecedario.length());
            }
            
        }
        return textoCodificado;
    }
    
    public static String decodificar(String abecedario, String texto, int desplazamiento){
        String textodeCodificado = "";
        texto = texto.toUpperCase();
        char caracter;
        int posicion;
        for (int i = 0; i < texto.length(); i++) {
            caracter=texto.charAt(i);
            posicion=abecedario.indexOf(caracter);
            
            if (posicion==-1){
                textodeCodificado+=caracter;
            }else{
                if(posicion-desplazamiento<0){
                    textodeCodificado+= abecedario.charAt(abecedario.length()+(posicion+desplazamiento));
                }else{
                    textodeCodificado+= abecedario.charAt((posicion-desplazamiento)%abecedario.length());
                }
            }
            
        }
        return textodeCodificado;
    }*/
}
