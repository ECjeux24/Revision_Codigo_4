package com.generation;
import java.util.Scanner; // se nombra la libreria para el uso del scanner

public class Codigo4 {

public statatic void main (String[] args){ // hacia falta la funcion para correr el codigo

Scanner s = new Scanner( system.in); // instanciamos para recibir el dato
System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
String j1 = s.next();

System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
Scanner s2 = new Scanner( system.in);
String j2 = s2.next(); // llamamos de manera correcta la variable

if (j1 == j2)) {
  System.out.println("Empate");
} else {
  int g = 2;
  switch(j1) {
    case "piedra":
      if (j2 == "tijeras") {
        g = 1;
      }
    case "papel":
      if (j2 == "piedra") {
        g = 1;
  }
    case "tijera":
      if (j2=="papel") {
        g = 1;
      }
      break;
    default:
         g=2; // si ninguno de los casos se cumple gana 2
  }
  System.out.println("Gana el jugador " + g);
}
}

}
  
  
}
