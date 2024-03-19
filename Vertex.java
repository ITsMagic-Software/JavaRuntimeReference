package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Console.Terminal;
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.Interface;
import com.itsmagic.engine.Core.Components.JCompiler.JavaJar;
import com.itsmagic.engine.Engines.Engine.Engine;
import com.itsmagic.engine.Engines.Engine.Vertex.Manager.VertexManager;
import com.itsmagic.engine.Engines.Engine.Vertex.Utils.VertexConverter;
import com.itsmagic.engine.Engines.Utils.StringFunctions.StringUtils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//>REMOVE-BRIDGE<


import java.lang.reflect.Field;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Vertex"})
public final class Vertex {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Engine.Vertex.Vertex vertex;
    @IgnoreAutoComplete
    public Vertex(com.itsmagic.engine.Engines.Engine.Vertex.Vertex vertex) {
        this.vertex = vertex;
    }
    @BuildClassConstructor
    public Vertex(Engine engine){}

    private transient final Object setVertiesBlock = new Object();
    private transient Runnable setVerticesRunnable;

    private transient final Object setTrianglesBlock = new Object();
    private transient Runnable setTrianglesRunnable;

    private transient final Object setNormalsBlock = new Object();
    private transient Runnable setNormalsRunnable;

    private transient final Object setUVsBlock = new Object();
    private transient Runnable setUVsRunnable;

    private transient final Object setJointsBlock = new Object();
    private transient Runnable setJointsRunnable;

    private transient final Object setWeightsBlock = new Object();
    private transient Runnable setWeightsRunnable;
    //>REMOVE-BRIDGE<

    public Vertex() {
        //<REMOVE-BRIDGE>
        this.vertex = new com.itsmagic.engine.Engines.Engine.Vertex.Vertex();
        VertexManager.addVertex(StringUtils.randomUUID(), vertex);
        //>REMOVE-BRIDGE<
    }

