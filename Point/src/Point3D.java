//public class Point3D  extends Point2D {
//    private float z=0.0f;
//
//    public Point3D(float x, float y, float z){
//        super(x, y);
//        this.z=z;
//    }
//
//    public Point3D(){
//    }
//
//    public float getZ(){
//        return this.z;
//    }
//
//    public void setZ(float z){
//        this.z=z;
//    }
//
//    public void setXYZ(float x, float y, float z){
//        setXY(x, y);
//        this.z=z;
//    }
//
//    public float[] getXYZ(){
//        float[] test=new float[3];
//        test[0]=this.z;
//        test[1]=this.z;
//        test[2]=this.z;
//        return test;
//    }
//
//    @Override
//    public String toString(){
//        return "("+getX()+","+getY()+","+getZ()+")";
//    }
//    public static void main(String[] args) {
//       Point3D point3D = new Point3D();
//       point3D.setX(0);
//       point3D.setY(1);
//       point3D.setZ(2);
//       point3D.setXY(3,4);
//       System.out.println("Point3D : " + point3D.toString());
//       point3D.setXYZ(5,6,7);
//       System.out.println("Point3D : " + point3D.toString());
//
//    }
//}
