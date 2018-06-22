public class PangramChecker {

    public boolean isPangram(String input) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (char c : alpha.toCharArray()){
          if (!input.toLowerCase().contains(Character.toString(c))) {
            return false;
          }
        }
        return true;
    }

}
