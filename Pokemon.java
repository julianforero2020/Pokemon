
public class Pokemon
{
    String nombre;
    String tipo;
    
    public Pokemon()
    {
      
    }

    
    
    public void mostrarPokemon()
    {
      System.out.println ("El pokemos es:"+nombre + "Y es de tipo: " + tipo );
    }
    
    
    public String getNombre(){
        return this.nombre;
    }

    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

  
    public String getTipo(){
        return this.tipo;
    }

    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

}