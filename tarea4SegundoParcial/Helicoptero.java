
public class Helicoptero extends Vehiculo
{
    private int numeroHelices;
    
    public Helicoptero(String matricula, String modelo, String color,int numeroHelices){
        super(matricula,modelo,color);
        this.numeroHelices = numeroHelices;
    }

    public String despegar(){
        String res = "El avion despego despues de avanzar sobre la pista";
        return res;
    }
    
    public String aterrizar(){
        String res = "El avion aterrizo sobre la pista de aterrizaje";
        return res;
    }
    public String mostrarDatos(){//sobreescribiendo el metodo
        return "El helicoptero tiene "+ super.mostrarDatos()+"\nnumero de Helices: "+numeroHelices;
    }
    
}
