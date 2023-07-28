package omikuji;

public class Omikuji {
	private final int DAIKICHI = 0;
	private final int KICHI = 1;
	private final int TYUKICHI = 2;
	private final int KYO = 3;
	private final int DAIKYO = 4;

	public void PrintOmikuji(int num) {
		String str;
		switch (num) {
		case DAIKICHI: {
			str = "ëÂãg";
			break;
		}
		case KICHI: {
			str = "ãg";
			break;
		}
		case TYUKICHI: {
			str = "íÜãg";
			break;
		}
		case KYO: {
			str = "ã•";
			break;
		}
		case DAIKYO: {
			str = "ëÂã•";
			break;
		}
		default:
			str = "ññãg";
		}

		System.out.println("Ç†Ç»ÇΩÇÃâ^ê®ÇÕ" + str + "Ç≈Ç∑");

	}
}
