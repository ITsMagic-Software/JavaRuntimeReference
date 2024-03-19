package JAVARuntime;

//<REMOVE-BRIDGE>
import android.opengl.Matrix;
import android.os.Build;

import com.itsmagic.engine.Engines.Engine.Vector.Vector2;
import com.itsmagic.engine.Engines.Graphics.GraphicsEngine;
import com.itsmagic.engine.Engines.Utils.Mathematicals.MatrixUtils;

//>REMOVE-BRIDGE<
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Debug"})
public class GizmoPath extends GizmoElement{

    private transient Vertex vertex;
    private transient Vector3 position = new Vector3();
    private transient Quaternion rotation = new Quaternion();
    private transient Vector3 scale = new Vector3(1);
    private transient float[] matrix;
    private transient Color color;
    private transient Object userPointer = null;
    //<REMOVE-BRIDGE>
    /*
    //>REMOVE-BRIDGE<
    private int wireFrameWidth = 0;
    //<REMOVE-BRIDGE>
    */
    //>REMOVE-BRIDGE<
    //<REMOVE-BRIDGE>
    private transient int wireFrameWidth = GraphicsEngine.Utils.lineWidth;
    //>REMOVE-BRIDGE<

    //<REMOVE-BRIDGE>
    public transient float[] rotMatrix;
    private transient Vector3 lastCalculatedPos = new Vector3();
    private transient Quaternion lastCalculatedRot = new Quaternion();
    private transient Vector3 lastCalculatedSca = new Vector3();
    public transient int createdEntries;
    //>REMOVE-BRIDGE<

    public GizmoPath() {
    }

    @Override
    @HideGetSet
    public Color getColor() {
        return color;
    }
    @HideGetSet
    @MethodArgs(args ={"color"})
    public void setColor(Color color) {
        this.color = color;
    }

    @HideGetSet
    public Vector3 getPosition() {
        return position;
    }
    @HideGetSet
    @MethodArgs(args ={"position"})
    public void setPosition(Vector3 position) {
        //<REMOVE-BRIDGE>
        if(position == null){
            throw new NullPointerException("position can't be null");
        }
        //>REMOVE-BRIDGE<
        this.position = position;
    }
    @MethodArgs(args ={"x","y","z"})
    public void setPosition(float x, float y, float z) {
        this.position.set(x, y, z);
    }

