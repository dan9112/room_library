package ru.test.my_tests.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns
import ru.test.my_tests.user_classes.Book

class MyDbManagerBook(context: Context) {
    val myDbHelper = MyDbHelper(context)
    var db: SQLiteDatabase? = null

    fun openDb() {
        db = myDbHelper.writableDatabase
    }

    fun insertAuthors(authors: Array<String>) {
        for (i in authors.indices) {
            var authorId: Int?
            val cursor = db?.query(BookAuthor.TABLE_NAME, Array(1){BaseColumns._ID}, "${BookAuthor.COLUMN_NAME_NAME} = ", Array(1){authors[i]}, null, null, null)
            while (cursor?.moveToNext()!!) {
                authorId = cursor.getInt(cursor.getColumnIndex(BookAuthor.COLUMN_NAME_NAME))
            }
            if (c != null)

            cursor.close()
        }
    }

    fun insertToDb(book: Book) {
        val values = ContentValues().apply {
            put(BookTable.COLUMN_NAME_NAME, book.name)
            put(BookTable.COLUMN_NAME_DESCRIPTION, book.description)
        }
        db?.insert(BookTable.TABLE_NAME, null, values)
        insertAuthors(book.author)
        insertGenres(book.genre)
    }

    fun removeItemFromDb(id: String) {
        var selection = BaseColumns._ID + "=$id"

        db?.delete(MyDbNameClass.TABLE_NAME, selection, null)
    }

    fun readDbData(): ArrayList<ListItem> {
        val dataList = ArrayList<ListItem>()

        val cursor = db?.query(MyDbNameClass.TABLE_NAME, null, null, null, null, null, null)
        while (cursor?.moveToNext()!!) {
            val dataTitle = cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_TITLE))
            val dataContent =
                cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_CONTENT))
            val dataUri =
                cursor.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_IMAGE_URI))
            val dataId =
                cursor.getInt(cursor.getColumnIndex(BaseColumns._ID))

            val item = ListItem()
            item.title = dataTitle
            item.desc = dataContent
            item.uri = dataUri
            item.id = dataId

            dataList.add(item)
        }
        cursor.close()
        return dataList
    }

    fun closeDb() {
        myDbHelper.close()
    }
}