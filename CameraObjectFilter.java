package JAVARuntime;

@ClassCategory(cat = {"CameraFilters"})
public interface CameraObjectFilter {
  @JRDoc_EN("Filters which Light will be rendered. Return true to render and false to ignore.")
  @JRDoc_PT("Filtra qual Luz será renderizada. Retorne verdadeiro para renderizar e falso para ignorar.")
  @MethodArgs({"light"})
  boolean filterLight(Light light);

  @JRDoc_EN("Filters which Shadow will be rendered. Return true to render and false to ignore.")
  @JRDoc_PT("Filtra qual Sombra será renderizada. Retorne verdadeiro para renderizar e falso para ignorar.")
  boolean filterShadow();

  @JRDoc_EN("Filters which ModelRenderer will be rendered. Return true to render and false to ignore.")
  @JRDoc_PT("Filtra qual ModelRenderer será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
  @MethodArgs({"renderer"})
  boolean filterRenderer(ModelRenderer renderer);

  @JRDoc_EN("Filters which SkinnedModelRenderer will be rendered. Return true to render and false to ignore.")
  @JRDoc_PT("Filtra qual SkinnedModelRenderer será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
  @MethodArgs({"renderer"})
  boolean filterRenderer(SkinnedModelRenderer renderer);

  @JRDoc_EN("Filters which Bake will be rendered. Return true to render and false to ignore.")
  @JRDoc_PT("Filtra qual Bake será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
  @MethodArgs({"material", "bake"})
  boolean filterMaterialBake(Material material, Vertex bake);

  @JRDoc_EN("Filters which 3DText will be rendered. Return true to render and false to ignore.")
  @JRDoc_PT("Filtra qual Texto 3D será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
  @MethodArgs({"component"})
  boolean filter3DText(Component component);

  @JRDoc_EN("Defines whether the Fog will render. Return true to render and false to ignore.")
  @JRDoc_PT("Define se o Fog será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
  boolean renderFog();

  @JRDoc_EN("Defines whether Particles will render. Return true to render and false to ignore.")
  @JRDoc_PT("Define se as Partículas serão renderizadas. Retorne verdadeiro para renderizar e falso para ignorar.")
  boolean renderParticles();

  @JRDoc_EN("Filters which ParticleEmitter will be rendered. Return true to render and false to ignore.")
  @JRDoc_PT("Filtra qual Emissor de Partículas será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
  @MethodArgs({"particleEmitter"})
  boolean filterParticle(ParticleEmitter particleEmitter);

  @JRDoc_EN("Defines whether the Terrain will render. Return true to render and false to ignore.")
  @JRDoc_PT("Define se o Terreno será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
  boolean renderTerrains();

  @JRDoc_EN("Filters which Terrain will be rendered. Return true to render and false to ignore.")
  @JRDoc_PT("Filtra qual Terreno será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
  @MethodArgs({"terrain"})
  boolean filterTerrain(STerrain terrain);

  @JRDoc_EN("Filters which HPOP will be rendered. Return true to render and false to ignore.")
  @JRDoc_PT("Filtra qual HPOP será renderizado. Retorne verdadeiro para renderizar e falso para ignorar.")
  @MethodArgs({"hpop"})
  boolean filterHPOP(HPOP hpop);

  @JRDoc_EN("Overrides the Ambient Light Color. Return the Color that will be override.")
  @JRDoc_PT("Substitui a Cor da Luz Ambiente. Retorne a Cor que será substituída.")
  Color overrideAmbientLight();

  @JRDoc_EN("Overrides the Indirect Light Color. Return the Color that will be override.")
  @JRDoc_PT("Substitui a Cor da Luz Indireta. Retorne a Cor que será substituída.")
  Color overrideIndirectLight();
}
