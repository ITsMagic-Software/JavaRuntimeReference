package JAVARuntime;

//<REMOVE-BRIDGE>

import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
import com.itsmagic.engine.Core.Components.JCompiler.Interfaces.BuildClassConstructor;
import com.itsmagic.engine.Core.Core;
import com.itsmagic.engine.Engines.Engine.Engine;
//>REMOVE-BRIDGE<

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Material"})
public class Shader {
    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Graphics.RuntimeShading.Shader shader;
    @IgnoreAutoComplete
    public Shader(com.itsmagic.engine.Engines.Graphics.RuntimeShading.Shader shader) {
        this.shader = shader;
    }

    @BuildClassConstructor
    public Shader(Engine engine) { }
    //>REMOVE-BRIDGE<

    private Shader() {
        //<REMOVE-BRIDGE>
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public int getProgram(){
        return shader.getProgram();
    }
    //>REMOVE-BRIDGE<

    public static class Builder{

        //<REMOVE-BRIDGE>
        public com.itsmagic.engine.Engines.Graphics.RuntimeShading.Shader.Builder builder;

        @BuildClassConstructor
        public Builder(Engine engine) { }
        //>REMOVE-BRIDGE<

        public Builder() {
            //<REMOVE-BRIDGE>
            this.builder = new com.itsmagic.engine.Engines.Graphics.RuntimeShading.Shader.Builder(true);
            //>REMOVE-BRIDGE<
        }
        @MethodArgs(args ={"vertexCode","fragmentCode"})
        public Builder(String vertexCode, String fragmentCode) {
            //<REMOVE-BRIDGE>
            this.builder = new com.itsmagic.engine.Engines.Graphics.RuntimeShading.Shader.Builder(true);
            this.builder.setVertexCode(vertexCode);
            this.builder.setFragmentCode(fragmentCode);
            //>REMOVE-BRIDGE<
        }

        public String getVertexCode() {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            return this.builder.getVertexCode();
            //>REMOVE-BRIDGE<
        }
        @MethodArgs(args ={"vertexCode","vertexCode"})
        public Builder setVertexCode(String vertexCode) {
            //<REMOVE-BRIDGE>
            this.builder.setVertexCode(vertexCode.replace("[highp]", Core.settingsController.engine.HIGH_PRECISION));
            //>REMOVE-BRIDGE<
            return this;
        }
        @MethodArgs(args ={"file"})
        public Builder setVertexCode(VertexGLSLFile pFile) {
            //<REMOVE-BRIDGE>
            this.builder.setVertexCode(pFile);
            //>REMOVE-BRIDGE<
            return this;
        }
        @MethodArgs(args ={"vertexShader"})
        public Builder setVertexCode(VertexShader vertexShader) {
            //<REMOVE-BRIDGE>
            this.builder.setVertexCode(vertexShader.code.replace("[highp]", Core.settingsController.engine.HIGH_PRECISION));
            //>REMOVE-BRIDGE<
            return this;
        }

        public String getGeometryCode() {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            return this.builder.getGeometryCode();
            //>REMOVE-BRIDGE<
        }
        @MethodArgs(args ={"geometryCode"})
        public Builder setGeometryCode(String geometryCode) {
            //<REMOVE-BRIDGE>
            this.builder.setGeometryCode(geometryCode.replace("[highp]", Core.settingsController.engine.HIGH_PRECISION));
            //>REMOVE-BRIDGE<
            return this;
        }
        @MethodArgs(args ={"file"})
        public Builder setGeometryCode(GeometryGLSLFile pFile) {
            //<REMOVE-BRIDGE>
            this.builder.setGeometryCode(pFile);
            //>REMOVE-BRIDGE<
            return this;
        }
        @MethodArgs(args ={"fragmentShader"})
        public Builder setGeometryCode(GeometryShader geometryShader) {
            //<REMOVE-BRIDGE>
            this.builder.setGeometryCode(geometryShader.code.replace("[highp]", Core.settingsController.engine.HIGH_PRECISION));
            //>REMOVE-BRIDGE<
            return this;
        }

        public String getFragmentCode() {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            return this.builder.getFragmentCode();
            //>REMOVE-BRIDGE<
        }
        @MethodArgs(args ={"fragmentCode"})
        public Builder setFragmentCode(String fragmentCode) {
            //<REMOVE-BRIDGE>
            this.builder.setFragmentCode(fragmentCode.replace("[highp]", Core.settingsController.engine.HIGH_PRECISION));
            //>REMOVE-BRIDGE<
            return this;
        }
        @MethodArgs(args ={"file"})
        public Builder setFragmentCode(FragmentGLSLFile pFile) {
            //<REMOVE-BRIDGE>
            this.builder.setFragmentCode(pFile);
            //>REMOVE-BRIDGE<
            return this;
        }
        @MethodArgs(args ={"fragmentShader"})
        public Builder setFragmentCode(FragmentShader fragmentShader) {
            //<REMOVE-BRIDGE>
            this.builder.setFragmentCode(fragmentShader.code.replace("[highp]", Core.settingsController.engine.HIGH_PRECISION));
            //>REMOVE-BRIDGE<
            return this;
        }

        public Builder createProgram(){
            //<REMOVE-BRIDGE>
            Thread.requestOpenglEngineThread();
            this.builder.createProgram();
            //>REMOVE-BRIDGE<
            return this;
        }

        public boolean isGeometryShaderActive() {
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return false;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            return this.builder.isGeometryShaderActive();
            //>REMOVE-BRIDGE<
        }
        public Builder activateGeometryShader(boolean value) {
            //<REMOVE-BRIDGE>
            this.builder.activateGeometryShader(value);
            //>REMOVE-BRIDGE<
            return this;
        }

        public Builder compileVertex(){
            //<REMOVE-BRIDGE>
            Thread.requestOpenglEngineThread();
            this.builder.compileVertex();
            //>REMOVE-BRIDGE<
            return this;
        }
        @MethodArgs(args ={"compileErrorListener"})
        public Builder tryCompileVertex(CompileErrorListener compileErrorListener){
            //<REMOVE-BRIDGE>
            Thread.requestOpenglEngineThread();
            this.builder.compileVertex(new com.itsmagic.engine.Engines.Graphics.RuntimeShading.CompileErrorListener() {
                @Override
                public void onError(String message) {
                    compileErrorListener.onError(message);
                }
            });
            //>REMOVE-BRIDGE<
            return this;
        }

        public Builder compileGeometry(){
            //<REMOVE-BRIDGE>
            Thread.requestOpenglEngineThread();
            this.builder.compileGeometry();
            //>REMOVE-BRIDGE<
            return this;
        }
        @MethodArgs(args ={"compileErrorListener"})
        public Builder tryCompileGeometry(CompileErrorListener compileErrorListener){
            //<REMOVE-BRIDGE>
            Thread.requestOpenglEngineThread();
            this.builder.compileGeometry(new com.itsmagic.engine.Engines.Graphics.RuntimeShading.CompileErrorListener() {
                @Override
                public void onError(String message) {
                    compileErrorListener.onError(message);
                }
            });
            //>REMOVE-BRIDGE<
            return this;
        }

        public Builder compileFragment(){
            //<REMOVE-BRIDGE>
            Thread.requestOpenglEngineThread();
            this.builder.compileFragment();
            //>REMOVE-BRIDGE<
            return this;
        }
        @MethodArgs(args ={"compileErrorListener"})
        public Builder tryCompileFragment(CompileErrorListener compileErrorListener){
            //<REMOVE-BRIDGE>
            Thread.requestOpenglEngineThread();
            this.builder.compileFragment(new com.itsmagic.engine.Engines.Graphics.RuntimeShading.CompileErrorListener() {
                @Override
                public void onError(String message) {
                    compileErrorListener.onError(message);
                }
            });
            //>REMOVE-BRIDGE<
            return this;
        }

        public Shader create(){
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            Thread.requestOpenglEngineThread();
            return this.builder.create().toJAVARuntime();
            //>REMOVE-BRIDGE<
        }
        @MethodArgs(args ={"shaderErrorListener"})
        public Shader tryCreate(ShaderErrorListener shaderErrorListener){
            //<REMOVE-BRIDGE>
            /*
            //>REMOVE-BRIDGE<
            return null;
            //<REMOVE-BRIDGE>
            */
            //>REMOVE-BRIDGE<

            //<REMOVE-BRIDGE>
            Thread.requestOpenglEngineThread();
            return this.builder.create(new com.itsmagic.engine.Engines.Graphics.RuntimeShading.ShaderErrorListener() {
                @Override
                public void onError(String programError, String shaderError) {
                    shaderErrorListener.onError(programError, shaderError);
                }
            }).toJAVARuntime();
            //>REMOVE-BRIDGE<
        }
    }
}
