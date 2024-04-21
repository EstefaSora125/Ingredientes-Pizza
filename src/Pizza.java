import java.util.*;
public class Pizza {
    private final String QUESO = "Queso";

    public void createPizza(){
        int option = 0;
        boolean menu = false;
        String ingredients = "";
        Scanner scanner =  new Scanner(System.in);

        while (!menu){
            System.out.println("Bienvenido a la pizzeria :3" + "\n"
                    + "Ingresa los ingredientes que quieres añadir a tu pizza"+ "\n"
                    + "1. Queso" + "\n"
                    + "2. Ninguno de los ingredientes" + "\n"
                    + "3. Salir" + "\n");

            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("------------Queso agregado------" + "\n");
                    ingredients = ingredients + "\n" + QUESO;
                    break;
                case 2:
                    menu = true;
                    break;
                case 3:
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
