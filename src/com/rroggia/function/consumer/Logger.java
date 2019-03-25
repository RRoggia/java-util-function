package com.rroggia.function.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Logger {

	private List<String> errorsMessages = new ArrayList<>();
	private List<String> infoMessages = new ArrayList<>();

	public void logToConsole(String message, LogLevel logLevel) {
		logToConsole(logLevel).accept(message);
	}

	public void logToMemoryAndToConsole(String message, LogLevel logLevel) {
		if (logLevel == LogLevel.ERROR)
			logErrorToMemory().andThen(logToConsole(logLevel)).accept(message);
		else
			logInfoToMemory().andThen(logToConsole(logLevel)).accept(message);
	}

	public void logAllMessagesInMemory(LogLevel logLevel) {
		System.out.println();
		System.out.println("logging messages from " + logLevel.toString() + " memory");
		List<String> messages = logLevel == LogLevel.ERROR ? errorsMessages : infoMessages;

		for (String message : messages) {
			logToConsole(logLevel).accept(message);
		}
	}

	private Consumer<String> logErrorToMemory() {
		return logToMemory(errorsMessages);
	}

	private Consumer<String> logInfoToMemory() {
		return logToMemory(infoMessages);
	}

	private Consumer<String> logToMemory(List<String> messages) {
		return message -> messages.add(message);
	}

	private Consumer<String> logToConsole(LogLevel logLevel) {
		return message -> System.out.println(logLevel + " : " + message);
	}

	public static enum LogLevel {
		INFORMATION, ERROR;
	}

}
