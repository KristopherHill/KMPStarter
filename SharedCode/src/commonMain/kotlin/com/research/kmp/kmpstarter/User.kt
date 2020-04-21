package com.research.kmp.kmpstarter
data class User (val firstName: String, val lastName: String, val address: String,
                 val phoneNumber: String, val age: Int) {

    val fullName: String
            get() = "$firstName $lastName"

    val fullDetails : String
        get() = "$fullName \nAged $age \nAddress: $address"
}