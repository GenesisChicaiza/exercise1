package src.mates;


import java.util.List;



public class Principal{
    public static void main(String[] args) {
        //1
        System.out.println("La suma de los numeros hasta el 10 es "+ Funciones.suma(10));
        //2
        System.out.println("Factorial de 5: " + Funciones.factorial(5));
        //3
        System.out.println("La potencia de 4 es : "+ Funciones.potencias(4,5));
        //4
        int [] lista = {1,2,3,4,5};
        System.out.println("la suma de la lista es: " + Funciones.lista(lista));
        //5
        System.out.println("La media aritmetica es: " + Funciones.media(lista));
        //6
        List<Double> listaNumeros = List.of(2.0, 4.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0);
        double media = Funciones.media(listaNumeros); // Almacena la media en una variable
        System.out.println("La desviación típica es: " + Funciones.desviacionTipica(listaNumeros, media));
        //7
        System.out.println("La suma de los primeros números pares hasta 9 es: " + Funciones.sumaPares(9));
        //8
        List<Integer> lNumeros = List.of(1, 2, 3, 4);

        System.out.println("La suma de los elementos pares de la lista es: " + Funciones.sumaParesLista(lNumeros));
        //9
        List<Integer> listNumeros = List.of(1, 2, 6, 11);

        List<Integer> listaPares = Funciones.obtenerListaPares(listNumeros);

        System.out.println("Lista de números pares: " + listaPares);

        //10

        List<Integer> lisPar = Funciones.listaParesHastaN(9);
        System.out.println("Lista de los primeros números pares hasta " + 9 + ": " + listaPares);
        //11
        List<Integer> lista1 = List.of(1, 2, 3);
        List<Integer> lista2 = List.of(2, 4, 6);

        int productoEscalar = Funciones.calcularProductoEscalar(lista1, lista2);

        System.out.println("Producto escalar: " + productoEscalar);
    }
}

