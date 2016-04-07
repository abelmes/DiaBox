package com.diabox

class Diary {
    String title
    String deed
    Date startDate
    Date endDate
    Date addedOn
    User addedBy
    static hasmany=[involvedInUsers:User,partOfDiaryBooks:DiaryBook]
    static constraints = {
    }
}
