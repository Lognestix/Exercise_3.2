package ru.netology.domain;

public class CommentsInfo {
    private int count;                          //Количество комментариев
    private int canPost;                        //Может ли текущий пользователь комментировать запись
    private int groupsCanPost;                  //Могут ли сообщества комментировать запись
    private boolean canClose;                   //Может ли текущий пользователь закрыть комментирование записи
    private boolean canOpen;                    //Может ли текущий пользователь открыть комментирование записи

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
