package com.mikejohn01.topHitsSpotify;

import com.mikejohn01.topHitsSpotify.configuration.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//@EnableConfigurationProperties({Config.class})
@SpringBootApplication
public class TopHitsSpotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopHitsSpotifyApplication.class, args);
	}

}
