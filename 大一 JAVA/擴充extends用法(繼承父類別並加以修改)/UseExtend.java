public class UseExtend { 
    public static void main(String[] args) { 
        Point3D p1 = new Point3D(1, 3, 4); 
        Point3D p2 = new Point3D(); 
 
        System.out.printf("p1: (%d, %d, %d) \n", 
            p1.getX(), p1.getY(), p1.getZ());
 
        p2.setX(2); 
        p2.setY(4); 
        p2.setZ(6);
        System.out.printf("p2: (%d, %d, %d) \n", 
            p2.getX(), p2.getY(), p2.getZ()); 
    } 
}