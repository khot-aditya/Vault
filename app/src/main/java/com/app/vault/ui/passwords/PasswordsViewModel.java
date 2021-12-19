package com.app.vault.ui.passwords;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PasswordsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PasswordsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Passwords fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}