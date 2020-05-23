public class Main {
    public static void main(String[] args) {
        Material[] materials = new Material[10];
        materials[0] = new meat();
        materials[1] = new CrispyFlour();
        materials[2] = new meat();
        materials[3] = new CrispyFlour();
        materials[4] = new meat();
        materials[5] = new CrispyFlour();
        materials[6] = new meat();
        materials[7] = new CrispyFlour();
        materials[8] = new meat();
        materials[9] = new CrispyFlour();
        for (Material A: materials){
            System.out.println(A);
        }
    }
}
