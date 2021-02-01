
package msrc;


public class main5 {

    
    public static void main(String[] args) {
        
        int [] edad;
        
        System.out.println("Tamaño Array : " );
        
        int longitud = Entrada.readInt();
        edad = new int[longitud];
        for(int i = 0; i < longitud; i++){
            System.out.print("Elemento" + (i + i) + "? ");
            edad[i] = Entrada.radInt();
        }
        for(int i=0; i < longitud;i++){
            System.out.println("Elemento" + (i + 1) +":"+ edad[i]);
            edad[i] = Entrada.readInt(); 
        }
    }
    
}
