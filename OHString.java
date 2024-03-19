package JAVARuntime;

//<REMOVE-BRIDGE>
import com.itsmagic.engine.Activities.Editor.Panels.Scripting.Interfaces.Utils.IgnoreAutoComplete;
//>REMOVE-BRIDGE<

@ClassCategory(cat ={"Buffers"})
public class OHString implements
    SumOperator, SubOperator, DivOperator,
    SumEqualOperator, SubEqualOperator, DivEqualOperator,
    EqualsComparator, GreaterThanComparator, LessThanComparator,
    RemoveRemoveOperator
{

    //<REMOVE-BRIDGE>
    @IgnoreAutoComplete
    public transient com.itsmagic.engine.Engines.Native.OHString.OHString ohString;
    @IgnoreAutoComplete
    public OHString(com.itsmagic.engine.Engines.Native.OHString.OHString ohString) {
        this.ohString = ohString;
        this.ohString.setRuntime(this);
    }
    //>REMOVE-BRIDGE<

    public OHString() {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Native.OHString.OHString());
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public OHString(String str) {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Native.OHString.OHString(str));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public OHString(char[] str) {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Native.OHString.OHString(str));
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public OHString(OHString str) {
        //<REMOVE-BRIDGE>
        this(new com.itsmagic.engine.Engines.Native.OHString.OHString(str.ohString));
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"str"})
    public void set(String str){
        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        this.ohString.set(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void set(OHString str){
        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        this.ohString.set(str.ohString);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void set(float str){
        //<REMOVE-BRIDGE>
        this.ohString.set(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void set(int str){
        //<REMOVE-BRIDGE>
        this.ohString.set(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void set(boolean str){
        //<REMOVE-BRIDGE>
        this.ohString.set(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void set(double str){
        //<REMOVE-BRIDGE>
        this.ohString.set(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void set(long str){
        //<REMOVE-BRIDGE>
        this.ohString.set(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void set(short str){
        //<REMOVE-BRIDGE>
        this.ohString.set(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void set(char str){
        //<REMOVE-BRIDGE>
        this.ohString.set(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"chars","offset","length"})
    public void set(char[] chars, int offset, int length){
        //<REMOVE-BRIDGE>
        this.ohString.set(chars, offset, length);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"str"})
    public void concatLocal(String str){
        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        this.ohString.concatLocal(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void concatLocal(OHString str){
        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        this.ohString.concatLocal(str.ohString);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void concatLocalAtStart(String str){
        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        this.ohString.concatLocalAtStart(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public void concatLocalAtStart(OHString str){
        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        this.ohString.concatLocalAtStart(str.ohString);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"str"})
    public OHString concat(String str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        return this.ohString.concat(str).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public OHString concat(OHString str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        return this.ohString.concat(str.ohString).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public OHString concatAtStart(String str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        return this.ohString.concatAtStart(str).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public OHString concatAtStart(OHString str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        return this.ohString.concatAtStart(str.ohString).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"startIdx"})
    public OHString subString(int startIdx){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.ohString.substring(startIdx).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"startIdx","endIdx"})
    public OHString subString(int startIdx, int endIndex){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.ohString.substring(startIdx, endIndex).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"startIdx"})
    public void subStringLocal(int startIdx){
        //<REMOVE-BRIDGE>
        this.ohString.subStringLocal(startIdx);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"startIdx","endIdx"})
    public void subStringLocal(int startIdx, int endIndex){
        //<REMOVE-BRIDGE>
        this.ohString.subStringLocal(startIdx, endIndex);
        //>REMOVE-BRIDGE<
    }

    public OHString trim(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.ohString.trim().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"str"})
    public boolean equals(String str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            return false;
        }
        return this.ohString.equals(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public boolean equals(OHString str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            return false;
        }
        return this.ohString.equals(str.ohString);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public boolean equalsIgnoreCase(String str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            return false;
        }
        return this.ohString.equalsIgnoreCase(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public boolean equalsIgnoreCase(OHString str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            return false;
        }
        return this.ohString.equalsIgnoreCase(str.ohString);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"str"})
    public boolean contains(String str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        return this.ohString.contains(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public boolean contains(OHString str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        return this.ohString.contains(str.ohString);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"str"})
    public OHString[] split(String str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        return this.ohString.splitToRuntime(str);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str"})
    public OHString[] split(OHString str){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        return this.ohString.splitToRuntime(str.ohString);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"str", "replacement"})
    public OHString replace(String str, String replacement){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        if(replacement == null){
            throw new NullPointerException("replacement can't be null");
        }
        return this.ohString.replace(str, replacement).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str", "replacement"})
    public OHString replace(OHString str, OHString replacement){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        if(replacement == null){
            throw new NullPointerException("replacement can't be null");
        }
        return this.ohString.replace(str.ohString, replacement.ohString).toJAVARuntime();
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str", "replacement"})
    public void replaceLocal(String str, String replacement){
        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        if(replacement == null){
            throw new NullPointerException("replacement can't be null");
        }
        this.ohString.replaceLocal(str, replacement);
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"str", "replacement"})
    public void replaceLocal(OHString str, OHString replacement){
        //<REMOVE-BRIDGE>
        if(str == null){
            throw new NullPointerException("str can't be null");
        }
        if(replacement == null){
            throw new NullPointerException("replacement can't be null");
        }
        this.ohString.replaceLocal(str.ohString, replacement.ohString);
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"str"})
    public boolean isEmpty(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.ohString.isEmpty();
        //>REMOVE-BRIDGE<
    }

    public int length() {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return 0;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.ohString.capacity();
        //>REMOVE-BRIDGE<
    }

    //<REMOVE-BRIDGE>
    @Override
    //>REMOVE-BRIDGE<
    public String toString(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.ohString.toString();
        //>REMOVE-BRIDGE<
    }

    public OHString copy(){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.ohString.clone().toJAVARuntime();
        //>REMOVE-BRIDGE<
    }

    /// Comparators
    @MethodArgs(args ={"value"})
    public boolean equals(Object otherObject){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            return this.equals(other);
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            return this.equals(other);
        }
        else {
            throw new IllegalOperatorException("The operator == is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean pointerEquals(Object otherObject){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this == otherObject;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean notEquals(Object otherObject){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            return !this.equals(other);
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            return !this.equals(other);
        }
        else {
            throw new IllegalOperatorException("The operator != is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public static boolean isNull(Object value){
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return value == null;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public boolean greaterThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            return this.length() > other.length();
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            return this.length() > other.length();
        }
        else {
            throw new IllegalOperatorException("The operator > is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() > v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() > v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() > v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() > v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            return this.length() >= other.length();
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            return this.length() >= other.length();
        }
        else {
            throw new IllegalOperatorException("The operator >= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() >= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() >= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() >= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean greaterOrEqualsThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() >= v;
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public boolean lessThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            return this.length() < other.length();
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            return this.length() < other.length();
        }
        else {
            throw new IllegalOperatorException("The operator < is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() < v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() < v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() < v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() < v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            return this.length() <= other.length();
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            return this.length() <= other.length();
        }
        else {
            throw new IllegalOperatorException("The operator <= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(float v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() <= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(int v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() <= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(long v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() <= v;
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public boolean lessOrEqualsThan(double v) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return false;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        return this.length() <= v;
        //>REMOVE-BRIDGE<
    }

    /// Operators
    @MethodArgs(args ={"value"})
    public <T> T sum(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            return (T) this.concat(other);
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            return (T) this.concat(other);
        }
        else {
            throw new IllegalOperatorException("The operator + is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void sumEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            this.concatLocal(other);
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            this.concatLocal(other);
        }
        else {
            throw new IllegalOperatorException("The operator += is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public <T> T div(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            return (T) this.split(other);
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            return (T) this.split(other);
        }
        else {
            throw new IllegalOperatorException("The operator / is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void divEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        throw new IllegalOperatorException("The operator /= is undefined for the type " + this.getClass().getName());
        //>REMOVE-BRIDGE<
    }

    @MethodArgs(args ={"value"})
    public <T> T sub(Object otherObject) {
        //<REMOVE-BRIDGE>
        /*
        //>REMOVE-BRIDGE<
        return null;
        //<REMOVE-BRIDGE>
        */
        //>REMOVE-BRIDGE<

        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            return (T) this.replace(other,new OHString());
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            return (T) this.replace(other, "");
        }
        else {
            throw new IllegalOperatorException("The operator - is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }
    @MethodArgs(args ={"value"})
    public void subEqual(Object otherObject) {
        //<REMOVE-BRIDGE>
        if(otherObject instanceof OHString) {
            OHString other = (OHString) otherObject;
            this.replaceLocal(other,new OHString());
        }
        else if(otherObject instanceof String) {
            String other = (String) otherObject;
            this.replaceLocal(other, "");
        }
        else {
            throw new IllegalOperatorException("The operator -= is undefined for the type(s) " + this.getClass().getName() +", "+ otherObject.getClass().getName());
        }
        //>REMOVE-BRIDGE<
    }

    public void removeRemove() {
        //<REMOVE-BRIDGE>
        if(this.ohString.capacity() <= 0){
            throw new IndexOutOfBoundsException("Can't -- on a empty string");
        }
        this.subString(0, ohString.capacity()-1);
        //>REMOVE-BRIDGE<
    }
}
