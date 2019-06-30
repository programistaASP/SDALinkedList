package listy;

public class Main {

    public static void main(String[] args) {
        SDALinkedList mojaLista = new SDALinkedList(5);

        mojaLista = new SDALinkedList(5);
        mojaLista.add(10);
        mojaLista.add(15);
        mojaLista.add(20);
        mojaLista.add(25);
        mojaLista.add(1);
        mojaLista.add(-500);
        System.out.println(mojaLista.toString());
        mojaLista.remove(0);
        System.out.println(mojaLista.toString());


    }
}
