# Api_Request
## HTTP POST getting data from API in JSON

### 1. Manifest (AndroidManifest.xml)
Add the following line to the manifest file:

`<uses-permission android:name="android.permission.INTERNET" />`

And add the following line to the application tag:

`android:networkSecurityConfig="@xml/network_security_config"`

### 2. Network Security Configuration (network_security_config.xml)
Create a file called network_security_config.xml in the xml folder and add the following lines:

`<?xml version="1.0" encoding="utf-8"?>
<network-security-config>
<base-config cleartextTrafficPermitted="true">
</base-config>
</network-security-config>`

