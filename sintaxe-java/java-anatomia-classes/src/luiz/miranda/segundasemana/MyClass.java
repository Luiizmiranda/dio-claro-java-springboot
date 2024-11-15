package luiz.miranda.segundasemana;

public class MyClass {
    public static void main(String[] args) {
        System.out.print(nomeCompleto("Luiz", "Miranda"));
    }
    public static String nomeCompleto (String nome, String sobrenome){
        return nome + " " + sobrenome;
    }
}