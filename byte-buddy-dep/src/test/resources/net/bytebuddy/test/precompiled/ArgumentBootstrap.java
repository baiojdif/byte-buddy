package net.bytebuddy.test.precompiled;

import java.lang.invoke.*;

public class ArgumentBootstrap {

    public static CallSite bootstrap(MethodHandles.Lookup lookup, String methodName, MethodType methodType)
            throws NoSuchMethodException, IllegalAccessException {
        return new ConstantCallSite(lookup.findStatic(ArgumentBootstrap.class, methodName, methodType));
    }

    public static String foo(boolean arg0,
                             byte arg1,
                             short arg2,
                             char arg3,
                             int arg4,
                             long arg5,
                             float arg6,
                             double arg7,
                             Class<?> arg8,
                             MethodType arg9,
                             MethodHandle arg10,
                             String arg11,
                             Class<?> arg12,
                             MethodType arg13,
                             MethodHandle arg14,
                             Object arg15) {
        return "" + arg0 + arg1 + arg2 + arg3 + arg4 + arg5 + arg6 + arg7 + arg8 + arg9 + arg10 + arg11 + arg12 + arg13 + arg14 + arg15;
    }

    public static String bar(Boolean arg0,
                             Byte arg1,
                             Short arg2,
                             Character arg3,
                             Integer arg4,
                             Long arg5,
                             Float arg6,
                             Double arg7,
                             String arg8,
                             Class<?> arg9,
                             MethodType arg10,
                             MethodHandle arg11,
                             Object arg12) {
        return "" + arg0 + arg1 + arg2 + arg3 + arg4 + arg5 + arg6 + arg7 + arg8 + arg9 + arg10 + arg11 + arg12;
    }

    public static String qux(String arg) {
        return arg;
    }

    public static String baz(Object arg) {
        return arg.toString();
    }
}
