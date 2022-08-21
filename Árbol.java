public class Árbol {
  Nodo Raiz;
  public Árbol()
  {
  Raiz = null;    
  }
  public void insertarNodo(int i,Object Nombre)
  {
      Nodo n = new Nodo(i);
      n.contenido = Nombre;
      if(Raiz==null)
      {
          Raiz = n;
      }
      else
      {
          Nodo auxiliar = Raiz;
          while(auxiliar!=null)
          {
              n.head=auxiliar;
              if(n.key>auxiliar.key)
              {
                  auxiliar = auxiliar.der;
              }
              else
              {
                  auxiliar = auxiliar.izq;
              }
          }
          if(n.key<n.head.key)
          {
           n.head.izq=n;
          }
          else
          {
               n.head.der=n;
          }
      }
  }
  public void recorrerNodo(Nodo n)
  {
     if(n!=null)
     {
         recorrerNodo(n.izq);
         System.out.println("indice"+n.key+"Número"+n.contenido);
         recorrerNodo(n.der);
     }
  }
    private class Nodo
  {
        public Nodo head;
        public Nodo der;
        public Nodo izq;
        public int key;
        public Object contenido;
        public Nodo (int ind)
        {
            key = ind;
            der = null;
            izq = null;
            head = null;
            contenido = null;
            
        }
  }  
}
