import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        int option;
        do {
            //Menu
            System.out.println("1. Aniadir elementos");
            System.out.println("2. Verificar si un valor esta en el arbol (buscar)");
            System.out.println("3. Borrar Elemento");
            System.out.println("4. Recorrer el arbol");
            System.out.println("5. Salir");

            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Valor a ingresar:");
                    String valor = sc.next();
                    System.out.println("Antes de Ingresar:");
                    bt.traverseInOrder(bt.root);
                    bt.add(Integer.parseInt(valor));
                    System.out.println();
                    System.out.println("Despues de Ingresar:");
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingrese valor a buscar:");
                    valor = sc.next();
                    System.out.println(bt.containsNode(Integer.parseInt(valor)));
                    break;
                case 3:
                    System.out.println("Valor a borrar:");
                    valor = sc.next();
                    System.out.println("Antes de borrar:");
                    bt.traverseInOrder(bt.root);
                    bt.delete(Integer.parseInt(valor));
                    System.out.println();
                    System.out.println("Despues de borrar:");
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("In-Order:");
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    System.out.println("Pre-Order:");
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    System.out.println("Post-Order:");
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    System.out.println("Visits all the nodes of a level before going to the next level:");
                    bt.traverseLevelOrder();
                    System.out.println();
                    break;
            }
        } while (option != 5);

    }
}
