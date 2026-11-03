package ejercicioautomovil;

public class AutoMovil {
    //atributos//
    private String marca;
    private int year;
    private String color;
    private String modelo;
    
    //constructor//
    public AutoMovil(){
        System.out.println("Constructor de AutoMóvil");
    }
    //Getters//
    public String getMarca(){
        return marca;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    public String getModelo(){
        return modelo;
    }
    //Setters//
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void encender(){
        System.out.println("Encendiendo Vehiculo.......");
    }
    public void apagar(){
        System.out.println("Apagando Vehiculo......");
    }
    public void acelerar(){
        System.out.println("Acelerando........");
    }
    public void frenar(){
        System.out.println("Frenando.......");
    }
}

