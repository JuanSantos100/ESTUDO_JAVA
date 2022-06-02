package manipulando_strings;

import java.time.Year;
import java.util.Scanner;

public class Comparando {
    public static void main(String[] args) {
        String password = "123456"; // espaço de memória 0010

        System.out.print("Digite a sua senha: ");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine(); // espaço de memória 0020 criado ao usar o objeto Scanner

        //== não compara o conteúdo, ele compara a referência dos objetos, são Strings diferentes
        // Para que isso pudesse ser True, as duas variáveis deveriam apontar para o mesmo endereço de memória
        System.out.println(password.equals(pass));


        String x = "123456"; //endereço da memória 0030
        String y = "123456"; //endereço da memória 0030

        System.out.println(x == y);

        //Para comparar duas strings (conteúdo) usamos o método .equals()
        
    }
}
