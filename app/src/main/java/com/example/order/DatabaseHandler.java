package com.example.order;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Food";

    // Contacts table name
    private static final String TABLE_FOOD = "Order";

    // Contacts Table Columns names
    private static final String KEY_UID = "uid";
    private static final String KEY_OID = "oid";

    final static private String KEY_MJ = "mj";
    final static private String KEY_AJ = "aj";
    final static private String KEY_LJ = "lj";
    final static private String KEY_OS = "os";
    final static private String KEY_CS = "cs";

    final static private String KEY_PT = "pt";
    private static final String KEY_CW = "cw";
    final static private String KEY_FS = "fs";
    final static private String KEY_GP = "gp";
    final static private String KEY_DM = "dm";

    final static private String KEY_VT = "vt";
    private static final String KEY_BT = "bt";
    final static private String KEY_VP = "vp";
    final static private String KEY_CP = "cp";
    final static private String KEY_PA = "pa";

    final static private String KEY_RC = "rc";
    private static final String KEY_IC = "ic";
    final static private String KEY_CB = "cb";



    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //3rd argument to be passed is CursorFactory instance
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_FOOD + "("
                + KEY_UID + " INTEGER PRIMARY KEY," + KEY_OID + " INTEGER,"
                + KEY_MJ + " INTEGER," +  KEY_AJ + " INTEGER," + KEY_LJ + " INTEGER," + KEY_OS + " INTEGER," + KEY_CS + " INTEGER,"
                + KEY_PT + " INTEGER," +  KEY_CW + " INTEGER," + KEY_FS + " INTEGER," + KEY_GP + " INTEGER," + KEY_DM + " INTEGER,"
                + KEY_VT + " INTEGER," +  KEY_BT + " INTEGER," + KEY_VP + " INTEGER," + KEY_CP + " INTEGER," + KEY_PA + " INTEGER,"
                + KEY_RC + " INTEGER," +  KEY_IC + " INTEGER," + KEY_CB + " INTEGER" + ")";
        db.execSQL(CREATE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FOOD);

        // Create tables again
        onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    void addContact(Food food_add) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_UID, food_add.getUid());
        values.put(KEY_OID, food_add.getOid());

        values.put(KEY_MJ, food_add.getMj());
        values.put(KEY_AJ, food_add.getAj());
        values.put(KEY_LJ, food_add.getLj());
        values.put(KEY_OS, food_add.getOs());
        values.put(KEY_CS, food_add.getCs());

        values.put(KEY_PT, food_add.getPt());
        values.put(KEY_CW, food_add.getCw());
        values.put(KEY_FS, food_add.getFs());
        values.put(KEY_GP, food_add.getGp());
        values.put(KEY_DM, food_add.getDm());

        values.put(KEY_VT, food_add.getVt());
        values.put(KEY_BT, food_add.getBt());
        values.put(KEY_VP, food_add.getVp());
        values.put(KEY_CP, food_add.getCp());
        values.put(KEY_PA, food_add.getPa());

        values.put(KEY_RC, food_add.getRc());
        values.put(KEY_IC, food_add.getIc());
        values.put(KEY_CB, food_add.getCb());

        // Inserting Row
        db.insert(TABLE_FOOD, null, values);
        //2nd argument is String containing nullColumnHack
        db.close(); // Closing database connection
    }

    // Getting single contact
    Food getOrder(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_FOOD, new String[] { KEY_OID,
                        KEY_MJ, KEY_AJ, KEY_LJ, KEY_OS, KEY_CS, KEY_PT, KEY_CW, KEY_FS, KEY_GP, KEY_DM,
                        KEY_VT, KEY_BT, KEY_VP, KEY_CP, KEY_PA, KEY_RC, KEY_IC, KEY_CB }, KEY_UID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Food foodget = new Food(Integer.parseInt(cursor.getString(0)),
                Integer.parseInt(cursor.getString(1)), Integer.parseInt(cursor.getString(2)),
                Integer.parseInt(cursor.getString(3)), Integer.parseInt(cursor.getString(4)), Integer.parseInt(cursor.getString(5)),
                Integer.parseInt(cursor.getString(6)), Integer.parseInt(cursor.getString(7)), Integer.parseInt(cursor.getString(8)),
                Integer.parseInt(cursor.getString(9)), Integer.parseInt(cursor.getString(10)), Integer.parseInt(cursor.getString(11)),
                Integer.parseInt(cursor.getString(12)), Integer.parseInt(cursor.getString(13)), Integer.parseInt(cursor.getString(14)),
                Integer.parseInt(cursor.getString(15)), Integer.parseInt(cursor.getString(16)), Integer.parseInt(cursor.getString(17)),
                Integer.parseInt(cursor.getString(18)));
        // return contact
        return foodget;
    }

    // Getting All Contacts
    public List<Food> getAllOrders() {
        List<Food> contactList = new ArrayList<Food>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_FOOD;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Food f = new Food();
                f.setOid(Integer.parseInt(cursor.getString(0)));
                f.setMj(Integer.parseInt(cursor.getString(1)));
                f.setAj(Integer.parseInt(cursor.getString(2)));
                f.setLj(Integer.parseInt(cursor.getString(3)));
                f.setOs(Integer.parseInt(cursor.getString(4)));
                f.setCs(Integer.parseInt(cursor.getString(5)));

                f.setPt(Integer.parseInt(cursor.getString(6)));
                f.setCw(Integer.parseInt(cursor.getString(7)));
                f.setFs(Integer.parseInt(cursor.getString(8)));
                f.setGp(Integer.parseInt(cursor.getString(9)));
                f.setDm(Integer.parseInt(cursor.getString(10)));

                f.setVt(Integer.parseInt(cursor.getString(11)));
                f.setBt(Integer.parseInt(cursor.getString(12)));
                f.setVp(Integer.parseInt(cursor.getString(13)));
                f.setCp(Integer.parseInt(cursor.getString(14)));
                f.setPa(Integer.parseInt(cursor.getString(15)));

                f.setRc(Integer.parseInt(cursor.getString(16)));
                f.setIc(Integer.parseInt(cursor.getString(17)));
                f.setCb(Integer.parseInt(cursor.getString(18)));
                // Adding contact to list
                contactList.add(f);
            } while (cursor.moveToNext());
        }

        // return contact list
        return contactList;
    }

    // Updating single contact
   /* public int updateContact(Food food) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contact.getName());
        values.put(KEY_PH_NO, contact.getPhoneNumber());

        // updating row
        return db.update(TABLE_FOOD, values, KEY_ID + " = ?",
                new String[] { String.valueOf(food.getOid()) });
    }
*/
    // Deleting single contact
    public void deleteContact(Food food) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_FOOD, KEY_OID + " = ?",
                new String[] { String.valueOf(food.getOid()) });
        db.close();
    }

    // Getting contacts Count
    public int getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_FOOD;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
}