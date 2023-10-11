import java.util.List;

public class VertexProcessor {

    public void process(List<Vertex> vertices) {
        for (int i = 0; i < vertices.size(); i++) {
            Vertex vertex = vertices.get(i);
            vertex = worldTransform(vertex);
            vertices.set(i, vertex);
        }
    }

    private Vertex worldTransform(Vertex vertex) {
        // convert to column vector
        double[][] coordinates = new double[][]{
                {(double) vertex.x},
                {(double) vertex.y},
                {(double) vertex.z},
                {1}
        };
        // scale
        double[][] scaleMatrix = new double[][]{
                {vertex.scaleX, 0, 0, 0},
                {0, vertex.scaleY, 0, 0},
                {0, 0, vertex.scaleZ, 0},
                {0, 0, 0, 1}
        };
        coordinates = Matrix.multiplication(scaleMatrix, coordinates);
        // translate
        double[][] translateMatrix = new double[][]{
                {1, 0, 0, vertex.translateX},
                {0, 1, 0, vertex.translateY},
                {0, 0, 1, vertex.translateZ},
                {0, 0, 0, 1}
        };
        coordinates = Matrix.multiplication(translateMatrix, coordinates);
        // rotate by x
        double[][] rotateByXMatrix = new double[][]{
                {1, 0, 0, 0},
                {0, Math.cos(vertex.rotateX), -Math.sin(vertex.rotateX), 0},
                {0, Math.sin(vertex.rotateX), Math.cos(vertex.rotateX), 0},
                {0, 0, 0, 1}
        };
        coordinates = Matrix.multiplication(rotateByXMatrix, coordinates);
        // rotate by y
        double[][] rotateByYMatrix = new double[][]{
                {Math.cos(vertex.rotateX), 0, Math.sin(vertex.rotateX), 0},
                {0, 1, 0, 0},
                {-Math.sin(vertex.rotateX), 0, Math.cos(vertex.rotateX), 0},
                {0, 0, 0, 1}
        };
        coordinates = Matrix.multiplication(rotateByYMatrix, coordinates);
        // rotate by z
        double[][] rotateByZMatrix = new double[][]{
                {Math.cos(vertex.rotateX), -Math.sin(vertex.rotateX), 0, 0},
                {Math.sin(vertex.rotateX), Math.cos(vertex.rotateX), 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        coordinates = Matrix.multiplication(rotateByZMatrix, coordinates);
        // set transformed coordinates
        vertex.x = (int) coordinates[0][0];
        vertex.y = (int) coordinates[1][0];
        vertex.z = (int) coordinates[2][0];
        return vertex;
    }

    private Vertex viewTransform(Vertex vertex) {
        return null;
    }

    private Vertex projectionTransform(Vertex vertex) {
        return null;
    }

}
