package com.example.recycleviewexample;

import java.util.ArrayList;

public class Contact {
    private int mImage;
    private String mName;
    private boolean mOnline;

    public String getName() {
        return mName;
    }

    public int getImage() {
        return mImage;
    }

    public boolean isOnline() {
        return mOnline;
    }

    public Contact(String mName, int mImage, boolean mOnline) {
        this.mName = mName;
        this.mImage = mImage;
        this.mOnline = mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Person" + ++lastContactId, R.drawable.female, i <= numContacts / 2));

        }
        return contacts;

    }
}
