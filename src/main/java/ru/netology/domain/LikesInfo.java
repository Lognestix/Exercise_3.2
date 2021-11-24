package ru.netology.domain;

public class LikesInfo {
    private int count;                      //Число пользователей, которым понравилась запись
    private int userLikes;                  //Наличие отметки "Мне нравится" от текущего пользователя
    private int canLike;                    //Может ли текущий пользователь поставить отметку "Мне нравится"
    private int canPublish;                 //Может ли текущий пользователь сделать репост записи

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
