/* For LarKC */
package com.cyc.tool.subl.util;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MemTest {
	public static void main(String[] args) {
		System.out.println("Starting...");
		try {
			int objectsToAllocateSize = 260000000;
			if (args.length >= 1)
				try {
					objectsToAllocateSize = Integer.parseInt(args[0]);
				} catch (Exception ex) {
				}
			int nArrays = (int) Math.floor(objectsToAllocateSize / 260000000);
			if (objectsToAllocateSize % 260000000 != 0)
				++nArrays;
			ArrayList[] items = new ArrayList[nArrays];
			for (int i = 0; i < nArrays; ++i) {
				System.out.println("Allocating array of size: 260000000");
				items[i] = new ArrayList(260000000);
			}
			long origTime = System.currentTimeMillis();
			Runtime.getRuntime().gc();
			long origSpace = Runtime.getRuntime().freeMemory();
			int curPowNum = (int) Math.pow(1.0, 0.0);
			DateFormat formatter = DateFormat.getDateTimeInstance(2, 1);
			int j = 1;
			int curPower = 1;
			while (j <= objectsToAllocateSize) {
				int index = (int) Math.floor((j - 1) / 260000000);
				items[index].add(new Object());
				if (curPowNum == j) {
					curPowNum = (int) Math.pow(2.0, ++curPower);
					long curSpace = Runtime.getRuntime().freeMemory();
					System.out.println("Objects created: " + j);
					System.out.println("Available heap space: " + curSpace + " bytes");
					System.out.println("Space per object: " + (double) (origSpace - curSpace) / (double) j + " bytes");
					long curTime = System.currentTimeMillis();
					System.out.println(
							"Time per object allocation: " + (double) (curTime - origTime) / (double) j + " msecs");
					System.out.println("Time: " + formatter.format(new Date()));
					System.out.println("*******************************");
				}
				++j;
			}
			long curSpace2 = Runtime.getRuntime().freeMemory();
			System.out.println("Objects created: " + objectsToAllocateSize);
			System.out.println("Available heap space: " + curSpace2 + " bytes");
			System.out.println("Space per object: " + (double) (origSpace - curSpace2) / (double) objectsToAllocateSize
					+ " bytes");
			long curTime2 = System.currentTimeMillis();
			System.out.println("Time per object allocation: "
					+ (double) (curTime2 - origTime) / (double) objectsToAllocateSize + " msecs");
			System.out.println("Time: " + formatter.format(new Date()));
			System.out.println("*******************************");
			for (int k = 1; k <= 10; ++k) {
				origTime = System.currentTimeMillis();
				Runtime.getRuntime().gc();
				curTime2 = System.currentTimeMillis();
				System.out
						.println("Time to do nop GC with memory full: " + (double) (curTime2 - origTime) / (double) k);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Finished.");
	}

	private static int OBJECTS_TO_ALLOCATE = 260000000;
	private static int MAX_ARRAY_LENTH = 260000000;
}
