package ejercicioautomovil;

public class EjercicioAutomovil {

    
    public static void main(String[] args) {
     AutoMovil auto = new AutoMovil();
     auto.setMarca("BMW");
     auto.setColor("Gris");
     auto.setYear(2025);
     auto.setModelo("X5");
     
     System.out.println("Marca: " + auto.getMarca());
     System.out.println("Modelo: " + auto.getModelo());
     System.out.println("Año: " + auto.getYear());
     System.out.println("Color: " + auto.getColor());
     
     auto.encender();
     auto.acelerar();
     
     System.out.println("\n--- Honda Civic ---");
        // Crear instancia de HondaCivic
        HondaCivic honda = new HondaCivic();
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setYear(2024);
        honda.setColor("Rojo");

        System.out.println("Marca: " + honda.getMarca());
        honda.encender(); // Método sobrescrito
        honda.acelerar(); // Método sobrescrito
    }
    
}
