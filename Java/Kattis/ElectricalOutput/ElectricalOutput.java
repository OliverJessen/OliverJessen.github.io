public class ElectricalOutput {

  public static void main(String[] args){

  try{
    Kattio io = new Kattio(System.in, System.out);

    int lines = io.getInt();

    for(int i = 0; i < lines; i++) {

      int times = io.getInt();

      int totalValue = 0;

      for(int p = 0; p < times; p++) {

        totalValue += io.getInt();

      }
      io.println(totalValue - times + 1);
    }
    io.close();

    } catch(Exception e) {}
  }
}
