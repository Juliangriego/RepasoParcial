import java.util.Scanner;
import Clases.*;

public class Principal {
    public static void main (String[] args) {
        ClaseVehiculo auto1 = new ClaseVehiculo("Ford", "Ranger", "AA111UU");
        Scanner sc = new Scanner(System.in);

        //Muestra el coche
        auto1.toString();
        println("Encienda el vehículo con 1");
        do {
            if (sc.nextInt()==1){
            auto1.arranca();
        }
        } while (auto1.getEncendido());

        do{
            println("Menu de opciones:");
            
            println("1. Apagar el auto \t2. Andar con el auto\n3. Tocar bocina \t4. Mostrar kilometraje.");
            switch (sc.nextInt()){
                case 1: auto1.apaga(); break;
                case 2: println("¿Cuántos kilómetros va a recorrer?"); auto1.recorre(sc.nextInt()); break;
                case 3: auto1.tocaBocina();break;
                case 4: auto1.getKilometros();break;
                default: break;
            }
        } while (auto1.getEncendido());
    }
    
    public static void print(String s){System.out.print(s);}
    public static void println(String s){System.out.println(s);}
}