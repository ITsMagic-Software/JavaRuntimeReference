package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Material"})
public class Shader {
    //

    private Shader() {
        //
    }

    //

    public static class Builder{

        //

        public Builder() {
            //
        }
        @MethodArgs(args={"vertexCode","fragmentCode"})
        public Builder(String vertexCode, String fragmentCode) {
            //
        }

        public String getVertexCode() {
            //
            return null;
            //

            //
        }
        @MethodArgs(args={"vertexCode","vertexCode"})
        public Builder setVertexCode(String vertexCode) {
            //
            return this;
        }
        @Deprecated
        @DeprecatedInfo(info={"PFile is now obsolete, use Shader.Builder.setVertexCode(VertexGLSLFile) instead"})
        @MethodArgs(args={"file"})
        public Builder setVertexCode(PFile pFile) {
            //
            return this;
        }
        @MethodArgs(args={"file"})
        public Builder setVertexCode(VertexGLSLFile pFile) {
            //
            return this;
        }
        @MethodArgs(args={"vertexShader"})
        public Builder setVertexCode(VertexShader vertexShader) {
            //
            return this;
        }

        public String getGeometryCode() {
            //
            return null;
            //

            //
        }
        @MethodArgs(args={"geometryCode"})
        public Builder setGeometryCode(String geometryCode) {
            //
            return this;
        }
        @Deprecated
        @DeprecatedInfo(info={"PFile is now obsolete, use Shader.Builder.setGeometryCode(FragmentGLSLFile) instead"})
        @MethodArgs(args={"file"})
        public Builder setGeometryCode(PFile pFile) {
            //
            return this;
        }
        @MethodArgs(args={"file"})
        public Builder setGeometryCode(GeometryGLSLFile pFile) {
            //
            return this;
        }
        @MethodArgs(args={"fragmentShader"})
        public Builder setGeometryCode(GeometryShader geometryShader) {
            //
            return this;
        }

        public String getFragmentCode() {
            //
            return null;
            //

            //
        }
        @MethodArgs(args={"fragmentCode"})
        public Builder setFragmentCode(String fragmentCode) {
            //
            return this;
        }
        @Deprecated
        @DeprecatedInfo(info={"PFile is now obsolete, use Shader.Builder.setFragmentCode(FragmentGLSLFile) instead"})
        @MethodArgs(args={"file"})
        public Builder setFragmentCode(PFile pFile) {
            //
            return this;
        }
        @MethodArgs(args={"file"})
        public Builder setFragmentCode(FragmentGLSLFile pFile) {
            //
            return this;
        }
        @MethodArgs(args={"fragmentShader"})
        public Builder setFragmentCode(FragmentShader fragmentShader) {
            //
            return this;
        }

        public Builder createProgram(){
            //
            return this;
        }

        public boolean isGeometryShaderActive() {
            //
            return false;
            //

            //
        }
        public Builder activateGeometryShader(boolean value) {
            //
            return this;
        }


        public Builder compileVertex(){
            //
            return this;
        }
        @MethodArgs(args={"compileErrorListener"})
        public Builder tryCompileVertex(CompileErrorListener compileErrorListener){
            //
            return this;
        }

        public Builder compileGeometry(){
            //
            return this;
        }
        @MethodArgs(args={"compileErrorListener"})
        public Builder tryCompileGeometry(CompileErrorListener compileErrorListener){
            //
            return this;
        }

        public Builder compileFragment(){
            //
            return this;
        }
        @MethodArgs(args={"compileErrorListener"})
        public Builder tryCompileFragment(CompileErrorListener compileErrorListener){
            //
            return this;
        }

        public Shader create(){
            //
            return null;
            //

            //
        }
        @MethodArgs(args={"shaderErrorListener"})
        public Shader tryCreate(ShaderErrorListener shaderErrorListener){
            //
            return null;
            //

            //
        }
    }
}
