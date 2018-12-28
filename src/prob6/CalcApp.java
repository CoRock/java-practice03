package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			boolean flag = true;
			do {
				System.out.print(">> ");
				String expression = scanner.nextLine();

				/* 코드를 완성 합니다 */
				if (expression.equals("exit")) {
					break;
				}

				String[] tokens = expression.split(" ");
				if (tokens.length == 1 || tokens.length == 2) {
					System.out.println("공백을 확인해주세요.");
					continue;
				}

				int leftValue = Integer.parseInt(tokens[0]);
				String operator = tokens[1];
				int rightValue = Integer.parseInt(tokens[2]);
				int result = 0;

				switch (operator) {
				case "+":
					Add add = new Add();
					add.setValue(leftValue, rightValue);
					result = add.calculate();
					break;
				case "-":
					Sub sub = new Sub();
					sub.setValue(leftValue, rightValue);
					result = sub.calculate();
					break;
				case "*":
					Mul mul = new Mul();
					mul.setValue(leftValue, rightValue);
					result = mul.calculate();
					break;
				case "/":
					Div div = new Div();
					div.setValue(leftValue, rightValue);
					result = div.calculate();
					break;
				default:
					System.out.println("지원하는 연산이 아닙니다.");
				}

				System.out.print(">> ");
				System.out.println(result);
			} while (flag);

		}
	} // end of main

}