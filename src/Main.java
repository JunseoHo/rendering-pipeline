import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vertex> vertices = new ArrayList<>();
        vertices.add(new Vertex(1, 1, 1, 5, 5, 10, 20, 10, 20,
                Math.toRadians(45), Math.toRadians(30), Math.toRadians(60)));
        vertices.add(new Vertex(1, 1, -1, 5, 5, 10, 20, 10, 20,
                Math.toRadians(45), Math.toRadians(30), Math.toRadians(60)));
        vertices.add(new Vertex(1, -1, 1, 5, 5, 10, 20, 10, 20,
                Math.toRadians(45), Math.toRadians(30), Math.toRadians(60)));
        vertices.add(new Vertex(1, -1, -1, 5, 5, 10, 20, 10, 20,
                Math.toRadians(45), Math.toRadians(30), Math.toRadians(60)));
        vertices.add(new Vertex(-1, 1, 1, 5, 5, 10, 20, 10, 20,
                Math.toRadians(45), Math.toRadians(30), Math.toRadians(60)));
        vertices.add(new Vertex(-1, 1, -1, 5, 5, 10, 20, 10, 20,
                Math.toRadians(45), Math.toRadians(30), Math.toRadians(60)));
        vertices.add(new Vertex(-1, -1, 1, 5, 5, 10, 20, 10, 20,
                Math.toRadians(45), Math.toRadians(30), Math.toRadians(60)));
        vertices.add(new Vertex(-1, -1, -1, 5, 5, 10, 20, 10, 20,
                Math.toRadians(45), Math.toRadians(30), Math.toRadians(60)));
        new VertexProcessor().process(vertices);
        for (Vertex vertex : vertices) System.out.printf("x : %3d, y : %3d, z : %3d\n", vertex.x, vertex.y, vertex.z);
    }

}
