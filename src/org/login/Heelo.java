package org.login;

public class Heelo {
	private void voting() {
		int a=4;
		for(int i=a; i<=4; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main (String[] args) {
		Heelo h=new Heelo();
		h.voting();
	}

}
