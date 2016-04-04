import java.util.Random;
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    private int numeroDeClase;
    private int[] notas;
    private static final int NOTA_MINIMA_APROBADO = 5;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        notas = new int[0];
        Random random = new Random();
        numeroDeClase = 1 + random.nextInt(30);
    }

    /**
     * Método que añade notas
     */
    public void addNota(int nota) {
        if(nota<=10 && nota>=0) {
            int[] nuevasNotas = new int[notas.length+1];
            for (int index = 0; index<notas.length; index++) {
                nuevasNotas[index] = notas[index];
            }
            nuevasNotas[notas.length] = nota;
            notas = nuevasNotas;
        }
        else {
            System.out.println("Nota no valida");
        }
    }

    /**
     * Calcular media
     */
    public float calcularMedia() {
        int total = 0;
        float media = 0;
        if(notas.length>0) {
            for(int index =0; index<notas.length; index++) {
                total += notas[index];               
            }
            media = (float) total/notas.length;
        }
        return media;
    }

    /**
     * Comprobar si esta aprobado
     */
    public boolean estaAprobado() {
        boolean estaAprobado = false;
        if (calcularMedia()>=NOTA_MINIMA_APROBADO) {
            estaAprobado = true;
        }
        return estaAprobado;
    }

    /**
     * Muestra los datos del alumno
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de clase: " + numeroDeClase);
        System.out.println("Nota media: " + calcularMedia());
        if (estaAprobado()) {
            System.out.println("Está aprobado");
        }
        else {
            System.out.println("No está aprobado");
        }
    }
}
