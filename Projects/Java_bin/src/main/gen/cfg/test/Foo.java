//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.test;

import bright.serialization.*;



public final class Foo {
    public Foo(ByteBuf _buf) { 
        y1 = _buf.readInt();
        y2 = _buf.readInt();
        y3 = _buf.readInt();
    }

    public Foo(int y1, int y2, int y3 ) {
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }


    public final int y1;
    public final int y2;
    public final int y3;


    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "y1:" + y1 + ","
        + "y2:" + y2 + ","
        + "y3:" + y3 + ","
        + "}";
    }
}
