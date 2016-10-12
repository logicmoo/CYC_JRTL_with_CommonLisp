//
//
//
package com.cyc.tool.subl.util;

public abstract class InitializingSubLFile implements SubLFile {
	protected int initSpot;

	protected int lastPercentile;
	protected int sysdclSize;

	public InitializingSubLFile() {
		this.initSpot = 0;
		this.lastPercentile = 0;
		this.sysdclSize = 0;
	}

	protected int computePercentile() {
		if (this.sysdclSize <= 0 || this.initSpot <= 0)
			return 0;
		if (this.initSpot >= this.sysdclSize)
			return 100;
		return Math.min(99, this.initSpot * 100 / this.sysdclSize);
	}

	protected void finishPercentProgress() {
		System.out.println();
		System.out.println(" Done.");
		System.out.flush();
	}

	protected void initializeClass(String className) {
		SubLFiles.initialize(className);
		++this.initSpot;
		int percentile = this.computePercentile();
		if (percentile != this.lastPercentile) {
			if (percentile % 10 == 0) {
				System.out.printf(" %d%% ", percentile);
				if (percentile == 50) {
					System.out.println();
					System.out.print(" ");
				}
			} else
				System.out.print('.');
			System.out.flush();
			this.lastPercentile = percentile;
		}
	}

	protected void preparePercentProgress(int total) {
		this.sysdclSize = total;
		this.initSpot = 0;
		System.out.println(" Loading implementation classes ... ");
		System.out.print(" ");
		System.out.flush();
	}
}
