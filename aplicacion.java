import clases.Persona;
import clases.cuentaBancaria;

public class aplicacion {

    public static void main(String[] args) {
    
    Persona persona1 = new Persona("Francisco", 25);
    Persona persona2 = new Persona("Pedro", 31);
    Persona persona3 = new Persona("Camila", 23);

    cuentaBancaria cuenta1 = new cuentaBancaria(3000.0, persona1);
    cuentaBancaria cuenta2 = new cuentaBancaria(8600.0, persona2);
    cuentaBancaria cuenta3 = new cuentaBancaria(8600.0, persona3);

    cuenta1.depositar(500.0);
    cuenta2.retirar(300.0);
    cuenta3.depositar(800.0);
    System.out.println("----------------");
    System.out.println("Informacion de todas las cuentas");
    cuentaBancaria.ImprimeTodalaInfo();
    }
}
