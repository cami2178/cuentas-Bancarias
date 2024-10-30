package clases;

import java.util.ArrayList;
import java.util.Random;

public class cuentaBancaria {
    private double saldoDisponible;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<cuentaBancaria> listaCuentaBancarias = new ArrayList<>();

    public cuentaBancaria(double saldoDisponible, Persona titular) {
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
        this.numeroCuenta = generarNumero();
        listaCuentaBancarias.add(this);
    }

    public static int generarNumero() {
        Random numeroRandom = new Random();
        return 10000 + numeroRandom.nextInt(900000);
    };


    public void depositar( double monto){
        if (monto > 0) {
            saldoDisponible += monto;
            System.out.println("Deposito exitoso, tu nuevo saldo disponible es " + saldoDisponible);
        }
    }

    public void retirar (double monto) {
        if (monto > saldoDisponible) {
            System.out.println("monto execede el maximo de la cuenta");
            } else if (monto < 0) {
                System.out.println("monto invalido, intente nuevamente");
            } else {
                saldoDisponible -= monto;
                System.out.println("Retiro de dinero existoso, su saldo disponible es " + saldoDisponible);
            }
            
        
    }

    public void despliegaInfo() {
        System.out.println("Aqui encontraras las informacion de tu cuenta!");
        System.out.println("Titular " + titular.getNombre());
        System.out.println("edad; " + titular.getEdad());
        System.out.println("Numero de cuenta "+ numeroCuenta);
        System.out.println("Saldo disponible "+ saldoDisponible);
    }

    public static void ImprimeTodalaInfo(){
        for(cuentaBancaria cuenta : listaCuentaBancarias) {
            cuenta.despliegaInfo();
            System.out.println("-------------");
        }
    }

    // Metodos Getters y Setters
    public double getSaldoDisponible() {
        return this.saldoDisponible;
    }

    public Persona getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public static ArrayList<cuentaBancaria> getListaCuentaBancarias() {
        return listaCuentaBancarias;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

}
