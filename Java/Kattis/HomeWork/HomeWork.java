public class HomeWork {


  public static void main(String[] args) {

  try{
    Kattio io = new Kattio(System.in, System.out);

    String a = io.getWord(";");


    io.close();

  } catch (Exception e) {}
}
}
