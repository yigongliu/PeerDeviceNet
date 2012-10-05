package com.xconns.peerdevicenet;

import android.os.Parcel;
import android.os.Parcelable;

public class NetInfo implements Parcelable {
	//network type names
	public final static int NoNet = -1;
	public final static int WiFi = 0;
	public final static int WiFiDirect = 1;
	public final static int Bluetooth = 2;
	public final static int Mobile = 3;
	public final static int Other = 4;
	public final static int NET_TYPES = 5;
	
	public final static String NetTypeName(int t) {
		switch (t) {
		case NoNet:
			return "NoNet";
		case WiFi:
			return "Wi-Fi";
		case WiFiDirect:
			return "Wi-Fi Direct";
		case Bluetooth:
			return "Bluetooth";
		case Mobile:
			return "Mobile";
		case Other:
			return "Other";
		}
		return null;
	}
	
	//net info
	public int type = 0;
	public String name = null;
	public String pass = null;
	public byte[] info = null;
	public String intfName = null;  //local interface name for this net
	public String addr = null;  //addr of this host in this net
	
	public NetInfo(int t, String n, String p, byte[] i, String in, String a) {
		type = t;
		name = n;
		pass = p;
		info = i;
		intfName = in;
		addr = a;
	}

	public static final Creator<NetInfo> CREATOR = new Creator<NetInfo>() {
		public NetInfo[] newArray(int size) {
			return new NetInfo[size];
		}
		
		public NetInfo createFromParcel(Parcel in) {
			return new NetInfo(in);
		}
	};
	
	public NetInfo() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("type:%s, name:%s, addr:%s", type, name, addr);
	}

	public int describeContents() {
		return 0;
	}

	public NetInfo(Parcel in) {
		readFromParcel(in);
	}
	
	public void readFromParcel(Parcel in) {
		type = in.readInt();
		name = in.readString();
		pass = in.readString();
		//in.readByteArray(info);
		info = in.createByteArray();
		intfName = in.readString();  //local interface name for this net
		addr = in.readString();  //addr of this host in this net
	}
	
	public void writeToParcel(Parcel out, int flags) {
		out.writeInt(type);
		out.writeString(name);
		out.writeString(pass);
		out.writeByteArray(info);
		out.writeString(intfName);
		out.writeString(addr);
	}
}
