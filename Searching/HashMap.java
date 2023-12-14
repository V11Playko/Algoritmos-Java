package Searching;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        // Crear un mapa hash
        Map<String, Integer> hashMap = new java.util.HashMap<>();

        // Inserción de elementos
        hashMap.put("Uno", 1);
        hashMap.put("Dos", 2);
        hashMap.put("Tres", 3);

        // Búsqueda de un elemento
        String keyToSearch = "Tres";
        if (hashMap.containsKey(keyToSearch)) {
            int value = hashMap.get(keyToSearch);
            System.out.println("El valor asociado a '" + keyToSearch + "' es: " + value);
        } else {
            System.out.println("'" + keyToSearch + "' no encontrado en el mapa");
        }
    }
}