    public List<Vector3> getVertices(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getVerticesJavaList(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public float[] getVerticesArray(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getVerticesArray(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public NativeFloatBuffer getVerticesBuffer(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.vertex.getVertices().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setVertices(List<Vector3> list){
        //<REMOVE-BRIDGE>
        if(Engine.isOpenglEngineThread()) {
            VertexConverter.setVerticesFromJavaList(list, this.vertex);
        } else {
            synchronized (setVertiesBlock){
                if(setVerticesRunnable != null){
                    Engine.interrupt(setVerticesRunnable);
                    setVerticesRunnable = null;
                }
                setVerticesRunnable = new Runnable() {
                    @Override
                    public void run() {
                        JavaJar.execute(new Interface() {
                            @Override
                            public void run() {
                                VertexConverter.setVerticesFromJavaList(list, vertex);
                                setVerticesRunnable = null;
                            }
                        });
                    }
                };
                Engine.runOnEngine(setVerticesRunnable);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setVertices(float[] array){
        //<REMOVE-BRIDGE>
        if ((array.length % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                VertexConverter.setVerticesFromArray(array, this.vertex);
            } else {
                synchronized (setVertiesBlock){
                    if(setVerticesRunnable != null){
                        Engine.interrupt(setVerticesRunnable);
                        setVerticesRunnable = null;
                    }
                    setVerticesRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    VertexConverter.setVerticesFromArray(array, vertex);
                                    setVerticesRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setVerticesRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid vertices array, the last vertice is not complete, every vertice should add 3 elements to array");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setVertices(NativeFloatBuffer vertices){
        //<REMOVE-BRIDGE>
        if ((vertices.capacity() % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setVertices(vertices.buffer);
            } else {
                synchronized (setVertiesBlock){
                    if(setVerticesRunnable != null){
                        Engine.interrupt(setVerticesRunnable);
                        setVerticesRunnable = null;
                    }
                    setVerticesRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setVertices(vertices.buffer);
                                    setVerticesRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setVerticesRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid vertices buffer, the last vertice is not complete, every vertice should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setVertices(Vector3Buffer buffer){
        //<REMOVE-BRIDGE>
        if ((buffer.buffer.getBuffer().capacity() % 3) == 0 || buffer.capacity() == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setVertices(buffer.getFloatBuffer().buffer);
            } else {
                synchronized (setVertiesBlock){
                    if(setVerticesRunnable != null){
                        Engine.interrupt(setVerticesRunnable);
                        setVerticesRunnable = null;
                    }
                    setVerticesRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setVertices(buffer.getFloatBuffer().buffer);
                                    setVerticesRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setVerticesRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid vertices buffer, the last vertice is not complete, every vertice should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }

    public List<Vector3> getTriangles(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getTriangleJavaList(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public int[] getTrianglesArray(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getIndicesArray(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public NativeIntBuffer getTrianglesBuffer(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.vertex.getTriangles().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setTriangles(List<Vector3> list){
        //<REMOVE-BRIDGE>
        if(Engine.isOpenglEngineThread()) {
            VertexConverter.setTrianglesFromJavaList(list, this.vertex);
        } else {
            synchronized (setTrianglesBlock) {
                if (setTrianglesRunnable != null) {
                    Engine.interrupt(setTrianglesRunnable);
                    setTrianglesRunnable = null;
                }
                setTrianglesRunnable = new Runnable() {
                    @Override
                    public void run() {
                        JavaJar.execute(new Interface() {
                            @Override
                            public void run() {
                                VertexConverter.setTrianglesFromJavaList(list, vertex);
                                setTrianglesRunnable = null;
                            }
                        });
                    }
                };
                Engine.runOnEngine(setTrianglesRunnable);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setTriangles(int[] array){
        //<REMOVE-BRIDGE>
        if ((array.length % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                VertexConverter.setTrianglesFromArray(array, this.vertex);
            } else {
                synchronized (setTrianglesBlock) {
                    if (setTrianglesRunnable != null) {
                        Engine.interrupt(setTrianglesRunnable);
                        setTrianglesRunnable = null;
                    }
                    setTrianglesRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    VertexConverter.setTrianglesFromArray(array, vertex);
                                    setTrianglesRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setTrianglesRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid triangles array, the last triangle is not complete, every triangle should add 3 elements to array");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setTriangles(NativeIntBuffer triangles){
        //<REMOVE-BRIDGE>
        if ((triangles.capacity() % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setTriangles(triangles.buffer);
            } else {
                synchronized (setTrianglesBlock) {
                    if (setTrianglesRunnable != null) {
                        Engine.interrupt(setTrianglesRunnable);
                        setTrianglesRunnable = null;
                    }
                    setTrianglesRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setTriangles(triangles.buffer);
                                    setTrianglesRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setTrianglesRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid triangles buffer, the last triangle is not complete, every triangle should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setTriangles(Point3Buffer buffer){
        //<REMOVE-BRIDGE>
        if ((buffer.buffer.buffer.capacity() % 3) == 0 || buffer.capacity() == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setTriangles(buffer.buffer);
            } else {
                synchronized (setTrianglesBlock) {
                    if (setTrianglesRunnable != null) {
                        Engine.interrupt(setTrianglesRunnable);
                        setTrianglesRunnable = null;
                    }
                    setTrianglesRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setTriangles(buffer.buffer);
                                    setTrianglesRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setTrianglesRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid triangles buffer, the last triangle is not complete, every triangle should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }

    public List<Vector3> getNormals(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getNormalsJavaList(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public float[] getNormalsArray(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getNormalsArray(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public NativeFloatBuffer getNormalsBuffer(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.vertex.getNormals().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setNormals(List<Vector3> list){
        //<REMOVE-BRIDGE>
        if(Engine.isOpenglEngineThread()) {
            VertexConverter.setNormalsFromJavaList(list, this.vertex);
        } else {
            synchronized (setNormalsBlock) {
                if (setNormalsRunnable != null) {
                    Engine.interrupt(setNormalsRunnable);
                    setNormalsRunnable = null;
                }
                setNormalsRunnable = new Runnable() {
                    @Override
                    public void run() {
                        JavaJar.execute(new Interface() {
                            @Override
                            public void run() {
                                VertexConverter.setNormalsFromJavaList(list, vertex);
                                setNormalsRunnable = null;
                            }
                        });
                    }
                };
                Engine.runOnEngine(setNormalsRunnable);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setNormals(float[] array){
        //<REMOVE-BRIDGE>
        if ((array.length % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                VertexConverter.setNormalsFromArray(array, this.vertex);
            } else {
                synchronized (setNormalsBlock) {
                    if (setNormalsRunnable != null) {
                        Engine.interrupt(setNormalsRunnable);
                        setNormalsRunnable = null;
                    }
                    setNormalsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    VertexConverter.setNormalsFromArray(array, vertex);
                                    setNormalsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setNormalsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid normals array, the last normal is not complete, every normal should add 3 elements to array");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setNormals(NativeFloatBuffer normals){
        //<REMOVE-BRIDGE>
        if ((normals.capacity() % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setNormals(normals.buffer);
            } else {
                synchronized (setNormalsBlock) {
                    if (setNormalsRunnable != null) {
                        Engine.interrupt(setNormalsRunnable);
                        setNormalsRunnable = null;
                    }
                    setNormalsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setNormals(normals.buffer);
                                    setNormalsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setNormalsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid normals buffer, the last normal is not complete, every normal should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setNormals(Vector3Buffer buffer){
        //<REMOVE-BRIDGE>
        if ((buffer.buffer.getBuffer().capacity() % 3) == 0 || buffer.capacity() == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setNormals(buffer.getFloatBuffer().buffer);
            } else {
                synchronized (setNormalsBlock) {
                    if (setNormalsRunnable != null) {
                        Engine.interrupt(setNormalsRunnable);
                        setNormalsRunnable = null;
                    }
                    setNormalsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setNormals(buffer.getFloatBuffer().buffer);
                                    setNormalsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setNormalsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid normals buffer, the last normal is not complete, every normal should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }

    public List<Vector2> getUVs(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getUvsJavaList(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public float[] getUVsArray(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getUVsArray(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public NativeFloatBuffer getUVsBuffer(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.vertex.getUVs().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setUVs(List<Vector2> list){
        //<REMOVE-BRIDGE>
        if(Engine.isOpenglEngineThread()) {
            VertexConverter.setUVsFromJavaList(list, this.vertex);
        } else {
            synchronized (setUVsBlock) {
                if (setUVsRunnable != null) {
                    Engine.interrupt(setUVsRunnable);
                    setUVsRunnable = null;
                }
                setUVsRunnable = new Runnable() {
                    @Override
                    public void run() {
                        JavaJar.execute(new Interface() {
                            @Override
                            public void run() {
                                VertexConverter.setUVsFromJavaList(list, vertex);
                                setUVsRunnable = null;
                            }
                        });
                    }
                };
                Engine.runOnEngine(setUVsRunnable);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setUVs(float[] array){
        //<REMOVE-BRIDGE>
        if ((array.length % 2) == 0) {
            if(Engine.isOpenglEngineThread()) {
                VertexConverter.setUVsFromArray(array, this.vertex);
            } else {
                synchronized (setUVsBlock) {
                    if (setUVsRunnable != null) {
                        Engine.interrupt(setUVsRunnable);
                        setUVsRunnable = null;
                    }
                    setUVsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    VertexConverter.setUVsFromArray(array, vertex);
                                    setUVsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setUVsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid UVs array, the last UV vector2 is not complete, every UV should add 2 elements to array");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setUVs(NativeFloatBuffer uvs){
        //<REMOVE-BRIDGE>
        if ((uvs.capacity() % 2) == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setUVs(uvs.buffer);
            } else {
                synchronized (setUVsBlock) {
                    if (setUVsRunnable != null) {
                        Engine.interrupt(setUVsRunnable);
                        setUVsRunnable = null;
                    }
                    setUVsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setUVs(uvs.buffer);
                                    setUVsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setUVsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid UVs buffer, the last UV vector2 is not complete, every UV should add 2 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setUVs(Vector2Buffer buffer){
        //<REMOVE-BRIDGE>
        if ((buffer.buffer.buffer.capacity() % 2) == 0 || buffer.capacity() == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setUVs(buffer.getFloatBuffer().buffer);
            } else {
                synchronized (setUVsBlock) {
                    if (setUVsRunnable != null) {
                        Engine.interrupt(setUVsRunnable);
                        setUVsRunnable = null;
                    }
                    setUVsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setUVs(buffer.getFloatBuffer().buffer);
                                    setUVsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setUVsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid UVs buffer, the last UV vector2 is not complete, every UV should add 2 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }

    public List<Vector3> getJoints(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getJointsJavaList(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public float[] getJointsArray(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getJointsArray(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public NativeFloatBuffer getJointsBuffer(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.vertex.getJoints().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setJoints(List<Vector3> list){
        //<REMOVE-BRIDGE>
        if(Engine.isOpenglEngineThread()) {
            VertexConverter.setJointsFromList(list, this.vertex);
        } else {
            synchronized (setJointsBlock) {
                if (setJointsRunnable != null) {
                    Engine.interrupt(setJointsRunnable);
                    setJointsRunnable = null;
                }
                setJointsRunnable = new Runnable() {
                    @Override
                    public void run() {
                        JavaJar.execute(new Interface() {
                            @Override
                            public void run() {
                                VertexConverter.setJointsFromList(list, vertex);
                                setJointsRunnable = null;
                            }
                        });
                    }
                };
                Engine.runOnEngine(setJointsRunnable);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setJoints(float[] array){
        //<REMOVE-BRIDGE>
        if ((array.length % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                VertexConverter.setJointsFromArray(array, this.vertex);
            } else {
                synchronized (setJointsBlock) {
                    if (setJointsRunnable != null) {
                        Engine.interrupt(setJointsRunnable);
                        setJointsRunnable = null;
                    }
                    setJointsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    VertexConverter.setJointsFromArray(array, vertex);
                                    setJointsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setJointsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid joints array, the last vertice is not complete, every vertice should add 3 elements to array");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setJoints(NativeFloatBuffer joints){
        //<REMOVE-BRIDGE>
        if ((joints.capacity() % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setJoints(joints.buffer);
            } else {
                synchronized (setJointsBlock) {
                    if (setJointsRunnable != null) {
                        Engine.interrupt(setJointsRunnable);
                        setJointsRunnable = null;
                    }
                    setJointsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setJoints(joints.buffer);
                                    setJointsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setJointsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid joints buffer, the last vertice is not complete, every vertice should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setJoints(Vector3Buffer buffer){
        //<REMOVE-BRIDGE>
        if ((buffer.buffer.getBuffer().capacity() % 3) == 0 || buffer.capacity() == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setJoints(buffer.getFloatBuffer().buffer);
            } else {
                synchronized (setJointsBlock) {
                    if (setJointsRunnable != null) {
                        Engine.interrupt(setJointsRunnable);
                        setJointsRunnable = null;
                    }
                    setJointsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setJoints(buffer.getFloatBuffer().buffer);
                                    setJointsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setJointsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid joints buffer, the last vertice is not complete, every vertice should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }

    public List<Vector3> getWeights(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getWeightsJavaList(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public float[] getWeightsArray(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return VertexConverter.getWeightsArray(this.vertex);
        //>REMOVE-BRIDGE<
    }
    public NativeFloatBuffer getWeightsBuffer(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.vertex.getWeights().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setWeights(List<Vector3> list){
        //<REMOVE-BRIDGE>
        if(Engine.isOpenglEngineThread()) {
            VertexConverter.setWeightsFromList(list, this.vertex);
        } else {
            synchronized (setWeightsBlock) {
                if (setWeightsRunnable != null) {
                    Engine.interrupt(setWeightsRunnable);
                    setWeightsRunnable = null;
                }
                setWeightsRunnable = new Runnable() {
                    @Override
                    public void run() {
                        JavaJar.execute(new Interface() {
                            @Override
                            public void run() {
                                VertexConverter.setWeightsFromList(list, vertex);
                                setWeightsRunnable = null;
                            }
                        });
                    }
                };
                Engine.runOnEngine(setWeightsRunnable);
            }
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setWeights(float[] array){
        //<REMOVE-BRIDGE>
        if ((array.length % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                VertexConverter.setWeightsFromArray(array, this.vertex);
            } else {
                synchronized (setWeightsBlock) {
                    if (setWeightsRunnable != null) {
                        Engine.interrupt(setWeightsRunnable);
                        setWeightsRunnable = null;
                    }
                    setWeightsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    VertexConverter.setWeightsFromArray(array, vertex);
                                    setWeightsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setWeightsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid weights array, the last vertice is not complete, every vertice should add 3 elements to array");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setWeights(NativeFloatBuffer weights){
        //<REMOVE-BRIDGE>
        if ((weights.capacity() % 3) == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setWeights(weights.buffer);
            } else {
                synchronized (setWeightsBlock) {
                    if (setWeightsRunnable != null) {
                        Engine.interrupt(setWeightsRunnable);
                        setWeightsRunnable = null;
                    }
                    setWeightsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setWeights(weights.buffer);
                                    setWeightsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setWeightsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid weights buffer, the last vertice is not complete, every vertice should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void setWeights(Vector3Buffer buffer){
        //<REMOVE-BRIDGE>
        if ((buffer.buffer.getBuffer().capacity() % 3) == 0 || buffer.capacity() == 0) {
            if(Engine.isOpenglEngineThread()) {
                this.vertex.setWeights(buffer.getFloatBuffer().buffer);
            } else {
                synchronized (setWeightsBlock) {
                    if (setWeightsRunnable != null) {
                        Engine.interrupt(setWeightsRunnable);
                        setWeightsRunnable = null;
                    }
                    setWeightsRunnable = new Runnable() {
                        @Override
                        public void run() {
                            JavaJar.execute(new Interface() {
                                @Override
                                public void run() {
                                    vertex.setWeights(buffer.getFloatBuffer().buffer);
                                    setWeightsRunnable = null;
                                }
                            });
                        }
                    };
                    Engine.runOnEngine(setWeightsRunnable);
                }
            }
        } else {
            throw new RuntimeException("Invalid weights buffer, the last vertice is not complete, every vertice should add 3 elements to buffer");
        }
        //>REMOVE-BRIDGE<
    }

    public enum RayMode{ClosestPoint, FirstHit}
    @MethodArgs(args ={"transform","ray"})
    public LaserHit traceLaser(Transform transform, Ray ray){
        return traceLaser(transform, ray, RayMode.ClosestPoint);
    }
    @MethodArgs(args ={"transform","ray","rayMode"})
    public LaserHit traceLaser(Transform transform, Ray ray, RayMode rayMode){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit = this.vertex.traceRay(transform.transform, ray.ray, rayMode);
        if(laserHit != null) {
            return laserHit.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"transform","ray","rayMode","backfaceCulling"})
    public LaserHit traceLaser(Transform transform, Ray ray, RayMode rayMode, boolean backfaceCulling){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit = this.vertex.traceRay(transform.transform, ray.ray, rayMode, backfaceCulling);
        if(laserHit != null) {
            return laserHit.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"transform","ray","asyncLaserListener"})
    public void traceLaserAsync(Transform transform, Ray ray, AsyncLaserListener asyncLaserListener){
        traceLaserAsync(transform, ray, asyncLaserListener, RayMode.ClosestPoint);
    }
    @MethodArgs(args ={"transform","ray","asyncLaserListener","rayMode"})
    public void traceLaserAsync(Transform transform, Ray ray, AsyncLaserListener asyncLaserListener, RayMode rayMode){
        //<REMOVE-BRIDGE>
        new AsyncTask(new AsyncRunnable() {
            @Override
            public Object onBackground(Object input) {
                com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit = Vertex.this.vertex.traceRay(transform.transform, ray.ray, rayMode);
                if(laserHit != null) {
                    return laserHit.toJAVARuntime();
                }
                return null;
            }

            @Override
            public void onEngine(Object result) {
                if(result != null){
                    asyncLaserListener.onFinish((LaserHit) result);
                } else {
                    asyncLaserListener.onFinish(null);
                }
            }
        });
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"transform","ray","asyncLaserListener","rayMode","backfaceCulling"})
    public void traceLaserAsync(Transform transform, Ray ray, AsyncLaserListener asyncLaserListener, RayMode rayMode, boolean backfaceCulling){
        //<REMOVE-BRIDGE>
        new AsyncTask(new AsyncRunnable() {
            @Override
            public Object onBackground(Object input) {
                com.itsmagic.engine.Engines.Engine.Laser.LaserHit laserHit = Vertex.this.vertex.traceRay(transform.transform, ray.ray, rayMode, backfaceCulling);
                if(laserHit != null) {
                    return laserHit.toJAVARuntime();
                }
                return null;
            }

            @Override
            public void onEngine(Object result) {
                if(result != null){
                    asyncLaserListener.onFinish((LaserHit) result);
                } else {
                    asyncLaserListener.onFinish(null);
                }
            }
        });
        //>REMOVE-BRIDGE<
    }

    public void apply(){
        //<REMOVE-BRIDGE>
        this.vertex.apply();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"regenerateTBN","recalculateBoundingBox"})
    public void apply(boolean regenerateTBN, boolean recalculateBoundingBox){
        //<REMOVE-BRIDGE>
        this.vertex.apply(regenerateTBN, recalculateBoundingBox);
        //>REMOVE-BRIDGE<
    }

    public void regenerateNormals(){
        //<REMOVE-BRIDGE>
        this.vertex.regenerateNormals();
        this.apply(true, false);
        //>REMOVE-BRIDGE<
    }

    public AABB getBoundingBox(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.vertex.getBoundingBox().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    public AABB recalculateBoundingBox(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        this.vertex.recalculateBoundingBox();
        return this.vertex.getBoundingBox().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    /// Abstract
    @MethodArgs(args ={"file"})
    public static Vertex loadFile(VertexFile pFile){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(pFile == null){ throw new NullPointerException("VertexFile can't be null"); }

        com.itsmagic.engine.Engines.Engine.Vertex.Vertex vertex = com.itsmagic.engine.Engines.Engine.Vertex.Vertex.loadFile(pFile.getFilePath());
        if(vertex != null){
            return vertex.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"file"})
    public static Vertex loadFile(File file){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(file == null){ throw new NullPointerException("file can't be null"); }
        Terminal.log(
                Terminal.warningColor("Loading vertex from project files without using a concrete TextureFile created by itsmagic properties panel, will broken in exported APK!"),
                Terminal.warningColor("Make sure to use this method for loading game data files that are present in device storage, not in PROJECT")
        );

        com.itsmagic.engine.Engines.Engine.Vertex.Vertex vertex = VertexManager.importVertex(file, new VertexManager.ImportProgress() {
            @Override
            public void setProgress(float v) {

            }
        });
        if(vertex != null){
            return vertex.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"inputStream"})
    public static Vertex loadFile(InputStream inputStream){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(inputStream == null){ throw new NullPointerException("inputStream can't be null"); }
        Terminal.log(
                Terminal.warningColor("Loading vertex from project files without using a concrete TextureFile created by itsmagic properties panel, will broken in exported APK!"),
                Terminal.warningColor(  "Make sure to use this method for loading game data files that are present in device storage, not in PROJECT")
        );

        com.itsmagic.engine.Engines.Engine.Vertex.Vertex vertex = VertexManager.importVertex(inputStream, new VertexManager.ImportProgress() {
            @Override
            public void setProgress(float v) {

            }
        });
        if(vertex != null){
            return vertex.toJAVARuntime();
        }
        return null;
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @Retention(RetentionPolicy.RUNTIME)
    //>REMOVE-BRIDGE<
    private @interface PrimitiveExpose { }

    @PrimitiveExpose
    public static final int CUBE = 0;
    @PrimitiveExpose
    public static final int SPHERE = 1;
    @PrimitiveExpose
    public static final int CONE = 2;
    @PrimitiveExpose
    public static final int CYLINDER = 3;
    @PrimitiveExpose
    public static final int CIRCLE = 4;
    @PrimitiveExpose
    public static final int TORUS = 5;
    @PrimitiveExpose
    public static final int SQUARE = 6;
    @PrimitiveExpose
    public static final int SQUARE90 = 7;
    @PrimitiveExpose
    public static final int CAPSULE = 8;
    @PrimitiveExpose
    public static final int HALF_CAPSULE = 9;
    @PrimitiveExpose
    public static final int SPHERE_LOWPOLY = 10;

    @MethodArgs(args ={"primitive"})
    public static Vertex loadPrimitive(int primitive){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        com.itsmagic.engine.Engines.Engine.Vertex.Vertex vertex = null;
        for (Field declaredField : Vertex.class.getDeclaredFields()) {
            if(declaredField.getType().isPrimitive() && declaredField.getType() == int.class){
                if(declaredField.getAnnotation(PrimitiveExpose.class) != null) {
                    try {
                        if (declaredField.getInt(null) == primitive) {
                            vertex = com.itsmagic.engine.Engines.Engine.Vertex.Vertex.loadPrimitive(com.itsmagic.engine.Engines.Engine.Vertex.Vertex.Primitive.valueOf(declaredField.getName()));
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if(vertex != null){
            return vertex.toJAVARuntime();
        } else {
            StringBuilder builder = new StringBuilder();
            for (Field declaredField : Vertex.class.getDeclaredFields()) {
                if(declaredField.getType().isPrimitive() && declaredField.getType() == int.class){
                    if(declaredField.getAnnotation(PrimitiveExpose.class) != null) {
                        builder.append("(Vertex.").append(declaredField.getName()).append(")");
                        builder.append(", ");
                    }
                }
            }
            throw new IllegalArgumentException("Invalid primitive, available options: " + builder.toString());
        }
        //>REMOVE-BRIDGE<
    }
}
