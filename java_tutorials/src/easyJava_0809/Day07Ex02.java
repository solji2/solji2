package easyJava_0809;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
	private String name;
	private int id;
	private String phoneNo;
	public Student(String name, int id, String phoneNo) {
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return String.format("%s : %d %s", name, id, phoneNo);
	}
}

// �씠由� �궎, �븰�깮 媛�
public class Day07Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Student> sMap = new HashMap<String, Student>();
		System.out.println("�씠由�, �븘�씠�뵒, �쟾�솕踰덊샇 �닚�쑝濡� �엯�젰�븯�떆�삤");
		sMap.put("conan", new Student(scan.next(), scan.nextInt(), scan.next()));
		sMap.put("rose", new Student(scan.next(), scan.nextInt(), scan.next()));
		sMap.put("ran", new Student(scan.next(), scan.nextInt(), scan.next()));
		sMap.put("kid", new Student(scan.next(), scan.nextInt(), scan.next()));
		System.out.println("�벑濡앸맂 �븰�깮�쓽 �닔 : " + sMap.size());
		System.out.println(sMap.get("kid").toString());
		System.out.println(sMap.get("conan").toString());
		System.out.println(sMap.get("rose").toString());
		System.out.println(sMap.get("ran").toString());
		
	}
}
