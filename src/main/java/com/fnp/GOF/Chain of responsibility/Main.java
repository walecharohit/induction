import chainofresponsibilityresource.*;

public class Main{
	
	private static Logger getChainOfLoggers(){
	
		Logger errorLogger = new ErrorLog(Logger.Error);
		Logger fileLogger = new FileLog(Logger.Debug);
		Logger consoleLogger = new ConsoleLog(Logger.Info);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	
	public static void main(String[] args){
	
		Logger logchain = getChainOfLoggers();
		
		logchain.logMessage(Logger.Info, "This is infoLog.");
		logchain.logMessage(Logger.Debug, "This is debugLog.");
		logchain.logMessage(Logger.Error, "This is errorLog.");
	
	}
}
