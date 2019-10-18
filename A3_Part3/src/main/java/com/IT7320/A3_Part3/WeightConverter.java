package com.IT7320.A3_Part3;

public class WeightConverter implements IConvert{

	public double fromKGToPound(double value) {
		// multiply by 2.205
		return value*2.205;
	}

	public double fromKGToStone(double value) {
		// divide by 6.35
		return value/6.35;
	}

	public double fromPoundToStone(double value) {
		// divide by 14
		return value/14;
	}

	public double fromPoundToKG(double value) {
		// divide by 2.205
		return value/2.205;
	}

	public double fromStoneToKG(double value) {
		// multiply by 6.35
		return value*6.35;
	}

	public double fromStoneToPound(double value) {
		// multiply by 14
		return value*14;
	}
	
}
