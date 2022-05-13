package backend.thread;

import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TalkServer extends JFrame implements Runnable {
	ServerSocket 	server 	= 	null;
	Socket 			client 	= 	null;
	JTextArea 		jta_log = 	new JTextArea(10, 30);
	JScrollPane 	jsp_log = 	new JScrollPane(jta_log,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
												JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	// 서버의 생성자 정의를 해야 함! 
	public TalkServer() {
		
	}
	
	@Override
	public void run() {
		boolean isStop = false;
		
		try {
			server = new ServerSocket(2899);
			jta_log.append("Server Ready...................\n");
			while(!isStop) {
				client = server.accept();
				jta_log.append("client info"+client.getInetAddress()+"\n");
			}
			
		} catch (Exception e) {
			
		}
	}
	
	public void initDisplay() {
		this.add("center",jsp_log);
		this.setTitle("악 어려워");
		this.setSize(500,  400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		TalkServer ts = new TalkServer();
		ts.initDisplay();

	}

}
