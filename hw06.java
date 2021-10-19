import java.util.*;
class hw0601{//在main方法中完成，判断一个数是否是水仙花数
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个三位正整数");
		int a =input.nextInt();
		if (a>=100&&a<1000){
			int gw=a%10;
			int sw=a/10%10;
			int bw=a/100%10;
			int sum=gw*gw*gw+sw*sw*sw+bw*bw*bw;
			if (sum==a){
					System.out.println("此数是水仙花数");}
			else if(sum!=a){
					System.out.println("此数不是水仙花数");}
		}else{
				System.out.println("不是三位的正整数");}
		}
	}
}
class hw0602{//编写一个方法，判断一个数是奇数还是偶数
	public static int judge(){
		Scanner input=new Scanner(System.in);
		System.out.print("在此输入一个正整数");
		int a =input.nextInt();
		if (a%2==0){
			System.out.println(a+"是偶数");
		}else{
			System.out.println(a+"是奇数");
		}		
		
	
	public static void main(String[] args){
		System.out.println(hw0602.judge());
	}
}
	
class hw0603{//编写一个方法，根据星期得到每天做的事情
	public static String judge(){
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个星期数");
		String week=input.next();
		switch (week){		
			case"星期一":
			case"星期二":
			case"星期四":
			case"星期六":
				return "学习";
			case"星期三":
			case"星期五":
				return"自习";
			case"星期日":
				return"休息";
			default:
				return"星期输入有误";}		
	}
	public static void main(String[] args){
		System.out.println(hw0603.judge());
	}
}



	


