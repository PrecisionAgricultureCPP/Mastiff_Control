package Client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
	public static void main(String args[]) throws Exception {

		DatagramSocket clientSocket = new DatagramSocket();
		InetAddress IPAddress = InetAddress.getByName("192.168.10.160");
		//byte[] sendData = { 83, 68, 82, (byte) 127, (byte) 127, (byte) 90, (byte) 160, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
		byte[] receiveData = new byte[1024];
		
		byte[] sendData1 = { 83, 68, 82, (byte) 127, (byte) 127, (byte) 90, (byte) 160, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };

		DatagramPacket sendPacket = new DatagramPacket(sendData1, sendData1.length, IPAddress, 6767);
		//long start = System.nanoTime();
//		for (int i = 0; i < 100; i++) {
//			clientSocket.send(sendPacket);
//		}
		byte[] sendData2 = { 83, 68, 82, (byte) 255, (byte) 127, (byte) 90, (byte) 160, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
		sendPacket = new DatagramPacket(sendData2, sendData2.length, IPAddress, 6767);
		for (int i = 0; i < 100; i++) {
			clientSocket.send(sendPacket);
		}
		Thread.sleep(2000);
		byte[] sendData3 = { 83, 68, 82, (byte) 0, (byte) 127, (byte) 90, (byte) 160, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
		sendPacket = new DatagramPacket(sendData3, sendData3.length, IPAddress, 6767);
		for (int i = 0; i < 100; i++) {
			clientSocket.send(sendPacket);
		}
		Thread.sleep(2000);
		byte[] sendData4 = { 83, 68, 82, (byte) 127, (byte) 127, (byte) 120, (byte) 20, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
		sendPacket = new DatagramPacket(sendData4, sendData4.length, IPAddress, 6767);
		for (int i = 0; i < 100; i++) {
			clientSocket.send(sendPacket);
		}
		Thread.sleep(2000);
		byte[] sendData5 = { 83, 68, 82, (byte) 127, (byte) 127, (byte) 90, (byte) 160, (byte) 127, (byte) 160, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
		sendPacket = new DatagramPacket(sendData5, sendData5.length, IPAddress, 6767);
		for (int i = 0; i < 100; i++) {
			clientSocket.send(sendPacket);
		}
		Thread.sleep(2000);
		byte[] sendData6 = { 83, 68, 82, (byte) 127, (byte) 127, (byte) 90, (byte) 160, (byte) 127, (byte) 127, (byte) 150, (byte) 150, (byte) 150, (byte) 127, (byte) 127, (byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
		sendPacket = new DatagramPacket(sendData6, sendData6.length, IPAddress, 6767);
		for (int i = 0; i < 100; i++) {
			clientSocket.send(sendPacket);
		}
		Thread.sleep(2000);
		byte[] sendData7 = { 83, 68, 82, (byte) 127, (byte) 127, (byte) 90, (byte) 160, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 90, (byte) 90, (byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
		sendPacket = new DatagramPacket(sendData7, sendData7.length, IPAddress, 6767);
		for (int i = 0; i < 100; i++) {
			clientSocket.send(sendPacket);
		}
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		clientSocket.receive(receivePacket);
		String data = new String(receivePacket.getData(), 0, receivePacket.getLength());
		byte[] newdata = data.getBytes();
		for (int i = 0; i < newdata.length; i++)
			System.out.println(newdata[i]);
		clientSocket.close();
	}
}
//	public static byte[] PacketToByte(Packet packet) throws Exception {
//		ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
//		ObjectOutputStream objStream = new ObjectOutputStream(byteStream);
//		objStream.writeObject(packet);
//
//		return byteStream.toByteArray();
//	}
//	public static byte[] convertToBytes(Packet packet) throws IOException {
//	    try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
//	         ObjectOutput out = new ObjectOutputStream(bos)) {
//	        out.writeObject(packet);
//	        return bos.toByteArray();
//	    } 
//	}
//	public static Object byteToObj(byte[] bytes) throws IOException, ClassNotFoundException {
//		ByteArrayInputStream byteStream = new ByteArrayInputStream(bytes);
//		ObjectInputStream objStream = new ObjectInputStream(byteStream);
//
//		return objStream.readObject();
//	}
//}