    @HideGetSet
    public Quaternion getRotation() {
        return rotation;
    }
    @HideGetSet
    @MethodArgs(args ={"rotation"})
    public void setRotation(Quaternion rotation) {
        //<REMOVE-BRIDGE>
        if(rotation == null){
            throw new NullPointerException("rotation can't be null");
        }
        //>REMOVE-BRIDGE<
        this.rotation = rotation;
    }
    @MethodArgs(args ={"x","y","z"})
    public void setRotation(float x, float y, float z){
        //<REMOVE-BRIDGE>
        this.rotation.instance.fromEuler(x, y, z);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"x","y","z","w"})
    public void setRotation(float x, float y, float z, float w){
        //<REMOVE-BRIDGE>
        this.rotation.instance.set(x, y, z, w);
        //>REMOVE-BRIDGE<
    }

    @HideGetSet
    public Vector3 getScale() {
        return scale;
    }
    @HideGetSet
    @MethodArgs(args ={"scale"})
    public void setScale(Vector3 scale) {
        //<REMOVE-BRIDGE>
        if(scale == null){
            throw new NullPointerException("scale can't be null");
        }
        //>REMOVE-BRIDGE<
        this.scale = scale;
    }
    @MethodArgs(args ={"x","y","z"})
    public void setScale(float x, float y, float z) {
        this.scale.set(x, y, z);
    }

    @Override
    @HideGetSet
    public float[] getMatrix(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        boolean calculate = true;

        if(lastCalculatedPos.equals(position)){
            if(lastCalculatedSca.equals(scale)){
                if(lastCalculatedRot.equals(rotation)){
                    calculate = false;
                }
            }
        }

        lastCalculatedPos.set(position);
        lastCalculatedRot.set(rotation);
        lastCalculatedSca.set(scale);

        if(matrix == null){ matrix = new float[16]; calculate = true; }

        if(calculate) {
            rotMatrix = new float[16];
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                Matrix.setIdentityM(rotMatrix, 0); // initialize to identity matrix
            }
            Matrix.setIdentityM(matrix, 0); // initialize to identity matrix

            Matrix.translateM(matrix, 0, position.getX(), position.getY(), position.getZ());
            MatrixUtils.rotate(matrix, rotMatrix, rotation.instance);
            MatrixUtils.scale(matrix, scale.instance);
        } else {
            rotMatrix = null;
        }

        return matrix;
        //>REMOVE-BRIDGE<
    }
    @HideGetSet
    @MethodArgs(args ={"matrix"})
    public void setMatrix(float[] matrix) {
        this.matrix = matrix;
    }

    @HideGetSet
    public Object getUserPointer() {
        return userPointer;
    }
    @HideGetSet
    @MethodArgs(args ={"userPointer"})
    public void setUserPointer(Object userPointer) {
        this.userPointer = userPointer;
    }

    public void clear() {
        //<REMOVE-BRIDGE>
        createdEntries = -1;
        objects.clear();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"from","to"})
    public GizmoPath addLine(Vector3 from, Vector3 to){
        //<REMOVE-BRIDGE>
        objects.add(new Line(from.copy(), to.copy()));
        //>REMOVE-BRIDGE<
        return this;
    }

    //<REMOVE-BRIDGE>
    public GizmoPath addLineUnsafe(Vector3 from, Vector3 to){
        objects.add(new Line(from, to));
        return this;
    }
    //>REMOVE-BRIDGE<

    @MethodArgs(args ={"path"})
    public GizmoPath addPath(List<Vector2> path){
        //<REMOVE-BRIDGE>
        for (int i = 0; i < path.size()-1; i++) {
            Vector2 c = path.get(i);
            Vector2 n = path.get(i+1);

            addLine(new Vector3(c.x, 0, c.y), new Vector3(n.x, 0, n.y));
        }
        //>REMOVE-BRIDGE<
        return this;
    }

    @Override
    @HideGetSet
    public int getWireFrameWidth() {
        return wireFrameWidth;
    }
    @HideGetSet
    @MethodArgs(args ={"wireFrameWidth"})
    public void setWireFrameWidth(int wireFrameWidth) {
        this.wireFrameWidth = wireFrameWidth;
    }

    public void apply(){
        //<REMOVE-BRIDGE>
        createdEntries = -1;
        getVertex();
        //>REMOVE-BRIDGE<
    }
    public void destroy() {
        //<REMOVE-BRIDGE>
        if(vertex != null){
            vertex.vertex.removeLink(this);
        }
        vertex = null;
        objects.clear();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    private List<Entry> objects = new LinkedList<>();
    class Entry{
        public int verticesCount(){ return 0; }
        public int verticesBackyardCount(){ return 0; }
        public void insertVertices(NativeFloatBuffer nativeFloatBuffer, int offset){ }
        public void insertVerticesBackyard(NativeFloatBuffer nativeFloatBuffer, int offset){ }
        public int indicesCount(){ return 0; }
        public int indicesCountBackyard(){ return 0; }
        public void insertIndices(NativeIntBuffer nativeIntBuffer, int offset){ }
        public void insertIndicesBackyard(NativeIntBuffer nativeIntBuffer, int offset){ }
    }
    class Line extends Entry{
        public Vector3 a, b;

        private int addedLoc;
        public Line(Vector3 a, Vector3 b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int verticesCount() {
            return 3;
        }

        @Override
        public int verticesBackyardCount() {
            return 3;
        }

        @Override
        public void insertVertices(NativeFloatBuffer nativeFloatBuffer, int offset) {
            addedLoc = offset;
            nativeFloatBuffer.put(a.getX());
            nativeFloatBuffer.put(a.getY());
            nativeFloatBuffer.put(a.getZ());

            nativeFloatBuffer.put(b.getX());
            nativeFloatBuffer.put(b.getY());
            nativeFloatBuffer.put(b.getZ());

            nativeFloatBuffer.put(b.getX());
            nativeFloatBuffer.put(b.getY());
            nativeFloatBuffer.put(b.getZ());
        }

        @Override
        public void insertVerticesBackyard(NativeFloatBuffer nativeFloatBuffer, int offset) {
            addedLoc = offset;
            nativeFloatBuffer.put(b.getX());
            nativeFloatBuffer.put(b.getY());
            nativeFloatBuffer.put(b.getZ());

            nativeFloatBuffer.put(a.getX());
            nativeFloatBuffer.put(a.getY());
            nativeFloatBuffer.put(a.getZ());

            nativeFloatBuffer.put(a.getX());
            nativeFloatBuffer.put(a.getY());
            nativeFloatBuffer.put(a.getZ());
        }

        @Override
        public int indicesCount() {
            return 1;
        }

        @Override
        public int indicesCountBackyard() {
            return 1;
        }

        @Override
        public void insertIndices(NativeIntBuffer nativeIntBuffer, int offset) {
            nativeIntBuffer.put(addedLoc+0);
            nativeIntBuffer.put(addedLoc+1);
            nativeIntBuffer.put(addedLoc+2);
        }

        @Override
        public void insertIndicesBackyard(NativeIntBuffer nativeIntBuffer, int offset) {
            nativeIntBuffer.put(addedLoc+0);
            nativeIntBuffer.put(addedLoc+1);
            nativeIntBuffer.put(addedLoc+2);
        }
    }
    //>REMOVE-BRIDGE<

    @Override
    public Vertex getVertex(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(vertex == null || createdEntries != objects.size()) {
            if(vertex != null) {
                vertex.vertex.deepDestroy();
            }
            com.itsmagic.engine.Engines.Engine.Vertex.Vertex vertex = new com.itsmagic.engine.Engines.Engine.Vertex.Vertex();
            this.vertex = vertex.toJAVARuntime();

            int vertices = 0;
            for (int i = 0; i < objects.size(); i++) {
                Entry object = objects.get(i);
                vertices += object.verticesCount();
                vertices += object.verticesBackyardCount();
            }
            NativeFloatBuffer verticesBuffer = new NativeFloatBuffer(vertices * 3);
            verticesBuffer.setPosition(0);
            int addedVertices = 0;
            for (int i = 0; i < objects.size(); i++) {
                Entry object = objects.get(i);
                object.insertVertices(verticesBuffer, addedVertices);
                addedVertices += object.verticesCount();
            }
            for (int i = objects.size() - 1; i >= 0; i--) {
                Entry object = objects.get(i);
                object.insertVerticesBackyard(verticesBuffer, addedVertices);
                addedVertices += object.verticesCount();
            }


            int indices = 0;
            for (int i = 0; i < objects.size(); i++) {
                Entry object = objects.get(i);
                indices += object.indicesCount();
                indices += object.indicesCountBackyard();
            }
            NativeIntBuffer indicesBuffer = new NativeIntBuffer(indices * 3);
            indicesBuffer.setPosition(0);
            int addedIndices = 0;
            for (int i = 0; i < objects.size(); i++) {
                Entry object = objects.get(i);
                object.insertIndices(indicesBuffer, addedIndices);
                addedIndices += object.indicesCount();
            }
            for (int i = objects.size() - 1; i >= 0; i--) {
                Entry object = objects.get(i);
                object.insertIndicesBackyard(indicesBuffer, addedIndices);
                addedIndices += object.indicesCount();
            }

            vertex.setVertices(verticesBuffer.buffer);
            vertex.setTriangles(indicesBuffer.buffer);
            createdEntries = objects.size();
        }
        return vertex;
        //>REMOVE-BRIDGE<
    }

    @Override
    public RenderMode getRenderMode() {
        return RenderMode.WireFrame;
    }

    /*public boolean isEnableTransparency() {
        return enableTransparency;
    }
    public void setEnableTransparency(boolean enableTransparency) {
        this.enableTransparency = enableTransparency;
    }*/
}
