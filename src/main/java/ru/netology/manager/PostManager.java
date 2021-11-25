package ru.netology.manager;

import ru.netology.domain.*;

public class PostManager {
    private Post[] posts;

    public Post[] searchPost(int ownerId, String domain, String query, boolean ownersOnly, byte count, int offset) {
        //Некоторая логика
        return null;
    }

    public void deletePost(int ownerId, int id) {
        //Некоторая логика
    }
}