package testProgram5;

/**
 * 24点
 * @author wanghan
 *
 */
public class Test5_13 {
	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = {"黑桃","红桃","方块","梅花"};
		String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}

		for(int i = 0; i<deck.length; i++) {
			int index = (int)(Math.random()*deck.length);

			int temp = deck[index];
			deck[index] = deck[i];
			deck[i] = deck[index];
		}

		int ent = 0;
		int sum = 0;
		int times = 0;
		for(int i = 0; i<deck.length; i++) {
			String suit = suits[deck[i]/13];
			String rank = ranks[deck[i]%13];
			System.out.print(suit + " " + rank);
			sum += deck[i]%13;
			ent++;
			if(ent==4) {
				System.out.print("和：" + sum+ "点");
				if(sum==24) {
					times ++;
				}
				System.out.println();
				ent=0;
				sum=0;
			}
		}
		System.out.println("二十四点出现次数： " + times);

	}
}