public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase que implementa la interfaz
        Calculadora calculadora = new Calculadora();

        // Utilizar cada método al menos una vez
        int resultadoSuma = calculadora.suma(10, 5);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = calculadora.resta(10, 5);
        System.out.println("Resta: " + resultadoResta);

        int resultadoMultiplicacion = calculadora.multiplicacion(10, 5);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        int resultadoDivision = calculadora.division(10, 2);
        System.out.println("División: " + resultadoDivision);
    }
}