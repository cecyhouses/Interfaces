class Calculadora implements OperacionesMatematicas {
    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero no permitida");
            return 0; // Puedes manejar el error de otra manera si lo prefieres
        }
    }
}
