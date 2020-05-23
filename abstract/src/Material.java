public abstract class Material implements Discount{
    int id;
    String Name;
//    int NSX;
    int quantity;
    int cost;

    public Material() {

    }

    public Material(int id, String Name, int NSX, int quantity, int cost) {
        this.id = id;
        this.Name = Name;
        //this.NSX = NSX;
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

   // public int getNSX() {
    //    return NSX;
  //  }

   // public void setNSX(int NSX) {
    //    this.NSX = NSX;
    //}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract int abc();
    public abstract int abcd();

    @Override
    public String toString() {
        return "id=" + id +
                ", Name='" + Name + '\'' +
               // ", NSX=" + NSX +
                ", quantity=" + quantity +
                ", cost=" + cost ;
    }

    @Override
    public int howToDiscount() {
        return 0;
    }
}

