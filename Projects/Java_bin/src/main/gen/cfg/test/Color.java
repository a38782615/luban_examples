//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.test;

import bright.serialization.*;



public final class Color {
    public Color(ByteBuf _buf) { 
        r = _buf.readFloat();
        g = _buf.readFloat();
        b = _buf.readFloat();
        a = _buf.readFloat();
    }

    public Color(float r, float g, float b, float a ) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }


    public final float r;
    public final float g;
    public final float b;
    public final float a;


    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "r:" + r + ","
        + "g:" + g + ","
        + "b:" + b + ","
        + "a:" + a + ","
        + "}";
    }
}
