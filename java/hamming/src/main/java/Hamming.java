class Hamming {

    Hamming(String leftStrand, String rightStrand) {
      if (leftStrand.length() != rightStrand.length()) {
        throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
      }
    }

    int getHammingDistance() {

      int hammingDistance = 0;

      for (char c : leftString.toCharArray()) {
          if (c != rightStrand.toCharArray()[leftStrand.toCharArray().indexOf(c)]) {
              hammingDistance++;
          }
      }
      return hammingDistance;
    }

}
