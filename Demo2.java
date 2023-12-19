class number {
    number() {
		System.out.println("no parameter ");
    }

    number(int num1, int num2) {
    }

    number(int num1, int num5, float num3) {
    }

    number(byte num2, float num3, int num1) {
    }
}

class TelePhone {
    TelePhone() {
    }

    TelePhone(int num1, int num2) {
    }

    TelePhone(int num1, byte num2, float num3) {
    }

    TelePhone(byte num2, float num3, int num1) {
    }
}

class Jupiter {
    Jupiter() {
    }

    Jupiter(int num1, int num2) {
    }

    Jupiter(int num1, byte num2, float num3) {
    }

    Jupiter(byte num2, float num3, int num1) {
    }
}

class LinkedIn {
    LinkedIn() {
    }

    LinkedIn(int num1) {
    }

    LinkedIn(int num1, byte num2, float num3) {
    }

    LinkedIn(byte num2, float num3, double num8) {
    }
}

public class Demo {
    public static void main(String[] args) {
        new LinkedIn();
        new LinkedIn(13);
        new LinkedIn(67, (byte) 867, 56.89f);
        new LinkedIn((byte) 23, 567f, 45.567);

        new Jupiter();
        new Jupiter(13, 42);
        new Jupiter(67, (byte) 45676, 999.89f);
        new Jupiter((byte) 23, 567f, 7899);

        new number();
        new number(13, 24);
        new number(12, 34, 50);
    }
}