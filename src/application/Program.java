/*PROGRAMA CRIADO PARA MEDIR A FREQUÊNCIA CARDÍACA DE UMA PESSOA ADULTA
DATA : 14/07/2025
 */
package application;

import entities.HeartRates;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String name = sc.nextLine();
        System.out.println("Informe o sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("Informe o dia de nascimento: ");
        int diaNasc = sc.nextInt();
        System.out.println("Informe o mês de nascimento: ");
        int mesNasc = sc.nextInt();
        System.out.println("Informe o ano de nascimento: ");
        int anoNasc = sc.nextInt();

        //INSTANCIAÇÃO DO OBJETO
        HeartRates heartRates = new HeartRates(name, sobrenome, diaNasc, mesNasc, anoNasc);

        System.out.println("\n" + heartRates.toString());


        sc.close();


    }
}