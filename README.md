# Настройки добавленные в pom.xml для данного проекта
```xml
    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
            </plugin>
        </plugins>
    </build>

    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```
# Код Java находящийся в этом репозитории
```Java
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
```
```Java
package ru.netology.domain;

public class CommentsInfo {
    private String postId;                      //Идентификатор поста к которому создан комментарий
    private String activeTemplate;              //Активный шаблон отображения коментариев
    private String commentId;                   //Идентификатор комментария
    private String avatarUrl;                   //Ссылка на аватар в заголовке
    private String nameAndSurnameOfTheAuthor;   //Имя и фамилия автора в заголовке
    private String[] textMessage;               //Текст комментария
    private long dateAndTimeOfPublication;      //Дата и время публикации
    private int amountOfCommentLikes;           //Количество "лайков" комментария
    private boolean commentLike;                //Поставлен ли лайк комментарию
    private int amountOfCommentResponses;       //Количество ответных комментариев

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getActiveTemplate() {
        return activeTemplate;
    }

    public void setActiveTemplate(String activeTemplate) {
        this.activeTemplate = activeTemplate;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNameAndSurnameOfTheAuthor() {
        return nameAndSurnameOfTheAuthor;
    }

    public void setNameAndSurnameOfTheAuthor(String nameAndSurnameOfTheAuthor) {
        this.nameAndSurnameOfTheAuthor = nameAndSurnameOfTheAuthor;
    }

    public String[] getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String[] textMessage) {
        this.textMessage = textMessage;
    }

    public long getDateAndTimeOfPublication() {
        return dateAndTimeOfPublication;
    }

    public void setDateAndTimeOfPublication(long dateAndTimeOfPublication) {
        this.dateAndTimeOfPublication = dateAndTimeOfPublication;
    }

    public int getAmountOfCommentLikes() {
        return amountOfCommentLikes;
    }

    public void setAmountOfCommentLikes(int amountOfCommentLikes) {
        this.amountOfCommentLikes = amountOfCommentLikes;
    }

    public boolean isCommentLike() {
        return commentLike;
    }

    public void setCommentLike(boolean commentLike) {
        this.commentLike = commentLike;
    }

    public int getAmountOfCommentResponses() {
        return amountOfCommentResponses;
    }

    public void setAmountOfCommentResponses(int amountOfCommentResponses) {
        this.amountOfCommentResponses = amountOfCommentResponses;
    }
}
```