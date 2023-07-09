package com.example.composeuiexample.mainScreen

data class FirstSItemModel(
    val id: Int,
    val name:String
)

val uiSampleItemList = listOf(
    FirstSItemModel(id =1  , name = "Screen1"),
    FirstSItemModel(id =2  , name = "Screen2"),
    FirstSItemModel(id =3  , name = "Screen3"),
    FirstSItemModel(id =4  , name = "Screen4"),
    FirstSItemModel(id =5  , name = "Screen5"),
    FirstSItemModel(id =6  , name = "Screen6")
)