import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DiccionarioEspanolIngles {
    private HashMap<String, String> diccionario;

    public HashMap<String, String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<String, String> diccionario) {
        this.diccionario = diccionario;
    }

    public DiccionarioEspanolIngles (){
        diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("árbol", "tree");
        diccionario.put("agua", "water");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("computadora", "computer");
        diccionario.put("libro", "book");
        diccionario.put("lápiz", "pencil");
        diccionario.put("lapicero", "pen");
        diccionario.put("balón", "ball");
        diccionario.put("leche", "milk");
        diccionario.put("hombre", "man");
        diccionario.put("mujer", "woman");
        diccionario.put("niño", "boy");
        diccionario.put("niña", "girl");
        diccionario.put("auto", "car");
    }

    public void quiz() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        System.out.println("Por favor traduzca las siguientes 5 palabras");

        for (int i = 0; i < 5; i++) {
            Object[] palabras = diccionario.keySet().toArray();
            String palabraEspañol = (String) palabras[random.nextInt(palabras.length)];
            String palabraIngles = diccionario.get(palabraEspañol);

            System.out.print("Traduce '" + palabraEspañol + "': ");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(palabraIngles)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + palabraIngles);
                respuestasIncorrectas++;
            }
        }

        // Mostrar resultados
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
