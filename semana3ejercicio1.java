import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      int valoration;
      
      Scanner kb = new Scanner(System.in);
      System.out.println("¿de uno a diez que te parecio la serie?");
      valoration = kb.nextInt();

      if(valoration > 8){
        System.out.println("la serie es muy buena");
      }
      else if(valoration < 5){
        System.out.println("la serie no es buena");
      }
      else{
        System.out.println("la serie es buena");
    }
  }
}