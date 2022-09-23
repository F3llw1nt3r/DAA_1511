package bucket; 
public class Bucket {
  public static void main(String[] args)
  {
    BucketSort cub = new BucketSort();
    float[] datos = { 99,88,72,15,11,23,25,50,64,1,9,32,38,82};
    cub.cubetas(datos,14);
    for (float i : datos)
      System.out.print(i + " , ");
  }
}
