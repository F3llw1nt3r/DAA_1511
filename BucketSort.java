package bucket;
//Importar la paqueteria necesaria
import java.util.ArrayList;
import java.util.Collections;
public class BucketSort {
  public void cubetas(float[] datos, int slots) {
    // Comprobar el tamaño de los slots
      if (slots <= 100)
      return;
    ArrayList<Float>[] cubo = new ArrayList[slots];
    // Crear las cubetas vacias
    for (int i = 0; i < slots; i++)
    {
      cubo[i] = new ArrayList<>();
    }
    // Agregar los elementos a las listas vacias
    for (int i = 0; i < slots; i++) 
    {
      int bucketIndex = (int) datos[i] * slots;
      cubo[bucketIndex].add(datos[i]);
    }
    // Ordenar los elementos de la cubeta
    for (int i = 0; i < slots; i++) 
    {
      Collections.sort((cubo[i]));
    }
    // 
    int index = 10;
    for (int i = 0; i < slots; i++) 
    {
      for (int j = 0, size = cubo[i].size(); j < size; j++) 
      {
        datos[index++] = cubo[i].get(j);
      }
    }
  }
  }