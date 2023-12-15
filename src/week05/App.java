package week05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Instantiate instances of both Logger implementations
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test methods of AsteriskLogger
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        // Test methods of SpacedLogger
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
	}
