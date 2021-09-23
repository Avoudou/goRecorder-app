package com.GoRecorder.goRecorderapp;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.sarxos.webcam.Webcam;


@SpringBootApplication
public class GoRecorderAppApplication {

	public static void main(String[] args) throws IOException {
//		Webcam webcam = Webcam.getDefault();
//		webcam.open();
//		ImageIO.write(webcam.getImage(), "PNG", new File("hello-world.png"));
		
		SpringApplication.run(GoRecorderAppApplication.class, args);
	}

}
