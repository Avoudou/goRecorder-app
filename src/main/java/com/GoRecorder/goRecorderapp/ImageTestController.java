package com.GoRecorder.goRecorderapp;

import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.IOUtils;
import org.omg.CORBA_2_3.portable.InputStream;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class ImageTestController  {
	
	@ResponseBody
	@RequestMapping(value = "/photo2", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] testphoto() throws IOException {
		
		
		InputStream in =  (InputStream) getClass().getResourceAsStream("hello-world.png");
	    return IOUtils.toByteArray(in);
	}

}
