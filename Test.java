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

        String[] listaLetras={"a","b","c","d","e","f","g","h","i","j","k","l","m","n ",
                "ñ","o","p","q","r","s","t", "u","v","w","x","y","z"};
        String nombre = null;
        for(int index = 0; index<5; index++){
            String letra1 = listaLetras[rdm.nextInt(listaLetras.length)];
            String letra2 = listaLetras[rdm.nextInt(listaLetras.length)];
            String letra3 = listaLetras[rdm.nextInt(listaLetras.length)];
            nombre = letra1 + letra2 + letra3;
            Alumno alumno = new Alumno(nombre,rdm.nextInt(100));
            alumno.addNota(rdm.nextInt(10));
            alumno.addNota(rdm.nextInt(10));
            alumno.mostrarDatos();
            System.out.print("**************************************\n");
        }
    }
}
