package io.portfolio.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ReadingList {

	public static void main(String[] args) {
		SpringApplication.run(ReadingList.class, args);
	}

}
