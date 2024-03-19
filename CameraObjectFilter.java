package JAVARuntime;

@ClassCategory(cat ={"CameraFilters"})
public interface CameraObjectFilter {
    @MethodArgs(args ={"light"})
    boolean filterLight(Light light);
    boolean filterShadow();

    @MethodArgs(args ={"renderer"})
    boolean filterRenderer(ModelRenderer renderer);
    @MethodArgs(args ={"renderer"})
    boolean filterRenderer(SkinnedModelRenderer renderer);
    @MethodArgs(args ={"material","bake"})
    boolean filterMaterialBake(Material material, Vertex bake);
    @MethodArgs(args ={"component"})
    boolean filter3DText(Component component);

    boolean renderFog();

    boolean renderParticles();
    @MethodArgs(args ={"particleEmitter"})
    boolean filterParticle(ParticleEmitter particleEmitter);

    boolean renderTerrains();
    @MethodArgs(args ={"terrain"})
    boolean filterTerrain(STerrain terrain);

    @MethodArgs(args ={"hpop"})
    boolean filterHPOP(HPOP hpop);

    Color overrideAmbientLight();
    Color overrideIndirectLight();
}

