package JAVARuntime;


@ClassCategory(cat ={"Utils"})
public class AbstractCameraObjectFilter implements CameraObjectFilter {
    @MethodArgs(args ={"light"})
    public boolean filterLight(Light light) {
        return true;
    }
    @MethodArgs(args ={"renderer"})
    public boolean filterRenderer(ModelRenderer renderer) {
        return true;
    }
    @MethodArgs(args ={"renderer"})
    public boolean filterRenderer(SkinnedModelRenderer renderer) {
        return true;
    }
    @MethodArgs(args ={"material","bake"})
    public boolean filterMaterialBake(Material material, Vertex bake) {
        return true;
    }
    @MethodArgs(args ={"component"})
    public boolean filter3DText(Component component) {
        return true;
    }
}
