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
    
    /**
     * Método que añade notas
     */
    public void addNota(int nota) {
        int[] nuevasNotas = new int[notas.length+1];
        nuevasNotas = notas;
        nuevasNotas[notas.length] = nota;
        notas = nuevasNotas;
    }
    
    /**
     * Calcular media
     */
    public float calcularMedia() {
        int total = 0;
        for(int index =0; index<notas.length; index++) {
            total += notas[index];
        }
        return total/notas.length;
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
}
