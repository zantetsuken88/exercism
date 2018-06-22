import java.util.ArrayList;
import java.util.List;

class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuilder rnaString = new StringBuilder();

        for (char c : dnaStrand.toCharArray()){
          switch (c) {
            case 'G': rnaString.append('C'); break;
            case 'C': rnaString.append('G'); break;
            case 'T': rnaString.append('A'); break;
            case 'A': rnaString.append('U'); break;
            default: break;
          //insert exception here
          }
        }
        
        return rnaString.toString();

  }
}
