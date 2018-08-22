import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
      StringBuilder binary = new StringBuilder(Integer.toBinaryString(number));
      List<Signal> list = new ArrayList<>();
        binary.reverse();
        if(getSecretSignal(1, 0, binary)) {
            list.add(Signal.WINK);
        }
        if (getSecretSignal(2, 1, binary)) {
            list.add(Signal.DOUBLE_BLINK);
        }
        if (getSecretSignal(3, 2, binary)) {
            list.add(Signal.CLOSE_YOUR_EYES);
        }
        if (getSecretSignal(4, 3, binary)) {
            list.add(Signal.JUMP);
        }
        if (getSecretSignal(5,4, binary)) {
            Collections.reverse(list);
        }
        return list;
    }

    private boolean getSecretSignal(int binaryLength, int binaryChar, StringBuilder binary) {
        return ((binary.length() >= binaryLength) && binary.charAt(binaryChar) == '1');
    }

}
