package es.uax.luisgasa.gaes23.arrays;

/**
 * Clase ArrayExercises que proporciona una colección de métodos estáticos para operaciones comunes en arrays.
 * Estos métodos incluyen operaciones como encontrar el mínimo y máximo, sumar elementos, invertir arrays,
 * contar ocurrencias de un valor, entre otros. Esta clase es ideal para fines educativos y prácticos
 * para entender el manejo de arrays en Java.
 *
 * Cada método está diseñado para ser autocontenido y demuestra diferentes aspectos y técnicas
 * de manipulación de arrays. Además, el método main sirve como punto de partida para probar y
 * demostrar el uso de estos métodos.
 *
 * Ejemplo de Uso:
 * <pre>
 *     int[] miArray = {1, 2, 3, 4, 5};
 *     int suma = ArrayExercises.sumarArray(miArray);
 *     System.out.println("La suma de los elementos del array es: " + suma);
 * </pre>
 *
 * Nota: Esta clase es parte de un tutorial educativo sobre Java y no está optimizada para
 * producción.
 */
public class ArraysEjercicios01 {
    /**
     * La clase ArrayExercises contiene una serie de métodos para realizar diferentes operaciones en arrays.
     * Este método main se utiliza para demostrar y probar las funcionalidades de los métodos implementados en la clase.
     *
     * @param args Argumentos de línea de comandos no utilizados en este ejemplo.
     */
    public static void main(String[] args) {
        // Datos de prueba
        int[] arrayTest = {10, 20, 30, 40, 50};
        int[] arrayTest2 = {5, 15, 25, 35, 45};
        int[][] matrizTest = {{1, 2}, {3, 4}};
        int[][] matrizTest2 = {{2, 3}, {4, 5}};
        int valorBuscado = 20;
        int valorEliminar = 30;
        int numeroPrimos = 5;
        int rotacion = 2;
        int filtroValor = 25;
        int escalar = 3;

        // Llamadas a los métodos
        System.out.println("Suma de elementos: " + sumarArray(arrayTest));
        System.out.println("Mínimo del array: " + encontrarMinimo(arrayTest));
        System.out.println("Máximo del array: " + encontrarMaximo(arrayTest));
        System.out.println("Media de valores: " + calcularMedia(arrayTest));
        System.out.println("Array invertido: " + arrayAString(invertirArray(arrayTest)));
        System.out.println("Buscar elemento (" + valorBuscado + "): " + buscarElemento(arrayTest, valorBuscado));
        System.out.println("Contar ocurrencias de " + valorBuscado + ": " + contarOcurrencias(arrayTest, valorBuscado));

        int[] arrayOrdenado = arrayTest.clone();
        ordenarArray(arrayOrdenado);
        System.out.println("Array ordenado: " + arrayAString(arrayOrdenado));

        System.out.println("Fusionar arrays: " + arrayAString(fusionarArrays(arrayTest, arrayTest2)));
        System.out.println("Comparar arrays: " + compararArrays(arrayTest, arrayTest2));
        System.out.println("Eliminar elemento " + valorEliminar + ": " + arrayAString(eliminarElemento(arrayTest, valorEliminar)));
        System.out.println("Array a String: " + arrayAString(arrayTest));
        System.out.println("Contar pares e impares: " + arrayAString(contarParesImpares(arrayTest)));
        System.out.println("Encontrar duplicados: " + arrayAString(encontrarDuplicados(arrayTest)));
        System.out.println("Generar " + numeroPrimos + " primos: " + arrayAString(generarPrimos(numeroPrimos)));
        System.out.println("Rotar array " + rotacion + " posiciones: " + arrayAString(rotarArray(arrayTest, rotacion)));
        System.out.println("Filtrar valores mayores a " + filtroValor + ": " + arrayAString(filtrarValores(arrayTest, filtroValor)));
        System.out.println("Sumar matrices: " + arrayBidimensionalAString(sumarMatrices(matrizTest, matrizTest2)));
        System.out.println("Transponer matriz: " + arrayBidimensionalAString(transponerMatriz(matrizTest)));
        System.out.println("Multiplicar matriz por " + escalar + ": " + arrayBidimensionalAString(multiplicarMatrizEscalar(matrizTest, escalar)));
    }

    /**
     * Genera un String a partir de los elementos de un array bidimensional de enteros.
     * Método adicional para imprimir arrays bidimensionales
     *
     * @param matriz La matriz o array bidimensional a tratar
     * @return La cadena de texto que representa la matriz
     */
    private static String arrayBidimensionalAString(int[][] matriz) {
        return ""; // Implementación pendiente
    }


    /**
     * Suma los elementos de un array de enteros.
     *
     * @param array El array de enteros a sumar.
     * @return La suma de los elementos del array.
     */
    public static int sumarArray(int[] array) {
        return 0; // Implementación pendiente
    }

    /**
     * Encuentra el valor mínimo en un array de enteros.
     *
     * @param array El array de enteros.
     * @return El valor mínimo en el array.
     */
    public static int encontrarMinimo(int[] array) {
        return 0; // Implementación pendiente
    }

    /**
     * Encuentra el valor máximo en un array de enteros.
     *
     * @param array El array de enteros.
     * @return El valor máximo en el array.
     */
    public static int encontrarMaximo(int[] array) {
        return 0; // Implementación pendiente
    }

