
package programacion3;


public class Pelota {
    //variables nativas de la clase
    float radio;
    float peso;
    //Contructores
    
    public Pelota()
    {
    radio =100;
    peso=250;
    
    }
    
    public Pelota (float radio, float peso)
    {
        this.radio=radio;
        this.peso=peso;
    }
    //termina constructores
    
    //Metodos
   public float obtenerRadio()
   {
       return radio;
   }
   
   public float obtenerPeso()
   {
     return peso;
   }
   
   public void patearPelota()
   {
       System.out.println("Has pateado la pelota");
   
   }
   public void atraparPelota()
   {
       System.out.println("Has atrapado la pelota");
   }
   
}
