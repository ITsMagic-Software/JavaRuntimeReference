package JAVARuntime;

import java.util.ArrayList;
import java.util.List;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Physics","Components"})
public final class Collider extends Component {
    public enum Shape {
        Box,
        Sphere,
        Capsule,
        Model,
        ConvexModel,
        Decomposition
    }

    //

    //

    public Collider() {
        //
        super();
        //

        //
    }
    @MethodArgs({"shape"})
    public Collider(Shape type) {
        //
        super();
        //

        //
    }

    @JRDoc_EN("Returns the shape type of the collider.")
    @JRDoc_PT("Retorna o tipo de forma do collider.")
    public Shape getShape(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the shape type of the collider.")
    @JRDoc_PT("Define o tipo de forma do collider.")
    @MethodArgs({"value"})
    public void setShape(Shape value){
        //
    }

    @JRDoc_EN("Sets the vertex file for the collider.")
    @JRDoc_PT("Define o arquivo do vertex para o collider.")
    @HideGetSet
    @MethodArgs({"vertexFile"})
    public void setVertexFile(VertexFile pFile){
        //
    }

    @JRDoc_EN("Returns the collider vertex.")
    @JRDoc_PT("Retorna o vertex do collider.")
    @HideGetSet
    public Vertex getVertex(){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the vertex of the collider.")
    @JRDoc_PT("Define o vertex do collider.")
    @HideGetSet
    @MethodArgs({"vertex"})
    public void setVertex(Vertex vertex){
        //
    }

    @JRDoc_EN("Sets the convex vertex of the collider.")
    @JRDoc_PT("Define o vertex convexo do collider.")
    @HideGetSet
    @MethodArgs({"vertex"})
    public void setConvexVertex(Vertex vertex){
        //
    }

    @JRDoc_EN("Checks if this object is colliding with an object with the specified name.")
    @JRDoc_PT("Verifica se este objeto está colidindo com um objeto com o nome especificado.")
    @MethodArgs({"objectName"})
    public boolean colliderWithName(String objectName){
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Checks if this object is colliding with anything.")
    @JRDoc_PT("Verifica se este objeto está colidindo com algo.")
    public boolean isColliding(){
        //
        return false;
        //

        //
    }

    @JRDoc_EN("Returns a list of all current collisions.")
    @JRDoc_PT("Retorna uma lista de todas as colisões atuais.")
    public List<Collision> getCollisionList(){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns the number of current collisions.")
    @JRDoc_PT("Retorna o número de colisões atuais.")
    public int getCollisionsCount(){
        //
        return 0;
        //

        //
    }
    @JRDoc_EN("Returns the Collision at the specified index.")
    @JRDoc_PT("Retorna a colisão no índice especificado.")
    @MethodArgs({"idx"})
    public Collision getCollisionAt(int idx){
        //
        return null;
        //

        //
    }

    //
}
