PeerDeviceNet
=============

Here are PeerDeviceNet runtime apks. For source code, please check out https://github.com/yigongliu/PeerDeviceNet_Src.

PeerDeviceNet is both a mobile app to connect your android devices and an app framework to enable connected mobile apps.

As app framework, it provides reusable components and local services which can help developing connected mobile applications. You can use  PeerDeviceNet connection manager to connect your devices, and reuse the secure connection features. Via PeerDeviceNet, your apps can send messages to peer devices using high level Android intents and messengers; or communicate thru IDL interfaces to gain fine grained control of messaging and device connection behaviours. For more details, please check out PeerDeviceNet sample apps source code projects at github: PeerDeviceNet_Chat, PeerDeviceNet_RemoteIntentActivity and PeerDeviceNet_RotateWithPeers. 

Once devices have PeerDeviceNet installed, you have a free complete runtime to develop/run connected mobile apps. 

As mobile app, it connects your phones and tablets securely through WI-FI network to enable sharing across devices. It allows a group of devices share web pages, contact information, pictures, videos and other documentations. Connecting devices could be as simple as touching "Search and connect" button. Sending and sharing is initiated by touching the standard android "share" button which most major android apps support.

PeerDeviceNet is available free at popular app stores such as Google Play and Amazon AppStore.

Features:

1. Safe direct connections.

	Your devices connect to each other in direct connections. Nobody can connect to your device without your permission or active participation. All connections are secured using TLS/SSL.

2. Easy connection setup.

	Two simple methods to connect peer devices:
	
	* By using NFC/Android_Beam or camera scanning QR code. One device will be chosen as leader which will choose network (wifi, wifi direct or mobile hotspot), generate QR code image and start NFC transmit; others can join the group and connect to peers by either scanning leader's QR code using rear or front camera or tapping with leader device.

	* By search and find. In WI-FI networks (with multicast), simply start PeerDeviceNet or tap "Search and connect" button at multiple devices simultaneously; they can find and connect to each other automatically.

3. Easy to use

	PeerDeviceNet extends Android's standard "send and share" capability to remote devices. You go to apps which "own" the data you are interested (such Contact app for contact information, Gallery app for photos and videos), select or show the data and click "share" or "send" button. PeerDeviceNet will be among the list of targets thru which you can send data.

	You can choose multiple data items to send, or a whole folder of photos to send at the same time.

	You can choose to send data to one, a few or all connected devices.

4. Flexible multitasking.

	All devices participating PeerDeviceNet can send data to each other simultaneously. It can safely run in background while you are running other apps. You can add new data to send at any time.

5. Support most android devices.

	PeerDeviceNet supports android 2.2 up to 4.1, which cover over 95% of android devices

