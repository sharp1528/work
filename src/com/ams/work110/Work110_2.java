package com.ams.work110;

public class Work110_2 {

	/**
	 * Άρπδr·ι
	 * @param str1@δr·ιΆρ
	 * @param str2@δr·ιΆρ
	 * @return@δrΚ
	 * @throws IllegalArgumentException
	 */

	public int compare(String str1,String str2) throws IllegalArgumentException{
		if(str1==null || str2==null) {
			throw new IllegalArgumentException("ψͺnullΕ·B");
		}

		if(str1==str2) {
			return 0;

		}else if(str1.equals(str2)) {
			return 1;

		}else if(!(str1.equals(str2)) && str1.equalsIgnoreCase(str2)) {
			return 2;

		} else return 9;
	}
}
