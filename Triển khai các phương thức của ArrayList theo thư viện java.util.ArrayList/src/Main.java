public class Main {
    public static void main(String[] args) {
        Mylist<String> myList = new Mylist<>(0);
        myList.add(0, "haha");
        myList.add(1, "hihi");
        myList.add("huhu");
        myList.add("há há");
        myList.add(2, "hí hí");
        myList.add(3, "he he");
        myList.add("hê hê");

        System.out.println(myList.add("hơ hơ"));
        System.out.println(myList.remove(1));
        System.out.println(myList.print());
        System.out.println(myList.size());
        System.out.println(myList.clone());
        System.out.println(myList.indexOf("hế hế"));
        System.out.println(myList.contains("hề hề "));
        System.out.println(myList.get(3));
        myList.clear();
        System.out.println(myList.print());
    }
}
