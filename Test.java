import java.util.Random;
public class Test
{
    /**
     * Método que genera 5 objetos Alumno con valores aleatorios para los nombres, 
     * edades y notas, y que imprima los datos de cada alumno por pantalla.
     */
    public void test1()
    {
        Random rdm = new Random();
        for(int index = 0; index<5; index++){
            Alumno alumno = new Alumno("a",rdm.nextInt(100));
            alumno.addNota(rdm.nextInt(10));
            alumno.addNota(rdm.nextInt(10));
            alumno.mostrarDatos();
            System.out.print("**************************************\n");
        }
    }
}
