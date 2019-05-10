package org.appdapter.demo;

public class ScriptMe
{
    public static String yoYoYo(final String arg) {
        return "heard[" + arg + "]";
    }
    
    public static void main(final String[] args) {
        try {
            System.out.println("ScriptMe: " + yoYoYo("whatevs"));
        }
        catch (Throwable t) {
            System.out.println("Caught: " + t);
            t.printStackTrace();
        }
    }
}

/*

	Total time: 24 ms
	
*/