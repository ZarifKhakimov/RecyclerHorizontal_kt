package com.example.myscrollapp_kt.activity.model

class Member(val profile: Int, val fullname: String) {

    override fun toString(): String {
        return "Member { " +
                "profile=" + profile +
                ",  fullName='" + fullname + '\''
    }
}
