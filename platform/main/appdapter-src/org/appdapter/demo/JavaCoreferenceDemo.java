package org.appdapter.demo;

public class JavaCoreferenceDemo
{
    public static <OT> OT getOffTopic() {
        return null;
    }
    
    public static <OT> OT getOffTopicNarrow(final Class<OT> objClass) {
        return null;
    }
    
    public static <JFT extends JavaFunTao<JFZ>, JFZ extends JavaFunZen<JFT>> JFT makeSomeTaoUsingProtos(final JFT taoProto, final JFZ zenProto) {
        return null;
    }
    
    public static <JFT extends JavaFunTao<JFZ>, JFZ extends JavaFunZen<? extends JFT>> JFT makeSomeTaoUsingClasses(final Class<JFT> taoProto, final Class<JFZ> zenProto) {
        return null;
    }
    
    public static JCRFTao makeSomeResolvedTao() {
        final JCRFTao taoProto = new JCRFTao();
        final JCRFZen zenProto = new JCRFZen();
        final JCRFTao pMadeTao = makeSomeTaoUsingProtos(taoProto, zenProto);
        final JCRFTao cMadeTao = makeSomeTaoUsingClasses(JCRFTao.class, JCRFZen.class);
        return pMadeTao;
    }
    
    public static void haveFun() {
        final JCRFTao tao = new JCRFTao();
        final JCRFZen zen = new JCRFZen();
        final JCRFZen freshZen = tao.consider(zen, (JavaFunTao<JCRFZen>)tao);
        final JavaFunTao<JCRFZen> absTao = tao;
    }
    
    public static class JCRFTao implements JavaFunTao<JCRFZen>
    {
        @Override
        public JCRFZen consider(final JCRFZen someZen, final JavaFunTao<JCRFZen> otherTao) {
            return someZen;
        }
    }
    
    public static class JCRFZen implements JavaFunZen<JCRFTao>
    {
        @Override
        public JCRFTao meditate(final JCRFTao someTao, final JavaFunZen<JCRFTao> otherZen) {
            return someTao;
        }
    }
    
    public interface JavaFunTao<JFZ extends JavaFunZen<? extends JavaFunTao<JFZ>>>
    {
        JFZ consider(final JFZ p0, final JavaFunTao<JFZ> p1);
    }
    
    public interface JavaFunZen<JFT extends JavaFunTao<? extends JavaFunZen<JFT>>>
    {
        JFT meditate(final JFT p0, final JavaFunZen<JFT> p1);
    }
    
    public interface JavaResolvedZen extends JavaEmptyZen<JavaResolvedTao>
    {
    }
    
    public interface JavaEmptyZen<JET extends JavaEmptyTao<? extends JavaEmptyZen<? extends JET>>>
    {
    }
    
    public interface JavaEmptyTao<JEZ extends JavaEmptyZen<? extends JavaEmptyTao<? extends JEZ>>>
    {
    }
    
    public interface JavaResolvedTao extends JavaEmptyTao<JavaResolvedZen>
    {
    }
    
    public interface LoEmptyZen<JET extends JavaEmptyTao<? extends JavaEmptyZen<? extends JET>>> extends JavaEmptyZen<JET>
    {
    }
    
    public interface LoEmptyTao<JEZ extends JavaEmptyZen<? extends JavaEmptyTao<? extends JEZ>>> extends JavaEmptyTao<JEZ>
    {
    }
    
    public interface HiEmptyZen<JET extends JavaEmptyTao<? extends JavaEmptyZen<? extends JET>>> extends JavaEmptyZen<JET>
    {
    }
    
    public interface HiEmptyTao<JEZ extends JavaEmptyZen<? extends JavaEmptyTao<? extends JEZ>>> extends JavaEmptyTao<JEZ>
    {
    }
    
    public interface JavaRawZen<JRT extends JavaRawTao>
    {
        JRT meditateAndProduceTao(final JRT p0);
    }
    
    public interface JavaRawTao<JRZ extends JavaRawZen>
    {
        JRZ considerAndProduceZen(final JRZ p0);
        
        JavaRawTao<JRZ> considerAndProduceTao(final JRZ p0);
    }
}

/*

	Total time: 25 ms
	
*/