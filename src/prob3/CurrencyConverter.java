package prob3;

public class CurrencyConverter {
	
	private static double rate;

	public static double toDollar(double won) {
		// TODO: 한국 원화를 달러로 변환
		double dollar = won / CurrencyConverter.rate;
		
		return dollar;
	}

	public static double toKRW(double dollar) {
		// TODO: 달러를 한국 원화로 변환
		double krw = dollar * CurrencyConverter.rate;
		return krw;
	}
	
	public static void setRate(double r) {
		// TODO: 환율 설정(KRW/$1)
		CurrencyConverter.rate = r;
	}
	
}
