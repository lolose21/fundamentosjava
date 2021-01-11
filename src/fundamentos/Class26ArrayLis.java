package fundamentos;

import java.util.ArrayList;

public class Class26ArrayLis {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        System.out.println("numero de elementos :" + lista.size());
        lista.add("primer");
        lista.add("segundo");
        lista.add("tercero");
        lista.add("primero");

        lista.add(1, "cuatro");

        lista.set(1, "modificado");
        //eliminar un elemento
        lista.remove(1);
        //eliminar un elemento por objeto
        lista.remove("primero");
        //buscar un elemento
        //lista.contains()
        int posicion = lista.indexOf("primero");
        System.out.println("la posicion de primero es:" + posicion);
        int pos = lista.lastIndexOf("primero");
        System.out.println("la posicion de lastindexof" + pos);
        System.out.println("numero de elementos :" + lista.size());
        for (int i = 0; i < lista.size(); i++) {
            String dato = lista.get(i);
            System.out.println(i + "  : " + dato);

        }
        //recorre conjuntos con bucles de referencia
        //una referencia es una variable que apunta a un objeto
        //en lugar de declarar una variable
        //contador(no existe) se recorre con un objeto
        //y finaliza cuando no hay mas objetos a recorrer.
        //sintaxis :
        //for (tipo variable : conjunto) {//variable es la diferencia}
        for (String dato : lista) {
            System.out.println(dato);

        }
        //eliminar todos los elementos de la coleccion
        lista.clear();
        System.out.println("numero de elementos : " + lista.size());
    }

}
