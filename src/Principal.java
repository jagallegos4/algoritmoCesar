
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menu();
        
    }
    
    public static String codificar(String abecedario, String texto, int desplazamiento){
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
    }
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        String abecedario= "ABCDEFGHIJKLMNOPQRSTUBWXYZ";
        String codificado, decodificado, fraseCodificar, fraseDecodificar;
        int desplazamiento1, desplazamiento2, opcion;
        
        do{
            System.out.println("..*MENU*..");
            System.out.println("1. Codificar Frase");
            System.out.println("2. Decodificar Frase");
            System.out.println("3. Salir");            
            System.out.print("Ingrese una opcion: ");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    sc.nextLine();
                    System.out.println("INGRESE UNA FRASE: ");
                    fraseCodificar = sc.nextLine();
                    System.out.println("INGRESE EL DESPLAZAMIENTO: ");
                    desplazamiento1 = sc.nextInt();
                    codificado=codificar(abecedario,fraseCodificar,desplazamiento1);
                    System.out.println("Frase Codificada: "+codificado);
                    break;                    
                case 2:
                    sc.nextLine();
                    System.out.println("INGRESE UNA FRASE: ");
                    fraseDecodificar = sc.nextLine();
                    System.out.println("INGRESE EL DESPLAZAMIENTO: ");
                    desplazamiento2 = sc.nextInt();
                    sc.nextLine();
                    decodificado=decodificar(abecedario,fraseDecodificar,desplazamiento2);
                    System.out.println("Frase Decodificada: "+decodificado);
                    break;
                case 3:
                    System.out.println("SALISTE DEL MENU\nGRACIAS");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                break;
            }
        }while(opcion!=3);
    }
}
