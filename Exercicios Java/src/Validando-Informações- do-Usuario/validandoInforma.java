import java.util.Scanner;

public class validandoInforma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String estadoCivil;

        do {
            System.out.println("Insira o seu nome: ");
            nome = sc.next();

            if (nome.length() >= 3) {
                System.out.println("Nome cadastrado com sucesso!");
                infoValida = true;
            } else {
                System.out.println("O nome precisa ter mais de 3 caracteres para se registrar.");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Insira a sua idade: ");
            idade = sc.nextInt();

            if (idade >= 0) {
                System.out.println("Idade cadastrada com sucesso.");
                infoValida = true;
            } else {    
                System.out.println("A idade precisa ser maior ou igual a zero para se cadastrar!");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Informe o seu salário: ");
            salario = sc.nextDouble();

            if (salario > 100) {
                System.out.println("Salário cadastrado com sucesso.");
                infoValida = true;
            } else {
                System.out.println("Salário inválido. Por favor, insira um salário maior do que 100.");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Informe o seu estado civil: ");
            estadoCivil = sc.next();

            if (estadoCivil.equalsIgnoreCase("Solteiro") || estadoCivil.equalsIgnoreCase("Divorciado") ||
                estadoCivil.equalsIgnoreCase("Viuvo") || estadoCivil.equalsIgnoreCase("Casado")) {
                System.out.println("Estado civil cadastrado com sucesso.");
                infoValida = true;
            } else {
                System.out.println("Informação inválida. Por favor, insira uma das seguintes opções: " +
                        "solteiro , divorciado, viúvo , casado .");
            }

        } while (!infoValida);
    
            System.out.println("INFORMAÇÕES CADASTRADAS PELO ÚSUARIO ");
            System.out.println("Nome: " + nome);
            System.out.println("Idade : " + idade);
            System.out.println("Sálario atual : " + salario);
            System.out.println("Estado civil : " + estadoCivil);
            
    
    
    
    
    
    
    
    
    
    
    }










}
