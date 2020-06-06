public class Suma2 {
    public static void main(String[] args) {
        int num1, num2, resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        num2 = sc.nextInt();

        resultado = num1 + num2;
        System.out.println("El resultado es:" + resultado);

    }

}