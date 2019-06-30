package listy;

public class SDALinkedList {
    Node head;

    public SDALinkedList(Node head) {
        this.head = head;       // konstruktor przyjmujacy node'a
    }

    public SDALinkedList() {
    } // konstruktor bezparametrowy

    public SDALinkedList(int value) {
        Node toAdd = new Node(value);
        head = toAdd;
    } //konstruktor przyjmujacy wartosc, tworzy noda, ustawia head'a na tego noda

    public void add(int value) {
        Node temp = head; // ustawiamy poczatek pracy na poczatek listy
        while (temp.getNext() != null) { //dopoki mozemy znalezc nastepny element
            temp = temp.getNext(); //dopoty przechodzimy do nastepnego wezla
        }
        temp.setNext(new Node(value)); // ustawiwamy ostatniemu wezlowi wskaznik na nastepny, ktory stanie sie 'ostatni'
    }

    public void remove(int index) {
        Node temp = head; // zaczynamy prace od poczatku listy
        Node prevToRemovingOne = null; // ustawiamy sobie wezel poprzedzajacy ten do usuniecia na null - uwaga, moze generowac nullPointerException
        for (int i = 0; i < index; i++) { // ta petla pozwala nam iterowac tak dlugo az dojdziemy do wezla, ktory chcemy usunac
            if (i == index - 1) { //warunek sprwadzajacy, czy jestesmy w wezle poprzedzajacy ten, ktory chcemy usunac
                prevToRemovingOne = temp;
            }
            temp = temp.getNext(); // przejscie do nastepnego node'a
        }
        prevToRemovingOne.setNext(temp.getNext()); //ustawienie 'nexta' wezlowi n-1 na wezel n+1 -> pomieniecie wezla do usuniecia, ergo jego usuniecie
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else return false;
    }

    public int size() {
        Node temp = head;
        int index = 0;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            index++;
        }
        return index + 1;
    }

    public int getFirst() {
        Node temp = head;
        return head.getValue();
    }

    public int getLast() {
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();

        }
        return temp.getValue();
    }

    public int get() {
        Node temp = head;
        int index = 0;
        for (int i = 0; i < size(); i++) {
            temp = temp.getNext();
            if (i == index-1) {
                return temp.getValue();
            }
        }
        return -1;
    }






    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node temp = head;
        sb.append(temp.getValue());
        while (temp.getNext() != null) {
            temp = temp.getNext();
            sb.append(", " + temp.getValue());
        }
        sb.append(']');
        return sb.toString();
    }
}
