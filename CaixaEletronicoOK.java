package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        String Senha_valida = "123456";
        String senha;
        String CPF;
        String CPF_valido = "123.456.789-00";
        int count = 0;
        int operacao;
        int saldo = 1000;
        int valordeposito;
        int valorsaque;
        int novamente;

        Scanner ler = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Bem Vindo ao Caixa XzX");
        System.out.println("-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Por favor digite o seu CPF: ");
        CPF = ler.next();

        if (CPF.equals(CPF_valido)) {

            while (count <= 2) {
                System.out.println("Por favor digite a sua senha:");
                senha = ler.next();

                if (senha.equals(Senha_valida)) {
                    System.out.println("-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Saldo = 1");
                    System.out.println("Depósito = 2");
                    System.out.println("Saque = 3");
                    System.out.println("Sair = 0");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");
                    operacao = ler.nextInt();

                    do {
                        if (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 0) {
                            System.out.println("Digite novamente a opção:");
                            operacao = ler.nextInt();
                        }
                    } while (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 0);

                    switch (operacao) {
                        case 1:
                            System.out.println("Seu Saldo atual é de: R$ " + saldo + ",00");
                            break;

                        case 2:
                            System.out.println("Insira o valor a ser depositado:");
                            valordeposito = ler.nextInt();
                            saldo = valordeposito + saldo;
                            System.out.println("Agora seu saldo é de : R$ " + saldo + ",00");
                            break;

                        case 3:
                            System.out.println("Qual valor deseja sacar? ");
                            valorsaque = ler.nextInt();
                            saldo = saldo - valorsaque;
                            System.out.println("Agora seu saldo é de : R$ " + saldo + ",00");
                            break;

                        case 0:
                            System.out.println("Até logo! :D");
                            System.exit(0);

                    }

                    System.out.println("Deseja realizar mais alguma operação?");
                    System.out.println("1 para NÃO e 2 para SIM");
                    novamente = ler.nextInt();

                    if (novamente == 1) {
                        System.out.println("-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("Até logo! :D ");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=");
                        break;
                    } else if (novamente == 2) {
                        senha = Senha_valida;
                    }
                }
                if (senha != Senha_valida && count <= 2) {
                    System.out.println("Senha incorreta, tente novamente. Você tem mais " + (2 - count) + " tentativas.");
                    count++;
                }

                if (count > 2) {
                    System.out.println("Sua conta foi bloqueada, devido a falha na verificação!");
                }
            }
        } else {
            System.out.println("CPF inválido, se certifique!");
        }
    }
}
