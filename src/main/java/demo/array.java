package demo;

public class array {

	public static void main(String[] args) {
		int[] arr={11111, 212, 3232, 23232, 25};

		int length = 0;

        for(int i=0;i<arr.length;i++) {
        	System.out.print("+");
        	String str=String.valueOf(arr[i]);
        	length=str.length();
        	for(int j=0;j<=length-1;j++) {
        		System.out.print("-");
        	}
        }
        System.out.println("+");
        
        
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.print("|");
        	System.out.print(arr[i]);
        }
        System.out.println("|");
        
        for(int i=0;i<arr.length;i++) {
        	System.out.print("+");
        	String str=String.valueOf(arr[i]);
        	length=str.length();
        	for(int j=0;j<=length-1;j++) {
        		System.out.print("-");
        	}
        }
        System.out.println("+");
	}

}
