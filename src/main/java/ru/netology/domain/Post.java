package ru.netology.domain;

public class Post {
    private String postId;                          //Идентификатор поста
    private String avatarUrl;                       //Ссылка на аватар в заголовке
    private String headline;                        //Текстовый заголовок
    private long dateAndTimeOfPublication;          //Дата и время публикации
    private boolean commandDropdownMenu;            //Активно ли выпадающее командное меню
    private String[] textMessage;                   //Текстовая составляющая поста
    private String imageOrVideoUrl;                 //Графическая составляющая поста
    private String imageOrVideoDescription;         //Описание графической составляющей поста
    private int amountOfVideoViews;                 //Количество просмотров видео в посте
    private int amountOfPostLikes;                  //Количество "лайков" поста
    private boolean postLike;                       //Поставлен ли лайк посту
    private int amountOfPostComments;               //Количество коментариев к посту
    private int amountOfPostReposts;                //Количество репостов поста
    private int amountOfPostViews;                  //Количество просмотров
    private boolean viewingAndWritingComments;      //Активны ли просмотр и написание коментариев
    private CommentsInfo commentsInfo;              //Отображение комментариев, если активен просмотр

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public long getDateAndTimeOfPublication() {
        return dateAndTimeOfPublication;
    }

    public void setDateAndTimeOfPublication(long dateAndTimeOfPublication) {
        this.dateAndTimeOfPublication = dateAndTimeOfPublication;
    }

    public boolean isCommandDropdownMenu() {
        return commandDropdownMenu;
    }

    public void setCommandDropdownMenu(boolean commandDropdownMenu) {
        this.commandDropdownMenu = commandDropdownMenu;
    }

    public String[] getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String[] textMessage) {
        this.textMessage = textMessage;
    }

    public String getImageOrVideoUrl() {
        return imageOrVideoUrl;
    }

    public void setImageOrVideoUrl(String imageOrVideoUrl) {
        this.imageOrVideoUrl = imageOrVideoUrl;
    }

    public String getImageOrVideoDescription() {
        return imageOrVideoDescription;
    }

    public void setImageOrVideoDescription(String imageOrVideoDescription) {
        this.imageOrVideoDescription = imageOrVideoDescription;
    }

    public int getAmountOfVideoViews() {
        return amountOfVideoViews;
    }

    public void setAmountOfVideoViews(int amountOfVideoViews) {
        this.amountOfVideoViews = amountOfVideoViews;
    }

    public int getAmountOfPostLikes() {
        return amountOfPostLikes;
    }

    public void setAmountOfPostLikes(int amountOfPostLikes) {
        this.amountOfPostLikes = amountOfPostLikes;
    }

    public boolean isPostLike() {
        return postLike;
    }

    public void setPostLike(boolean postLike) {
        this.postLike = postLike;
    }

    public int getAmountOfPostComments() {
        return amountOfPostComments;
    }

    public void setAmountOfPostComments(int amountOfPostComments) {
        this.amountOfPostComments = amountOfPostComments;
    }

    public int getAmountOfPostReposts() {
        return amountOfPostReposts;
    }

    public void setAmountOfPostReposts(int amountOfPostReposts) {
        this.amountOfPostReposts = amountOfPostReposts;
    }

    public int getAmountOfPostViews() {
        return amountOfPostViews;
    }

    public void setAmountOfPostViews(int amountOfPostViews) {
        this.amountOfPostViews = amountOfPostViews;
    }

    public boolean isViewingAndWritingComments() {
        return viewingAndWritingComments;
    }

    public void setViewingAndWritingComments(boolean viewingAndWritingComments) {
        this.viewingAndWritingComments = viewingAndWritingComments;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}
