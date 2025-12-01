package JAVARuntime;

//

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat ={"Laser"})
public final class Laser {
    //

    //

    public Laser() {
        //
    }
    @MethodArgs({"color"})
    public Laser(Color color) {
        //
    }

    @JRDoc_EN("Returns the color shown in the editor when the Laser hits something.")
    @JRDoc_PT("Retorna a cor exibida no editor quando o Laser acerta algo.")
    @HideGetSet
    public Color getColor() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the color shown in the editor when the Laser hits something.")
    @JRDoc_PT("Define a cor exibida no editor quando o Laser acerta algo.")
    @HideGetSet
    @MethodArgs({"color"})
    public void setColor(Color color){
        //
    }

    @JRDoc_EN("Returns the color shown in the editor when the Laser hits nothing.")
    @JRDoc_PT("Retorna a cor exibida no editor quando o Laser não acerta nada.")
    @HideGetSet
    public Color getNoHitColor() {
        //
        return null;
        //

        //
    }
    @JRDoc_EN("Sets the color shown in the editor when the Laser hits nothing.")
    @JRDoc_PT("Define a cor exibida no editor quando o Laser não acerta nada.")
    @HideGetSet
    @MethodArgs({"color"})
    public void setNoHitColor(Color color){
        //
    }

    @JRDoc_EN("Returns whether the gizmo (laser visualization) is shown in the editor.")
    @JRDoc_PT("Retorna se o gizmo (visualização do laser) está sendo exibido no editor.")
    @HideGetSet
    public boolean isShowGizmo() {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Sets whether the gizmo (laser visualization) is shown in the editor.")
    @JRDoc_PT("Define se o gizmo (visualização do laser) será exibido no editor.")
    @HideGetSet
    @MethodArgs({"showGizmo"})
    public void setShowGizmo(boolean showGizmo) {
        //
    }

    @JRDoc_EN("Returns whether the laser should try to find out which child collider was hit.")
    @JRDoc_PT("Retorna se o laser deve tentar descobrir qual collider filho foi atingido.")
    @HideGetSet
    public boolean isDetermineHitCollider() {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Defines whether the laser should try to find out which child collider of the object with physics was the laser's hit collider, it is a heavy operation that should be turned off when not needed; True by default; When false: hit.getColliderObject(), hit.getCollider() return null")
    @JRDoc_PT("Define se o laser deve tentar descobrir qual collider filho do objeto com a fisica foi o colisor de batida do laser, é uma operação pesada que deve ser desligada quando não precisar; True por padrão; Quando false: hit.getColliderObject(), hit.getCollider() retornam null.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setDetermineHitCollider(boolean value) {
        //
    }

    @JRDoc_EN("Returns whether the laser should try to calculate the UV of the face at the hit point.")
    @JRDoc_PT("Retorna se o laser deve tentar calcular o UV da face no ponto de impacto.")
    @HideGetSet
    public boolean isCalculateFaceUV() {
        //
        return false;
        //

        //
    }
    @JRDoc_EN("Defines whether the laser should try to calculate the UV of the face at the hit point, it is a heavy operation that should be turned off when not needed; True by default; When false: hit.getUVCoord() return null.")
    @JRDoc_PT("Define se o laser deve tentar calcular o UV da face no hit point, é uma operação pesada que deve ser desligada quando não precisar; True por padrão; Quando false: hit.getUVCoord() retorna null.")
    @HideGetSet
    @MethodArgs({"value"})
    public void setCalculateFaceUV(boolean value) {
        //
    }

    // -------------------------
    // Single-hit ray traces
    // -------------------------

    @JRDoc_EN("Traces a laser using the specified Ray.")
    @JRDoc_PT("Traça um laser usando o Ray especificado.")
    @MethodArgs({"ray"})
    public LaserHit trace(JAVARuntime.Ray ray) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a laser from a specified position and direction.")
    @JRDoc_PT("Traça um laser a partir de uma posição e direção especificadas.")
    @MethodArgs({"position","direction"})
    public LaserHit trace(Vector3 position, Vector3 direction) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a laser from a specified position and direction, with a defined maximum distance.")
    @JRDoc_PT("Traça um laser a partir de uma posição e direção especificadas, com uma distância máxima definida.")
    @MethodArgs({"position","direction","distance"})
    public LaserHit trace(Vector3 position, Vector3 direction, float distance) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a laser from a specified position, direction, and distance with the indicated PhysicsLayer.")
    @JRDoc_PT("Traça um laser a partir de uma posição, direção e distância máxima especificada no PhysicsLayer indicado.")
    @MethodArgs({"position","direction","distance","layer"})
    public LaserHit trace(Vector3 position, Vector3 direction, float distance, PhysicsLayer layer) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a laser from a specified position and direction, in the indicated PhysicsLayer.")
    @JRDoc_PT("Traça um laser a partir de uma posição e direção especificadas, no PhysicsLayer indicado.")
    @MethodArgs({"position","direction","layer"})
    public LaserHit trace(Vector3 position, Vector3 direction, PhysicsLayer layer) throws NoHitException {
        //
        return null;
        //

        //
    }

    // -------------------------
    // Multi-hit ray traces (agora lançam NoHitException quando vazias)
    // -------------------------

    @JRDoc_EN("Traces a laser using the specified Ray and return all collisions.")
    @JRDoc_PT("Traça um laser usando o Ray especificado e retorna todas as colisões.")
    @MethodArgs({"ray"})
    public List<LaserHit> traceAll(JAVARuntime.Ray ray) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a laser from a specified position and direction and return all collisions.")
    @JRDoc_PT("Traça um laser a partir de uma posição e direção especificadas e retorna todas as colisões.")
    @MethodArgs({"position","direction"})
    public List<LaserHit> traceAll(Vector3 position, Vector3 direction) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a laser from a specified position and direction, with a defined maximum distance and return all collisions.")
    @JRDoc_PT("Traça um laser a partir de uma posição e direção especificadas, com uma distância máxima definida e retorna todas as colisões.")
    @MethodArgs({"position","direction","distance"})
    public List<LaserHit> traceAll(Vector3 position, Vector3 direction, float distance) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a laser from a specified position, direction, and distance with the indicated PhysicsLayer and return all collisions.")
    @JRDoc_PT("Traça um laser a partir de uma posição, direção e distância máxima especificada no PhysicsLayer indicado e retorna todas as colisões.")
    @MethodArgs({"position","direction","distance","layer"})
    public List<LaserHit> traceAll(Vector3 position, Vector3 direction, float distance, PhysicsLayer layer) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a laser from a specified position and direction, in the indicated PhysicsLayer and return all collisions.")
    @JRDoc_PT("Traça um laser a partir de uma posição e direção especificadas, no PhysicsLayer indicado e retorna todas as colisões.")
    @MethodArgs({"position","direction","layer"})
    public List<LaserHit> traceAll(Vector3 position, Vector3 direction, PhysicsLayer layer) throws NoHitException {
        //
        return null;
        //

        //
    }

    // -------------------------
    // Single-hit sphere traces
    // -------------------------

    @JRDoc_EN("Traces a sphere sweep test laser using the specified Ray.")
    @JRDoc_PT("Traça um teste esferico laser usando o Ray especificado.")
    @MethodArgs({"ray","radius"})
    public LaserHit traceSphere(JAVARuntime.Ray ray, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a sphere sweep test laser from a specified position and direction.")
    @JRDoc_PT("Traça um teste esferico laser a partir de uma posição e direção especificadas.")
    @MethodArgs({"position","direction","radius"})
    public LaserHit traceSphere(Vector3 position, Vector3 direction, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a sphere sweep test laser from a specified position and direction, with a defined maximum distance.")
    @JRDoc_PT("Traça um teste esferico laser a partir de uma posição e direção especificadas, com uma distância máxima definida.")
    @MethodArgs({"position","direction","distance","radius"})
    public LaserHit traceSphere(Vector3 position, Vector3 direction, float distance, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a sphere sweep test laser from a specified position, direction, and distance with the indicated PhysicsLayer.")
    @JRDoc_PT("Traça um teste esferico laser a partir de uma posição, direção e distância máxima especificada no PhysicsLayer indicado.")
    @MethodArgs({"position","direction","distance","layer","radius"})
    public LaserHit traceSphere(Vector3 position, Vector3 direction, float distance, PhysicsLayer layer, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a sphere sweep test laser from a specified position and direction, in the indicated PhysicsLayer.")
    @JRDoc_PT("Traça um teste esferico laser a partir de uma posição e direção especificadas, no PhysicsLayer indicado.")
    @MethodArgs({"position","direction","layer","radius"})
    public LaserHit traceSphere(Vector3 position, Vector3 direction, PhysicsLayer layer, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }

    // -------------------------
    // Multi-hit sphere traces (agora lançam NoHitException quando vazias)
    // -------------------------

    @JRDoc_EN("Traces a sphere sweep test laser using the specified Ray and return all collisions.")
    @JRDoc_PT("Traça um teste esferico laser usando o Ray especificado e retorna todas as colisões.")
    @MethodArgs({"ray","radius"})
    public List<LaserHit> traceSphereAll(JAVARuntime.Ray ray, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a sphere sweep test laser from a specified position and direction and return all collisions.")
    @JRDoc_PT("Traça um teste esferico laser a partir de uma posição e direção especificadas e retorna todas as colisões.")
    @MethodArgs({"position","direction","radius"})
    public List<LaserHit> traceSphereAll(Vector3 position, Vector3 direction, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a sphere sweep test laser from a specified position and direction, with a defined maximum distance and return all collisions.")
    @JRDoc_PT("Traça um teste esferico laser a partir de uma posição e direção especificadas, com uma distância máxima definida e retorna todas as colisões.")
    @MethodArgs({"position","direction","distance","radius"})
    public List<LaserHit> traceSphereAll(Vector3 position, Vector3 direction, float distance, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a sphere sweep test laser from a specified position, direction, and distance with the indicated PhysicsLayer and return all collisions.")
    @JRDoc_PT("Traça um teste esferico laser a partir de uma posição, direção e distância máxima especificada no PhysicsLayer indicado e retorna todas as colisões.")
    @MethodArgs({"position","direction","distance","layer","radius"})
    public List<LaserHit> traceSphereAll(Vector3 position, Vector3 direction, float distance, PhysicsLayer layer, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }

    @JRDoc_EN("Traces a sphere sweep test laser from a specified position and direction, in the indicated PhysicsLayer and return all collisions.")
    @JRDoc_PT("Traça um teste esferico laser a partir de uma posição e direção especificadas, no PhysicsLayer indicado e retorna todas as colisões.")
    @MethodArgs({"position","direction","layer","radius"})
    public List<LaserHit> traceSphereAll(Vector3 position, Vector3 direction, PhysicsLayer layer, float radius) throws NoHitException {
        //
        return null;
        //

        //
    }
}
