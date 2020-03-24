

public class Pokedex
{
   String entrenador;
   //variables del mundo
   static int agua;
   static int fuego;
   static int dragon;
   static int planta;
   static int electrico;
   static int roca;
   static int volador;
   //variables para entrenador
   private int aguas;
   private int fuegos;
   private int dragons;
   private int plantas;
   private int electricos;
   private int rocas;
   private int voladors;
   static int entrena;
  
    public Pokedex()
    {
       entrena++;
    }

   public void capturaPokemon(Pokemon P)
    {
    if (P.tipo=="agua") {
        agua++;
        aguas++;
    } else if (P.tipo=="fuego") {
        fuego++;
        fuegos++;
    } else if (P.tipo=="dragon") {
        dragon++;
        dragons++;
    } else if (P.tipo=="planta") {
        planta++;
        plantas++;
    } else if (P.tipo=="electrico") {  
        electrico++;
        electricos++;
    } else if (P.tipo=="roca") {
        roca++;
        rocas++;
    } else if (P.tipo=="volador"){
        volador++;
        voladors++;
    }
    }
  
   public void liberarPokemon(Pokemon P)
    {
      if (P.tipo=="agua") {
        aguas--;
            } else if (P.tipo=="fuego") {
        fuegos--;
    } else if (P.tipo=="dragon") {
        dragons--;
    } else if (P.tipo=="planta") {
        plantas--;
    } else if (P.tipo=="electrico") {  
        electricos--;
    } else if (P.tipo=="roca") {
        rocas++;
    } else if (P.tipo=="volador"){
        voladors--;
    }
    }
   
    public void intercambiarPokemon(Pokemon Pnuevo, Pokemon Pantiguo)
    {
    this.capturaPokemon(Pnuevo);
    this.liberarPokemon(Pantiguo);
    
    }
    
    public void reiniciarPokedex()
    {
        aguas=0;
        fuegos=0;
        dragons=0;
        plantas=0;
        electricos=0;
        rocas=0;
        voladors=0;
        
    }
   
    public void mostrarPokedex()
    {
        System.out.println ("Pokemones de aguas: " +aguas);
        System.out.println ("Pokemones de fuegos: " +fuegos);
        System.out.println ("Pokemones de dragons: " +dragons);
        System.out.println ("Pokemones de plantas: " +plantas);
        System.out.println ("Pokemones de electricos: " +electricos);
        System.out.println ("Pokemones de rocas: " +rocas);
        System.out.println ("Pokemones de voladores: " +voladors);
    }
   
    public double mediaPokemon()
    {
      return (agua+fuego+dragon+planta+electrico+roca+volador)/entrena;
    }
   
    public String getEntrenador(){
        return this.entrenador;
    }

    
    public void setEntrenador(String entrenador){
        this.entrenador = entrenador;
    }

    
    public int getAgua(){
        return this.agua;
    }

   
    public void setAgua(int agua){
        this.agua = agua;
    }

    
    public int getFuego(){
        return this.fuego;
    }

   
    public void setFuego(int fuego){
        this.fuego = fuego;
    }

    
    public int getDragon(){
        return this.dragon;
    }

    
    public void setDragon(int dragon){
        this.dragon = dragon;
    }

    
    public int getPlanta(){
        return this.planta;
    }

    
    public void setPlanta(int planta){
        this.planta = planta;
    }

   
    public int getElectrico(){
        return this.electrico;
    }

    
    public void setElectrico(int electrico){
        this.electrico = electrico;
    }

    
    public int getRoca(){
        return this.roca;
    }

   
    public void setRoca(int roca){
        this.roca = roca;
    }
    
    public int getVolador(){
        return this.volador;
    }

    
    public void setVolador(int volador){
        this.volador = volador;
    }

    
    public int getAguas(){
        return this.aguas;
    }

    
    public void setAguas(int aguas){
        this.aguas = aguas;
    }//end method setAguas

    
    public int getFuegos(){
        return this.fuegos;
    }

    
    public void setFuegos(int fuegos){
        this.fuegos = fuegos;
    }

    
    public int getDragons(){
        return this.dragons;
    }

    
    public void setDragons(int dragons){
        this.dragons = dragons;
    }

    public int getPlantas(){
        return this.plantas;
    }

    
    public void setPlantas(int plantas){
        this.plantas = plantas;
    }

 
    public int getElectricos(){
        return this.electricos;
    }

    
    public void setElectricos(int electricos){
        this.electricos = electricos;
    }

    
    public int getRocas(){
        return this.rocas;
    }

    
    public void setRocas(int rocas){
        this.rocas = rocas;
    }

    
    public int getVoladors(){
        return this.voladors;
    }

    
    public void setVoladors(int voladors){
        this.voladors = voladors;
    }

    
    public int getEntrena(){
        return this.entrena;
    }

    
    public void setEntrena(int entrena){
        this.entrena = entrena;
    }

}