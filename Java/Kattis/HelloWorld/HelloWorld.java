public class HelloWorld{

  public static void main(String[] args){
    try{
      //Javas println og scanf er meget langsomme - brug istedet Kattis
      //lidt hurtigere metoder
      Kattio io = new Kattio(System.in, System.out);

      //Kattio's println
      io.println("Hello World!");

      //Sådan henter du en int    : io.getInt();
      //Sådan henter du en String : io.word();

      //Husk at lukke ellers bliver der ikke skrevet noget
      io.close();

    }catch(Exception e){

    }

  }




}
