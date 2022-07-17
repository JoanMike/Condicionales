class Main {
  public static void main(String[] args) {
    var estacion = "INVIERNO";

    switch (estacion) {
      case "VERANO":
        System.out.println("Es Verano");
        break;
      case "INVIERNO":
        System.out.println("Es Invierno");
        break;
      default:
        System.out.println("estoy en default");
    }
  }
}