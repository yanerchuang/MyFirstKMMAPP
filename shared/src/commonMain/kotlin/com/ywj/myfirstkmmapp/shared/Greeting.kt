package com.ywj.myfirstkmmapp.shared


class Greeting {
    fun greeting(): String {
        return "Hello ywj, ${Platform().platform}!"
    }

    fun calculateNameLength(name:String?):Int{
        return name?.length ?: 0
    }
}
