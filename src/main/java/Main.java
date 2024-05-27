

public class Main {
  public static void main(String[] args) {
    System.out.println("Uma TV de 200 watts fica ligada aproximadamente 5h diariamente, o consumo elétrico mensal sera de:");
    System.out.println("");
    int potencia = 200;
    System.out.println("potência:");
    System.out.println(potencia);
    int tempo = 5;
    System.out.println("tempo ligada:");
    System.out.println(tempo);
    System.out.println("");
    System.out.println("200 x 5 = 1000");
    System.out.println("");
    int diario = potencia * tempo;
    System.out.println("gasto diário em watts:");
    System.out.println(diario);
    System.out.println("");
    System.out.println("1000 x 30 = 30000");
    System.out.println("");
    int mes = 30;
    int gastomensal = diario * mes;
    System.out.println("o gasto mensal em watts é:");
    System.out.println(gastomensal);
    System.out.println("");
    System.out.println("30000/1000");
    System.out.println("");
    int kwh = 1000;
    System.out.println("transformando em kwh fica:");
    int transformado = gastomensal/kwh;
    System.out.println(transformado);
    System.out.println("");
    System.out.println("Resultado Final:");
    System.out.println("30KWH");
  }

 
}