package org.logicmoo.system;

import java.io.File;
import java.io.IOException;

public class StartMUD {
	public static void main(String[] args) {

		String startDir = "D:\\workspace\\phase02-jrtl\\platform\\";
		System.setProperty("user.dir",startDir);

		try {
			String current = new java.io.File(".").getCanonicalPath();
			System.err.println("Current dir:" + current);
			String currentDir = System.getProperty("user.dir");
			System.err.println("Current dir using System:" + currentDir);
		} catch (IOException e) {
			e.printStackTrace();
		}

		ProcessBuilder pb = new ProcessBuilder("D:\\exeutils\\pskill.exe","swipl-win.exe");
		pb.directory(new File(startDir));
		try {
			Process p = pb.start();
			p.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

		pb = new ProcessBuilder("C:\\pf\\swipl\\bin\\swipl-win.exe","-g","startDmiles.");
		pb.directory(new File(startDir));
		try {
			Process p = pb.start();
			p.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
