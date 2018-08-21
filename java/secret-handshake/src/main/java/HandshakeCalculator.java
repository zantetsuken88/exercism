import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> list = new ArrayList<>();

        StringBuilder binary = new StringBuilder(Integer.toBinaryString(number));
        binary.reverse();

        if(binary.charAt(0) == '1') {
            list.add(Signal.WINK);
        }
        if ((binary .length() >= 2) && (binary.charAt(1) == '1')) {
            list.add(Signal.DOUBLE_BLINK);
        }
        if ((binary .length() >= 3) && (binary.charAt(2) == '1')) {
            list.add(Signal.CLOSE_YOUR_EYES);
        }
        if ((binary .length() >= 4) && (binary.charAt(3) == '1')) {
            list.add(Signal.JUMP);
        }
        if ((binary .length() >= 5) && (binary.charAt(4) == '1')) {
            Collections.reverse(list);
        }
        return list;
    }

}
