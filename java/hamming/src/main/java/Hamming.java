class Hamming {

  private String leftStrand;
  private String rightStrand;

  Hamming(String leftStrand, String rightStrand) {
    if (leftStrand.length() != rightStrand.length()) {
      throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }
    this.leftStrand = leftStrand;
    this.rightStrand = rightStrand;

  }

  int getHammingDistance() {

    int hammingDistance = 0;
    int count = 0;

    for (char c : leftStrand.toCharArray()) {
      if (c != rightStrand.charAt(count)) {
        hammingDistance++;
      }
      count++;
    }
    return hammingDistance;
  }

}
