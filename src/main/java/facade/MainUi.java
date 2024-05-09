package facade;

import entity.Conta;
import java.util.Scanner;

public class MainUi {

    public Fachada fachada;
    public Scanner scan = new Scanner(System.in);
    
    
    public MainUi() {
        fachada = new Fachada();
    }


    public static void main(String[] args) {
        MainUi mainUi = new MainUi();
        mainUi.menu();
        int opcao = mainUi.scan.nextInt();
        mainUi.comunicaFachada(opcao);
    }

    public void menu() {
        System.out.println("""
                           *------------------------------*
                            BEM-VINDO AO SEU MENU DE CONTAS
                           *------------------------------*
                           Selecione uma opção para iniciar!
                            1 - Inserir uma conta;
                            2 - Alterar uma conta;
                            3 - Remover uma conta;
                            4 - Buscar por uma conta;
                            5 - Ver todas as contas existentes;
                            0 - Sair do programa.
                           """);
    }

    public void comunicaFachada(int opcao) {
        while(opcao != 0){
        switch (opcao) {
            case 1 -> inserirConta();
            case 2 -> alterarConta();
            case 3 -> removerConta();
            case 4 -> buscarConta();
            case 5 -> listarContas();
            case 0 -> System.out.println("Programa encerrado!");
            default -> System.out.println("Essa opção é inválida, digite novamente!");
        }
        menu();
        opcao = scan.nextInt();
        }
    }

    public void inserirConta() {
        System.out.println("Insira o número da conta:");
        int numero = scan.nextInt();
        System.out.println("Insira a agência da conta:");
        int agencia = scan.nextInt();
        System.out.println("Insira o saldo inicial da conta:");
        double saldo = scan.nextDouble();
        scan.nextLine(); // Limpar o buffer
        System.out.println("Insira o nome do titular da conta:");
        String titular = scan.nextLine();

        Conta c = fachada.criarConta(numero, agencia, saldo, titular);
        fachada.inserirConta(c);
        System.out.println("Conta inserida com sucesso!");
    }
    
    public void alterarConta(){
        System.out.println("Você só tem permissão de alterar o nome do titular!");
        System.out.println("Digite o número da conta que quer alterar:");
        int numero = this.scan.nextInt();
        Conta c = fachada.buscarConta(numero);
        System.out.println("Digite o novo nome de titular:");
        String titular = this.scan.nextLine();
        c.setTitular(titular);
        System.out.println("Nome alterado com sucesso!");
    }
    public void removerConta(){
    }
    public void buscarConta(){
    }
    public void listarContas(){
    }
}