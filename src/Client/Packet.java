package Client;

public class Packet {
	public char sync_1;

	public char sync_2;

	public char sync_3;

	public int drive_speed;

	public int turn_speed;

	public int c_tilt;

	public int c_pan;

	public int nose;

	public int base;

	public int shoulder;

	public int elbow;

	public int wrist;

	public int gripper;

	public int flipper;

	public int digital_1;

	public int digital_2;

	public int digital_3;

	public int checksum_high;

	public int checksum_low;

	public Packet() {
		
		sync_1 = 'S';

		sync_2 = 'D';

		sync_3 = 'R';

		drive_speed = 127;

		turn_speed = 127;

		c_tilt = 127;

		c_pan = 127;

		nose = 127;

		base = 127;

		shoulder = 127;

		elbow = 127;

		wrist = 127;

		gripper = 127;

		flipper = 127;
		
		digital_1 = 24;

		digital_2 = 0;

		digital_3 = 0;

		checksum_high = 0; 

		checksum_low = 0; 

	}

	public Packet(Packet newpacket) {

		sync_1 = newpacket.sync_1;

		sync_2 = newpacket.sync_2;

		sync_3 = newpacket.sync_3;

		drive_speed = newpacket.drive_speed;

		turn_speed = newpacket.turn_speed;

		c_tilt = newpacket.c_tilt;

		c_pan = newpacket.c_pan;

		nose = newpacket.nose;

		base = newpacket.base;

		shoulder = newpacket.shoulder;

		elbow = newpacket.elbow;

		wrist = newpacket.wrist;

		gripper = newpacket.gripper;

		flipper = newpacket.flipper;

		digital_1 = newpacket.digital_1;

		digital_2 = newpacket.digital_2;

		digital_3 = newpacket.digital_3;

		checksum_high = newpacket.checksum_high;

		checksum_low = newpacket.checksum_low;

	}

}
