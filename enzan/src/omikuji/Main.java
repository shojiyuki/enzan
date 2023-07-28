package omikuji;

public class Main {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("�R�}���h�����ɐ��l��2�n���Ă��������B");
			return;
		}
		int a = 0, b = 0;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.out.println("�R�}���h������������ƂȂ��Ă��܂��B���l��n���ĉ������B");
		}

		caluculateOmikuji(a, b);

	}

	private static void caluculateOmikuji(int a, int b) {
		int num1 = Enzan.add(a, b);
		int num2 = Enzan.multiply(num1, num1);
		int num3 = Enzan.sub(num2, b);
		int num4 = Enzan.devide(num3, b);
		int result =  Enzan.mod(num4, b);
		while (result > 5) {
			result = Enzan.mod(num4, b);
		}

		Omikuji omikuji = new Omikuji();
		omikuji.PrintOmikuji(result);
	}

}
