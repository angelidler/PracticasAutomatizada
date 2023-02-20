package PruebaTestng;

public class pruebaDeIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pruebaDeIguales r = new pruebaDeIguales();
		double a = 100.01;
		double b = 100;
		String c = "100.0 hola mundo";

		System.out.print(r.getTransfer(c));
		
	

	}

	public String getTransfer(String transfer) {
		int i;
		for (i = 0; i < transfer.length(); i++) {

			if (transfer.charAt(i) == ' ') {

				break;

			}

		}
		return transfer.subSequence(0, i).toString();
	}
}
