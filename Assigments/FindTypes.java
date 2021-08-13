package wee1.day2.Assigments;

public class FindTypes {

	public static void main(String[] args) {
		String test = " i am happily learning java for the 1st time ";

		int  letter = 0, space = 0, num = 0;

char[] A =test.toCharArray();

for (int i = 0; i < A.length; i++) {

	if(Character.isDigit(A[i])) {

		num =num+1;



	}

	else if(Character.isAlphabetic(A[i])){

		letter=letter+1;

	}

	

	

}

	System.out.println("num :" + num);

	System.out.println("letter :" + letter);

	System.out.println("space : " + space);

	

		

	}

}
