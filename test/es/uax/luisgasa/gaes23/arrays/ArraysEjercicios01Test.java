package es.uax.luisgasa.gaes23.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysEjercicios01Test {

    @Test
    public void testSumarArray() {
        assertEquals(15, ArraysEjercicios01.sumarArray(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, ArraysEjercicios01.sumarArray(new int[]{}));
        assertEquals(-1, ArraysEjercicios01.sumarArray(new int[]{-1, 0, 1}));
        assertEquals(10, ArraysEjercicios01.sumarArray(new int[]{10}));
    }

    @Test
    public void testEncontrarMinimo() {
        assertEquals(1, ArraysEjercicios01.encontrarMinimo(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-3, ArraysEjercicios01.encontrarMinimo(new int[]{-1, -2, -3}));
        assertEquals(0, ArraysEjercicios01.encontrarMinimo(new int[]{0, 5, 10}));
        assertEquals(7, ArraysEjercicios01.encontrarMinimo(new int[]{7}));
    }

    @Test
    public void testEncontrarMaximo() {
        assertEquals(5, ArraysEjercicios01.encontrarMaximo(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-1, ArraysEjercicios01.encontrarMaximo(new int[]{-1, -2, -3}));
        assertEquals(10, ArraysEjercicios01.encontrarMaximo(new int[]{0, 5, 10}));
        assertEquals(7, ArraysEjercicios01.encontrarMaximo(new int[]{7}));
    }

    @Test
    public void testCalcularMedia() {
        assertEquals(3.0, ArraysEjercicios01.calcularMedia(new int[]{1, 2, 3, 4, 5}), 0.001);
        assertEquals(0.0, ArraysEjercicios01.calcularMedia(new int[]{}), 0.001);
        assertEquals(0.0, ArraysEjercicios01.calcularMedia(new int[]{-1, 1}), 0.001);
        assertEquals(2.5, ArraysEjercicios01.calcularMedia(new int[]{2, 3}), 0.001);
    }

    @Test
    public void testInvertirArray() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArraysEjercicios01.invertirArray(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.invertirArray(new int[]{}));
        assertArrayEquals(new int[]{1}, ArraysEjercicios01.invertirArray(new int[]{1}));
        assertArrayEquals(new int[]{-1, 0, 1}, ArraysEjercicios01.invertirArray(new int[]{1, 0, -1}));
    }

    @Test
    public void testBuscarElemento() {
        assertTrue(ArraysEjercicios01.buscarElemento(new int[]{1, 2, 3, 4, 5}, 3));
        assertFalse(ArraysEjercicios01.buscarElemento(new int[]{1, 2, 3, 4, 5}, 6));
        assertFalse(ArraysEjercicios01.buscarElemento(new int[]{}, 3));
        assertTrue(ArraysEjercicios01.buscarElemento(new int[]{3}, 3));
    }

    @Test
    public void testContarOcurrencias() {
        assertEquals(2, ArraysEjercicios01.contarOcurrencias(new int[]{1, 3, 3, 4, 5}, 3));
        assertEquals(0, ArraysEjercicios01.contarOcurrencias(new int[]{1, 2, 3, 4, 5}, 6));
        assertEquals(0, ArraysEjercicios01.contarOcurrencias(new int[]{}, 3));
        assertEquals(1, ArraysEjercicios01.contarOcurrencias(new int[]{3}, 3));
    }

    @Test
    public void testOrdenarArray() {
        int[] array1 = {5, 4, 3, 2, 1};
        ArraysEjercicios01.ordenarArray(array1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array1);

        int[] array2 = {};
        ArraysEjercicios01.ordenarArray(array2);
        assertArrayEquals(new int[]{}, array2);

        int[] array3 = {1};
        ArraysEjercicios01.ordenarArray(array3);
        assertArrayEquals(new int[]{1}, array3);

        int[] array4 = {-1, 1, 0};
        ArraysEjercicios01.ordenarArray(array4);
        assertArrayEquals(new int[]{-1, 0, 1}, array4);
    }

    @Test
    public void testFusionarArrays() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, ArraysEjercicios01.fusionarArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6, 7}));
        assertArrayEquals(new int[]{1, 2, 3}, ArraysEjercicios01.fusionarArrays(new int[]{}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, ArraysEjercicios01.fusionarArrays(new int[]{1, 2, 3}, new int[]{}));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.fusionarArrays(new int[]{}, new int[]{}));
    }

    @Test
    public void testCompararArrays() {
        assertTrue(ArraysEjercicios01.compararArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertFalse(ArraysEjercicios01.compararArrays(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
        assertFalse(ArraysEjercicios01.compararArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4}));
        assertTrue(ArraysEjercicios01.compararArrays(new int[]{}, new int[]{}));
    }

    @Test
    public void testEliminarElemento() {
        assertArrayEquals(new int[]{1, 3, 4, 5}, ArraysEjercicios01.eliminarElemento(new int[]{1, 2, 3, 4, 5}, 2));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArraysEjercicios01.eliminarElemento(new int[]{1, 2, 3, 4, 5}, 6));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.eliminarElemento(new int[]{}, 2));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.eliminarElemento(new int[]{2}, 2));
    }

    @Test
    public void testArrayAString() {
        assertEquals("1 2 3 4 5", ArraysEjercicios01.arrayAString(new int[]{1, 2, 3, 4, 5}));
        assertEquals("", ArraysEjercicios01.arrayAString(new int[]{}));
        assertEquals("3", ArraysEjercicios01.arrayAString(new int[]{3}));
        assertEquals("-1 0 1", ArraysEjercicios01.arrayAString(new int[]{-1, 0, 1}));
    }

    @Test
    public void testContarParesImpares() {
        assertArrayEquals(new int[]{2, 3}, ArraysEjercicios01.contarParesImpares(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{0, 0}, ArraysEjercicios01.contarParesImpares(new int[]{}));
        assertArrayEquals(new int[]{1, 0}, ArraysEjercicios01.contarParesImpares(new int[]{2}));
        assertArrayEquals(new int[]{1, 1}, ArraysEjercicios01.contarParesImpares(new int[]{2, 3}));
    }

    @Test
    public void testEncontrarDuplicados() {
        assertArrayEquals(new int[]{2, 3}, ArraysEjercicios01.encontrarDuplicados(new int[]{1, 2, 2, 3, 3}));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.encontrarDuplicados(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.encontrarDuplicados(new int[]{}));
        assertArrayEquals(new int[]{1}, ArraysEjercicios01.encontrarDuplicados(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void testGenerarPrimos() {
        assertArrayEquals(new int[]{2, 3, 5, 7, 11}, ArraysEjercicios01.generarPrimos(5));
        assertArrayEquals(new int[]{2}, ArraysEjercicios01.generarPrimos(1));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.generarPrimos(0));
        assertArrayEquals(new int[]{2, 3, 5}, ArraysEjercicios01.generarPrimos(3));
    }

    @Test
    public void testRotarArray() {
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, ArraysEjercicios01.rotarArray(new int[]{1, 2, 3, 4, 5}, 2));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArraysEjercicios01.rotarArray(new int[]{1, 2, 3, 4, 5}, 5));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.rotarArray(new int[]{}, 3));
        assertArrayEquals(new int[]{1}, ArraysEjercicios01.rotarArray(new int[]{1}, 10));
    }

    @Test
    public void testFiltrarValores() {
        assertArrayEquals(new int[]{4, 5}, ArraysEjercicios01.filtrarValores(new int[]{1, 2, 3, 4, 5}, 3));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.filtrarValores(new int[]{1, 2, 3}, 4));
        assertArrayEquals(new int[]{}, ArraysEjercicios01.filtrarValores(new int[]{}, 1));
        assertArrayEquals(new int[]{2}, ArraysEjercicios01.filtrarValores(new int[]{2}, 1));
    }

    @Test
    public void testSumarMatrices() {
        assertArrayEquals(new int[][]{{3, 5}, {7, 9}}, ArraysEjercicios01.sumarMatrices(new int[][]{{1, 2}, {3, 4}}, new int[][]{{2, 3}, {4, 5}}));
        assertArrayEquals(new int[][]{}, ArraysEjercicios01.sumarMatrices(new int[][]{}, new int[][]{}));
        // Considerar agregar pruebas adicionales para matrices de diferentes tamaños o con casos especiales.
    }

    @Test
    public void testTransponerMatriz() {
        assertArrayEquals(new int[][]{{1, 3}, {2, 4}}, ArraysEjercicios01.transponerMatriz(new int[][]{{1, 2}, {3, 4}}));
        assertArrayEquals(new int[][]{}, ArraysEjercicios01.transponerMatriz(new int[][]{}));
        // Considerar agregar pruebas adicionales para matrices no cuadradas o con casos especiales.
    }

    @Test
    public void testMultiplicarMatrizEscalar() {
        assertArrayEquals(new int[][]{{2, 4}, {6, 8}}, ArraysEjercicios01.multiplicarMatrizEscalar(new int[][]{{1, 2}, {3, 4}}, 2));
        assertArrayEquals(new int[][]{}, ArraysEjercicios01.multiplicarMatrizEscalar(new int[][]{}, 2));
        assertArrayEquals(new int[][]{{-2, -4}, {-6, -8}}, ArraysEjercicios01.multiplicarMatrizEscalar(new int[][]{{1, 2}, {3, 4}}, -2));
        // Considerar agregar pruebas adicionales para matrices de diferentes tamaños o con casos especiales.
    }

}
