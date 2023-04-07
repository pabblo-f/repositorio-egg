package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); 
    
        Mascota m1 = new Mascota("pablo chiquito", "chiquito", "perro");
        
        m1.setNombre("pablo chiquito");
        
        m1.pasear(100);
        
        System.out.println(m1);
        
        

    }

    
    
    
}

