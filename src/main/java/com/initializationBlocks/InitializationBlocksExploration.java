package com.initializationBlocks;

public class InitializationBlocksExploration {

    public void executive() {
        NotStaticDog notStaticDog = new NotStaticDog();
        notStaticDog.print();
        notStaticDog = new NotStaticDog("bill", "doberman", 2);
        notStaticDog.print();

        StaticCat staticCat = new StaticCat();
        staticCat.print();
        staticCat = new StaticCat("Jeff", "sphinx", 1);
        staticCat.print();
    }

}
