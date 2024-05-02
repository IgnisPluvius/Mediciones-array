import java.util.ArrayList;

/**
 * MedicionesTemperaturas representa una lista de mediciones de temperaturas
 * de una estación meteorológica. Las temperaturas están en grados centígrados
 * 
 * @author N. Aguirre 
 * @version 0.1
 */

import java.util.ArrayList;

public class MedicionesTemperaturas
{
    
    // lista de mediciones tomadas en la estacion meteorologica.
    private ArrayList<Float> mediciones;
    
    /**
     * Constructor de MedicionesTemperaturas. Crea la lista de mediciones vacía.
     */
    public MedicionesTemperaturas()
    {
        mediciones = new ArrayList<Float>();
    }
    
    /**
     * Agrega una nueva medicion de temperatura
     */
    public void agregarMedicion(float nuevaTemperatura) {
        assert nuevaTemperatura > -273 : "Temperatura no valida";
        mediciones.add(nuevaTemperatura);
    }
    
    /**
     * Imprime la lista de temperaturas/mediciones
     */
    public void imprimirTemperaturas()
    {
        System.out.println("Temperaturas Registradas:");
        for (Float temp: mediciones) {
            System.out.println(temp + "°C");
        }
    }
    
    /**
     * Calcula el promedio de temperaturas. 
     * Precondicion: debe haber al menos una temperatura cargada para que el promedio tenga sentido.
     */
    public float promedioTemperaturas()
    {
        assert mediciones.size() > 0: "debe haber al menos una temperatura cargada para calcular el promedio";
        float suma = 0;
        for (Float temp: mediciones) {
            suma = suma + temp;
        }
        return suma / mediciones.size();
    }
    
    /**
     * Calcula cantidad de registros de temperaturas negativas (sub cero)
     */
    public int cantidadRegistrosSubCero() {
        int negativas = 0;
        for (Float temp: mediciones) {
            if (temp < 0) {
                negativas = negativas + 1;
            }
        }
        return negativas;
    }
    
    /**
     * computa la cantidad de temperaturas extremas registradas
     */
    public void cantidadTemperaturasExtremas()
    {
        int cant = 0;
        for(Float temp: mediciones){
            if (temp > 35 || temp < -15){
                cant += 1;
            }
        }
        System.out.println("La cantidad de temperaturas extremas registradas es: " + cant);
    }
    
     /**
     * Imprime la lista de temperaturas/mediciones en grados FALSOS
     */
    public void imprimirTempFarenheit(){
        System.out.println("Temperaturas registradas en grados Farenheit:");
        for (Float temp: mediciones) {
            float tempFarenheit = (temp * 1.8f) + 32f;
            System.out.println(tempFarenheit + "°F");
        }
    }
    
    /**
     * devuelve la cantidad de temperaturas consecutivas
     */
    public void temperaturasConsecutivas(){
        int cant = 0;
        float tempAnterior = -500;
        for (Float temp: mediciones) {
            if (temp == tempAnterior){
                cant++;
            }
            tempAnterior = temp;
        }
        System.out.println("Hay " + cant + " temperaturas consecutivas");
    }
}


