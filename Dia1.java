//1. Como funcionam as variáveis
//public class Main {
//public static void main(String[] args) {
//    int minhaIdade = 21;
//    int salarioMensal = 50000;
//    System.out.println(minhaIdade);
//    System.out.println(salarioMensal);
//}
//}

//---------------------------------------------------------------

//2. Tipos primitivos de variáveis
//public class Main {
//    public static void main(String[] args){
//        byte minhaIdade = 21;
//        int salarioMensal = 50_000;
//        long idadeMilisegundos = 78854222111111111L;
//        double altura = 1.70;
//        char initial = 'H';
//        boolean eMaiorDeIdade = true;
//    }
//}

//---------------------------------------------------------------

//3. Tipos de referência de variáveis
//public class Main {
//    public static void main(String[] args){
//    byte minhaIdade = 21;
//    String firstName = "Hellen " + "Silva";
//
//    System.out.println(minhaIdade);
//    System.out.println(firstName.toLowerCase());
//
//    }
//}

//---------------------------------------------------------------

//4.Atalhos e formatação
//public class Main {
//    public static void main(String[] args){
//        //Dados do cliente
//        byte minhaIdade = 21;
//        String firstName = "Hellen" + "\t Silva";
//        //Imprimir na tela os dados acima
//        System.out.println(minhaIdade);
//        System.out.println("Hi");
//        System.out.println(firstName.toLowerCase());
//    }
//}

//---------------------------------------------------------------

//5.Adicionando o input
//public class Main {
//    public static void main(String[] args) {
//        Scanner idadeScanner = new Scanner(System.in);
//        System.out.println("Digite a sua idade: ");
//        byte idadeCliente = idadeScanner.nextByte();
//        System.out.println(idadeCliente);
//    }
//}

//---------------------------------------------------------------

//Projeto aula 1

public class Main {
    public static void main(String[] args) {
        Scanner numero1Scanner = new Scanner(System.in);
        System.out.print("Digine o primeiro número: ");
        int numero1 = numero1Scanner.nextInt();
        Scanner numero2Scanner = new Scanner(system.in);
        System.out.print("Digine o segundo número: ");
        int numero2 = numero1Scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("O resultado e: " + resultado);
    }

}
