package com.crazyostudio.storyverse.Model;

import java.util.ArrayList;

public class UserModel {
    private String username;
    private String emailAddress;
    private String password;
    private String profilePictureUri;
    private ArrayList<String> readingHistory;
//    private ArrayList<String> bookmarks;
//    private String analyticsData;
    private String gender;
    private boolean isKid;
    private long phoneNumber;
    private String userState;
    private String userDistrict;

    private ArrayList<String> FavoriteLanguages;
    private String favoriteCategory;

    public UserModel() {
    }
//  Model Use Sign Up
    public UserModel(String username, String emailAddress, String password, String profilePictureUri, String gender, boolean isKid, long phoneNumber, String userState, ArrayList<String> favoriteLanguages, String favoriteCategory,String userDistrict) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
        this.profilePictureUri = profilePictureUri;
        this.gender = gender;
        this.isKid = isKid;
        this.phoneNumber = phoneNumber;
        this.userState = userState;
        FavoriteLanguages = favoriteLanguages;
        this.favoriteCategory = favoriteCategory;
        this.userDistrict = userDistrict;
    }

    public UserModel(String username, String emailAddress, String password, String profilePictureUri, ArrayList<String> readingHistory, String gender, boolean isKid, long phoneNumber, String userState, String userDistrict, ArrayList<String> favoriteLanguages, String favoriteCategory) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
        this.profilePictureUri = profilePictureUri;
        this.readingHistory = readingHistory;
        this.gender = gender;
        this.isKid = isKid;
        this.phoneNumber = phoneNumber;
        this.userState = userState;
        this.userDistrict = userDistrict;
        FavoriteLanguages = favoriteLanguages;
        this.favoriteCategory = favoriteCategory;
    }

    public String getUserDistrict() {
        return userDistrict;
    }

    public void setUserDistrict(String userDistrict) {
        this.userDistrict = userDistrict;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePictureUri() {
        return profilePictureUri;
    }

    public void setProfilePictureUri(String profilePictureUri) {
        this.profilePictureUri = profilePictureUri;
    }

    public ArrayList<String> getReadingHistory() {
        return readingHistory;
    }

    public void setReadingHistory(ArrayList<String> readingHistory) {
        this.readingHistory = readingHistory;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isKid() {
        return isKid;
    }

    public void setKid(boolean kid) {
        isKid = kid;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public ArrayList<String> getFavoriteLanguages() {
        return FavoriteLanguages;
    }

    public void setFavoriteLanguages(ArrayList<String> favoriteLanguages) {
        FavoriteLanguages = favoriteLanguages;
    }

    public String getFavoriteCategory() {
        return favoriteCategory;
    }

    public void setFavoriteCategory(String favoriteCategory) {
        this.favoriteCategory = favoriteCategory;
    }
}
