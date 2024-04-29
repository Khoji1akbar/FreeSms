package com.example.myapplication.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.example.myapplication.chat2.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}