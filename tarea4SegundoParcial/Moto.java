
/**
 * Write a description of class Ejemplo3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moto extends Vehiculo
{
    private double cilindraje;
    private int tipo;
    
     public Moto(String matricula, String modelo, String color,int cilindraje,int tipo){
        super(matricula,modelo,color);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }
    /*
        Cilindraje                     Valor a Pagar
      
      Menor a 100cc                     150$ // tipo 1
      de 100 cc a 200cc                 300$ // tipo 1
      Mas de 200cc                      400$ // tipo 1
      MotoCarro                         400$ // tipo 2
     */
                        
    public double calcularValorSoat(){
        double soat = 0;
        if(cilindraje<100){
            soat = 150;
        }
        if(cilindraje>=100 && cilindraje<=200){
            soat = 300;
        }
        if(cilindraje>200){
            soat = 400;
        }
        if(tipo == 2){
            soat = 400;
        }
        return soat;
    }
    
     public String mostrarDatos(){//sobreescribiendo el metodo
        return "La moto tiene "+ super.mostrarDatos()+"\nCilindraje: "+cilindraje;
    }
}
