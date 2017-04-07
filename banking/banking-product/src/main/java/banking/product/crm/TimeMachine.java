package banking.product.crm;


import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class TimeMachine {

        private static volatile Clock clock = Clock.systemDefaultZone();
        private static final ZoneId zoneId = ZoneId.systemDefault();


        public static LocalDate today() {
            return LocalDate.now(clock());
        }

        public static void useDefaultClock() {
            clock = Clock.systemDefaultZone();
        }

        public static Clock clock() {
            return clock;
        }
}
