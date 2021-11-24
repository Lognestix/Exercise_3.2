package ru.netology.domain;

public class RepostsInfo {
    private int count;                      //Число пользователей скопировавших запись
    private int userReposted;               //Наличие репоста от текущего пользователя

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}
