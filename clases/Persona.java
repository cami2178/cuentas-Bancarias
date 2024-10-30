package clases;

public class Persona {
    private String nombre;
    private int edad;

    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void despliegaInfo(){
        System.out.println("nombre " + this.nombre);
        System.out.println("edad " + this.edad);
    }

    public String getNombre (){
        return this.nombre;
    }
    public int getEdad (){
        return this.edad;
    }
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
}
