package JAVARuntime;

@ClassCategory(cat={"CameraFilters"})
public interface CameraObjectFilter {
    @MethodArgs(args={"light"})
    boolean filterLight(Light light);
    @MethodArgs(args={"renderer"})
    boolean filterRenderer(ModelRenderer renderer);
    @MethodArgs(args={"renderer"})
    boolean filterRenderer(SkinnedModelRenderer renderer);
    @MethodArgs(args={"material","bake"})
    boolean filterMaterialBake(Material material, Vertex bake);
    @MethodArgs(args={"component"})
    boolean filter3DText(Component component);
}

