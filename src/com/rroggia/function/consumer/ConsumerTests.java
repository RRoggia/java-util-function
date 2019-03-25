package com.rroggia.function.consumer;

import com.rroggia.function.consumer.Logger.LogLevel;

public class ConsumerTests {

	public static void main(String[] args) {

		Logger logger = new Logger();

		logger.logToConsole("logging to console", LogLevel.ERROR);
		logger.logToMemoryAndToConsole("Something that need to be stored", LogLevel.INFORMATION);
		logger.logToMemoryAndToConsole("Serios messages are serious", LogLevel.INFORMATION);
		logger.logToMemoryAndToConsole("Errors are red", LogLevel.ERROR);

		logger.logAllMessagesInMemory(LogLevel.ERROR);

		logger.logAllMessagesInMemory(LogLevel.INFORMATION);

	}

}
