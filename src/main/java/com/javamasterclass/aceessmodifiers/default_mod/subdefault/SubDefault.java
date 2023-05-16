package com.javamasterclass.aceessmodifiers.default_mod.subdefault;


import com.javamasterclass.aceessmodifiers.default_mod.MainDefault;
import com.javamasterclass.aceessmodifiers.private_mod.MainPrivate;

public class SubDefault {
    public static void main(String[] args) {
        System.out.println(MainDefault.lastName);       // only public accessible
        System.out.println(
                "Default is package-private only : \n" +
                "Only accessible in same package\n" +
                "Not accessible in even sub-package of same package"
        );
    }
}

// default only accessible in package com.javamasterclass.aceessmodifiers.default_mod
// not in package com.javamasterclass.aceessmodifiers.default_mod.subdefault