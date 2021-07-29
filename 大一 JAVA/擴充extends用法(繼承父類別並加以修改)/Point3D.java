public class Point3D extends Point2D { //extends class Point2D
    private int z;  //new a private direction 

    public Point3D() { 
        z = 0; 
    } 
    //construct func. meanwhile assign to call up Base class to extends it.
    Point3D(int x, int y, int z) { 
        super(x, y); 
        this.z = z; 
    }
    //get and set new direction
    public int getZ() {return z;}
    public void setZ(int z) {this.z = z;} 
}