    /**
     * Calcula la media de los valores en un array de enteros.
     *
     * @param array El array de enteros.
     * @return La media de los valores.
     */
    public static double calcularMedia(int[] array) {
        return 0.0; // Implementación pendiente
    }

    /**
     * Invierte el orden de los elementos en un array de enteros.
     *
     * @param array El array de enteros a invertir.
     * @return Un nuevo array con los elementos en orden inverso.
     */
    public static int[] invertirArray(int[] array) {
        return null; // Implementación pendiente
    }

    /**
     * Busca un elemento específico en un array de enteros.
     *
     * @param array El array de enteros donde buscar.
     * @param valor El valor a buscar.
     * @return true si el valor está en el array, false de lo contrario.
     */
    public static boolean buscarElemento(int[] array, int valor) {
        return false; // Implementación pendiente
    }

    /**
     * Cuenta las ocurrencias de un valor específico en un array de enteros.
     *
     * @param array El array de enteros.
     * @param valor El valor a contar.
     * @return El número de veces que aparece el valor en el array.
     */
    public static int contarOcurrencias(int[] array, int valor) {
        return 0; // Implementación pendiente
    }

    /**
     * Ordena un array de enteros de menor a mayor.
     *
     * @param array El array de enteros a ordenar.
     */
    public static void ordenarArray(int[] array) {
        // Implementación pendiente
    }

    /**
     * Fusiona dos arrays de enteros en uno nuevo.
     *
     * @param array1 El primer array de enteros.
     * @param array2 El segundo array de enteros.
     * @return Un nuevo array que contiene todos los elementos de array1 y array2.
     */
    public static int[] fusionarArrays(int[] array1, int[] array2) {
        return null; // Implementación pendiente
    }

    /**
     * Compara dos arrays de enteros para verificar si son iguales.
     *
     * @param array1 El primer array de enteros.
     * @param array2 El segundo array de enteros.
     * @return true si ambos arrays son iguales, false de lo contrario.
     */
    public static boolean compararArrays(int[] array1, int[] array2) {
        return false; // Implementación pendiente
    }

    /**
     * Elimina la primera ocurrencia de un valor específico de un array de enteros.
     *
     * @param array El array de enteros.
     * @param valor El valor a eliminar.
     * @return Un nuevo array sin la primera ocurrencia del valor.
     */
    public static int[] eliminarElemento(int[] array, int valor) {
        return null; // Implementación pendiente
    }

    /**
     * Convierte un array de enteros a una cadena de texto.
     *
     * @param array El array de enteros.
     * @return Una cadena representando el array.
     */
    public static String arrayAString(int[] array) {
        return null; // Implementación pendiente
    }

    /**
     * Cuenta el número de elementos pares e impares en un array de enteros.
     *
     * @param array El array de enteros.
     * @return Un array de dos elementos, el primero indica la cantidad de pares y el segundo la de impares.
     */
    public static int[] contarParesImpares(int[] array) {
        return null; // Implementación pendiente
    }

    /**
     * Encuentra los elementos duplicados en un array de enteros.
     *
     * @param array El array de enteros.
     * @return Un nuevo array con los elementos duplicados en el array original.
     */
    public static int[] encontrarDuplicados(int[] array) {
        return null; // Implementación pendiente
    }

    /**
     * Genera un array con los primeros n números primos.
     *
     * @param n La cantidad de números primos a generar.
     * @return Un array de enteros conteniendo los primeros n números primos.
     */
    public static int[] generarPrimos(int n) {
        return null; // Implementación pendiente
    }

    /**
     * Rota los elementos de un array de enteros n posiciones.
     *
     * @param array El array de enteros a rotar.
     * @param n     El número de posiciones a rotar.
     * @return Un nuevo array con los elementos rotados.
     */
    public static int[] rotarArray(int[] array, int n) {
        return null; // Implementación pendiente
    }

    /**
     * Filtra un array de enteros, devolviendo un nuevo array con los elementos mayores a un valor dado.
     *
     * @param array El array de enteros.
     * @param valor El valor umbral para el filtro.
     * @return Un nuevo array con los elementos mayores a valor.
     */
    public static int[] filtrarValores(int[] array, int valor) {
        return null; // Implementación pendiente
    }

    /**
     * Suma dos matrices (arrays bidimensionales) de enteros.
     *
     * @param matriz1 La primera matriz de enteros.
     * @param matriz2 La segunda matriz de enteros.
     * @return Una nueva matriz que es la suma de matriz1 y matriz2.
     */
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        return null; // Implementación pendiente
    }

    /**
     * Transpone una matriz (array bidimensional) de enteros.
     *
     * @param matriz La matriz de enteros a transponer.
     * @return Una nueva matriz que es la transpuesta de matriz.
     */
    public static int[][] transponerMatriz(int[][] matriz) {
        return null; // Implementación pendiente
    }

    /**
     * Multiplica cada elemento de una matriz de enteros por un escalar.
     *
     * @param matriz  La matriz de enteros.
     * @param escalar El número entero (escalar) por el cual multiplicar cada elemento de la matriz.
     * @return Una nueva matriz con cada elemento multiplicado por el escalar.
     */
    public static int[][] multiplicarMatrizEscalar(int[][] matriz, int escalar) {
        return null; // Implementación pendiente
    }
}
