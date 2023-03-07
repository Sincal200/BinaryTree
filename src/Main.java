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

        bt.traverseInOrder(bt.root);
        System.out.println();
        System.out.println(bt.containsNode(6));
        System.out.println(bt.containsNode(4));
        System.out.println(bt.containsNode(1));
        System.out.println(bt.containsNode(9));
        //bt.delete(9);
        //bt.delete(3);
        System.out.println(bt.containsNode(9));
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        bt.traverseLevelOrder();



    }
}
