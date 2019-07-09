package javabook.chapter5.wrappertest;

import java.util.Arrays;

public class WrapperTest {
	/**
	 * int[] intArr;
	 * void stringToIntArray(String);
	 * void sortIntArray();
	 * String intArrayToString();
	 * 
	 * String wrapper(String);
	 * */
	public static final String SPACE_SAPERATOR = " ";
	private int[] intArr;

	public String wrapper(String str) {
		stringToIntArray(str);
		sortIntArray();
		return intArrayToString();
	}
	
	void sortIntArray() {
		Arrays.sort(this.intArr);
	}
	
	//实现里面的逻辑代码，将输入的字符串转换为int类型的数组，并存储到intArr数组中
	void stringToIntArray(String str) {
		String[] strArr = str.split(SPACE_SAPERATOR);
		intArr = new int[strArr.length];
		for (int i = 0;i<strArr.length;i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
	}
	
	
	//实现里面的逻辑代码，将intArr数组中存储的值转换成String字符串，格式参考"101 20 -5 323 4 20 200 0 325 1"
	String intArrayToString() {
		StringBuffer strbuffer = new StringBuffer();
		for(int i = 0;i<intArr.length;i++) {
			if(i<intArr.length-1) {
				strbuffer.append(intArr[i]+" ");
			}else {
				strbuffer.append(intArr[i]);
			}
		}
		return strbuffer.toString();
	}

}
