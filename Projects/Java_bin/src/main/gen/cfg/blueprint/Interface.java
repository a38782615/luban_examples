//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.blueprint;

import bright.serialization.*;



public final class Interface extends cfg.blueprint.Clazz {
    public Interface(ByteBuf _buf) { 
        super(_buf);
    }

    public Interface(String name, String desc, java.util.ArrayList<cfg.blueprint.Clazz> parents, java.util.ArrayList<cfg.blueprint.Method> methods ) {
        super(name, desc, parents, methods);
    }



    public static final int __ID__ = 2114170750;

    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public void resolve(java.util.HashMap<String, Object> _tables) {
        super.resolve(_tables);
    }

    @Override
    public String toString() {
        return "{ "
        + "name:" + name + ","
        + "desc:" + desc + ","
        + "parents:" + parents + ","
        + "methods:" + methods + ","
        + "}";
    }
}
