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
			str = "��g";
			break;
		}
		case KICHI: {
			str = "�g";
			break;
		}
		case TYUKICHI: {
			str = "���g";
			break;
		}
		case KYO: {
			str = "��";
			break;
		}
		case DAIKYO: {
			str = "�勥";
			break;
		}
		default:
			str = "���g";
		}

		System.out.println("���Ȃ��̉^����" + str + "�ł�");

	}
}
