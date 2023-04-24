import java.util.LinkedList;

public class zadacha1 {
    public static void main(String[] args) {
        
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("A");
        originalList.add("B");
        originalList.add("C");
        originalList.add("D");

        LinkedList<String> reversedList = reverseLinkedList(originalList);

        System.out.println("Начальный список: " + originalList);
        System.out.println("Перевернутый список: " + reversedList);
    }

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
