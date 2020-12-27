import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tabelas {

    public static void main(String[] args) {

        String[] fileNameInput = { "./Resultados/totalsProfit98491.txt", "./Resultados/totalsProfit98495.txt","./Resultados/totalsProfit98629.txt", };
        String[] fileNameOutput = { "./Resultados/Tabelas/Profit98491.txt", "./Resultados/Tabelas/Profit98495.txt","./Resultados/Tabelas/Profit98629.txt", };
        String[] numMec = {"98491", "98495", "98629"};

        for (int i = 0; i < fileNameInput.length; i++) {

            try (Scanner input = new Scanner(new File(fileNameInput[i]))) {
                try (PrintWriter out = new PrintWriter(new File(fileNameOutput[i]))) {
                    out.printf("+------------------------------------------------------+\n");
                    out.printf("|                    Profit - %s                    |\n", numMec[i]);
                    out.printf("+-------------+-----------------------+----------------+\n");
                    out.printf("|   %-10s|      %-16s|     %-10s |\n", "Tarefas", "Programadores", "Profit");
                    out.printf("+-------------+-----------------------+----------------+\n");
                    
                    while (input.hasNextLine()) {
                        String linha = input.nextLine();
                        String[] tab = linha.split(" ");

                        out.printf("+-------------+-----------------------+----------------+\n");
                        out.printf("|     %-8s|           %-12s|      %-10s|\n", tab[0], tab[1], tab[2]);
                    }
                    out.printf("+-------------+-----------------------+----------------+\n");
                    

                } catch (FileNotFoundException e) {
                    System.err.println(e.getMessage());
                }
            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
