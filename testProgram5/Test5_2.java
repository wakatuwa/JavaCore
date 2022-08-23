package testProgram5;
/**
 * 随机生成范围内整数，比较
 * @author wanghan
 *
 */
public class Test5_2 {
	public static void main(String[] args) {
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
		int[] arr1 = new int[100];
		for(int i = 0; i<100; i++) {
			arr1[i] = (int)(Math.random()*6) + 1;
		}
		for(int i = 0; i<100; i++) {
			if(arr1[i]==1)
				count1++;
			else if(arr1[i]==2)
				count2++;
			else if(arr1[i]==3)
				count3++;
			else if(arr1[i]==4)
				count4++;
			else if(arr1[i]==5)
				count5++;
			else if(arr1[i]==6)
				count6++;
		}
		System.out.println("第一个数组各位统计:");
		System.out.println("1出现的次数：" + count1);
		System.out.println("2出现的次数：" + count2);
		System.out.println("3出现的次数：" + count3);
		System.out.println("4出现的次数：" + count4);
		System.out.println("5出现的次数：" + count5);
		System.out.println("6出现的次数：" + count6);
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
		count5 = 0;
		count6 = 0;
		int[] arr2 = new int[1000];
		for(int i = 0; i<1000; i++) {
			arr2[i] = (int)(Math.random()*6) + 1;
		}
		for(int i = 0; i<1000; i++) {
			if(arr2[i]==1)
				count1++;
			else if(arr2[i]==2)
				count2++;
			else if(arr2[i]==3)
				count3++;
			else if(arr2[i]==4)
				count4++;
			else if(arr2[i]==5)
				count5++;
			else if(arr2[i]==6)
				count6++;
		}
		System.out.println("第一个数组各位统计:");
		System.out.println("1出现的次数：" + count1);
		System.out.println("2出现的次数：" + count2);
		System.out.println("3出现的次数：" + count3);
		System.out.println("4出现的次数：" + count4);
		System.out.println("5出现的次数：" + count5);
		System.out.println("6出现的次数：" + count6);
	}
}
