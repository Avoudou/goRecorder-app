package com.GoRecorder.goRecorderapp;

import java.io.IOException;

import java.nio.ByteBuffer;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

@Component
@ServerEndpoint(value="/wsServer")
public class WsServer {
	@OnOpen
	public void OnOpen(Session session) {
		System.out.println(session.toString()); 
	}
	
	@OnMessage
	public void onMessage(Session ss,byte[] img) {
		ByteBuffer buf = ByteBuffer.wrap(img);
		try {
			System.out.println(ss.toString()+"  on message"); 
			ss.getBasicRemote().sendBinary(buf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@OnClose
	public void onClose(Session ss) {
		try {
			System.out.println(ss.toString()+"  closed"); 
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
