package com.GoRecorder.goRecorderapp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.sarxos.webcam.Webcam;

@RestController
public class TestController {

	@GetMapping("/test")
	public String test() throws IOException {
		Webcam webcam = Webcam.getDefault();
		webcam.open();
		ImageIO.write(webcam.getImage(), "PNG", new File("hello-world.png"));
		BufferedImage image= ImageIO.read(new File("hello-world.png"));
		return "fff";
	}

}
