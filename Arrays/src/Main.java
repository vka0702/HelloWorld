import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        String ht = "nme";
//        String ju = "nme";
//
//        System.out.println(ht.hashCode());
//        System.out.println(ju.hashCode());

//        Map<String, Cat> mapOfCats = new HashMap<String, Cat>();
        List<Cat> listOfCtas = new ArrayList<>();

        Cat catOne = new Cat( "Habib", 2);
        Cat catTwo = new Cat( "Conor", 2);
        Cat catThree = new Cat( "Dzyuba", 4);
        Cat catFour = new Cat( "Kokorin", 3);

        listOfCtas.add(catOne);
        listOfCtas.add(catTwo);
        listOfCtas.add(catThree);
        listOfCtas.add(catFour);

        //listOfCtas.get(1).more();
        System.out.println("--------------------------------------");
        System.out.println(listOfCtas.get(0).name);

        listOfCtas.get(0).more();

//        mapOfCats.put(catOne.name, catOne);
//        mapOfCats.put(catTwo.name, catTwo);
//        mapOfCats.put(catThree.name, catThree);
//        mapOfCats.put(catFour.name, catFour);
//
//        System.out.println("________________________________");


//        System.out.println(catOne.hashCode());
//        System.out.println(catTwo.hashCode());
//        System.out.println(catThree.hashCode());
//        System.out.println(catFour.hashCode());




//        int [][] elements = new int[3][3];
//        elements[1][1]=9;
//        System.out.println(elements[1][2]);

//        for (int x=0; x<3; x++){
//            System.out.println("");
//            for (int y=0; y<3; y++) {
//                if (elements[x][y] != 0){
//                    System.out.print(elements[x][y] + " ");
//                    continue;
//                }
//                elements[x][y]=1;
//                System.out.print(elements[x][y] + " ");
//            }
//        }

//        String [] cats = new String[4];
//
//        cats[0] = "Valasquez";
//        cats[1] = "Habib";
//        cats[2] = "Conor";
//        cats[3] = "Dos Santos";

//        System.out.println("\n");
//        System.out.println(cats[0]);
//        System.out.println(cats[1]);
//        System.out.println(cats[2]);
//        System.out.println(cats[3]);
//        System.out.println(elements.length);

    }
}
