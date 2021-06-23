
public class Volqueta extends Vehiculo
{
   private int capacidadCarga;
   
   public Volqueta(String matricula, String modelo, String color,int capacidadCarga){
        super(matricula,modelo,color);
        this.capacidadCarga = capacidadCarga;
    }
   
   public String cargar(int cantidad){
       String res = "";
       if(cantidad<=capacidadCarga){
            res = "Se realizo la carga completa!!!"; 
        }else{
            res = "No se puede realizar la carga porque supera la capacidad";
        }
        return res;
   }
   public String mostrarDatos(){//sobreescribiendo el metodo
        return "La volqueta tiene "+ super.mostrarDatos()+"\ncapacidad de Carga: "+capacidadCarga;
    }
    
}
