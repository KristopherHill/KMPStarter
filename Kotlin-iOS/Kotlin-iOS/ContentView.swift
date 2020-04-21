//
//  ContentView.swift
//  Kotlin-iOS
//
//  Created by Kristopher Hill on 21/04/2020.
//  Copyright © 2020 Kristopher Hill. All rights reserved.
//

import SwiftUI
import SharedCode

struct ContentView: View {
    var body: some View {
        VStack {
            Text(userInfo())
            Text("\n\n" + PlatformIdKt.platformName)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

func userInfo() -> String {
    let firstName = "Kris"
    let lastName = "Hill"
    let address = "Huddersfield HD5"
    let phoneNumber = "01484 123321"
    let age = 22 as Int32
    let user = User(firstName: firstName, lastName: lastName, address: address, phoneNumber: phoneNumber, age: age)
    
    return user.fullDetails
}
