package manipulando_strings;

public class Exemplo_String {
    public static void main(String[] args) {
        String frase = "Um exemplo de frase qualquer frase";

        System.out.println(frase.length()); //quantidade de caracteres do meu string
        System.out.println(frase + " concatenada"); //Concatenação de String
        System.out.println(frase.contains("exemplo")); //Verifica se existe algum caractere na String
        System.out.println(frase.indexOf("frase")); //Index onde começa a minha frase ou caractere
        System.out.println(frase.lastIndexOf("frase"));// Índice da última vez que aconteceu aquela sentença
        System.out.println(frase.toUpperCase()); //Todos os caracteres da minha String ficam em Caixa alta
        System.out.println(frase.toLowerCase()); //Todos os caracteres da minha String ficam em Caixa baixa
        System.out.println(frase.trim()); //Remove os espaços desnecessários
        System.out.println(frase.substring(14)); //Começo a ler a minha string a partir do index fornecido


        System.out.println(frase.equals("Um exemplo de frase qualquer")); //Compara se a string é igual com a string fornecida


    }
}