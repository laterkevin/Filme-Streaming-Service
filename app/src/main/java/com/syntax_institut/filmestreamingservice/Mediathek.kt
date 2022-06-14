package com.syntax_institut.filmestreamingservice

import android.icu.text.CaseMap

/**
 * Diese Klasse liefert die Mediathek und enthält die Funktionalität zum Sortieren der Listen
 */
class Mediathek {

    /**
     * Diese Funktion liefert die Mediathek.
     * enthalten sind alle Filme
     */
    fun createDatabase(): MutableList<String> {

        // Eine Liste mit falschen Elementen
        val movieDatabase = mutableListOf(
            "How I Met Your Mother",
            "Sons Of Anarchy",
            "Bauer Sucht Frau"
        )

        // Leere die Liste
        // todo Schreibe hier deinen Code
        movieDatabase.clear()

        // Erstelle einige Variablen mit Filmtiteln
        // todo Schreibe hier deinen Code
        var film1 = ("Alien - Die Wiedergeburt")
        var film2 = ("Avatar - Aufbruch nach Pandora")
        var film3= ("Indiana Jones - Jäger des verlorenen Schatzes")
        var film4 = ("Face Off - Im Körper des Feindes")
        var film5 = ("Unbreakable - Unzerbrechlich")
        var film6 = ("Star Wars - Zeit des Erwachens")
        var film7 = ("Doctor Strange")
        var film8 = ("Thor - Tag der Entscheidung")
        var film9 = ("Avengers - Endgame")
        var film10 = ("Titanic")
        var film11 = ("Toy Story")
        var film12 = ("Planet der Affen - Revolution")
        var film13 = ("Fluch der Karibik")
        var film14 = ("Encato")
        var film15 = ("Willow")
        var film16 = ("Anacondas - Auf der Jagd nach der Blutorchidee")
        var film17 = ("Die Mumie")
        var film18 = ("IO - Last On Earth")
        var film19 = ("Zodiac")
        var film20 = ("Deep Blue Sea")

        // Füge alle Filmtitel hinzu
        // todo Schreibe hier deinen Code
        movieDatabase.add(film1)
        movieDatabase.add(film2)
        movieDatabase.add(film3)
        movieDatabase.add(film4)
        movieDatabase.add(film5)
        movieDatabase.add(film6)
        movieDatabase.add(film7)
        movieDatabase.add(film8)
        movieDatabase.add(film9)
        movieDatabase.add(film10)
        movieDatabase.add(film11)
        movieDatabase.add(film12)
        movieDatabase.add(film13)
        movieDatabase.add(film14)
        movieDatabase.add(film15)
        movieDatabase.add(film16)
        movieDatabase.add(film17)
        movieDatabase.add(film18)
        movieDatabase.add(film19)
        movieDatabase.add(film20)

        // Mische die Elemente in der Liste
        // todo Schreibe hier deinen Code
        movieDatabase.shuffle()

        // Liefere alle Filme zurück
        return movieDatabase
    }

    /**
     * Diese Funktion sortiert die übergebende Liste alphabetisch
     */
    fun sortListAlphabetically(list: MutableList<String>): MutableList<String> {

        // sortiert die Liste alphabetisch
        // todo Schreibe hier deinen Code
        list.sort()

        // liefert die geänderte Liste zurück
        return list
    }

    /**
     * Diese Funktion sortiert die übergebene Liste nach Wortlänge
     */
    fun sortListTitleLength(list: MutableList<String>): MutableList<String> {

        // sortiert nach länge des Wortes
        // todo Schreibe hier deinen Code
        list.sortBy { it. length }

        // liefert die geänderte Liste zurück
        return list
    }

    /**
     * Diese Funktion invertiert die Reihenfolge der Liste
     */
    fun invertList(list: MutableList<String>): MutableList<String> {

        // invertiert die Reihenfolge
        // todo Schreibe hier deinen Code
        list.reverse()

        // liefert die geänderte Liste zurück
        return list
    }

    /**
     * Diese Funktion löscht den übergebenen Titel aus der Mediathek
     */
    fun deleteFromDatabase(database: MutableList<String>, title: String): MutableList<String> {

        // Entfehrnt den Titel aus der Mediathek
        // todo Schreibe hier deinen Code
        database.remove(title)

        // liefert die geänderte Liste zurück
        return database
    }

    /**
     * Diese Funktion fügt den übergebenen Titel an erster Stelle zu den Favoriten hinzu
     */
    fun addToFavorites(favorites: MutableList<String>, title: String): MutableList<String> {

        // fügt den Titel an erster Stelle in die Liste ein
        // todo Schreibe hier deinen Code
        favorites.add(0, title)

        // liefert die geänderte Liste zurück
        return favorites
    }
}
