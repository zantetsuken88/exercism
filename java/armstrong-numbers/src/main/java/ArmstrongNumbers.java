class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
			String numString = String.valueOf(numberToCheck);
			int numLength = numString.length();

			char[] digits = numString.toCharArray();
			double sumValue = (double) (0);

			for (int i = 0;i < digits.length; i++){
				double d1 = (double) (digits[i] - '0');
				double d2 = (double) (numLength);
				double powered = Math.pow(d1, d2);
				sumValue+=powered;
			}

			int sumPowered = (int) (sumValue);
			return numberToCheck == sumPowered;

	}

}
