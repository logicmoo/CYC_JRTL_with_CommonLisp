package org.appdapter.core.component;

public class ComponentAssemblyNames
{
    public static String NS_rdf;
    public static String NS_rdfs;
    public static String NS_dc;
    public static String NS_box;
    public static String P_description;
    public static String P_label;
    public static String P_javaFQCN;
    public static String P_extraThing;
    
    static {
        ComponentAssemblyNames.NS_rdf = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        ComponentAssemblyNames.NS_rdfs = "http://www.w3.org/2000/01/rdf-schema#";
        ComponentAssemblyNames.NS_dc = "http://purl.org/dc/elements/1.1/";
        ComponentAssemblyNames.NS_box = "http://www.appdapter.org/schema/box#";
        ComponentAssemblyNames.P_description = ComponentAssemblyNames.NS_rdfs + "description";
        ComponentAssemblyNames.P_label = ComponentAssemblyNames.NS_box + "label";
        ComponentAssemblyNames.P_javaFQCN = ComponentAssemblyNames.NS_box + "javaFQCN";
        ComponentAssemblyNames.P_extraThing = ComponentAssemblyNames.NS_box + "extraThing";
    }
}

/*

	Total time: 7 ms
	
*/