package selenium.java;

public class Function {
	
	public static void addTwoParameters(int a,int b){
		int res = a+b;
		System.out.println(res);
	}
	public  int threeParameters(int a, int b, int c){
		int result = a+b+c;
		System.out.println(result);
		return result;
		
	}
	public void  printName(String name){
		System.out.println(name);
		
	}


	public static void main(String[] args) {
		Function.addTwoParameters(10, 20);
		Function f = new Function();
		f.threeParameters(10, 20, 30);
		f.printName("murthy");

	}

}
