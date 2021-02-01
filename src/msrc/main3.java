
package msrc;


public class main3 {

   
    public static void main(String[] args) {
       int[] numeros = {4,5,10,24,1,9,8};
       int menor = 0;
       int mayor = 0;
       for(int i=0; i<numeros.length;i++){
           if(menor > numeros[i]) menor = numeros[i];
           if(mayor < numeros[i]) mayor = numeros[i];
           
       
       }
       System.out.println("mayor = " + mayor);
       System.out.println("menor = " + menor);
       
       
    }
    
}
