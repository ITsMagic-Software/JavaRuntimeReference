package JAVARuntime;

@ClassCategory(cat ={"Utils"})
public class AbstractCameraObjectFilter implements CameraObjectFilter {
    @JRDoc_EN("Filters which Shadow will be rendered. Return true to render and false to ignore.")
    @JRDoc_PT("Filtra qual Sombra será renderizada. Retorne verdadeiro para renderizar e falso para ignorar.")
    public boolean filterShadow() {
        return true;
    }

    @JRDoc_EN("Filters which ModelRenderer will be rendered. Return true to render and false to ignore.")
    @JRDoc_PT("Filtra qual ModelRenderer será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
    @MethodArgs({"renderer"})
    public boolean filterRenderer(ModelRenderer renderer) {
        return true;
    }
    @JRDoc_EN("Filters which SkinnedModelRenderer will be rendered. Return true to render and false to ignore.")
    @JRDoc_PT("Filtra qual SkinnedModelRenderer será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
    @MethodArgs({"renderer"})
    public boolean filterRenderer(SkinnedModelRenderer renderer) {
        return true;
    }
    @JRDoc_EN("Filters which Bake will be rendered. Return true to render and false to ignore.")
    @JRDoc_PT("Filtra qual Bake será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
    @MethodArgs({"material","bake"})
    public boolean filterMaterialBake(Material material, Vertex bake) {
        return true;
    }
    @JRDoc_EN("Filters which 3DText will be rendered. Return true to render and false to ignore.")
    @JRDoc_PT("Filtra qual Texto 3D será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
    @MethodArgs({"component"})
    public boolean filter3DText(Component component) {
        return true;
    }

    @JRDoc_EN("Defines whether the Fog will render. Return true to render and false to ignore.")
    @JRDoc_PT("Define se o Fog será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
    public boolean renderFog() {
        return true;
    }

    @JRDoc_EN("Defines whether Particles will render. Return true to render and false to ignore.")
    @JRDoc_PT("Define se as Partículas serão renderizadas. Retorne verdadeiro para renderizar e falso para ignorar.")
    public boolean renderParticles() {
        return true;
    }

    @JRDoc_EN("Filters which ParticleEmitter will be rendered. Return true to render and false to ignore.")
    @JRDoc_PT("Filtra qual Emissor de Partículas será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
    @MethodArgs({"particleEmitter"})
    public boolean filterParticle(ParticleEmitter particleEmitter) {
        return true;
    }

    @JRDoc_EN("Overrides the Ambient Light Color. Return the Color that will override.")
    @JRDoc_PT("Substitui a Cor da Luz Ambiente. Retorne a Cor que será substituída.")
    public Color overrideAmbientLight() {
        return null;
    }
    @JRDoc_EN("Overrides the Indirect Light Color. Return the Color that will override.")
    @JRDoc_PT("Substitui a Cor da Luz Indireta. Retorne a Cor que será substituída.")
    public Color overrideIndirectLight() {
        return null;
    }

}


