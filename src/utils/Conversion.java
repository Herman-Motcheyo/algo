package utils;

import java.util.ArrayList;

public class Conversion {

	public static ArrayList<Double> arrayToArrayList(double array[]) {
		ArrayList<Double> arr = new ArrayList<Double>(array.length);
		for (int i = 0; i < array.length; i++) {
			arr.add(array[i]);
		}
		return arr;
	}

	public static double[] arrayListToArray(ArrayList<Double> arr) {
		double[] array = new double[arr.size()];
		for (int i = 0; i < array.length; i++)
			array[i] = arr.get(i);
		return array;
	}
}
