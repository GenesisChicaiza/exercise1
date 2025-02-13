package src.mates;

import java.util.ArrayList;
import java.util.List;

public class Funciones{

    //1
    public static int suma(int n){
        int acumulado = 0;
        for(int i = 1; i <= n; i++){
            acumulado += i; //añade y lo iguala
        }
        return acumulado;
    }

    //2
    public static int factorial(int n){
        int torial = 1;
        for(int i = 1;  i <= n; i++){
            torial *= i;
        }
        return torial;
    }


    //3
    public static int potencias(int base, int exponente){
        int poten = 1;
        for (int i=1; i <= exponente; i++){
            poten *= base;
        }
        return poten;
    }

    //4
    public static int lista(int [] lista){
        int result = 0;

        for(int i = 0; i< lista.length; i++ ){
            result += lista[i];
        }
        return result;
    }
    //5
    public static double media(int [] lista){
        return (double) lista(lista) / lista.length;}

    //6 desviacion tipica
    public static double media(List<Double> numeros) {
        return numeros.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

    public static double desviacionTipica(List<Double> numeros, double media) {
        double sumaCuadradosDiferencias = numeros.stream()
                .mapToDouble(numero -> Math.pow(numero - media, 2))
                .sum();

        return Math.sqrt(sumaCuadradosDiferencias / numeros.size());
    }

    //7
    public static int sumaPares(int n) {
        int suma = 0;
        if (n % 2 != 0) {
            n--;
        }
        for (int i = n; i >= 2; i -= 2) {
            suma += i;
        }
        return suma;
    }

    //8
    public static int sumaParesLista(List<Integer> numeros) {
        int sum = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                sum += numero;
            }
        }

        return sum;
    }

    //9
    public static List<Integer> obtenerListaPares(List<Integer> numeros) {
        List<Integer> listaPares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero >= 2 && numero % 2 == 0) {
                listaPares.add(numero);
            }
        }

        return listaPares;
    }

    //10
    public static List<Integer> listaParesHastaN(int n) {
        List<Integer> lPares = new ArrayList<>();
        if (n % 2 != 0) {
            n--;
        }

        for (int i = n; i >= 2; i -= 2) {
            lPares.add(i);
        }

        return lPares;
    }

    //11

    public static int calcularProductoEscalar(List<Integer> lista1, List<Integer> lista2) {
        if (lista1.size() != lista2.size() || lista1.isEmpty()) {
            throw new IllegalArgumentException("Las listas deben tener el mismo tamaño y no estar vacías");
        }

        int productoEscalar = 0;

        for (int i = 0; i < lista1.size(); i++) {
            productoEscalar += lista1.get(i) * lista2.get(i);
        }

        return productoEscalar;
    }


}