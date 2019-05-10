/**
 * 
 */
package org.tartarus.snowball;

import org.tartarus.snowball.ext.englishStemmer;

/**
 * @author user
 *
 */
public class TestStemmer {

	/**
	 * 
	 */
	public TestStemmer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		englishStemmer english = new englishStemmer();
		String [] ta="banking achieving s a cave is not arriving ".split("\\s+");
		StringBuffer sb=new StringBuffer();
		
		String[] test = {"bank", "banks", "banking", "banker", "banked", "bankers"};
		String[] gold = {"bank", "bank", "bank", "banker", "bank", "banker"};
		for (int i = 0; i < test.length; i++) {
		english.setCurrent( ta[i]);
		english.stem();
		 
		System.out.println(ta[i]+"   English: " + english.getCurrent()+"\n");
		sb.append(english.getCurrent()+" ");
		}

	}

}
