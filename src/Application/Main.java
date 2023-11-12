package Application;

import Entities.City;
import Exception.CepNotFoundException;
import Exception.FileNotCreatedException;
import Util.Operations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe o cep da cidade que se deseja saber: ");
            String valorCep = sc.next();

            City city = Operations.findAdress(valorCep);
            Operations.writeFile(city);

        } catch (CepNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (FileNotCreatedException e2) {
            System.out.println(e2.getMessage());
        }
    }
}