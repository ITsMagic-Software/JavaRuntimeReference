package JAVARuntime;

@ClassCategory(cat ={"Utils"})
public class AbstractCameraObjectFilter implements CameraObjectFilter {
    @MethodArgs(args ={"light"})
    public boolean filterLight(Light light) {
        return true;
    }
    public boolean filterShadow() {
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

    public boolean renderFog() {
        return true;
    }

    public boolean renderParticles() {
        return true;
    }

    @MethodArgs(args ={"particleEmitter"})
    public boolean filterParticle(ParticleEmitter particleEmitter) {
        return true;
    }

    public boolean renderTerrains() {
        return true;
    }
    @MethodArgs(args ={"terrain"})
    public boolean filterTerrain(STerrain terrain) {
        return true;
    }

    @MethodArgs(args ={"hpop"})
    public boolean filterHPOP(HPOP hpop) {
        return true;
    }

    public Color overrideAmbientLight() {
        return null;
    }
    public Color overrideIndirectLight() {
        return null;
    }
}


