
public class Vehiculo
{
    private String matricula;
    private String modelo;
    private String color;
    
    public Vehiculo(String matricula, String modelo, String color){
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }
    public String getMatricula(){
        return matricula;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
    public String avanzar(){
        return "El vehiculo esta avanzando";
    }
    public String frenar(){
        return "El vehiculo esta frenando";
    }
    
    public String mostrarDatos(){
        String res;
        return res = "\nmatricula : "+matricula+
                     "\nmodelo : "+modelo+
                     "\ncolor : "+color;
    }
  
}
