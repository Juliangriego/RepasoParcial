package Clases;

public class ClaseVehiculo {
    private String marca;
    private String modelo;
    private int kilometraje;
    private String patente;
    private boolean encendido;

    //Constructores
    public ClaseVehiculo(String mar, String mod, String pat){
        this.marca = mar;
        this.modelo = mod;
        this.kilometraje = 0;
        this.patente=pat;
    }

    //Setters
    public void setMarca (String m)            {this.marca =m;}
    public void setModelo (String mo)          {this.modelo =mo;}
    public void setKilometros (int km)         {this.kilometraje=km;}
    public void setPatente (String pat)        {this.patente=pat;}

    //Getters
    public String getMarca()                   {return this.marca;}
    public String getModelo()                  {return this.modelo ;}
    public int getKilometros()                 {return this.kilometraje;}
    public String getPatente()                 {return this.patente;}
    public boolean getEncendido()              {return this.encendido;}

    //ToString
    public String toString(){ return "********************\n" + 
                                     "Marca: " + getMarca() +
                                   "\nModelo: " + getModelo() +
                                   "\nKilometraje: " + getKilometros() +
                                   "\nPatente: " + getPatente() + 
                                   "\n********************";}

    //Metodos:

    public void arranca(){encendido = true ;}
    public void apaga(){encendido = false;}
    public void tocaBocina() {
        if(encendido){System.out.println("BIP BIP");} 
        else {System.out.println("ENCENDEME");}
    }
    public void recorre(int km) {
        if(encendido){
            this.kilometraje += km; 
            System.out.println("El vehículo recorrió " + km + " km.");
        } else {
            System.out.println("ENCENDEMEEEE");
        }
        
    }

}
