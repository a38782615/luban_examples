//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.test;

import bright.serialization.*;



public abstract class RefDynamicBase {
    public RefDynamicBase(ByteBuf _buf) { 
        x = _buf.readInt();
    }

    public RefDynamicBase(int x ) {
        this.x = x;
    }

    public static RefDynamicBase deserializeRefDynamicBase(ByteBuf _buf) {
        switch (_buf.readInt()) {
            case cfg.test.RefBean.__ID__: return new cfg.test.RefBean(_buf);
            default: throw new SerializationException();
        }
    }

    public final int x;
    public cfg.test.TestBeRef x_Ref;

    public abstract int getTypeId();

    public void resolve(java.util.HashMap<String, Object> _tables) {
        this.x_Ref = ((cfg.test.TbTestBeRef)_tables.get("test.TbTestBeRef")).get(x);
    }

    @Override
    public String toString() {
        return "{ "
        + "x:" + x + ","
        + "}";
    }
}
