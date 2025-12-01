package JAVARuntime;

//

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"ObjectPool","Components"})
public final class ObjectPool extends Component{
    //

    public static class Object{
        //

        private Object(){}

        @JRDoc_EN("Returns the position of the HPO at the specified index.")
        @JRDoc_PT("Retorna a posição do HPO no índice especificado.")
        @MethodArgs({"index"})
        public Vector3 getPosition(){
            //
            return null;
            //

            //
        }
        @JRDoc_EN("Changes the position of the HPO at the specified index.")
        @JRDoc_PT("Altera a posição do HPO no índice especificado.")
        @MethodArgs({"position"})
        public void setPosition(Vector3 position){
            //
        }

        @JRDoc_EN("Returns the rotation of the HPO at the specified index.")
        @JRDoc_PT("Retorna a rotação do HPO no índice especificado.")
        @MethodArgs({"index"})
        public Quaternion getRotation(){
            //
            return null;
            //

            //
        }
        @JRDoc_EN("Changes the rotation of the HPO at the specified index.")
        @JRDoc_PT("Altera a rotação do HPO no índice especificado.")
        @MethodArgs({"rotation"})
        public void setRotation(Quaternion rotation){
            //
        }

        @JRDoc_EN("Returns the scale of the HPO at the specified index.")
        @JRDoc_PT("Retorna a escala do HPO no índice especificado.")
        @MethodArgs({"index"})
        public float getScale(){
            //
            return 0;
            //

            //
        }
        @JRDoc_EN("Changes the scale of the HPO at the specified index.")
        @JRDoc_PT("Altera a escala do HPO no índice especificado.")
        @MethodArgs({"scale"})
        public void setScale(float scale){
            //
        }
    }

    public static class SearchResult {
        //

        @JRDoc_EN("Returns the object of the HPOP search result.")
        @JRDoc_PT("Retorna o objeto do resultado da busca do HPOP.")
        @HideGetSet
        public ObjectPool.Object getObject() {
            //
            return null;
            //

            //
        }
        @JRDoc_EN("Returns the squared distance of the HPOP search result.")
        @JRDoc_PT("Retorna a distância ao quadrado do resultado da busca do HPOP.")
        @HideGetSet
        public float getSquaredDistance() {
            //
            return 0;
            //

            //
        }
        @JRDoc_EN("Returns the distance of the HPOP search result.")
        @JRDoc_PT("Retorna a distância do resultado da busca do HPOP.")
        @HideGetSet
        public float getDistance() {
            //
            return 0;
            //

            //
        }
    }

    public ObjectPool() {
        //
        super();
        //

        //
    }

    @JRDoc_EN("Adds an HPO at the specified position and returns its index.")
    @JRDoc_PT("Adiciona um HPO na posição especificada e retorna seu índice.")
    @MethodArgs({"position"})
    public ObjectPool.Object add(Vector3 position){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Returns the count of objects in the current HPOP.")
    @JRDoc_PT("Retorna a quantidade de objetos no HPOP atual.")
    public int objectCount(){
        //
        return 0;
        //

        //
    }

    @MethodArgs({"index"})
    public ObjectPool.Object getObject(int index){
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Updates the object.")
    @JRDoc_PT("Atualiza o objeto.")
    @MethodArgs({"object"})
    public void notifyObjectChanged(ObjectPool.Object object){
        //
    }

    @JRDoc_EN("Deletes multiple HPOs based on the provided search results.")
    @JRDoc_PT("Exclui vários objects com base nos resultados de busca fornecidos.")
    @MethodArgs({"searchResultList"})
    public void delete(List<SearchResult> searchResultList){
        //
    }
    @JRDoc_EN("Deletes the HPO at the specified index.")
    @JRDoc_PT("Exclui o HPO no índice especificado.")
    @MethodArgs({"object"})
    public void delete(ObjectPool.Object object){
        //
    }

    @JRDoc_EN("Finds and returns all objects within a specified circle defined by center and radius.")
    @JRDoc_PT("Encontra e retorna todos os objects dentro de um círculo especificado pelo centro e raio.")
    @MethodArgs({"center","radius"})
    public List<SearchResult> findInCircle(Vector3 center, float radius){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Finds and returns all objects within a specified sphere defined by center and radius.")
    @JRDoc_PT("Encontra e retorna todos os objects dentro de uma esfera especificada pelo centro e raio.")
    @MethodArgs({"center","radius"})
    public List<SearchResult> findInSphere(Vector3 center, float radius){
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Finds and returns all objects within a rectangular area defined by two corners: min and max.")
    @JRDoc_PT("Encontra e retorna todos os objects dentro de uma área retangular definida por dois cantos: min e max.")
    @MethodArgs({"min","max"})
    public List<SearchResult> findInSquare(Vector2 min, Vector2 max){
        //
        return null;
        //

        //
    }

    //
}
