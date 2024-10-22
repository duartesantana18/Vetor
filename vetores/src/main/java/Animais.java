/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Animais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] animais = new String[10]; // Vetor para armazenar até 10 animais
        int contador = 0; // Contador para o número de animais

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar animal");
            System.out.println("2. Exibir animais");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção (1/2/3): ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            if (escolha == 1) {
                if (contador < animais.length) {
                    System.out.print("Digite o nome do animal: ");
                    String nome = scanner.nextLine();
                    animais[contador] = nome; // Adiciona o animal ao vetor
                    contador++;
                    System.out.println(nome + " adicionado à lista!");
                } else {
                    System.out.println("A lista de animais está cheia!");
                }
            } else if (escolha == 2) {
                if (contador > 0) {
                    System.out.println("Animais na lista:");
                    for (int i = 0; i < contador; i++) {
                        System.out.println("- " + animais[i]);
                    }
                } else {
                    System.out.println("A lista de animais está vazia.");
                }
            } else if (escolha == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close(); // Fecha o scanner
    }
}

