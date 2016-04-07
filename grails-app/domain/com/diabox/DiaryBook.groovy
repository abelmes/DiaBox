package com.diabox

class DiaryBook {
    String name
    String description
    char privacy
    static hasmany=[users:User,diaries:Diary];
    static belongsto=User
    static constraints = {
    }
}
