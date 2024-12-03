import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class BoletinUD4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 71:
                    ejercicio7p1();
                    break;
                case 72:
                    ejercicio7p2();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
                    break;
                case 15:
                    ejercicio15();
                    break;
            }
            sc.nextLine();
            sc.nextLine();
        }while (opcion != 0);
    }
    public static void menu() {
        System.out.println("¿Qué quieres hacer? ");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("71. Ejercicio 7 Parte 1");
        System.out.println("72. Ejercicio 7 Parte 1");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.println("12. Ejercicio 12");
        System.out.println("13. Ejercicio 13");
        System.out.println("14. Ejercicio 14");
        System.out.println("15. Ejercicio 15");
        System.out.print("Introduce opcion: ");
    }
    public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero secreto");
        int snum = sc.nextInt();
        if (snum == 241){
            System.out.println("Has acertado");
        }
        else {
            System.out.println("Has fallado");
        }
    }
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nota puede ir del 0 al 10");
        double nota = sc.nextDouble();
        if (nota >= 9 && nota <= 10) {
            System.out.println("Tu nota es excelente");
        }
        else{
            if (nota >=6.5 && nota < 9){
                System.out.println("Tu nota es un notable");
            }
            else{
                if (nota >=5 && nota < 6.5) {
                    System.out.println("Tu nota esta aprobada");
                }
                else{
                    System.out.println("Has suspendido");
                }
            }
        }
    }
    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = sc.nextInt();
        System.out.println("Dime otro numero");
        int num2 = sc.nextInt();
        System.out.println("La suma de los dos numeros es: " + (num1 + num2));
        System.out.println("La resta de los dos numeros es: " + (num1 - num2));
        System.out.println("La division de los dos numeros es: " + (num1 * num2));
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error no se puede dividir por 0");
        }
        else{
            System.out.println(num1 + "/" + num2 + " es igual a " + (num1 / num2));
        }
    }
    public static void ejercicio4(){
        for (int i = 0; i <= 100 ; i++){
            System.out.printf("_");
        }
    }
    public static void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas veces quiere que se repita el bucle");
        int n = sc.nextInt();
        for (int i = 0; i <= n ; i++){
            System.out.printf("_");
        }
    }
    public static void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas veces quiere que se repita el bucle");
        int n = sc.nextInt();
        for (int i = 0; i <= 10 ; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
    public static void ejercicio7p1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n = sc.nextInt();
        int suma = 0;
        for (int i=0; i<=n; i++){
            if (i % 3 == 0){
                suma = suma + i;
            }
        }
        System.out.println("El resultado de todas los multiplos de 3 es " + suma );
    }
    public static void ejercicio7p2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n = sc.nextInt();
        int suma = 0;
        int multiplo = 0;
        for (int i = 0; i<= n; i++){
            while (multiplo <= n){
                multiplo = i*3;
                suma = suma+multiplo;
            }
        }
        System.out.println("El resultado de todas los multiplos de 3 es " + suma);
    }
    public static void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero a dividir");
        int num1 = sc.nextInt();
        System.out.println("Dime el numero por el que dividir");
        int num2 = sc.nextInt();
        int resto = num1 - (num1/num2)*num2;
        System.out.println("El resto es " + resto);
    }
    public static void ejercicio9(){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero entre 0 y 10");
            num = sc.nextInt();
        } while(num < 0 || num > 10);

    }
    public static void ejercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
    public static void ejercicio11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        int suma = 0;
        for (int i = 0; i <= num; i+=3){
            suma = suma + i;
        }
    }
    public static void ejercicio12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero a multiplicar");
        int num1 = sc.nextInt();
        System.out.println("Dime de cuanto quieres la tabla de multiplicar");
        int num2 = sc.nextInt();

        for (int i = 0; i <= num2; i++){
            System.out.println(num1 + " x " + i + " = " + (num1*i));
        }
    }
    public static void ejercicio13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime altura del cuadrado");
        int num1 = sc.nextInt();
        System.out.println("Dime base del caudrado");
        int num2 = sc.nextInt();
        for (int i = 0; i < num1; i++) {
            for (int e = 0; e< num2; e++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
    public static void ejercicio14() {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        for (int i = 0; i < 10; i++) {
            num2=0;
            for (int e = 0; e < 10; e++){
                num3=0;
                for (int a = 0; a < 10; a++) {
                    num4=0;
                    for (int b = 0; b < 10; b++){
                        num5=0;
                        for (int c = 0; c < 10; c++) {
                            System.out.println(num1 + "-" + num2 + "-" + num3 + "-" + num4 + "-" + num5);
                            num5++;
                        }
                        num4++;
                    }
                    num3++;
                }
                num2++;
            }
            num1++;
        }
    }
    public static void ejercicio15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = sc.nextInt();
        int primos = 0;
        for (int i = 1; i < num1; i++) {
            for (int e = 1; e< i; e++) {
                if (i % e != 0) {
                    primos++;
                }
            }
        }
        System.out.printf("Hay " + primos + " numeros primos");
    }
}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
