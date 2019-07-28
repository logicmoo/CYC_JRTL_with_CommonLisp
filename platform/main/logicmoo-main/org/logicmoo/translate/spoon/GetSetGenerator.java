package org.logicmoo.translate.spoon;

import spoon.Launcher;
import spoon.SpoonAPI;

/**
 * Created by Erwin on 11/12/2016.
 */
public class GetSetGenerator {

    public static void main(String[] args) {
        final SpoonAPI spoon = new Launcher();
        spoon.addInputResource("src/main/java");
        spoon.setSourceOutputDirectory("target");
        spoon.addProcessor(new GetSetProcessor());
        spoon.run();
    }

}
