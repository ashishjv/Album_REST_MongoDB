package com.example.album_REST_MongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AlbumRestMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumRestMongoDbApplication.class, args);
	}

}
