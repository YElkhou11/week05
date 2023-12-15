package week05;

class SpacedLogger implements Logger {
    @Override
    public void log(String message) {
        for (char ch : message.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    @Override
    public void error(String message) {
        System.out.print("ERROR: ");
        for (char ch : message.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
