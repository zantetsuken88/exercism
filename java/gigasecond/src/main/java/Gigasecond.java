import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDate birthDate;
    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {

        this.birthDate = birthDate;
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {

      if(this.birthDate != null) {
        birthDateTime = this.birthDate.atStartOfDay();
      }

        return birthDateTime.plusSeconds(1000000000);
    }


}
