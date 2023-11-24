# Arrays: Ejercicios en Java

- Destinatario original: Informática. 1º Grado en Ingeniería Aeroespacial. UAX.
- Fecha creación: 24/11/2023 
- Documento original: [Arrays: Ejercicios en Java (*Notion*)](https://luisgasa-uax.notion.site/Ejercicios-Arrays-y-m-todos-en-Java-1-e9289c88f3b146ed86a842758fbf15eb?pvs=4)

## Contenidos:
package es.uax.luisgasa.gaes23.arrays;
### ArrayEjercicios01


Clase ArrayExercises que proporciona una colección de métodos estáticos para operaciones comunes en arrays.
Estos métodos incluyen operaciones como encontrar el mínimo y máximo, sumar elementos, invertir arrays, contar ocurrencias de un valor, entre otros. Esta clase es ideal para fines educativos y prácticos para entender el manejo de arrays en Java.

Cada método está diseñado para ser autocontenido y demuestra diferentes aspectos y técnicas de manipulación de arrays. Además, el método main sirve como punto de partida para probar y demostrar el uso de estos métodos.

Ejemplo de Uso:
```
    int[] miArray = {1, 2, 3, 4, 5};
    int suma = ArrayExercises.sumarArray(miArray);
    System.out.println("La suma de los elementos del array es: " + suma);
```

Nota: Esta clase es parte de un tutorial educativo sobre Java y no está optimizada para
producción.

1. Suma los elementos de un array de enteros.

   `public static int sumarArray(int[] array) `

2. Encuentra el valor mínimo en un array de enteros.

   `public static int encontrarMinimo(int[] array) `

3. Encuentra el valor máximo en un array de enteros.

   `public static int encontrarMaximo(int[] array) `

4. Calcula la media de los valores en un array de enteros.

   `public static double calcularMedia(int[] array) `

6. Invierte el orden de los elementos en un array de enteros.

   `public static int[] invertirArray(int[] array) `

7. Busca un elemento específico en un array de enteros.

   `public static boolean buscarElemento(int[] array, int valor) `

7. Cuenta las ocurrencias de un valor específico en un array de enteros.

   `public static int contarOcurrencias(int[] array, int valor) `

8. Ordena un array de enteros de menor a mayor.

   `public static void ordenarArray(int[] array) `

9. Fusiona dos arrays de enteros en uno nuevo.

   `public static int[] fusionarArrays(int[] array1, int[] array2) `

10. Compara dos arrays de enteros para verificar si son iguales.

    `public static boolean compararArrays(int[] array1, int[] array2) `

11. Elimina la primera ocurrencia de un valor específico de un array de enteros.

    `public static int[] eliminarElemento(int[] array, int valor) `

12. Convierte un array de enteros a una cadena de texto.

    `public static String arrayAString(int[] array) `

13. Cuenta el número de elementos pares e impares en un array de enteros.

    `public static int[] contarParesImpares(int[] array) `

14. Encuentra los elementos duplicados en un array de enteros.

    `public static int[] encontrarDuplicados(int[] array) `

15. Genera un array con los primeros n números primos.

    `public static int[] generarPrimos(int n) `

16. Rota los elementos de un array de enteros n posiciones.

    `public static int[] rotarArray(int[] array, int n) `

17. Filtra un array de enteros, devolviendo un nuevo array con los elementos mayores a un valor dado.

    `public static int[] filtrarValores(int[] array, int valor) `

18. Suma dos matrices (arrays bidimensionales) de enteros.

    `public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) `

19. Transpone una matriz (array bidimensional) de enteros.

    `public static int[][] transponerMatriz(int[][] matriz) `

20. Multiplica cada elemento de una matriz de enteros por un escalar.

    `public static int[][] multiplicarMatrizEscalar(int[][] matriz, int escalar) `



##### Calificaciones según ejercicio

| Nº Ejercicio | Nombre del Ejercicio | Complejidad (1-5) |
| --- | --- | --- |
| 1 | Suma de Elementos | 2 |
| 2 | Mínimo del Array | 2 |
| 3 | Máximo del Array | 2 |
| 4 | Media de Valores | 3 |
| 5 | Invertir Array | 3 |
| 6 | Buscar Elemento | 2 |
| 7 | Contar Ocurrencias | 3 |
| 8 | Ordenar Array | 4 |
| 9 | Fusionar Arrays | 3 |
| 10 | Comparar Arrays | 3 |
| 11 | Eliminar Elemento | 3 |
| 12 | Array a String | 2 |
| 13 | Contar Pares e Impares | 3 |
| 14 | Encontrar Duplicados | 4 |
| 15 | Array de Primos | 4 |
| 16 | Rotar Array | 3 |
| 17 | Filtrar Valores | 3 |
| 18 | Suma de Matrices | 4 |
| 19 | Transponer Matriz | 4 |
| 20 | Multiplicar Matriz | 4 |

## Test unitarios:
- [Test unitarios para ArrayEjercicios01](test/es/uax/luisgasa/gaes23/arrays/ArraysEjercicios01Test.java)
- [ArrayPrimosTest.java](test%2Fes%2Fuax%2Fluisgasa%2Fgaes23%2Farrays%2FArrayPrimosTest.java)
