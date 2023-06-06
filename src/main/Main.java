package main;


import function.Function;
import function.FunctionImplement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

   public static void main(String[] args) {

      Function functions = new FunctionImplement();

      functions.reverce("hola como estas");

      String[] names = {
              "juan",
              "Adrian",
              "Felipe",
              "Eustaquio",
              "Jimena",
              "Diego"
      };

      for (String name: names) {
         System.out.println(name);
      }

      int[][] bidimencional= new int[2][5];
      bidimencional[0][0] = 20;
      bidimencional[0][1] = 21;
      bidimencional[0][2] = 22;
      bidimencional[0][3] = 23;
      bidimencional[0][4] = 24;
      bidimencional[1][0] = 26;
      bidimencional[1][1] = 27;
      bidimencional[1][2] = 28;
      bidimencional[1][3] = 29;
      bidimencional[1][4] = 30;


      for (int i = 0; i < bidimencional.length; i++) {
         for (int j = 0; j < bidimencional[i].length; j++) {
            int vA = i+j;
            System.out.println("posicion actual es " + vA +" y valor es " + bidimencional[i][j] );
         }
      }

      Vector<Integer> vector = new Vector();
      vector.add(1);
      vector.add(2);
      vector.add(3);
      vector.add(4);
      vector.add(5);
      vector.remove(1);
      vector.remove(1);
      System.out.println(vector);

      /**/

      ArrayList<Integer> arrayList = new ArrayList();

      arrayList.add(10);
      arrayList.add(20);
      arrayList.add(30);
      arrayList.add(40);

      LinkedList<ArrayList> listLinkedList = new LinkedList();

      listLinkedList.add(arrayList);
      for (int i = 0; i < listLinkedList.size(); i++) {
         System.out.println(listLinkedList.getFirst());
      }



   }
}
