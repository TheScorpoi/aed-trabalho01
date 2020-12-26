import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProcessData {

    public static void main(String[] args) {

        Map<String, Integer> profitsMap = new TreeMap<>();

        String fileName = "./Resultados/totalsProfit.txt";

        try (Scanner input = new Scanner(new FileReader(fileName))) {

            while (input.hasNextLine()) {
                String linha = input.nextLine();

                String[] tab = linha.split(" ");

                if (profitsMap.containsKey(tab[2])) {
                    profitsMap.put(tab[2], profitsMap.get(tab[2]) + 1);
                } else {
                    profitsMap.put(tab[2], 1);
                }
            }

            for (String key : profitsMap.keySet()) {
                System.out.printf("%s %10d\n", key, profitsMap.get(key));
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}
