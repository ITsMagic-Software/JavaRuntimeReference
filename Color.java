package JAVARuntime;

//

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
@ClassCategory(cat={"Vector"})
public class Color implements
        SumOperator, SubOperator, MulOperator, DivOperator,
        SumEqualOperator, SubEqualOperator, MulEqualOperator, DivEqualOperator,
        EqualsComparator, GreaterThanComparator, LessThanComparator
{
    //

    //

    public Color() {
        //
    }
    @MethodArgs(args={"r","g","b"})
    public Color(int r, int g, int b) {
        //
    }
    @MethodArgs(args={"a","r","g","b"})
    public Color(int a, int r, int g, int b) {
        //
    }
    @MethodArgs(args={"a","r","g","b"})
    public Color(float a, float r, float g, float b) {
        //
    }
    @MethodArgs(args={"hex"})
    public Color(String hex){
        //
    }
    
    @MethodArgs(args={"color"})
    public void set(Color color){
        //
    }

    /**
     * Integer color
     * Also called by HEX
     */
    public int getInt(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"color"})
    public void setInt(int color){
        //
    }

    /**
     * Hex color
     */
    @MethodArgs(args={"hex"})
    public void fromHexString(String hex){
        //
    }
    @MethodArgs(args={"hex"})
    public void fromHex(String hex){
        //
    }
    public String getHexString(){
        //
        return "";
        //

        //
    }
    public String toHex(){
        //
        return "";
        //

        //
    }

    /**
     * Integer value of the ARGB channels (0-255)
     */
    public int getIntAlpha(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setIntAlpha(int value){
        //
    }
    public int getIntRed(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setIntRed(int value){
        //
    }
    public int getIntGreen(){
        //
        return 0;
        //

        //
    }
    @Deprecated
    @DeprecatedInfo(info={"method with spelling error, use setIntGreen"})
    @MethodArgs(args={"value"})
    public void setIntGree(int value){
        //
    }
    @MethodArgs(args={"value"})
    public void setIntGreen(int value){
        //
    }
    public int getIntBlue(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setIntBlue(int value){
        //
    }
    
    @MethodArgs(args={"a","r","g","b"})
    public void setInts(int a, int r, int g, int b){
        //
    }
    @MethodArgs(args={"r","g","b"})
    public void setInts(int r, int g, int b){
        //
    }

    /**
     * Float value of the ARGB channels (0.0f - 1.0f)
     */
    public float getFloatAlpha(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setFloatAlpha(float value){
        //
    }

    public float getFloatRed(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setFloatRed(float value){
        //
    }

    public float getFloatGreen(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setFloatGreen(float value){
        //
    }

    public float getFloatBlue(){
        //
        return 0;
        //

        //
    }
    @MethodArgs(args={"value"})
    public void setFloatBlue(float value){
        //
    }
    
    @MethodArgs(args={"a","r","g","b"})
    public void setFloats(float a, float r, float g, float b){
        //
    }
    @MethodArgs(args={"r","g","b"})
    public void setFloats(float r, float g, float b){
        //
    }
    
    @MethodArgs(args={"color"})
    public Color sum(Color color){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"color"})
    public Color sum(Vector3 color){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"color"})
    public Color sum(Vector2 color){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args={"color"})
    public Color sub(Color color){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"color"})
    public Color sub(Vector3 color){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"color"})
    public Color sub(Vector2 color){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args={"color"})
    public Color mul(Color color){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"color"})
    public Color mul(Vector3 color){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"color"})
    public Color mul(Vector2 color){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args={"color"})
    public Color div(Color color){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"color"})
    public Color div(Vector3 color){
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"color"})
    public Color div(Vector2 color){
        //
        return null;
        //

        //
    }
    
    @MethodArgs(args={"color"})
    public void sumLocal(Color color){
        //
    }
    @MethodArgs(args={"color"})
    public void sumLocal(Vector3 color){
        //
    }
    @MethodArgs(args={"color"})
    public void sumLocal(Vector2 color){
        //
    }
    
    @MethodArgs(args={"color"})
    public void subLocal(Color color){
        //
    }
    @MethodArgs(args={"color"})
    public void subLocal(Vector3 color){
        //
    }
    @MethodArgs(args={"color"})
    public void subLocal(Vector2 color){
        //
    }
    
    @MethodArgs(args={"color"})
    public void mulLocal(Color color){
        //
    }
    @MethodArgs(args={"color"})
    public void mulLocal(Vector3 color){
        //
    }
    @MethodArgs(args={"color"})
    public void mulLocal(Vector2 color){
        //
    }
    
    @MethodArgs(args={"color"})
    public void divLocal(Color color){
        //
    }
    @MethodArgs(args={"color"})
    public void divLocal(Vector3 color){
        //
    }
    @MethodArgs(args={"color"})
    public void divLocal(Vector2 color){
        //
    }

    public String toString() {
        //
        return "";
        //

        //
    }

    public static Color RED(){
        //
        return null;
        //

        //
    }
    public static Color WHITE(){
        //
        return null;
        //

        //
    }
    public static Color BLACK(){
        //
        return null;
        //

        //
    }
    public static Color GREEN(){
        //
        return null;
        //

        //
    }
    public static Color BLUE(){
        //
        return null;
        //

        //
    }
    public static Color YELLOW(){
        //
        return null;
        //

        //
    }
    public static Color PINK(){
        //
        return null;
        //

        //
    }

    /// Comparators
    @MethodArgs(args={"otherObject"})
    public boolean equals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"otherObject"})
    public boolean pointerEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"otherObject"})
    public boolean notEquals(Object otherObject){
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public static boolean isNull(Object value){
        //
        return false;
        //

        //
    }
    
    @MethodArgs(args={"otherObject"})
    public boolean greaterThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean greaterThan(float v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean greaterThan(int v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean greaterThan(long v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean greaterThan(double v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"otherObject"})
    public boolean greaterOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean greaterOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean greaterOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean greaterOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean greaterOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }
    
    @MethodArgs(args={"otherObject"})
    public boolean lessThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean lessThan(float v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean lessThan(int v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean lessThan(long v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean lessThan(double v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"otherObject"})
    public boolean lessOrEqualsThan(Object otherObject) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean lessOrEqualsThan(float v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"value"})
    public boolean lessOrEqualsThan(int v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"color"})
    public boolean lessOrEqualsThan(long v) {
        //
        return false;
        //

        //
    }
    @MethodArgs(args={"color"})
    public boolean lessOrEqualsThan(double v) {
        //
        return false;
        //

        //
    }

    /// Operators
    @MethodArgs(args={"otherObject"})
    public <T> T sum(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"otherObject"})
    public void sumEqual(Object otherObject) {
        //
    }
    
    @MethodArgs(args={"otherObject"})
    public <T> T div(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"otherObject"})
    public void divEqual(Object otherObject) {
        //
    }
    
    @MethodArgs(args={"otherObject"})
    public <T> T mul(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"otherObject"})
    public void mulEqual(Object otherObject) {
        //
    }
    
    @MethodArgs(args={"otherObject"})
    public <T> T sub(Object otherObject) {
        //
        return null;
        //

        //
    }
    @MethodArgs(args={"otherObject"})
    public void subEqual(Object otherObject) {
        //
    }
}
