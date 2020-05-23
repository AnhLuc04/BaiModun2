package exercise;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(0);
        myList.add(0, "Alex Woo");
        myList.add(1, "Hoang Nam");
        myList.add("Nguyen Phuong");
        myList.add("Oanh Nguyen");
        myList.add(2, "Hang Nguyen");
        myList.add(3, "Hue Nguyen");
        myList.add("Ngo Thuan");

        System.out.println(myList.add("Hang Nguyen"));
        System.out.println(myList.remove(1));
        System.out.println(myList.print());
        System.out.println(myList.size());
        System.out.println(myList.clone());
        System.out.println(myList.indexOf("Hoang Nam"));
        System.out.println(myList.contains("Oanh Nguyen"));
        System.out.println(myList.get(3));
        myList.clear();
        System.out.println(myList.print());
    }
}
