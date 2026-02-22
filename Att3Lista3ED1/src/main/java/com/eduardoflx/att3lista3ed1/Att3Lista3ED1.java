/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eduardoflx.att3lista3ed1;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Att3Lista3ED1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        boolean tamValido = false;
        boolean temEspecial = false;

        // Verifica tamanho mínimo
        if (senha.length() >= 8) {
            tamValido = true;
        }

        // Verifica se existe caractere especial
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (c == '@' || c == '#' || c == '$' ||
                c == '%' || c == '&' || c == '*') {
                temEspecial = true;
            }
        }

        // Resultado final
        if (tamValido && temEspecial) {
            System.out.println("Senha Valida");
        } else {
            System.out.println("Senha Invalida");

            if (!tamValido) {
                System.out.println("- Deve possuir ao menos 8 caracteres.");
            }

            if (!temEspecial) {
                System.out.println("- Deve possuir ao menos algum caractere especial (@, #, $, %, &, *).");
            }
        }

        scanner.close();
    }
}
