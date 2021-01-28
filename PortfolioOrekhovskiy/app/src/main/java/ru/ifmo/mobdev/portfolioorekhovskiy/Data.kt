package ru.ifmo.mobdev.portfolioorekhovskiy

object Data {
    fun getElements(): List<Element> {
        return listOf(
            Element(
                "Я позиционирую себя как .NET разработчик. Могу в стек ASP.NET.",
                R.drawable.cs
            ),
            Element(
                "Могу и в Java, но не испытываю от этого особого удовольствия.",
                R.drawable.java
            ),
            Element(
                "В веб тоже могу. Html, CSS, JS, TypeScript - все без проблем.",
                R.drawable.js
            ),
        )
    }
}