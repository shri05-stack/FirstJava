
public class UseNextgenMainArray {
	public static void main(String[] args) {
		String[]cars= {"porsche", "mercedes","bmw"};
		NextgenArray<String> nextgenarray  = new NextgenArray(cars);
		
		String str1= nextgenarray.get(1);
		String str2 = nextgenarray.get(3);
		System.out.println(str1);
		System.out.println(str2);
		
		
		nextgenarray.set(1, "20");
		
		System.out.println(nextgenarray);
		Integer[]nos = {5,6,3,8,9};
//		Nextgenarray<Integer> nextgenarray1 = new UseNextgenMainArray(nos);
		
		NextgenArray<Integer> nextgenArray2= new NextgenArray<>(nos);
		int e = nextgenArray2.get(1);
		nextgenArray2.set(2,10);
		
		
	}

}
