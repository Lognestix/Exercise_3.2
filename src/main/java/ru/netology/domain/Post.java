package ru.netology.domain;

public class Post {
    private int id;                                 //Идентификатор записи
    private int ownerId;                            //Идентификатор владельца стены
    private int fromId;                             //Идентификатор автора записи
    private int createdBy;                          //Идентификатор администратора, опубликовавщего запись
    private int date;                               //Дата и время публикации
    private String text;                            //Текст поста
    private int replyOwnerId;                       //Идентификатор автора записи на которую была оставлена текущая
    private int replyPostId;                        //Идентификатор записи на которую была оставлена текущая
    private int friendsOnly;                        //Информация о том что запись создана "Только для друзей"
    private CommentsInfo commentsInfo;              //Информация о комментариях к записи
    private LikesInfo likesInfo;                    //Информация о лайках к записи
    private RepostsInfo repostsInfo;                //Информация о репостах записи
    private ViewsInfo viewsInfo;                    //Информация о просмотрах записи
    private String postType;                        //Тип записи
    private Geo geo;                                //Информация о местоположении
    private int signerId;                           //Идентификатор подписи автора записи, опубликованной от сообщества
    private int canPin;                             //Может ли текущий пользователь закрепить запись
    private int canDelete;                          //Может ли текущий пользователь удалить запись
    private int canEdit;                            //Может ли текущий пользователь редактировать запись
    private int isPinned;                           //Информация о том что запись закреплена
    private int markedAsAds;                        //Содержит ли запись отметку "реклама"
    private boolean isFavorite;                     //Добавлен ли объект в закладки текущего пользователя
    private int postponedId;                        //Идентификатор отложенной записи

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
