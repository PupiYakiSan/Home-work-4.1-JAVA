    import org.example.BonusService;
    import org.junit.jupiter.api.Test;
    import org.junit.jupiter.api.Assertions;

    public class BonusServiceTest {

        @Test
        void shouldCalculateForRegisteredAndUnderLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1000;
            boolean registered = true;
            long expected = 30;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForRegisteredAndOverLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1_000_000;
            boolean registered = true;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void shouldCalculateForUnRegisteredAndUnderLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1000;
            boolean registered = false;
            long expected = 10;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void shouldCalculateForUnRegisteredAndOverLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1_000_000;
            boolean registered = false;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }
        @Test
        void shouldCalculateForRegisteredAndBonusEquallyLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 16699;
            boolean registered = true;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForRegisteredAndBonusEquallyLimitPlusOne() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 16700;
            boolean registered = true;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForUnRegisteredAndBonusEquallyLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 50099;
            boolean registered = false;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForUnRegisteredAndBonusEquallyLimitPlusOne() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 50100;
            boolean registered = false;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForRegisteredAndZeroBonus() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 33;
            boolean registered = true;
            long expected = 0;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForRegisteredAndOneBonus() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 34;
            boolean registered = true;
            long expected = 1;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForUnRegisteredAndZeroBonus() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 99;
            boolean registered = false;
            long expected = 0;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForUnRegisteredAndOneBonus() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 100;
            boolean registered = false;
            long expected = 1;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

    }