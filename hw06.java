import java.util.*;
class hw0601{//��main��������ɣ��ж�һ�����Ƿ���ˮ�ɻ���
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("����һ����λ������");
		int a =input.nextInt();
		if (a>=100&&a<1000){
			int gw=a%10;
			int sw=a/10%10;
			int bw=a/100%10;
			int sum=gw*gw*gw+sw*sw*sw+bw*bw*bw;
			if (sum==a){
					System.out.println("������ˮ�ɻ���");}
			else if(sum!=a){
					System.out.println("��������ˮ�ɻ���");}
		}else{
				System.out.println("������λ��������");}
		}
	}
}
class hw0602{//��дһ���������ж�һ��������������ż��
	public static int judge(){
		Scanner input=new Scanner(System.in);
		System.out.print("�ڴ�����һ��������");
		int a =input.nextInt();
		if (a%2==0){
			System.out.println(a+"��ż��");
		}else{
			System.out.println(a+"������");
		}		
		
	
	public static void main(String[] args){
		System.out.println(hw0602.judge());
	}
}
	
class hw0603{//��дһ���������������ڵõ�ÿ����������
	public static String judge(){
		Scanner input=new Scanner(System.in);
		System.out.println("����һ��������");
		String week=input.next();
		switch (week){		
			case"����һ":
			case"���ڶ�":
			case"������":
			case"������":
				return "ѧϰ";
			case"������":
			case"������":
				return"��ϰ";
			case"������":
				return"��Ϣ";
			default:
				return"������������";}		
	}
	public static void main(String[] args){
		System.out.println(hw0603.judge());
	}
}



	


