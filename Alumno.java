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
    private float notaMedia;
    private boolean aprobado;
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
}
