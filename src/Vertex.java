public class Vertex {

    public int x;
    public int y;
    public int z;
    public int scaleX;
    public int scaleY;
    public int scaleZ;
    public int translateX;
    public int translateY;
    public int translateZ;
    public double rotateX;
    public double rotateY;
    public double rotateZ;

    public Vertex(int x, int y, int z, int scaleX, int scaleY, int scaleZ, int translateX, int translateY,
                  int translateZ,
                  double rotateX, double rotateY, double rotateZ) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.scaleZ = scaleZ;
        this.translateX = translateX;
        this.translateY = translateY;
        this.translateZ = translateZ;
        this.rotateX = rotateX;
        this.rotateY = rotateY;
        this.rotateZ = rotateZ;
    }

}
