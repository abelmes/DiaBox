package com.diabox

class User {
    String userName
    String email
    String password
    static hasmany=[diaryBooks:DiaryBook]
    static constraints = {
    }
}
