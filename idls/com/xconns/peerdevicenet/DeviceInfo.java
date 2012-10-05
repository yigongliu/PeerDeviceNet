/*************************************************************************
 * 
 * XCONNS CONFIDENTIAL
 * __________________
 * 
 *  2012 - 2013  XCONNS, LLC 
 *  All Rights Reserved.
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of XCONNS, LLC and its suppliers, if any.  
 * The intellectual and technical concepts contained herein are 
 * proprietary to XCONNS, LLC and its suppliers and may be covered 
 * by U.S. and Foreign Patents, patents in process, and are protected 
 * by trade secret or copyright law. Dissemination of this information
 * or reproduction of this material is strictly forbidden unless prior
 * written permission is obtained from XCONNS, LLC.
 */

package com.xconns.peerdevicenet;

import android.os.Parcel;
import android.os.Parcelable;

public class DeviceInfo implements Parcelable {
	public String name = null;
	public String addr = null;
	public String port = null;
	
	public static final Creator<DeviceInfo> CREATOR = new Creator<DeviceInfo>() {
		public DeviceInfo[] newArray(int size) {
			return new DeviceInfo[size];
		}
		
		public DeviceInfo createFromParcel(Parcel in) {
			return new DeviceInfo(in);
		}
	};
	
	public DeviceInfo(Parcel in) {
		readFromParcel(in);
	}
	
	public DeviceInfo() {
		// TODO Auto-generated constructor stub
	}

	public DeviceInfo(String n,String a,String p) {
		name = n;
		addr = a;
		port = p;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s)", name, addr);
	}
	
	public int describeContents() {
		return 0;
	}
	
	public void writeToParcel(Parcel out, int flags) {
		out.writeString(name);
		out.writeString(addr);
		out.writeString(port);
	}

	public void readFromParcel(Parcel in) {
		name = in.readString();
		addr = in.readString();
		port = in.readString();
	}
}

