package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Goods[] arrayGoods = new Goods[COUNT_GOODS];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < COUNT_GOODS; i++) {
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");
			
			String name = tokens[0];
			int price = Integer.parseInt(tokens[1]);
			int stock = Integer.parseInt(tokens[2]);
			
			Goods g = new Goods(name, price, stock);
			arrayGoods[i] = g;
		}
		
		int idx = 0;
		for (Goods g : arrayGoods) {
			System.out.println(
					g.getName() + "(가격: " +
					g.getPrice() + "원)이 " +
					g.getCountStock() + "개 입고 되었습니다."
			);
			idx++;
		}
	}
}
