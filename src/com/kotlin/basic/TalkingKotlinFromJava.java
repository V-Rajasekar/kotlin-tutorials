package com.kotlin.basic;

import java.io.IOException;

import com.kotlin.classes.Customer;
import com.kotlin.classes.CustomerKt;
import com.kotlin.classes.Status;
import kotlin.ExtensionFunctionType;

public class TalkingKotlinFromJava {

    public static void main(String[] args) {
        Customer customerKt = new Customer(1, "Raj", "rajasekar@gmail.com", null, null);
        System.out.printf("Id %d Name: %s", customerKt.getId(), customerKt.getName());
        String customerLoyal = customerKt.loyaltyCustomer;

        customerKt.changeStatus(Status.ACTIVE);
        customerKt.changeStatus();
        customerKt.preferentials();
        try {
            customerKt.loadStatistics("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Kotlin Top-level Functions call from Java
        TopLevelFunctionKt.prefix("$", "1000");

        TopLevelFunctionKt.getCopyRightOwner();

        int copyRightVersion = TopLevelFunctionKt.copyRightVersion;

        // Extension Functions from Java
        ExtensionFunctionsKt.hello("this is extension function call from java");
        // static Customer extension passing the customer instance.
        ExtensionFunctionsKt.extension(customerKt);
    }
}
