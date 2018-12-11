package com.example.android.miwok;

import java.security.PublicKey;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageID = -1;
    private int mAudioID;

    public Word(String defaultTranslation, String miwokTranslation, int audioID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioID = audioID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageID, int audioID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageID = imageID;
        mAudioID = audioID;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageID() {
        return mImageID;
    }

    public boolean hasImage() {
        return mImageID != -1;
    }

    public  int getmAudioID() {return mAudioID; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageID=" + mImageID +
                ", mAudioID=" + mAudioID +
                '}';
    }
}
