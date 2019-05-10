package eu.larkc.plugin.reason.CRION;


	
	import org.semanticweb.owl.model.OWLAxiom;
	import org.semanticweb.owl.model.OWLLogicalAxiom;

	/**
	 * <p/>
	 * A class which implements the Comparable interface, so we can use 
	 * java.util.Collections.sort to sort our set according to the distance.
	 * </p>
	 *
	 * @author Jun Fang and ZhiSheng Huang
	 * Department of computer Science, Vrije Universiteit Amsterdam, The Netherlands
	 * leon.essence@gmail.com, huang@cs.vu.nl
	 *
	 *
	 * @version 1.0
	 * @Date: Mar 15, 2010
	 *
	 */
	public class AxiomDistance implements Comparable<AxiomDistance>{
		
		private OWLLogicalAxiom a;
		private double distance;

		
		public AxiomDistance(OWLLogicalAxiom a, double distance) {
			super();
			this.a = a;
			this.distance = distance;
		}

		
		public OWLLogicalAxiom getA() {
			return a;
		}

		public void setA(OWLLogicalAxiom a) {
			this.a = a;
		}


		public double getDistance() {
			return distance;
		}

		public void setDistance(double distance) {
			this.distance = distance;
		}



		public int compareTo(AxiomDistance arg0) {
			if(this.getDistance()>arg0.getDistance()) {
				return 1;
			} else if (this.getDistance()==arg0.getDistance()) {
				return 0;
			} else {
				return -1;
			}
		}

	}



