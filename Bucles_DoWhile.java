class PracticaDoWhile {
  public static void main(String[] args) {
    int contador = 2;
    // El Do While primero ejecuta y luego continua con la condicion a diferencia
    // del While que primero lee la condicion y luego ejecuta.
    do {
      System.out.println(contador);
      contador--;
    } while (contador > 2);
  }
}
