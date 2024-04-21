import java.util.*;
public class Pizza {
    private final String CHEESE = "Queso";
    private final String MUSHROOM = "Champiñón";

    public void createPizza(){
        int option = 0;
        boolean menu = false;
        String ingredients = "";
        Scanner scanner =  new Scanner(System.in);

        while (!menu){
            System.out.println("Bienvenido a la pizzeria" + "\n"
                    + "Ingresa los ingredientes que quieres añadir a tu pizza"+ "\n"
                    + "1. Queso" + "\n"
                    + "2. Champiñón" + "\n"
                    + "3. Ninguno de los ingredientes" + "\n"
                    + "4. Salir" + "\n");

            option = scanner.nextInt();

            switch (option){
                case 1:
                    ingredients = ingredients + "\n" + CHEESE;
                    break;
                case 2:
                    ingredients = ingredients + "\n" + MUSHROOM;
                    break;
                case 3:
                    menu = true;
                    break;
                case 4:
                    menu = true;
                    break;
                default:
                    System.out.println("Opción no permitida");
                    break;
            }
        }
        if (ingredients.equals("")){
            System.out.println("Usted no agregó ningún ingrediente");
        }else{
            System.out.println("Su pizza tiene  los siguientes ingredientes: " + ingredients);
        }

    }
}
